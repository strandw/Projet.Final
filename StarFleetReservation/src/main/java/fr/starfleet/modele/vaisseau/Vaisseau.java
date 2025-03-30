package main.java.fr.starfleet.modele.vaisseau;

public class Vaisseau {
    private String nom;
    private String immatriculation;
    private int capaciteMaximale;
    private List<Mission> missions;

    // Constructeur
    public Vaisseau(String nom, String immatriculation, int capaciteMaximale) {
        this.nom = nom;
        this.immatriculation = immatriculation;
        this.capaciteMaximale = capaciteMaximale;
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

    public int getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
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
        System.out.println("Capacité Maximale : " + capaciteMaximale);
        System.out.println("Missions : ");
        for (Mission mission : missions) {
            System.out.println(" - " + mission.getNom());
        }
    }
}