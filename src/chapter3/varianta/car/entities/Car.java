/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3.varianta.car.entities;

import chapter3.varianta.car.enums.Color;
import chapter3.varianta.car.enums.Mark;
import java.util.Random;

/**
 *
 * @author SLAVA
 */
public class Car {
    private int id;
    private Mark mark;
    private String model;
    private int yearOfIssue;
    private Color color;
    private int price;
    private String registrNumber;

   
    
    public Car(){
    }
   
    public Car(int id) {
      super(); 
      this.id = id;
    }
    public Car(int id, Mark mark,String model, int yearOfIssue, Color color, int price, String registrNumber){
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.registrNumber = registrNumber;
    }
    
     public int getId() {
        return id;
    }
    
     public final void setId(int id) throws Exception {
        if (id>0) {
            this.id = id;
        } else {
            throw new Exception("ID номер некорректен");
        }
    }
    
   
    public void setMark(Mark mark){
        this.mark = mark;
    }

    public Mark getMark(){
        return mark;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYearOfIssue(int yearOfIssue){
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue(){
        return yearOfIssue;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor(){
        return color;}

    public void  setPrice(int price){
        this.price = price;
    }

    public long getPrice(){
        return price;
    }

    public void setRegistrNumber(String registrNumber){
        this.registrNumber  = registrNumber;
    }

    public String getRegistrNumber(){
        return registrNumber;
    }

     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Автомобиль").append("\n");
        sb.append("id=").append(id).append("\n");
        sb.append("марка=").append(mark).append("\n");;
        sb.append("модель=").append(model).append("\n");;
        sb.append("год выпуска:=").append(yearOfIssue).append("\n");;
        sb.append("регистрационный номер=").append(registrNumber).append("\n");
        sb.append("цена=").append(price);
         return sb.toString();
    }

}