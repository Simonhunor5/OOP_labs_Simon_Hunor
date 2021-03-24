package lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {

    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;

        this.elements = new double[length];
    }

    public MyArray(double[] elements) {

        this.length = elements.length;

        this.elements = new double[elements.length];

        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i];
        }
    }

    public MyArray(MyArray array) {


        this.length = array.length;

        this.elements = new double[this.length];

        for (int i = 0; i < array.length; i++) {
            this.elements[i] = array.elements[i];
        }
    }

    public MyArray(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner == null) {
            return;
        }

        this.length = scanner.nextInt();

        this.elements = new double[this.length];

        for (int i = 0; i < this.length; i++) {
            this.elements[i] = scanner.nextInt();
        }
    }

    public void fillRandom(double rangeMin, double rangeMax) {
        Random r = new Random();

        for (int i = 0; i < this.length; i++) {
            double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();

            this.elements[i] = randomValue;
        }
    }

    public double mean()
    {
        double sum = 0;
        for(int i = 0; i < this.length; i++)
        {
            sum += this.elements[i];
        }

        if(this.length == 0)
        {
            return Double.NaN;
        }else
        {
            return sum/ this.length;
        }
    }

    public double stddev()
    {
        double mean = mean();
        double sum = 0;
        for(int i = 0; i < this.length; i++)
        {
            sum += Math.pow((this.elements[i]-mean),2);
        }

        return Math.sqrt(sum/this.length);
    }

    public void sort()
    {
        Arrays.sort(this.elements);
    }

    public void print(String name)
    {

        System.out.print(name + ": ");

        for(int i = 0; i < this.length; i++)
        {
            System.out.printf("%.2f " , this.elements[i]);
        }

        System.out.println();
    }
}
