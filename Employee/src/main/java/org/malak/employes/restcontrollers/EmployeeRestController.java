package org.malak.employes.restcontrollers;

import java.util.List;

import org.malak.employes.entities.Employee;
import org.malak.employes.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class EmployeeRestController {
	
	@Autowired
	EmployeService employeService;
	
	@RequestMapping(path="/all",method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployes()
	{List<Employee> employes=employeService.getAllEmployes();
		
		return new ResponseEntity<>(employes,HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Employee getEmployeById(@PathVariable("id") Long id) 
	{
    return employeService.getEmploye(id);
    }
	
	 @RequestMapping(method = RequestMethod.POST)
	   public Employee createEmployee(@RequestBody Employee employee) 
	 	{
	    return employeService.saveEmploye(employee);
	    }
	  @RequestMapping(method = RequestMethod.PUT)
	    public Employee updateEmploye(@RequestBody Employee employee) 
	  	{
	    return employeService.updateEmploye(employee);
	    }
	  @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	    public void deleteEmployee(@PathVariable("id") Long id)
	    {
		  employeService.deleteEmployeById(id);
	    }	    
	  @RequestMapping(value="/empsoc/{id}",method = RequestMethod.GET)
	    public List<Employee> getProduitsBySocId(@PathVariable("id") Long id) {
	    return employeService.findBySocieteIdSociete(id);
	    }
	  @RequestMapping(value="/empbyname/{nom}",method = RequestMethod.GET)
	    public List<Employee> findByNomContains(@PathVariable("nom") String nom) {
	  
	  return employeService.findByNomContains(nom);
	  }
	  
}

