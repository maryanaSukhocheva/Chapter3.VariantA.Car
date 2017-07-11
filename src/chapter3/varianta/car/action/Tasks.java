package chapter3.varianta.car.action;

import chapter3.varianta.car.entities.Car;
import chapter3.varianta.car.enums.Mark;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Tasks {
   //Output a list of cars of a certain brand
    public List<Car> carsOfCertainMark(List<Car> cars, Mark mark){ 
        List<Car> listCars = new ArrayList<Car>(); //Create a new array of cars
        for (Car currentCar : cars) {
            if (currentCar.getMark().equals(mark)) {
                listCars.add(currentCar); //Add the car to the new array 
            }  
        }
        return listCars;
    }

    //List of cars of the given model, which are operated more than n years
    public List<Car> carsOfModelAndLifetime(List<Car> cars, String model, int numberOfYears) {
        List<Car> listCars = new ArrayList<Car>(); //Create a new array of cars
        Date currentDate = new Date();
        int currentYear = currentDate.getYear()+1900;  //Find the current year
        for (Car currentCar : cars) { 
             if (currentCar.getModel().equals(model) && currentYear-currentCar.getYearOfIssue() > numberOfYears)
                listCars.add(currentCar); //Add the car to the new array 
        }
        return listCars;
    }

    //List of cars of a given year of production, the price of which is more than
    public List<Car> getCarsByYearAndPrice(List<Car> cars, int yearOfIssue, int price) {
        List<Car> listCars = new ArrayList<Car>(); //Create a new array of cars
        for (Car currentCar : cars) {
            if (currentCar.getYearOfIssue()==yearOfIssue && currentCar.getPrice() > price) 
                listCars.add(currentCar); //Add the car to the new array
        }
        return listCars;
    }
}
