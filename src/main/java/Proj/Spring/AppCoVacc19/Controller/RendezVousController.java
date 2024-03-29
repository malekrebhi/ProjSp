package Proj.Spring.AppCoVacc19.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import  Proj.Spring.AppCoVacc19.Entity.Rendez_vous;
import  Proj.Spring.AppCoVacc19.Service.RendezVousService;

@RestController
public class RendezVousController {
	
	@Autowired
	private RendezVousService RendezVousService;

	//SELECT
	@RequestMapping("/RendezVous")
	public List<Rendez_vous> SelectRendezVous(){
	    return RendezVousService.SelectRendezVous();
		
	}
	
	//DELETE
	@RequestMapping(method= RequestMethod.DELETE , value="/RendezVous/{id}")
	public void DeleteRDV(@PathVariable int id) {
		RendezVousService.DeleteRDV(id);
		System.out.println("RdV supprimé !");

	}
	
	//UPDATE
	@RequestMapping(method= RequestMethod.PUT , value="/RendezVous")
	public void UpdateRDV(@RequestBody Rendez_vous rdv) {
		RendezVousService.UpdateRDV(rdv);
		System.out.println("RdV modifié !");

	}
	
	//ADD
	@RequestMapping(method= RequestMethod.POST , value="/RendezVous")
	public void AddRDV(@RequestBody Rendez_vous rdv) {
		RendezVousService.AddRDV(rdv);
		System.out.println("RdV ajouté !");

	}




}
