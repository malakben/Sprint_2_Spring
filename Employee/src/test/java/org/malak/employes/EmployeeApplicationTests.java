package org.malak.employes;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.malak.employes.entities.Employee;
import org.malak.employes.entities.Societe;
import org.malak.employes.repose.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Test
	public void testCreateEmployee() {
	Employee emp = new Employee("ben ali","malak","14404701","RH","1994-05-19");
	employeeRepository.save(emp);
	}
	@Test
	public void testFindEmployee()
	{
	Employee e = employeeRepository.findById(2L).get();
	System.out.println(e);
	}
	@Test
	public void testUpdateProduit()
	{
		Employee emp = employeeRepository.findById(2L).get();
		emp.setService("new service");
		employeeRepository.save(emp);
	}

	@Test
	public void testDeleteEmployee()
	{
	employeeRepository.deleteById(5L);
	}
	@Test
	public void testListerTousEmployes()
	{
	List<Employee> emps = employeeRepository.findAll();
	for (Employee e : emps)
	{
	System.out.println(e);
	}
	}
	@Test
	public void testFindEmployeeByNom()
	{
	List<Employee> emps = employeeRepository.findByNom("ben ali");
		for (Employee e:emps)
			System.out.println(e);
	}
	@Test
	public void testFindEmployeeByPrenom()
	{
	List<Employee> emps = employeeRepository.findByPrenom("malak");
		for (Employee e:emps)
			System.out.println(e);
	}
	@Test
	public void testFindEmployeeByNomContains()
	{
	List<Employee> emps = employeeRepository.findByNomContains("n");
		for (Employee e:emps)
			System.out.println(e);
	}
	
	@Test
	public void testfindByNomPrenom()
	{
	List<Employee> emps = employeeRepository.findByNomPrenom("ben ali", "malak");
	for (Employee e : emps)
	{
	System.out.println(e);
	}
	}
	
	@Test
	public void testfindByOrderByPrenomAsc()
	{
	List<Employee> emps =employeeRepository.findByOrderByPrenomAsc();
	for (Employee e : emps)
		{
			System.out.println(e);
		}
	}
	
	@Test
	public void testTrierEmployeeNomDESC()
	{
	List<Employee> emps = employeeRepository.TrierEmployeeNom();
	for (Employee e : emps)
		{
			System.out.println(e);
		}
	}
	@Test
	public void testfindBySociete()
	{
	Societe soc = new Societe();
	soc.setIdSociete(2L);
	List<Employee> emps = employeeRepository.findBySociete(soc);
	for (Employee e : emps)
	{
	System.out.println(e);
	}
	}

}
