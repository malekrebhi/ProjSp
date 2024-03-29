package Proj.Spring.AppCoVacc19.Controller;

import Proj.Spring.AppCoVacc19.Entity.Centre_Vaccination;
import Proj.Spring.AppCoVacc19.Service.CentreVaccService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CentreVaccController {
	
	@Autowired
	private CentreVaccService  CentreVaccService;
	

	//SELECT
	@RequestMapping("/Centre")
	public List<Centre_Vaccination> SelectCentre(){
		return CentreVaccService.SelectCentre();
		
	}
	
	//DELETE
	@RequestMapping(method= RequestMethod.DELETE , value="/Centre/{id}")
	public void DeleteCentre(@PathVariable int id) {
		CentreVaccService.DeleteCentre(id);
		System.out.println("Centre supprimé !");

	}
	
	//UPDATE
	@RequestMapping(method= RequestMethod.PUT , value="/Centre")
    public void UpdateCentre(@RequestBody Centre_Vaccination centre) {
		CentreVaccService.UpdateCentre(centre);
		System.out.println("Centre modifié !");

	}

	
	//ADD
	@RequestMapping(method= RequestMethod.POST , value="/Centre")
    public void AddCentre(@RequestBody Centre_Vaccination centre) {
		CentreVaccService.AddCentre(centre);
		System.out.println("Centre ajouté !");

	}

}
