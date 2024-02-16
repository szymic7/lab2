package klasy_porownywanych_obiektow;

import java.util.Objects;

public class Data {
    private int dzien;
    private int miesiac;
    private int rok;

    public Data(int dzien, int miesiac, int rok) {
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
        if (o == null || this.getClass() != o.getClass()) return false;
        Data that = (Data) o;
        return this.getDzien() == that.getDzien() && this.getMiesiac() == that.getMiesiac() && this.getRok() == that.getRok();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getDzien(), this.getMiesiac(), this.getRok());
    }

}
