/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author kernel-mk
 */
public class Circle {
    
    private Double radius = 1.0;
    private String colors = "red";
    
    public Circle(){
        
    }
    
    public Circle(Double radius){
        
    }
    
    public Circle(Double radius,String colors){
        
    }
   
    public Double getRadius(){
        return this.radius;
    }
    public String getColors(){
        return this.colors;
    }
    
    public void setRadius(Double radius){
        this.radius = radius;
    }

    public void setColors(String colors){
        this.colors = colors;
    }
    
    public String toString(){
        return "Circle[radius=" + this.radius + ",color=" + this.colors + "]";
    }

    public Double getArea(){
        return Math.PI * this.radius * this.radius;
    }
    
}
