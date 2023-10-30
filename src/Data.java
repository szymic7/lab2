import java.util.Objects;

public class Data {
    private int dzien;
    private int miesiac;
    private int rok;
    public Data(int dzien, int miesiac, int rok){
        this.dzien = dzien;
        this.miesiac = miesiac;
        this.rok = rok;
    }
    public int getDzien(){
        return this.dzien;
    }
    public int getMiesiac(){
        return this.miesiac;
    }
    public int getRok(){
        return this.rok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return dzien == data.dzien && miesiac == data.miesiac && rok == data.rok;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dzien, miesiac, rok);
    }
}
