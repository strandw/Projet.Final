package main.java.fr.starfleet.modele.reservation;

public class Reservation {
    private String idReserv;
    private Personne passenger;
    private Mission mission;
    private Date datedeReserv;
    private boolean confirmee;

    // Constructeur
    public Reservation(String idReservation, Personne passenger, Mission mission, Date dateReservation) {
        this.idReservation = idReservation;
        this.passenger = passenger;
        this.mission = mission;
        this.dateReservation = dateReservation;
        this.confirmee = false; 
    }

    // Getters et setters
    public String getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(String idReservation) {
        this.idReservation = idReservation;
    }

    public Personne getPassenger() {
        return passenger;
    }

    public void setPassenger(Personne passenger) {
        this.passenger = passenger;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public boolean isConfirmee() {
        return confirmee;
    }

    public void setConfirmee(boolean confirmee) {
        this.confirmee = confirmee;
    }

    // Méthodes

    // Confirmer la réservation
    public void confirmer() {
        this.confirmee = true;
    }

    // Annuler la réservation
    public void annuler() {
        this.confirmee = false;
    }

    // Méthode pour afficher les informations de la réservation
    public void afficherInfos() {
        System.out.println("ID Réservation : " + idReservation);
        System.out.println("Passenger : " + passenger.getNom()); 
        System.out.println("Mission : " + mission.getCode()); 
        System.out.println("Date de Réservation : " + dateReservation);
        System.out.println("Confirme : " + (confirme ? "Oui" : "Non"));
    }
}