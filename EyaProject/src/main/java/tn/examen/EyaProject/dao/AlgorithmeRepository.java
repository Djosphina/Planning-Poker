package tn.examen.EyaProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.examen.EyaProject.entity.Algorithme;
import tn.examen.EyaProject.entity.Projet;

public interface AlgorithmeRepository extends JpaRepository<Algorithme, Long> {
}
