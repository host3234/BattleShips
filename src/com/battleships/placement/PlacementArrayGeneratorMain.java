package com.battleships.placement;

public class PlacementArrayGeneratorMain {


    private static final String FILE_PATH = "mc.txt";
    private static final int ITERATION_COUNT = 1000*1000;
    public static void main(String[] args) {

        PlacementArrayGenerator.generate(FILE_PATH,ITERATION_COUNT);
    }
}