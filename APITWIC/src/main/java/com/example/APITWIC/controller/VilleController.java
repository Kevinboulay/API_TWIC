package com.example.APITWIC.controller;

import com.example.APITWIC.model.Ville;
import com.example.APITWIC.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VilleController {

    @Autowired
    private VilleService villeService;


    @GetMapping("ville")
    public List<Ville> get(@RequestParam(required  = false, value="codePostal") String codePostal) {
        if(codePostal == null) {
            return this.villeService.findAll();
        }
        else {
            return this.villeService.findAllWithCodePostal(codePostal);
        }
    }


    @PostMapping("AjouterVille")
    public String add(
            @RequestBody Ville ville
    ){
        this.villeService.saveVille(ville);
        return "Ville ajoutée";
    }


    @DeleteMapping("SupprimerVille/{codeINSEE}")
    public String delete(
            @PathVariable String codeINSEE
    ){
        this.villeService.deleteByCodeINSEE(codeINSEE);
        return "Suppression effectuée";
    }


    @PutMapping("UpdateVille/{codeINSEE}")
    public String update(
            @RequestBody Ville ville,
            @PathVariable String codeINSEE
    ) {
        this.villeService.updateVille(ville, codeINSEE);

        return "Update effectuée";
    }

}
