package agh.po.lab2;
import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i<=6;) {
            int numer = r.nextInt(49) + 1;
            if (!lista.contains(numer)){
                lista.add(numer);
                i++;
                }
        }
        System.out.println(lista);
    }
}
