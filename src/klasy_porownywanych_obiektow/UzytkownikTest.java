package klasy_porownywanych_obiektow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UzytkownikTest {

    @Test
    void uzytkownikIDequals() {
        Uzytkownik uzytkownik = new Uzytkownik("antek", "antek@wp.pl", 1);
        assertTrue(uzytkownik.equals(new Uzytkownik("borek", "borek123@gmail.com", 2)));
    }

}