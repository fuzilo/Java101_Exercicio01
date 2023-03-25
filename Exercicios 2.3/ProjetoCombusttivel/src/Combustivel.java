import java.util.Scanner;


/**
 *
 * @author fuzil
 */
public class Combustivel {
    private double litros;
    private double totalGasto;
    private double km;
    private double valorComb;

    public Combustivel() {
        this(0.0,0.0,0.0,0.0);
    }

    public Combustivel(double litros, double totalGasto, double km, double valorComb) {
        this.litros = litros;
        this.totalGasto = totalGasto;
        this.km = km;
        this.valorComb = valorComb;
    }


    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getValorComb() {
        return valorComb;
    }

    public void setValorComb(double valorComb) {
        this.valorComb = valorComb;
    }
        
    
    public void CalcularLitros(double km){
    
  
        this.setLitros(km/12);
    
    }
    
    public double CalcularTotalGasto(double valorComb){
            this.setTotalGasto(this.getLitros()*valorComb);
            return getTotalGasto();
    
    }
    
}