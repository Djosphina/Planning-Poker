package tn.examen.EyaProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.examen.EyaProject.entity.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {

}
