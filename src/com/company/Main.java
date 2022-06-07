package com.company;

public class Main {

    public static void main(String[] args) {
        String[] commands = {"Сидеть", "Лежать"};
        Shelter romashka = new Shelter("Romashka","Chui 100");
        Dog rex = new Dog("Rex","Ovcharka",commands , ColorEnum.BLACK,romashka);
        System.out.println(rex.getInfo());
        rex.makeVoice();
        rex.makeVoice("гув гув");
        String[] commands1 = {"Сидеть", "Лежать","Принести"};
        Shelter solnyshko = new Shelter("Solnyshko","Chak 57");
        Dog jack = new Dog("Jack","Taksa",commands1,ColorEnum.GRAY,solnyshko);
        System.out.println(jack.getInfo());
        jack.makeVoice();
        jack.makeVoice("гыв гыв");
        Dog bill = new Dog("Bill","Dvornyaga",ColorEnum.BROWN,solnyshko);
        System.out.println(bill.getInfo());
        bill.makeVoice("фав фав");
        bill.makeVoice();
    }
}
