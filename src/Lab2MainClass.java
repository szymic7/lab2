import java.util.*;

public class Lab2MainClass {

    public static void main(String[] args) {
        Lab2MainClass obiekt = new Lab2MainClass();
        obiekt.mainLoop();
    }


    public void mainLoop() {

        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n         Wybierz opcje:       ");
            System.out.println("------------------------------");
            System.out.println("1 - zadanie 4 - HashSet i metody equals() oraz hashCode()");
            System.out.println("2 - zadanie 7 - ArrayList, Comparable i Comparator");
            System.out.println("3 - zadanie 8 - HashMap i metody equals() oraz hashCode()");
            System.out.println("4 - Zakoncz program");

            System.out.println("\nPodaj numer opcji, ktora chcesz wybrac: ");
            selection = scanner.nextInt();

            switch(selection) {
                case 1:
                    this.zad4();
                    break;
                case 2:
                    this.zad7();
                    break;
                case 3:
                    this.zad8();
                    break;
                case 4:
                    System.out.println("\nProgram zakonczony.");
                    break;
                default:
                    System.out.println("\nNieprawidlowy numer wybranego polecenia. Wybierz polecenie ponownie.");
                    break;
            }

        } while(selection!=4);

    }


    public void zad4() {

        HashSet<Uzytkownik> uzytkownicy = new HashSet<>();
        uzytkownicy.add(new Uzytkownik("marek13", "marek13@gmail.com", 001));
        uzytkownicy.add(new Uzytkownik("gracz", "gracz@gmail.com", 002));
        uzytkownicy.add(new Uzytkownik("bartek30", "bartek.bartek@wp.pl", 001));
        uzytkownicy.add(new Uzytkownik("maks2000", "maksymilian2000@gmail.com", 003));
        uzytkownicy.add(new Uzytkownik("tomek99", "tomek.99@yahoo.com", 002));

        System.out.println("\nUzytkownicy o unikatowych numerach ID, dodani do HashSetu:");
        for(Uzytkownik u: uzytkownicy) {
            System.out.println(u.toString());
        }

    }


    public void zad7() {

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt("mleko", 3.50));
        produkty.add(new Produkt("ciastka", 4.20));
        produkty.add(new Produkt("jogurt", 2.25));
        produkty.add(new Produkt("woda", 0.99));
        produkty.add(new Produkt("ciasto", 11.99));

        Collections.sort(produkty);
        System.out.println("\nProdukty z Listy posortowane za pomocą interfejsu Comparable (po nazwie alfabetycznie): ");
        for(Produkt p: produkty) {
            System.out.println(p.toString());
        }

        Comparator<Produkt> poCenie = new Comparator<>() {
            @Override
            public int compare(Produkt p1, Produkt p2) {
                if(p1.getCena()>p2.getCena())
                    return 1;
                else if(p1.getCena()<p2.getCena())
                    return -1;
                else
                    return 0;
            }
        };

        Collections.sort(produkty, poCenie);
        System.out.println("\nProdukty z Listy posortowane za pomocą Comparatora (po cenie rosnaco): ");
        for(Produkt p: produkty) {
            System.out.println(p.toString());
        }

    }


    public void zad8() {

        HashMap<Data, String> mapaDaty = new HashMap<>();
        mapaDaty.put(new Data(12, 4, 2000), "12 kwietnia 2000 r.");
        mapaDaty.put(new Data(31, 12, 2021), "31 grudnia 2021 r.");
        mapaDaty.put(new Data(5, 8, 1996), "5 sierpnia 1996 r.");
        mapaDaty.put(new Data(17, 10, 2023), "17 pazdziernika 2023 r.");

        System.out.println("\nElementy HashMapy znalezione za pomocą kluczy w postaci obiektow klasy Data: ");
        System.out.println(mapaDaty.get(new Data(12, 4, 2000)));
        System.out.println(mapaDaty.get(new Data(31, 12, 2021)));
        System.out.println(mapaDaty.get(new Data(5, 8, 1996)));
        System.out.println(mapaDaty.get(new Data(17, 10, 2023)));

    }

}
