package sio.app.models;

public class CoursCollectif extends Cours implements ICalcul{
    private String nomCours;
    private int ageMini;
    private int nbPlaceMaxi;

    //constructeur de class
    public CoursCollectif(int unId,double unPrix,String nomCours, int ageMini, int nbPlaceMaxi) {
        //ici on appelle le constructeur de la classe mère
        super(unId,unPrix);

        this.nomCours = nomCours;
        this.ageMini = ageMini;
        this.nbPlaceMaxi = nbPlaceMaxi;
    }

    //methode implementer

    @Override
    public double getPrix() {
        double complement = 17;

        if (ageMini < 10){
            complement = 12;
        } else if (ageMini < 20) {
            complement = 15;
        }

        return super.getPrix() + complement;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Nom : " + nomCours + " AgeMini : " + ageMini + " NbPlace : " + nbPlaceMaxi;
    }
}
