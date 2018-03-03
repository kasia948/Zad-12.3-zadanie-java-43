import java.io.*;
import java.util.*;

public class UploadNumbers {
    public static void main(String[] args) throws IOException {


        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);

        TreeMap<Integer, Integer> liczby = new TreeMap<>();

        int nextKey; //zmienna która bedzie kluczem

        while (scan.hasNextInt()) {

            nextKey = scan.nextInt();// do zmiennej przypisuje się wartość z listy liczb
            int liczbaWystaplien = 1; //inna zmienna (będzie liczyć ilość wystapliń)

            if (!liczby.containsKey(nextKey)) {
                liczby.put(nextKey, liczbaWystaplien); //wstawia do mapy pierszą liczbę do klucza i liba wsyt to 1
            } else {
                Integer wart = liczby.get(nextKey);
                wart = wart + 1;
                liczby.put(nextKey,wart);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = liczby.entrySet();
        System.out.println(entries);

        Integer k = liczby.firstKey();
        System.out.println(liczby.firstKey()+": Liczba wystąpień: "+liczby.get(k));
        System.out.println(liczby.keySet()+": Liczba wystąpień: "+liczby.values());
        }
    }
