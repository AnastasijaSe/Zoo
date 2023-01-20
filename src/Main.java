import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tiere Loewe1 = new Tiere("Löwe", "Azra", "Säugetier", 1, "Fleischfresser", 145.0);

        Tiere Loewe2 = new Tiere("Löwe", "Rolle", "Säugetier", 1, "Fleischfresser", 140.0);

        Tiere Schlange1 = new Tiere("Schlange", "Ronja","Reptiel", 1, "Fleischfresser", 5);

        Tiere Ziege1 = new Tiere("Ziege", "Sandra", "Säugetier", 1, "Pflanzenfresser", 60);

        Tiere Ziege2 = new Tiere("Säugetier", "Eminen", "Pflanzenfresser", 1, "Pflanzenfresser", 80);


        ArrayList<Tiere> TierArray = new ArrayList<>();

        TierArray.add(Loewe1);
        TierArray.add(Loewe2);
        TierArray.add(Schlange1);
        TierArray.add(Ziege1);
        TierArray.add(Ziege2);

        for(Tiere t : TierArray){
            t.displayAttributes();
        }

        TierArray.size();
        System.out.println("\nInsgesamt gibt es: "+TierArray.size()+" Tiere");


        int Säugetieranzahl=0;

        for(int i=0; i<TierArray.size(); i++){
            if(TierArray.get(i).getArt().equals("Säugetier")){
                Säugetieranzahl++;
            }
        }
        System.out.println("Säugetieranzahl: "+Säugetieranzahl);




    }
}
