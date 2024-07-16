import java.io.*;
public class Car{
int speed;
double regularPrice;
String colour;
public Car(int speed, double regularPrice, String colour){
this.speed = speed;
this.regularPrice = regularPrice;
this.colour = colour;
}
public double getSalesPrice(){
return regularPrice;
}
public static class Truck extends Car{
int weight;
public Truck(int speed, double regularPrice, String colour, int weight) {
super(speed, regularPrice, colour);
this.weight = weight;
}
public double getSalesPrice(){
return super.getSalesPrice() * (weight > 2000 ? 0.10 : 0.20);
}
}
public static class Ford extends Car{
int year;
int manufacturerDiscount;
public Ford(int speed, double regularPrice, String colour, int year, int manufacturerDiscount) {
super(speed, regularPrice, colour);
this.year = year;
this.manufacturerDiscount = manufacturerDiscount;
}
public double getSalesPrice(){
return super.getSalesPrice() - manufacturerDiscount;
}
}
public static class Sedan extends Car{
int length;
public Sedan(int speed, double regularPrice, String colour, int length) {
super(speed, regularPrice, colour);
this.length = length;
}
public double getSalesPrice(){
return super.getSalesPrice() * (length > 20 ? 0.05 : 0.10);
}
}
public static void main(String[] args){
Sedan obj1 = new Sedan(400, 50001, "blue", 25);
Ford obj2 = new Ford(502, 6854, "red", 2015, 65);
Ford obj3 = new Ford(153, 18500, "white", 2022, 15);
Car obj4 = new Car(200, 5000, "orange");
System.out.println("Sedan: " + obj1.getSalesPrice());
System.out.println("Ford: " + obj2.getSalesPrice());
System.out.println("Ford: " + obj3.getSalesPrice());
System.out.println("Car: " + obj4.getSalesPrice());
}
}