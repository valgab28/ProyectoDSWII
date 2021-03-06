package com.backup.cliente.controller;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.backup.cliente.entity.InformeRai;
import com.backup.cliente.entity.PlanTrabajo;
import com.backup.cliente.entity.Usuario;
import com.google.gson.Gson;

@Controller
@RequestMapping("/informerai")
public class InformeRaiController {
	
	private String URL_PLANTRABAJO="http://localhost:8091/plantrabajo/";
	private String URL_INFORMERAI="http://localhost:8091/informerai/";
	
	
	@RequestMapping("/")
	public String index(Model model) {
		
		try {
			RestTemplate rt=new RestTemplate();
			ResponseEntity<PlanTrabajo[]>response1=rt.getForEntity(URL_PLANTRABAJO+"lista", PlanTrabajo[].class);
			ResponseEntity<InformeRai[]>response2=rt.getForEntity(URL_INFORMERAI+"lista", InformeRai[].class);
			model.addAttribute("plantrabajos",response1.getBody());
			model.addAttribute("informerais",response2.getBody());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "informerai";
	}

	
	
	@RequestMapping("/guardar")
	public String guardar(@RequestParam("descripcion") String descripcion, 
			@RequestParam("fuentes") String fuentes, 
			@RequestParam("contenido") String contenido,
			@RequestParam("planTrabajo") int cod_planT,
			@RequestParam("usuario") int cod_usr,
			RedirectAttributes redirect) {
		
		
		try {
			
			InformeRai bean=new InformeRai();
			bean.setDescripcion(descripcion);
			bean.setFuentes(fuentes);
			bean.setContenido(contenido);
			PlanTrabajo p=new PlanTrabajo();
			p.setCodigo(cod_planT);
			bean.setPlanTrabajo(p);
			Usuario u=new Usuario();
			u.setCodigo(cod_usr);	
			bean.setUsuario(u);
			
			//
			Gson gson=new Gson();
			String json=gson.toJson(bean);
			
			RestTemplate rs=new RestTemplate();
			
			
			HttpHeaders header=new HttpHeaders();
			header.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> request=new HttpEntity<String>(json,header);
			
			rs.postForObject(URL_INFORMERAI+"registrar", request, String.class);
			
			redirect.addFlashAttribute("MENSAJE","Informe Registrado");
			
			
		} catch (Exception e) {
			e.printStackTrace();
			redirect.addFlashAttribute("MENSAJE","Error en el registro");
		}
		
		
		
		
		return "redirect:/informerai/";
	}
	
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("codigo") int cod,RedirectAttributes redirect) {
		
		try {
			
			RestTemplate rt=new RestTemplate();
			rt.delete(URL_INFORMERAI+"eliminar/"+cod);
			redirect.addFlashAttribute("MENSAJE", "Informe eliminado");
			
		} catch (Exception e) {
			e.printStackTrace();
			redirect.addFlashAttribute("MENSAJE", "Error en la aliminaci??n");
		}
		
		
		
		return "redirect:/informerai/";
	}
	
	
	
}

















