package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    public static final int TESTING_ITERATIONS = 15;
    public static final int NUM_RHYMERS = 3;
    public static final int BOUND = 20;

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFifoRhymer(), factory.getHanoiRhymer()};
        
        for (int i = 1; i < TESTING_ITERATIONS; i++)
            for (int j = 0; j < NUM_RHYMERS; j++)
                rhymers[j].countIn(i);
        
        java.util.Random randomNumber = new java.util.Random();
        for (int i = 1; i < TESTING_ITERATIONS; i++)
            rhymers[NUM_RHYMERS].countIn(randomNumber.nextInt(BOUND));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[NUM_RHYMERS]).reportRejected());
        
    }
    
}