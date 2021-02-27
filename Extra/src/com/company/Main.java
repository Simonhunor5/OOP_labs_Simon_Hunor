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

		for (int i = 0; i < numberOfCars; i++)
		{
			int fuelRand = rand.nextInt(4);
			int familyRand = rand.nextInt(2);
			boolean familyBool = (familyRand == 1);
			cars[i] = new Car(s.next(), s.next(), fuelRand, familyBool, s.nextInt());
			System.out.println(cars[i]);
		}

		Scanner in = new Scanner(System.in);

		System.out.print("N=");
		int n = in.nextInt();

		Car[] carsNew = new Car[n];

		for(int i = 0; i < n; i++)
		{
			Scanner inNew = new Scanner(System.in);
			System.out.printf("Give the %d car's brand: \n", i + 1);
			String carBrand = inNew.nextLine();
			System.out.printf("Give the %d. car's type: \n", i + 1);
			String carType = inNew.nextLine();
			System.out.printf("Give the %d. car's fuel (0 – DIESEL, 1 – PETROL, 2 – GAS, otherwise – ELECTRIC) : \n", i + 1);
			int fuel = inNew.nextInt();
			System.out.printf("Is %d. a family car? (1 - YES, 0 - NO): \n", i + 1);
			int family = inNew.nextInt();
			boolean familyBool = (family == 1);
			System.out.printf("Give %d. year of manufacture: \n", i + 1);
			int year = inNew.nextInt();

			carsNew[i] = new Car(carBrand, carType, fuel, familyBool, year);
			System.out.println(carsNew[i]);
		}

		System.out.print("How many times do u want each car to move?: ");

		int numberOfMoves = in.nextInt();

		int actSpeed = 0;
		boolean firstReset = true;


		for(int i = 0; i < numberOfMoves; i++)
		{



			for(int j = 0; j < n; j++)
			{
				int randKilometers = rand.nextInt(50);
				carsNew[j].moveCar(randKilometers);

				actSpeed += 10;

				if(carsNew[j].getSpeed() >= 180)
				{
					System.out.println("U cant go faster than 180km/h!");
				}else
				{
					carsNew[j].changeSpeed(actSpeed);
				}
				

				if(carsNew[j].getNumberOfKilometers() > 200)
				{
					if(firstReset)
					{
						System.out.println("The first reseted car was " + (j + 1) + ". !");
						firstReset = false;
					}
					carsNew[j].resetMileage();
				}

			}



		}

		int numberOfDiesel = 0, numberOfRed = 0;

		for(int i = 0; i < n; i++)
		{

			if(carsNew[i].getFuel() == FuelType.DIESEL)
			{
				System.out.println(carsNew[i]);
				numberOfDiesel++;
			}
			if(carsNew[i].getColor() == Color.RED)
			{
				numberOfRed++;
			}

		}

		System.out.println("The number of DIESEL cars is: " + numberOfDiesel + " and the number of RED cars is " + numberOfRed);

	}
}
