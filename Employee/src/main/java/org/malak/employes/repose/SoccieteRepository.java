package org.malak.employes.repose;

import org.malak.employes.entities.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource(path = "soc")
@CrossOrigin("http://localhost:4200/") //pour autoriser angular 
public interface SoccieteRepository extends JpaRepository<Societe, Long> {

}
