package sem1;

import java.util.Arrays;
import java.util.Random;

public class Average {
    private double average;
    private double[] array;

    public  Average(double[] array){
        this.array = array;
    }

    public void calculateAverage(){
        double result = Arrays.stream(array).average().getAsDouble();
        System.out.println(result);
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextDouble(10);
            System.out.print(Math.round(array[i])+","+" ");
        }
        ;
        new Average(array).calculateAverage();
    }
}

