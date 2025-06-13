public class Orzel extends Ptak {
    private double rozpietoscSkrzydel;

    public Orzel(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public double getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }

    public String szybuj() {
        return "Orzeł szybując szuka zdobyczy.";
    }

    @Override
    public String wydajDzwiek() {
        return "Kreee!";
    }

    @Override
    public String poruszajSie() {
        return "Lata wysoko.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i klify.";
    }
}