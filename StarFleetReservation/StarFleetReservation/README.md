# StarFleetReservation

StarFleetReservation est une application Java permettant de gérer les réservations de missions spatiales pour des passagers civils et officiers. Elle inclut des fonctionnalités pour gérer les vaisseaux, les missions, et les réservations.

## Structure du projet

### 1. `Personne`
Classe abstraite représentant une personne. Elle est étendue par les classes `Civil` et `Officier`.

- **Attributs** :
  - `nom` : Nom de la personne.
  - `prenom` : Prénom de la personne.
  - `identifiant` : Identifiant unique.
- **Méthodes** :
  - `getDescription()` : Méthode abstraite à implémenter dans les sous-classes.

### 2. `Civil`
Classe représentant un passager civil.

- **Attributs** :
  - `planete_dOrigine` : Planète d'origine du civil.
  - `motifVoyage` : Motif du voyage.
- **Méthodes** :
  - `getDescription()` : Retourne une description du civil.

### 3. `Officier`
Classe représentant un officier.

- **Attributs** :
  - `rang` : Rang de l'officier.
  - `specialite` : Spécialité de l'officier.
- **Méthodes** :
  - `getDescription()` : Retourne une description de l'officier.

### 4. `Vaisseau`
Classe représentant un vaisseau spatial.

- **Attributs** :
  - `nom` : Nom du vaisseau.
  - `immatriculation` : Immatriculation du vaisseau.
  - `CapMax` : Capacité maximale du vaisseau.
  - `missions` : Liste des missions associées au vaisseau.
- **Méthodes** :
  - `ajouterMission(Mission mission)` : Ajoute une mission au vaisseau.
  - `afficherInfos()` : Affiche les informations du vaisseau.

### 5. `Mission`
Classe représentant une mission spatiale.

- **Attributs** :
  - `code` : identifiant unique de la mission.
  - `description` : Description de la mission.
  - `dateDepart` : Date de départ.
  - `dateRetour` : Date de retour.
  - `destination` : Destination de la mission.
  - `vaisseau` : Vaisseau assigné à la mission.
  - `reservations` : Liste des réservations pour la mission.
  - `capaciteMaximale` : Capacité maximale de la mission.
- **Méthodes** :
  - `ajouterReservation(Reservation reservation)` : Ajoute une réservation si la capacité maximale n'est pas atteinte.
  - `annulerReservation(String idReservation)` : Annule une réservation par son identifiant.
  - `getNombrePlacesDisponibles()` : Retourne le nombre de places disponibles.
  - `afficherInfos()` : Affiche les informations de la mission.

### 6. `Reservation`
Classe représentant une réservation.

- **Attributs** :
  - `idReserv` : Identifiant unique de la réservation.
  - `passenger` : Passager associé à la réservation.
  - `mission` : Mission associée à la réservation.
  - `datedeReserv` : Date de la réservation.
  - `confirmee` : Statut de confirmation de la réservation.
- **Méthodes** :
  - `confirmer()` : Confirme la réservation.
  - `annuler()` : Annule la réservation.
  - `afficherInfos()` : Affiche les informations de la réservation.

## Fonctionnalités principales

1. **Gestion des passagers** :
   - Ajout de civils et d'officiers.
   - Description des passagers.

2. **Gestion des vaisseaux** :
   - Ajout de missions à un vaisseau.
   - Affichage des informations des vaisseaux.

3. **Gestion des missions** :
   - Création de missions avec des détails comme la destination, les dates, et le vaisseau assigné.
   - Gestion des réservations pour chaque mission.

4. **Gestion des réservations** :
   - Création, confirmation, et annulation des réservations.
   - Affichage des informations des réservations.


étant en alternance voila ce que j'ai pu réalisée avec un emploie du temps plutot chargé par rapport a d'habitude 