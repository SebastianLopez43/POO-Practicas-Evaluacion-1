package eva1_4_clase_auto;

/**
 * @author José Sebastian López Ibarra
 * Wednesday february 23, 2022
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Kia");
        myCar.setModel("Rio");
        myCar.setVehicleType("Hashback");
        myCar.setColor("Blue");
        myCar.setYear(2021);
        myCar.setPrice(325000.00);
        myCar.printData();
    }
    
}

class Car{ // Tipos de datos Abstractos
    // Atributtes - Privates
    private String brand, model, vehic_type, color;
    private int year;
    private double price;
    
    /* Behavior
    set and get methods
    
    set -> Assign values
    get -> Read values
    */
    public void setBrand(String value){
        brand = value;
    }
    public String getBrand(){
        return brand;
    }
    public void setModel(String value){
        model = value;
    }
    public String getModel(){
        return model;
    }
    public void setVehicleType(String value){
        vehic_type = value;
    }
    public String getVehicleType(){
        return vehic_type;
    }
    public void setColor(String value){
        color = value;
    }
    public String getColor(){
        return color;
    }
    public void setYear(int value){
        year = value;
    }
    public int getYear(){
        return year;
    }
    public void setPrice(double value){
        price = value;
    }
    public double getPrice(){
        return price;
    }
    public void printData(){
        System.out.println("    -- Description --   ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type of car: " + vehic_type);
        System.out.println("Color: " + color);
        System.out.println("Year of the car: " + year);
        System.out.println("Price: $" + price + "\n");
    }
}
