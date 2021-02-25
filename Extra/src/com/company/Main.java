package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Car car = new Car("Ford", "Fiesta", 2, true, 2002);
		System.out.println(car);
		File inpF = new File("input.txt");

		Scanner s = new Scanner(inpF);

		int numberOfCars;
		numberOfCars = s.nextInt();

		Random rand = new Random();

		Car[] cars = new Car[numberOfCars];

		for (int i = 0; i < numberOfCars; i++) {
			int fuelRand = rand.nextInt(4);
			int familyRand = rand.nextInt(2);
			boolean familyBool = (familyRand == 1);
			cars[i] = new Car(s.next(), s.next(), fuelRand, familyBool, s.nextInt());
			System.out.println(cars[i]);
		}
	}
}
