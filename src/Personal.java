public class Personal {

    private int vt;
    private String namepersonal;
    private String gehaltart;
    private double gehaltmenge;


    private void setAttributesPersonal(int vt, String namepersonal, String gehaltart, double gehaltmenge) {
        this.vt = vt;
        this.namepersonal = namepersonal;
        this.gehaltart = gehaltart;
        this.gehaltmenge = gehaltmenge;
    }

    public void displayAttributesPersonal() {
        System.out.println("\nVollzeit oder Teilzeit: " + vt);
        System.out.println("Name: " + namepersonal);
        System.out.println("Gehaltart: " + gehaltart);
        System.out.println("Gehalt: " + gehaltmenge);
    }

    public void setvt(int vt) {
        vt = vt;
    }

    public void getvt(int vt) {
        vt = vt;
    }


    public void setnamepersonal(String namepersonal) {
        namepersonal = namepersonal;
    }

    public void getnamepersonal(String namepersonal) {
        namepersonal = namepersonal;
    }

    public void setgehaltart(String gehaltart) {
        gehaltart = gehaltart;
    }

    public void getgehaltart(String gehaltart) {
        gehaltart = gehaltart;
    }

    public void setgehaltmenge(double gehaltmenge) {
        gehaltmenge = gehaltmenge;
    }


    public Personal(int vt, String namepersonal, String gehaltart, double gehaltmenge) {
        setAttributesPersonal(vt, namepersonal, gehaltart, gehaltmenge);
    }

    public void getgehaltmenge(double gehaltmenge){
        gehaltmenge = gehaltmenge;
    }

                   /* public static void main (String[]args){

                        if (Futter = 0) {
                            System.out.println("Tier muss noch gefüttert werden.");
                        } else if (Futter == !0) {
                            System.out.println("Tier wurde schon gefüttert.");
                        }*/


                    }
