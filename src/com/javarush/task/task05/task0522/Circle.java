package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

   public Circle(int x, int y, int radius){
       this.x = x;
       this.y = y;
       this.radius =radius;
   }
   public Circle(int x, int y){
       this.x = x;
       this.y = y;
   }
    public Circle(int x){
        this.x = x;

    }
    public Circle(){}

    public static void main(String[] args) {

    }
}