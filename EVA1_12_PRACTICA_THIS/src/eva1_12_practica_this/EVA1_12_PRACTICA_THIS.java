package eva1_12_practica_this;

/**
 * @author José Sebastian López Ibarra
 * Friday March 04 2022
 */

public class EVA1_12_PRACTICA_THIS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Car{
    private String brand, model, vehic_type, color;
    private int year;
    private double price;
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getVehic_type() {
        return vehic_type;
    }
    public void setVehic_type(String vehic_type) {
        this.vehic_type = vehic_type;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}