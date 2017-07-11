/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.varianta.car.action;

import chapter3.varianta.car.entities.Car;
import chapter3.varianta.car.enums.Color;
import chapter3.varianta.car.enums.Mark;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sukhocheva Maryana
 */
public class Action {
    private List<Car> arrayOfCars;
    //id generating
    public static int generateId() {
        int resultId;
        Random random =new Random();
        resultId=random.nextInt(10000);
        return resultId;
    }
    
    public boolean addCar(Car car) throws Exception {
        boolean result;
        if (car!=null) {
            result=arrayOfCars.add(car);
            System.out.println("Add car");
        } else {
            throw new Exception("Error car added");
        }
        return result;
    }
//filling the arrayOfCars with cars
     public List<Car> generateCars()  {
        List<Car> arrayOfCars = new ArrayList<Car>();
        try {
        CarBuilder action = new CarBuilder();
        Car carFirst = action.buildCar(1, Mark.BMW, "X3", 1990, Color.BLACK, 10000, "");
        Car carSecond = action.buildCar(3, Mark.DAEWOO, "Matiz", 1995, Color.WHITE, 5000, "6llGHH");
        Car carThird = action.buildCar(5, Mark.LADA, "Priora", 1999, Color.GOLD, 10000, "");
        Car carFourth = action.buildCar(7, Mark.BMW, "X3", 1990, Color.BLUE, 15000, "");
        Car carFifth = action.buildCar(22, Mark.BMW, "X3", 2016, Color.SILVER, 20000, "");
        arrayOfCars.add(carFirst);
        arrayOfCars.add(carSecond);
        arrayOfCars.add(carThird);
        arrayOfCars.add(carFourth);
        arrayOfCars.add(carFifth);
         } catch (Exception ex) {
            System.err.println("Error when creating cars");
        }
        System.out.println("Создан массив автомобилей");
        return arrayOfCars;

    }
}
