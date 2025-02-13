package br.com.lucasmayrink.www.arrayunidimensional;

import java.util.Arrays;

public class ArraysExample { // Renomeei a classe para evitar conflito
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 3.0, 6.0};

        Arrays.stream(notas).forEach(System.out::println);
    }
}