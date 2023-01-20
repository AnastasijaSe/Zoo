import java.util.ArrayList;

public class Futter {

    private String typ;
    private String menge;
    private boolean schongefüttert;


    private void setAttributesFutter(String typ, String menge, boolean schongefüttert) {
        this.typ = typ;
        this.menge = menge;
        this.schongefüttert = schongefüttert;
    }

    public void displayAttributesFutter() {
        System.out.println("\nTyp: " + typ);
        System.out.println("Name: " + menge);
        System.out.println("Wurde das Tier schon gefüttert: " + schongefüttert);}

    public void settyp(String typ) {
        typ = typ;
    }

    public void gettyp(String typ) {
        this.typ = typ;
    }


    public void setmenge(String menge) {
        menge = menge;
    }

    public void getmenge(String menge) {
        this.menge = menge;
    }

    public void setschongefüttert(boolean schongefüttert) {
        schongefüttert = schongefüttert;
    }

    public void getschongefüttert(boolean schongefüttert) {
        this.schongefüttert = schongefüttert;
    }
    public Futter(String typ, String menge, boolean schongefüttert) {
        setAttributesFutter(typ, menge,schongefüttert);

}
}
