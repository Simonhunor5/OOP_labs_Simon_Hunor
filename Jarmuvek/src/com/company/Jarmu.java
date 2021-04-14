package com.company;

public class Jarmu {

    private int ferohelySzama;
    private String marka;
    private JarmuTipus tipus;

    public Jarmu(int ferohelySzama, JarmuTipus tipus,String marka)
    {
        this.ferohelySzama = ferohelySzama;
        this.marka = marka;
        this.tipus = tipus;
    }

    public int getFerohelySzama() {
        return ferohelySzama;
    }

    public JarmuTipus getTipus() {
        return tipus;
    }

    public void setFerohelySzama(int ferohelySzama) {
        this.ferohelySzama = ferohelySzama;
    }

    public void setTipus(JarmuTipus tipus) {
        this.tipus = tipus;
    }

    public void kozlekedes()
    {
        System.out.println("Halad elore");
    }

    @Override

    public String toString()
    {
        return "Ferohelyek szama: " + this.ferohelySzama + " Tipus: " + this.tipus + " Marka: " + this.marka;
    }

}
