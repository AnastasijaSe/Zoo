public class Tiere {
    private String Typ;
    private String Name;
    private String Art;
    private int Anzahl;
    private String Nahrung;
    private double Gewicht;


    private void setAttributes(String Typ, String Name, String Art, int Anzahl, String Nahrung, double Gewicht) {
        this.Typ = Typ;
        this.Name = Name;
        this.Art = Art;
        this.Anzahl = Anzahl;
        this.Nahrung = Nahrung;
        this.Gewicht = Gewicht;
    }

    public void displayAttributes() {
        System.out.println("Typ: " + Typ);
        System.out.println("Name: " + Name);
        System.out.println("\nArt: " + Art);
        System.out.println("Anzahl: " + Anzahl);
        System.out.println("Nahrung?: " + Nahrung);
        System.out.println("Gewicht?: " + Gewicht);
    }



    public void setTyp(String Typ) {
        Typ = Typ;
    }

    public void getTyp(String Typ) {
            Typ = Typ;
    }
    public void setName(String Name) {
        Name = Name;
    }

    public void getName(String Name) {
        Name = Name;
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


    public Tiere(String Typ, String Name, String Art, int Anzahl, String Nahrung, double Gewicht) {
        setAttributes(Typ, Name, Art, Anzahl, Nahrung, Gewicht);
    }
}