package com.company;

public enum CatBreed {
    Polydactyl, Snowshoe, Calico, BritishShorthair, Siamese, JapaneseBobtail, Persian, GrayTabby;

    public final String label;

    private CatBreed(String label)
    {
        this.label = label;
    }

    

}
