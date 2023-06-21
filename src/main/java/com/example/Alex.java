package com.example;

public class Alex extends Lion {

    public Alex(Feline feline) throws Exception {
        super(feline, "Самец");
    }

    public String getFriends() {
        return "Марти, Глория, Мелман";
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
