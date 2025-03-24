package hu.szamalk;

import hu.szamalk.modell.Szak;
import hu.szamalk.modell.Tantargy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    private static List<String> tantargyak;
    public static void main(String[] args) {
        Szak szak = new Szak("tantárgyak");

        Tantargy tantargy = new Tantargy("valami");
        System.out.println("Beolvasott fájl");
        szak.szakBeolvasas();
        System.out.println("Vizsga tárgyak");
       // tantargy.setCsak_vizsga();

//        szak.getTargyakNevSzerint();
//        szak.getTargyakNevSzerint();

        tantargyak = new ArrayList<>();
        tantargyak.add("elso");
        tantargyak.add("masodik");
        tantargyak.add("harmadik");
        tantargyak.add("negyedik");
        tantargyak.add("otodik");
        tantargyak.add("hatodik");
        tantargyak.add("hetedik");
        Collections.sort(tantargyak);



        new Main().feladatok();


}


    private void feladatok() {
        kulonbozoTargy();
        vizsgaTargy();
        osszesKredit();
    }

    private void osszesKredit() {

    }

    private void vizsgaTargy() {

    }


    private void kulonbozoTargy() {
        System.out.println("Különböző tantárygak száma: " + tantargyak.size());
    }
}