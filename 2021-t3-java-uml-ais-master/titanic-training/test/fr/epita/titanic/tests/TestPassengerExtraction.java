package fr.epita.titanic.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fr.epita.titanic.datamodel.Passenger;
import fr.epita.titanic.services.PassengerCSVReader;
import fr.epita.titanic.services.PassengerCSVReader2;
import java.util.Collections;
public class TestPassengerExtraction {

    public static void main(String[] args) throws IOException {

        givenTestFile_thenWeShouldHaveAValidListOfPassengers();
        computeStatisticalFacts();


    }

    private static void givenTestFile_thenWeShouldHaveAValidListOfPassengers() throws IOException {
        File file = new File("C:\\Users\\Natarajvikram\\Documents\\EPITA\\Semester 1\\java and UML\\titanic_assignment\\2021-t3-java-uml-ais-master\\titanic-training\\test.csv");
        PassengerCSVReader2 reader = new PassengerCSVReader2();
        List<Passenger> passengers = reader.readPassengers(file);

        System.out.println(passengers);

    }

    private static void computeStatisticalFacts() {
        // PassengerCSVReader reader = new PassengerCSVReader();
        // List<Passenger> passengers = reader.read(new File("C:\\Users\\Natarajvikram\\Documents\\EPITA\\Semester 1\\java and UML\\titanic_assignment\\2021-t3-java-uml-ais-master\\titanic-training\\test.csv"));
        File file = new File("C:\\Users\\Natarajvikram\\Documents\\EPITA\\Semester 1\\java and UML\\titanic_assignment\\2021-t3-java-uml-ais-master\\titanic-training\\test.csv");
        PassengerCSVReader2 reader = new PassengerCSVReader2();
        List<Passenger> passengers = null;
        try {
            passengers = reader.readPassengers(file);
        } catch (IOException e) {
            e.printStackTrace();
        }




        Double totalAge = 0.0;
        for(Passenger passenger : passengers){
            totalAge += passenger.getAge();
        }
        double averageAge = totalAge / passengers.size();
        System.out.println(averageAge);


        /*Double totalAge = 0.0;
        for(Passenger passenger : passengers){
            sorted_age = passenger.getAge();
        }
        double averageAge = totalAge / passengers.size();
        System.out.println(averageAge);*/
        int count = 0;
        for(Passenger passenger : passengers){
            if(passenger.getAge()<10){
                count++;
            }

            }
        System.out.println("Number of people less than 10 years old:"+ count);


        List<Double> list = new ArrayList<>();
        for(Passenger passenger : passengers) {
            list.add(passenger.getAge());
        }

        //System.out.println(list);
        Collections.sort(list);
        //System.out.println(list);


        //Collections.sort(sets);

        //System.out.println(list.size());
        double middle = list.size()/2;

        middle = middle > 0 && middle % 2 == 0 ? middle - 1 : middle;
        int middle1 = (int)middle;
        System.out.println("The median of ages column is:"+list.get(middle1));

        Double[] array = list.toArray(new Double[0]);


        double mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            double value = array[i];
            int count_ = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) count_++;
                if (count_ > maxCount) {
                    mode = value;
                    maxCount = count_;
                }
            }
        }
        System.out.println("mode of ages column is:"+mode);







        double sum = 0.0, standardDeviation = 0.0;
        int length = array.length;

        for(double num : array) {
            sum += num;
            }

        double mean = sum/length;

        for(double num: array) {
            standardDeviation += Math.pow(num - mean, 2);
            }

        System.out.println("The standard deviation of the age column is:"+Math.sqrt(standardDeviation/length));


















    }
}
