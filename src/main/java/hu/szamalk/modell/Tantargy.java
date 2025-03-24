package hu.szamalk.modell;

import java.util.List;
import java.util.Objects;

public class Tantargy {
    private String nev,tantargy;
    private int kredit;
    private List<String> tanarok;
    private boolean csak_vizsga;

    public Tantargy(String nev, String tantargy, int kredit, List<String> tanarok, boolean csak_vizsga) {
        this.nev = nev;
        this.tantargy = tantargy;
        this.kredit = kredit;
        this.tanarok = tanarok;
        this.csak_vizsga = csak_vizsga;
    }

    public Tantargy(String nev) {
        this.nev = nev;
        this.kredit = kredit;
        this.tanarok = tanarok;
        this.csak_vizsga = csak_vizsga;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKredit() {
        return kredit;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    public List<String> getTanarok() {
        return tanarok;
    }

    public void setTanarok(List<String> tanarok) {
        this.tanarok = tanarok;
    }

    public boolean isCsak_vizsga() {
        return csak_vizsga;
    }

    public void setCsak_vizsga() {
        if (csak_vizsga == true){
            System.out.println(tantargy);
        } else if (csak_vizsga == false) {
            System.out.println(tantargy);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tantargy tantargy = (Tantargy) o;
        return Objects.equals(nev, tantargy.nev);
    }



}
