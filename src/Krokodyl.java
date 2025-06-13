public class Krokodyl extends Gad {
    private boolean wodny;

    public Krokodyl(String nazwa, int wiek, boolean wodny) {
        super(nazwa, wiek);
        this.wodny = wodny;
    }

    public boolean czyWodny() {
        return wodny;
    }

    public String czajSie() {
        return "Krokodyl czai się w wodzie.";
    }

    @Override
    public String wydajDzwiek() {
        return "Chrum!";
    }

    @Override
    public String poruszajSie() {
        return "Pełznie po błocie.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Rzeki i bagna tropikalne.";
    }
}