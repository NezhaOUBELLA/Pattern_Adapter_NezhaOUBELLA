package org.example;

public class Main {
    public static void main(String[] args) {
        Standard standard=new StandardImpl();
        standard.operation(7, 9);
        Standard adaptee1=new AdaptateurHeritage();
        adaptee1.operation(7, 9);
        Standard adaptee2=new AdapteurComposition();
        adaptee2.operation(7, 9);
    }
}