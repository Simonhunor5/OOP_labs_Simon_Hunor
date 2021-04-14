package com.company;

public class Auto extends Jarmu{

    private int kerekekSzama;
    private String tipus;

    public Auto(int ferohelySzama, JarmuTipus tipus,String marka, int kerekekSzama, String tipus1)
    {
        super(ferohelySzama, tipus,marka);
        this.kerekekSzama = kerekekSzama;
        this.tipus = tipus1;
    }


    @Override

    public String toString()
    {
        return super.toString() +  " Kerekek szama: " + kerekekSzama + " Kinezettipus: " + this.tipus;
    }

    @Override

    public void kozlekedes()
    {
        System.out.println("Vegig halad az aszfalton");
    }
}
