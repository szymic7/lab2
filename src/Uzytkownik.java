import java.util.Objects;

public class Uzytkownik {
    private String nazwa;
    private String email;
    private int ID;

    public Uzytkownik(String nazwa, String email, int ID) {
        this.nazwa = nazwa;
        this.email = email;
        this.ID = ID;
    }

    public String getNazwa(){
        return this.nazwa;
    }
    public String getEmail(){
        return this.email;
    }
    public int getID(){
        return this.ID;
    }

    @Override
    public String toString() {
        return "Nazwa uzytkownika: " + this.getNazwa() + ", adres email: " + this.getEmail() + ", ID: " + String.format("%03d", this.getID());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Uzytkownik that = (Uzytkownik) o;
        return this.ID == that.getID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.ID);
    }

}
