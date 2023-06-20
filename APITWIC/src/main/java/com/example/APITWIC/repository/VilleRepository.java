package com.example.APITWIC.repository;

import com.example.APITWIC.model.Ville;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VilleRepository extends JpaRepository<Ville, Integer> {

    List<Ville> findAll();

    List<Ville> findAllByCodePostal(String codePostal);

    Ville getByCodeINSEE(String codeINSEE);

    void deleteByCodeINSEE(String codeINSEE);
}