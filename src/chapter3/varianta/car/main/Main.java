package chapter3.varianta.car.main;

import chapter3.varianta.car.action.Action;
import chapter3.varianta.car.action.OutputData;
import chapter3.varianta.car.action.Tasks;
import chapter3.varianta.car.entities.Car;
import chapter3.varianta.car.enums.Mark;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Sukhocheva Maryana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Action action = new Action();
            List<Car> cars = new ArrayList<Car>();
            cars = action.generateCars();
            Tasks tasks = new Tasks();
            
            System.out.println("Cписок автомобилей марки BMW:");
            List<Car> listCarsFirst = tasks.carsOfCertainMark(cars, Mark.BMW);
            OutputData.outputListCars(listCarsFirst);
                        
            System.out.println("Cписок автомобилей модели X3, которые эксплуатируются больше 3 лет:");
            List<Car> listCarsSecond = tasks.carsOfModelAndLifetime(cars, "X3", 3);
            OutputData.outputListCars(listCarsSecond);
                        
            System.out.println("Cписок автомобилей 1990 года выпуска, цена которых больше 10000:");
            List<Car> listCarsThird = tasks.getCarsByYearAndPrice(cars, 1990, 10000);
            OutputData.outputListCars(listCarsThird);
       
        

    }
}
