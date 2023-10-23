import java.util.*;

public class Main {


    public static void main(String[] args){
        Main obiekt = new Main();
        obiekt.mainLoop();
    }

    public void mainLoop(){

        int selection;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("\n         Wybierz opcje:       ");
            System.out.println("------------------------------");
            System.out.println("1 - zadanie 1 - HashSet i TreeSet");
            System.out.println("2 - zadanie 5 - ArrayList i komparator");
            System.out.println("3 - zadanie 3 - HashMap i TreeMap");
            System.out.println("4 - Zakoncz program");

            System.out.println("\nPodaj numer opcji, ktora chcesz wybrac: ");
            selection = scanner.nextInt();

            switch(selection){
                case 1:
                    this.zad1();
                    break;
                case 2:
                    this.zad5();
                    break;
                case 3:
                    //this.zad3();
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

    public void zad3(){
        
    }


}
