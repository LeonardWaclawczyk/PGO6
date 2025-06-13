public abstract class Zwierze {
    protected String nazwa;
    protected int wiek;

    public Zwierze(String nazwa, int wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void wyswietlInformacje() {
        String nazwaKlasy = getClass().getSimpleName(); // np. Lew
        String nadrzednaKlasa = getClass().getSuperclass().getSimpleName(); // np. Ssak
        System.out.println("Nazwa: " + nazwa + ", Wiek: " + wiek + ", Typ: " + nazwaKlasy + " (" + nadrzednaKlasa + ")");
    }


    public abstract String wydajDzwiek();
    public abstract String poruszajSie();
    public abstract String srodowiskoNaturalne();
}