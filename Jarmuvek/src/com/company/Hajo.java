package com.company;

public class Hajo extends Jarmu{

    private int matrozokSzama;
    private double horgonySulya;

    public Hajo(int ferohelySzama, JarmuTipus tipus,String marka, double horgonySulya, int matrozokSzama)
    {
        super(ferohelySzama,tipus,marka);
        this.matrozokSzama = matrozokSzama;
        this.horgonySulya = horgonySulya;
    }

    public double getHorgonySulya() {
        return horgonySulya;
    }

    public int getMatrozokSzama() {
        return matrozokSzama;
    }

    @Override

    public String toString()
    {
        return "HAJO <=> " +  " Matrozok szama: " + this.matrozokSzama + " HorgonySulya: " + this.horgonySulya + " " + super.toString();
    }

    @Override

    public void kozlekedes()
    {
        System.out.println("Oceanon uszik");
    }
}
