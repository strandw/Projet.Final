package main.java.fr.starfleet.modele.vaisseau;

public class Vaisseau {
    private String nom;
    private String immatriculation;
    private int CapMax;
    private List<Mission> missions;

    // Constructeur
    public Vaisseau(String nom, String immatriculation, int CapMax) {
        this.nom = nom;
        this.immatriculation = immatriculation;
        this.CapMax = CapMax;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getCapMax() {
        return CapMax;
    }

    public void setCapMax(int CapMax) {
        this.CapMax = CapMax;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public void ajouterMission(Mission mission) {
        if (missions != null) {
            missions.add(mission);
        }
    }

    public void afficherInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Immatriculation : " + immatriculation);
        System.out.println("Capacité Maximale : " + CapMax);
        System.out.println("Missions : ");
        for (Mission mission : missions) {
            System.out.println(" - " + mission.getNom());
        }
    }
}