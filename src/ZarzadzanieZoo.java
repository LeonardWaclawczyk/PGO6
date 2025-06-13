public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Simba", 5, 30);
        Zwierze orzel = new Orzel("Bielik", 3, 2.5);
        Zwierze krokodyl = new Krokodyl("Kroko", 12, true);

        Zwierze[] zwierzeta = { lew, orzel, krokodyl };

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("Dźwięk: " + z.wydajDzwiek());
            System.out.println("Ruch: " + z.poruszajSie());
            System.out.println("Środowisko: " + z.srodowiskoNaturalne());
            System.out.println();
        }
    }
}