package sio.app.models;

public class Cours implements ICalcul,Comparable<Cours> {
    private int idCours;
    private double prixCours;

    public Cours(int idCours, double prixCours) {
        this.idCours = idCours;
        this.prixCours = prixCours;
    }

    @Override
    public double getPrix() {
        return 5;
    }



    public String getInfo(){
        return "Numéro : " + idCours;
    }

    @Override
    public int compareTo(Cours o) {
        return Double.compare(this.getPrix(), o.getPrix());
    }
}
