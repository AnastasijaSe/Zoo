import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Personal Person1 = new Personal(1, "Nasti","Vollzeit",1000000.0);

        Personal Person2 = new Personal(2, "Rosa","Teilzeit",10000.0);

        Personal Person3 = new Personal(2, "Lea","Teilzeit",10000.0);


        Tiere Loewe1 = new Tiere("Löwe", "Azra", "Säugetier", 1, "Fleischfresser", 145.0);

        Tiere Loewe2 = new Tiere("Löwe", "Rolle", "Säugetier", 1, "Fleischfresser", 140.0);

        Tiere Schlange1 = new Tiere("Schlange", "Ronja","Reptiel", 1, "Fleischfresser", 5);

        Tiere Ziege1 = new Tiere("Ziege", "Sandra", "Säugetier", 1, "Pflanzenfresser", 60);

        Tiere Ziege2 = new Tiere("Säugetier", "Emine", "Pflanzenfresser", 1, "Pflanzenfresser", 80);


        Tickets Normal = new Tickets("Normaler Preis", 8.0, 64);

        Tickets Ermaessigt = new Tickets("Ermäßigter Preis (für Schüler, Studenten, Kinder)", 5.0, 79);

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


        ArrayList<Personal> PersonalArray = new ArrayList<>();

        PersonalArray.add(Person1);
        PersonalArray.add(Person2);
        PersonalArray.add(Person3);

        for(Personal p : PersonalArray){
            p.displayAttributesPersonal();
        }

        PersonalArray.size();
        System.out.println("\nInsgesamt gibt es: "+PersonalArray.size()+" Arbeiter");



    ArrayList<Tickets> TicketsArray = new ArrayList<>();

        TicketsArray.add(Normal);
        TicketsArray.add(Ermaessigt);

        for(Tickets tk : TicketsArray){
        tk.displayAttributesTickets();
        Tickets.summeTickets += tk.getanzahlverkauf();
    }

        System.out.println("\nInsgesamt wurden "+Tickets.summeTickets+" verkauft");
}
}
