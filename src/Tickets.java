public class Tickets {

        private String kateogerie;
        private double preise;
        private int anzahlverkauf;
        public static int summeTickets = 0;


        private void setAttributesTickets(String kateogerie, double preise, int anzahlverkauf) {
            this.kateogerie = kateogerie;
            this.preise = preise;
            this.anzahlverkauf = anzahlverkauf;
        }

        public void displayAttributesTickets() {
            System.out.println("\nTyp: " + kateogerie);
            System.out.println("Preis: " + preise);
            System.out.println("Verkaufte Tickets: " + anzahlverkauf);
        }


        public void setkategorie(String kateogerie) {
            kateogerie = kateogerie;
        }

        public void getpreise(String kateogerie) {
            this.kateogerie = kateogerie;
        }

        public void setpreise(double preise) {
            preise = preise;
        }

        public void getpreise(double preise) {
            this.preise = preise;
        }


        public void setanzahlverkauf(int anzahlverkauf) {
            anzahlverkauf = anzahlverkauf;
        }

        public int getanzahlverkauf() {
            return this.anzahlverkauf ;
        }

        public Tickets(String kateogerie, double preise, int anzahlverkauf) {
            setAttributesTickets(kateogerie, preise, anzahlverkauf);
        }
    }