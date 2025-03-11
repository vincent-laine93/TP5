package sio.app.models;

public class CoursIndividuel extends Cours implements ICalcul{
    private Instrument instrument;
     public CoursIndividuel(int unId,double unPrix,Instrument unInstrument) {
         super(unId,unPrix);
         this.instrument = unInstrument;
     }

    @Override
    public double getPrix() {
        double complement = 9;

        if (instrument.getNomInstrument().equals("Guitare")){
            complement = 7.5;
        } else if (instrument.getNomInstrument().equals("Piano")) {
            complement = 10.5;
        }
        return super.getPrix() + complement;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Instrument : " + instrument.getNomInstrument();
    }
}
