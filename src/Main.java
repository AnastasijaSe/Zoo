import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personal Person1 = new Personal(1, "Nasti", "Vollzeit", 1000000.0);

        Personal Person2 = new Personal(2, "Rosa", "Teilzeit", 10000.0);

        Personal Person3 = new Personal(2, "Lea", "Teilzeit", 10000.0);


        Tiere Loewe1 = new Tiere("Löwe", "Azra", "Säugetier", 1, "Fleischfresser", 145.0);

        Tiere Loewe2 = new Tiere("Löwe", "Rolle", "Säugetier", 1, "Fleischfresser", 140.0);

        Tiere Schlange1 = new Tiere("Schlange", "Ronja", "Reptiel", 1, "Fleischfresser", 5);

        Tiere Ziege1 = new Tiere("Ziege", "Sandra", "Säugetier", 1, "Pflanzenfresser", 60);

        Tiere Ziege2 = new Tiere("Ziege", "Eminen", "Säugetier", 1, "Pflanzenfresser", 80);

        Tiere Pinguin1 = new Tiere("Pinguin", "Cihad", "Säugetier", 1, "Pflanzenfresser", 80);


        Futter Azra = new Futter("Fleisch", "erwachsen", true);
        Futter Rolle = new Futter("Fleisch", "erwachsen", true);
        Futter Ronja = new Futter("Fleisch, Fisch", "erwachsen", true);
        Futter Sandra = new Futter("Pflanzen, Trockenfutter", "jung", false);
        Futter Eminen = new Futter("Pflanzen, Trockenfutter", "jung", false);
        Futter Cihad = new Futter("Pflanzen", "jung", false);


        Tickets Normal = new Tickets("Normaler Preis", 8.0, 64);
        Tickets Ermaessigt = new Tickets("Ermäßigter Preis (für Schüler, Studenten, Kinder)", 5.0, 79);

        Shop Kuscheltierklein = new Shop("Kuscheltiere (klein)", 25.0, 32);
        Shop Kuscheltiergross = new Shop("Kuscheltiere (groß)", 50.0, 46);
        Shop Magnet = new Shop("Magnete", 5.0, 23);
        Shop Tassen = new Shop("Tassen", 9.85, 19);
        Shop Streichelzoofutter = new Shop("Futter für den Streichelzoo", 2.0, 178);


        ArrayList<Tiere> TierArray = new ArrayList<>();

        TierArray.add(Loewe1);
        TierArray.add(Loewe2);
        TierArray.add(Schlange1);
        TierArray.add(Ziege1);
        TierArray.add(Ziege2);
        TierArray.add(Pinguin1);

        for (Tiere t : TierArray) {
            t.displayAttributes();
        }

        TierArray.size();
        System.out.println("\nInsgesamt gibt es: " + TierArray.size() + " Tiere");


        int Säugetieranzahl = 0;

        for (int i = 0; i < TierArray.size(); i++) {
            if (TierArray.get(i).getArt().equals("Säugetier")) {
                Säugetieranzahl++;
            }
        }
        System.out.println("Säugetieranzahl: " + Säugetieranzahl);


        int Reptilienanzahl=0;

        for(int i=0; i<TierArray.size(); i++){
            if(TierArray.get(i).getArt().equals("Reptiel")){
                Reptilienanzahl++;
            }
        }
        System.out.println("Reptilienanzahl: "+Reptilienanzahl);




        ArrayList<Personal> PersonalArray = new ArrayList<>();

        PersonalArray.add(Person1);
        PersonalArray.add(Person2);
        PersonalArray.add(Person3);

        for (Personal p : PersonalArray) {
            p.displayAttributesPersonal();
        }
        Scanner personscann = new Scanner(System.in);
        System.out.println("\nMöchtest du die Personendaten von den Mitarbeitern einsehen? (ja, nein): ");
        String personeingabe = personscann.next();
        if(personeingabe.equals("ja")) {
            for (Personal p : PersonalArray) {
                p.displayAttributesPersonal();
            }

        PersonalArray.size();
        System.out.println("\nInsgesamt gibt es: " + PersonalArray.size() + " Arbeiter");
            PersonalArray.size();
        }
        else if(personscann.equals("nein")){
            System.out.println("ok");
        }


        Scanner futterscann = new Scanner(System.in);
        System.out.println("\nMöchtest du den Fütterungsstand von einem Tier einsehen? (ja, nein): ");
        String eingabeFutter = futterscann.next();
        if(eingabeFutter.equals("nein")){
            System.out.println("Ok");
        }
        else if(eingabeFutter.equals("ja")){
            System.out.println("Von welchem Tier Möchtest du den Fütterungsstandeinsehen? \n (Löwe, Ziege, Schlange, Pinguin): ");
            String eingabeTier = futterscann.next();
            if(eingabeTier.equals("Löwe")){
                System.out.printf("Wähle Löwe nach Name aus (Azra, Rolle): ");
                String eingabeTierName = futterscann.next();
                if(eingabeTierName.equals("Azra")){
                    Azra.displayAttributesFutter();}
                else if(eingabeTierName.equals("Rolle")){
                        Rolle.displayAttributesFutter();
                }
            }
            if(eingabeTier.equals("Schlange")){
                System.out.printf("Wähle Schlange nach Name aus (Ronja): ");
                String eingabeTierName = futterscann.next();
                if(eingabeTierName.equals("Ronja")){
                    Ronja.displayAttributesFutter();
                }
            }
            if(eingabeTier.equals("Ziege")){
                System.out.printf("Wähle Ziege nach Name aus (Sandra, Eminen): ");
                String eingabeTierName = futterscann.next();
                if(eingabeTierName.equals("Sandra")){
                    Sandra.displayAttributesFutter();}
                else if(eingabeTierName.equals("Eminen")){
                    Eminen.displayAttributesFutter();
                }
        }
            if(eingabeTier.equals("Pinguin")) {
                System.out.printf("Wähle Pinguin nach Name aus (Cihad): ");
                String eingabeTierName = futterscann.next();
                if (eingabeTierName.equals("Cihad")) {
                    Cihad.displayAttributesFutter();
                }

            }

            ArrayList<Tickets> TicketsArray = new ArrayList<>();

            TicketsArray.add(Normal);
            TicketsArray.add(Ermaessigt);

        for (Tickets tk : TicketsArray) {
            tk.displayAttributesTickets();
            Tickets.summeTickets += tk.getanzahlverkauf();
        }

        System.out.println("\nInsgesamt wurden " + Tickets.summeTickets + " verkauft");
            Scanner ticketscann = new Scanner(System.in);
            System.out.println("\nMöchtest du die Personendaten von den Mitarbeitern einsehen? (ja, nein): ");
            String ticketeingabe = ticketscann.next();
            if(ticketeingabe.equals("ja")) {
            for(Tickets tk : TicketsArray){
                tk.displayAttributesTickets();
                Tickets.summeTickets += tk.getanzahlverkauf();
            }
            System.out.println("\nInsgesamt wurden "+Tickets.summeTickets+" verkauft");
            }


            ArrayList<Shop> ShopArray = new ArrayList<>();

            ShopArray.add(Kuscheltierklein);
            ShopArray.add(Kuscheltiergross);
            ShopArray.add(Magnet);
            ShopArray.add(Tassen);
            ShopArray.add(Streichelzoofutter);

            for (Shop s : ShopArray) {
                s.displayAttributesShop();
            }

            ShopArray.size();
            System.out.println("\nFolgendes Sortiment gibt es: " + TierArray.size());
        }
    }
}