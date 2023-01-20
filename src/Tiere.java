public class Tiere {
    private String Typ;

    private String Name;
    private String Art;
    private int Anzahl;
    private String Nahrung;
    private double Gewicht;


    private void setAttributes(String Art, int Anzahl, String Nahrung, double Gewicht) {
        this.Art = Art;
        this.Anzahl = Anzahl;
        this.Nahrung = Nahrung;
        this.Gewicht = Gewicht;
    }

    public void displayAttributes() {
        System.out.println("\nArt: " + Art);
        System.out.println("Anzahl: " + Anzahl);
        System.out.println("Nahrung?: " + Nahrung);
        System.out.println("Gewicht?: " + Gewicht);
    }


    public void setArt(String Art) {
        Art = Art;
    }

    public String getArt() {
        return Art;
    }

    public double getAnzahl() {
        return Anzahl;
    }

    public void setNahrung(String Nahrung) {
        Nahrung = Nahrung;
    }

    public String getNahrung() {
        return Nahrung;
    }

    public void setGewicht(double Gewicht) {
        Gewicht = Gewicht;
    }

    public double getGewicht() {
        return Gewicht;
    }


    public Tiere(String Art, int Anzahl, String Nahrung, double Gewicht) {
        setAttributes(Art, Anzahl, Nahrung, Gewicht);
    }
}