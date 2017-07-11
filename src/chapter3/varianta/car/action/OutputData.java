package chapter3.varianta.car.action;

import chapter3.varianta.car.entities.Car;
import java.util.List;

/**
 *
 * @author Sukhocheva Maryana
 */
public class OutputData {
    
    public static void outputListCars (List<Car> listCars) {
    for (Car car : listCars)
            System.out.println(car.toString());
            System.out.println("---------------");
    
    }
}
