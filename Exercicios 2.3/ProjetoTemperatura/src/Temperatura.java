/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fuzil
 */
public class Temperatura {
    
    private double celsius;
    private double fahrenheit;

    public Temperatura() {
        this (0.00,0.00);
    }

    public Temperatura(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    
    public void CalcularTempCelsius(double F){
    
        this.setCelsius((F-32)*(5/9.0));
        System.out.println("A temperatura equivale a :"+ getCelsius()+" C");
        
    }
    
    public void CalcularTempFahrenheit(double C){
    
        this.setFahrenheit(C*1.8+32);
         System.out.println("A temperatura equivale a :"+getFahrenheit()+" F");
    }
    
    
    
    
}