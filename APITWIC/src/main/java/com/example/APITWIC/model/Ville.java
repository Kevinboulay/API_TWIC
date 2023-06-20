package com.example.APITWIC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ville_france")
public class Ville {
    @Id
    @Column(name="Code_commune_INSEE",nullable = true)
    private String codeINSEE;
    @Column(name="Nom_commune",nullable = true)
    private String commune;
    @Column(name="Code_postal",nullable = true)
    private String codePostal;
    @Column(name="Libelle_acheminement",nullable = true)
    private String libelleAcheminement;
    @Column(name="Ligne_5",nullable = true)
    private String ligne5;
    @Column(name="Latitude",nullable = true)
    private String latitude;
    @Column(name="Longitude",nullable = true)
    private String longitude;


}