package chapter3.varianta.car.action;

import chapter3.varianta.car.entities.Car;
import chapter3.varianta.car.enums.Color;
import chapter3.varianta.car.enums.Mark;
import chapter3.varianta.car.exception.ParamsException;

/**
 *
 * @author Sukhocheva Maryana
 */
public class CarBuilder {
    
    //Creating a book on the set parameters
    public Car buildCar(int id, Mark mark,String model, int yearOfIssue, Color color, int price, String registrNumber) throws Exception {
        Car car = new Car();
         if (mark!=null && !model.isEmpty() && model!=null && yearOfIssue>=0 && color!=null && price>=0 && registrNumber!=null ) {
                if (id == 0) {
                    id = Action.generateId(); //id generation
                }
                try {
                    car.setId(id);
                    car.setMark(mark);
                    car.setModel(model);
                    car.setYearOfIssue(yearOfIssue);
                    car.setColor(color);
                    car.setPrice(price);
                    car.setRegistrNumber(registrNumber);
                    
                   
                } catch (ParamsException ex) {
                    System.out.println("Car error");
                }

        } else {
             System.out.println("Parametrs incorrect");
        }

        return car;
    }
    
    
    
    
}
