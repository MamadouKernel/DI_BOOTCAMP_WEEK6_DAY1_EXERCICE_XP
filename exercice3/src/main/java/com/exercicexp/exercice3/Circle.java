package com.exercicexp.exercice3;

public class Circle {
    
    private double radius = 1.0;
    private String colors = "red";
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        
    }
    
    public Circle(double radius,String colors){
      // TODO document why this constructor is empty
    }
   
    public double getRadius(){
        return this.radius;
    }
    public String getColors(){
        return this.colors;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColors(String colors){
        this.colors = colors;
    }
    
    public String toString(){
        return "Circle[radius=" + this.radius + ",color=" + this.colors + "]";
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    
}
