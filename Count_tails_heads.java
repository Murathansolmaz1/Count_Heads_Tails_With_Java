package com.company;

public class Count_tails_heads {

    public static void main(String[] args) {
        Counter headCount, tailCount;
        tailCount = new Counter();
        headCount = new Counter();
        for ( int flip = 0; flip < 100; flip++ ) {
            if (Math.random() < 0.5) // There's a 50/50 chance that this is true.
                headCount.increment(); // Count a "head".
            else
                 tailCount.increment(); // Count a "tail".
        }
        System.out.println("There were " + headCount.getValue() + " heads.");
        System.out.println("There were " + tailCount.getValue() + " tails.");
    }
}

class Counter{
    private int counter;

    Counter(){
        counter=0;
    }

    public void increment(){
        counter++;
    }
    public int getValue(){
        return counter;
    }
}
