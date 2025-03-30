package main.java.fr.starfleet.modele.personne;

class Civil extends Personne {
    private String planete_dOrigine;
    private String motifVoyage;

    public Civil(String nom, String prenom, String identifiant, String planete_dOrigine, String motifVoyage) {
        super(nom, prenom, identifiant);
        this.planete_dOrigine = planete_dOrigine;
        this.motifVoyage = motifVoyage;
    }

    public String getPlanete_dOrigine() {
        return planete_dOrigine;
    }

    public void setPlanete_dOrigine(String planete_dOrigine) {
        this.planete_dOrigine = planete_dOrigine;
    }

    public String getMotifVoyage() {
        return motifVoyage;
    }

    public void setMotifVoyage(String motifVoyage) {
        this.motifVoyage = motifVoyage;
    }

    @Override
    public String getDescription() {
        return "Civil originaire de " + planete_dOrigine + ", en voyage pour " + motifVoyage;
    }
}
