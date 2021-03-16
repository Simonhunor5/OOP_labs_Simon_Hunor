package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = readFromCSVFile("lab4_1_input.csv");

        if(people == null)
        {
            return;
        }

        for(Person p : people)
            System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getBirthYear());

    }

    public static void readFilePrintItsLineNumbered( String fileName ) {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));

            int line = 1;

            while(scanner.hasNext()) {
                System.out.println(line + ": " + scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Person> readFromCSVFile(String fileName){

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if(scanner == null)
        {
            return null;
        }

        ArrayList<Person> persons = new ArrayList<>();

        while(scanner.hasNextLine() ){
            String line = scanner.nextLine();
            if( line.isEmpty() ){
                continue;
            }
            String[] items = line.split(",");
            // trim: eliminates leading and trailing spaces
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            // Convert String → int: Integer.parseInt( String)
            int birtYear = Integer.parseInt(items[2].trim());
            persons.add( new Person(firstName, lastName, birtYear));
        }
        return persons;
    }
}
