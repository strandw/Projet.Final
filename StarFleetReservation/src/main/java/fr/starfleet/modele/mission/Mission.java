package main.java.fr.starfleet.modele.mission;

public class Mission {
    private String code;
    private String description;
    private Date dateDepart;
    private Date dateRetour;
    private String destination;

    private Vaisseau vaisseau;
    private List<Reservation> reservations;
    private int capaciteMaximale;

    // Constructeur
    public Mission(String code, String description, Date dateDepart, Date dateRetour, String destination, Vaisseau vaisseau, int capaciteMaximale) {
        this.code = code;
        this.description = description;
        this.dateDepart = dateDepart;
        this.dateRetour = dateRetour;
        this.destination = destination;
        this.vaisseau = vaisseau;
        this.capaciteMaximale = capaciteMaximale;
        this.reservations = new ArrayList<>();
    }

    // Getters et setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Vaisseau getVaisseau() {
        return vaisseau;
    }

    public void setVaisseau(Vaisseau vaisseau) {
        this.vaisseau = vaisseau;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public int getCapaciteMaximale() {
        return capaciteMaximale;
    }

    public void setCapaciteMaximale(int capaciteMaximale) {
        this.capaciteMaximale = capaciteMaximale;
    }


    public boolean ajouterReservation(Reservation reservation) {
        if (reservations.size() < capaciteMaximale) {
            reservations.add(reservation);
            return true;
        }
        return false;
    }

    
    public boolean annulerReservation(String idReservation) {
        for (Reservation reservation : reservations) {
            if (reservation.getId().equals(idReservation)) {
                reservations.remove(reservation);
                return true;
            }
        }
        return false;
    }

    
    public int getNombrePlacesDisponibles() {
        return capaciteMaximale - reservations.size();
    }

    
    public void afficherInfos() {
        System.out.println("Code Mission : " + code);
        System.out.println("Description : " + description);
        System.out.println("Date de départ : " + dateDepart);
        System.out.println("Date de retour : " + dateRetour);
        System.out.println("Destination : " + destination);
        System.out.println("Vaisseau : " + (vaisseau != null ? vaisseau.getNom() : "Non attribué"));
        System.out.println("Capacité Maximale : " + capaciteMaximale);
        System.out.println("Réservations : " + reservations.size());
    }
}