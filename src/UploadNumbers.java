import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UploadNumbers {
    public static void main(String[] args) throws IOException {


        File file = new File("liczby.txt");
        Scanner scan = new Scanner(file);

        List<Integer> liczby = new LinkedList<>();

        while (scan.hasNextLine()) {
            int NextInt = scan.nextInt();
            liczby.add(NextInt);
        }

        System.out.println(liczby.toString());


    }
}

