package org.acme;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class VoitureDto {
    @NotBlank(message = "Marque is mandatory")
    @Size(max = 50, message = "Marque must be less than 50 characters")
    private String marque;

    @NotBlank(message = "Modele is mandatory")
    @Size(max = 50, message = "Modele must be less than 50 characters")
    private String modele;

    @NotBlank(message = "Couleur is mandatory")
    @Size(max = 30, message = "Couleur must be less than 30 characters")
    private String couleur;

    @NotBlank(message = "Type is mandatory")
    @Size(max = 30, message = "Type must be less than 30 characters")
    private String type;

    @Max(value = 60, message = "NiveauCarburant must be less than or equal to 60L")
    private int niveauCarburant;

    // Constructor
    public VoitureDto(String marque, String modele, String couleur, String type, int niveauCarburant) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.type = type;
        this.niveauCarburant = niveauCarburant;
    }

    public VoitureDto() {}

    // Getters and Setters
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNiveauCarburant() {
        return niveauCarburant;
    }

    public void setNiveauCarburant(int niveauCarburant) {
        this.niveauCarburant = niveauCarburant;
    }
}