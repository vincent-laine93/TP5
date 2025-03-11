package sio.app.models;

public class Instrument {
    private int idInstrument;
    private String nomInstrument;

    public Instrument(int idInstrument, String nomInstrument) {
        this.idInstrument = idInstrument;
        this.nomInstrument = nomInstrument;
    }

    public String getNomInstrument() {
        return nomInstrument;
    }
}
