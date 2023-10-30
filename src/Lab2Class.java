import java.util.*;

public class Lab2Class {


    public static void main(String[] args){
        Lab2Class obiekt = new Lab2Class();
        obiekt.mainLoop();
    }

    public void mainLoop(){

        int selection;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("\n         Wybierz opcje:       ");
            System.out.println("------------------------------");
            System.out.println("1 - zadanie 4 - HashSet i metody equals() oraz hashCode()");
            System.out.println("2 - zadanie 7 - ArrayList, Comparable i Comparator");
            System.out.println("3 - zadanie 8 - HashMap i metody equals() oraz hashCode()");
            System.out.println("4 - Zakoncz program");

            System.out.println("\nPodaj numer opcji, ktora chcesz wybrac: ");
            selection = scanner.nextInt();

            switch(selection){
                case 1:
                    //this.zad4();
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

        }while(selection!=4);
    }

    /*
    public void zad1(){
        int n;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ile liczb typu Double chcesz dodac do kolekcji HashSet i TreeSet? ");
        n = scanner1.nextInt();

        HashSet<Double> hashSet = new HashSet<Double>();
        TreeSet<Double> treeSet = new TreeSet<Double>();
        Double liczba;
        for(int i = 0; i < n; i++){
            System.out.println("Podaj " + (i+1) + ". liczbe typu Double: ");
            liczba = scanner1.nextDouble();
            hashSet.add(liczba);
            treeSet.add(liczba);
        }
        System.out.println("\nHashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }

    public void zad5(){
        Comparator<String> poWieku = new Comparator<>() {
            @Override
            public int compare(String i, String j) {
                Integer x = Integer.parseInt(i.replaceAll("[^0-9]", ""));
                Integer y = Integer.parseInt(j.replaceAll("[^0-9]", ""));
                if(x > y)
                    return 1;
                else
                    return -1;
            }
        };

        ArrayList<String> osoby = new ArrayList<String>();
        osoby.add("Jan, 30");
        osoby.add("Monika, 22");
        osoby.add("Anna, 45");
        osoby.add("Wojciech, 18");
        osoby.sort(poWieku);
        //Collections.sort(osoby, poWieku);
        System.out.println("\nLista osob, posortowana wedlug wieku:");
        for(String osoba: osoby){
            System.out.println(osoba);
        }
    }
    */

    public void zad4(){

    }

    public void zad7(){

        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt("mleko", 3.50));
        produkty.add(new Produkt("ciastka", 4.20));
        produkty.add(new Produkt("jogurt", 2.25));
        produkty.add(new Produkt("woda", 0.99));
        produkty.add(new Produkt("ciasto", 11.99));

        Collections.sort(produkty);
        System.out.println("\nProdukty z Listy posortowane za pomocą interfejsu Comparable (po nazwie alfabetycznie): ");
        for(Produkt p: produkty){
            System.out.println(p.getNazwa() + ", " + p.getCena());
        }

        Comparator<Produkt> poCenie = new Comparator<>() {
            @Override
            public int compare(Produkt p1, Produkt p2) {
                if(p1.getCena()>p2.getCena()){
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Collections.sort(produkty, poCenie);
        System.out.println("\nProdukty z Listy posortowane za pomocą Comparatora (po cenie rosnaco): ");
        for(Produkt p: produkty){
            System.out.println(p.getNazwa() + ", " + p.getCena());
        }
    }

    public void zad8(){
        HashMap<Data, String> mapaDaty = new HashMap<>();
        mapaDaty.put(new Data(12, 4, 2000), "12 kwietnia 2000 r.");
        mapaDaty.put(new Data(31, 12, 2021), "31 grudnia 2021 r.");
        mapaDaty.put(new Data(5, 8, 1996), "5 sierpnia 1996 r.");
        mapaDaty.put(new Data(17, 10, 2023), "17 pazdziernika 2023 r.");

        System.out.println("\nElementy HashMapy znalezione za pomocą kluczy w postaci obiektow Data: ");
        System.out.println(mapaDaty.get(new Data(12, 4, 2000)));
        System.out.println(mapaDaty.get(new Data(31, 12, 2021)));
        System.out.println(mapaDaty.get(new Data(5, 8, 1996)));
        System.out.println(mapaDaty.get(new Data(17, 10, 2023)));
    }


}
