package org.malak.employes.restcontrollers;

import java.util.List;

import org.malak.employes.entities.Societe;
import org.malak.employes.repose.SoccieteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/soc")
@CrossOrigin("*")
public class SocieteRestController {
	@Autowired
	SoccieteRepository societeRepository; 
	@RequestMapping(method=RequestMethod.GET)
	public List<Societe> getAllCategories()
	{
	return societeRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Societe getCategorieById(@PathVariable("id") Long id) {
	return societeRepository.findById(id).get();
}
}





