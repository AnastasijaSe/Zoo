public class Shop {

    private String sortiment;
    private double preisgestaltung;
    private int vorrat;

    private void setAttributesShop(String sortiment, double preisgestaltung, int vorrat) {
        this.sortiment = sortiment;
        this.preisgestaltung = preisgestaltung;
        this.vorrat = vorrat;
    }

    public void displayAttributesShop() {
        System.out.println("\nFolgendes Sortiment wird angeboten: " + sortiment);
        System.out.println("Preis: " + preisgestaltung);
        System.out.println("Vorrat: " + vorrat);
    }

    public void setsortiment(String sortiment) {
        this.sortiment = sortiment;
    }

    public void getsortiment(String sortiment) {
        sortiment = sortiment;
    }


    public void setpreisgestaltung(double preisgestaltung) {
        this.preisgestaltung = preisgestaltung;
    }

    public void getpreisgestaltung(double preisgestaltung) {
        preisgestaltung = preisgestaltung;
    }

    public void setvorrat(int vorrat) {
        this.vorrat = vorrat;
    }

    public void getvorrat(int vorrat) {
        vorrat = vorrat;
    }

    public Shop(String sortiment, double preisgestaltung, int vorrat) {
        setAttributesShop(sortiment, preisgestaltung, vorrat);
    }
}
