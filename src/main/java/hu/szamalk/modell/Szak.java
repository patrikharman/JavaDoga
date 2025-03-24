package hu.szamalk.modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class Szak implements Comparable<Szak>{
    private String nev;
    private UUID id;
    private List<String> tantargyak;

    public Szak(String nev) {
        this.nev = nev;
        this.id = UUID.randomUUID();
        this.tantargyak = tantargyak;
    }

    public void szakKiirasa(){

    }

    public void szakBeolvasas(){
        String fn= "tantargyak.txt";
        try {
            List<String> sorok = Files.readAllLines(Path.of(fn));
            for (String sor : sorok){
                System.out.println(sor);
            }
        } catch (IOException e) {
            System.err.println("Hiba a fájl olvasás közben!" + e.getMessage());
        }

    }

    public List<Tantargy> getTargyakNevSzerint(){
        tantargyak.sort((Comparator<? super String>) tantargyak);
        return List.of();
    }



    @Override
    public String toString() {
        return "Szak{" +
                "nev='" + nev + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Szak masik) {
        Collator coll = Collator.getInstance();
        return coll.compare(this.tantargyak,masik.tantargyak);
    }


}
