package com.example.APITWIC.service;

import com.example.APITWIC.model.Ville;
import com.example.APITWIC.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {

    /**
     * Repository containing the information of the teams.
     */
    @Autowired
    private VilleRepository villeRepository;

    public List<Ville> findAll() {
        return villeRepository.findAll();
    }

    public List<Ville> findAllWithCodePostal(String codePostal) {
        return villeRepository.findAllByCodePostal(codePostal);
    }

    public void saveVille(Ville ville) {
        villeRepository.save(ville);
    }

    public void deleteByCodeINSEE(String codeINSEE) {
        villeRepository.deleteByCodeINSEE(codeINSEE);
    }

    public void updateVille(Ville ville, String codeINSEE) {
        Ville villeBDD = this.villeRepository.getByCodeINSEE(codeINSEE);
        villeBDD.setCommune(ville.getCommune());
        villeBDD.setCodePostal(ville.getCodePostal());
        villeBDD.setLibelleAcheminement(ville.getLibelleAcheminement());
        villeBDD.setLigne5(ville.getLigne5());
        villeBDD.setLatitude(ville.getLatitude());
        villeBDD.setLongitude(ville.getLongitude());
        this.villeRepository.save(villeBDD);
    }
}
