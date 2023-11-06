public class Produkt implements Comparable<Produkt> {
    private String nazwa;
    private double cena;

    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa(){
        return this.nazwa;
    }
    public double getCena(){
        return this.cena;
    }

    @Override
    public int compareTo(Produkt p) {
        int swap = 0;
        for(int i = 0; i < this.getNazwa().length(); i++) {
            if(this.getNazwa().charAt(i) > p.getNazwa().charAt(i)) {
                swap = 1;
                break;
            } else if(this.getNazwa().charAt(i) < p.getNazwa().charAt(i)) {
                swap = -1;
                break;
            }
        }
        return swap;
    }

    @Override
    public String toString() {
        return this.getNazwa() + ", " + String.format("%.2f", this.getCena()) + " zl";
    }

}
