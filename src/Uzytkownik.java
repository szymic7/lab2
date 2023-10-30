public class Uzytkownik {
    private String nazwa;
    private String email;
    private int ID;
    public Uzytkownik(String nazwa, String email, int ID){
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
}
