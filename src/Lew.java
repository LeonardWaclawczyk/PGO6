public class Lew extends Ssak {
    private int dlugoscGrzywy;

    public Lew(String nazwa, int wiek, int dlugoscGrzywy) {
        super(nazwa, wiek);
        this.dlugoscGrzywy = dlugoscGrzywy;
    }

    public int getDlugoscGrzywy() {
        return dlugoscGrzywy;
    }

    public String poluj() {
        return "Lew poluje na zebry.";
    }

    @Override
    public String wydajDzwiek() {
        return "Ryk!";
    }

    @Override
    public String poruszajSie() {
        return "Biega po sawannie.";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna afrykańska.";
    }
}