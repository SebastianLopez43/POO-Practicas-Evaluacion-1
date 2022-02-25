package eva1_5_computer_class;

/**
 *
 * @author José Sebastian López Ibarra
 * Thursday february 24 2022
 */
public class EVA1_5_COMPUTER_CLASS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computer myComp = new Computer();
        myComp.setProcessor("Intel Core i5 10400 CPU 2.9GHz");
        myComp.setOperativeSystem("Windows 10");
        myComp.setRAM_Model("Kingston Fury Beast ");
        myComp.setRAM_Memory(16);
        myComp.setPowerSupplyModel("EVGA ");
        myComp.setPowerSupply(500);
        myComp.setHardDiskModel("Adata Swordfish ");
        myComp.setHardDisk(500);
        myComp.setGraphicCard("Gygabyte GeForce GTX ");
        myComp.setGraphicCardModel(1660);
        myComp.setNetPrice(16479);
        myComp.setCabinet("Yeyian Blade 2100");
        myComp.printData();
    }
    
}

class Computer{
    // Atributtes
    private String processor, oper_Syst, graphic_card, RAM_Model, hard_disk_model, power_supply_model, cabinet;
    private int RAM, hard_disk, power_supply, graphic_card_model;
    private double net_price;
    
    // Methods
    public void setProcessor(String value){
        processor = value;
    }
    public String getProccesor(){
        return processor;
    }
    public void setOperativeSystem(String value){
        oper_Syst = value;
    }
    public String getOperativeSystem(){
        return oper_Syst;
    }
    public void setGraphicCard(String value){
        graphic_card = value;
    }
    public String getGraphicCard(){
        return graphic_card;
    }
    public void setGraphicCardModel(int value){
        graphic_card_model = value;
    }
    public int getGraphicCarModel(){
        return graphic_card_model;
    }
    public void setRAM_Model(String value){
        RAM_Model = value;
    }
    public String getRAM_Model(){
        return RAM_Model;
    }
    public void setRAM_Memory(int value){
        RAM = value;
    }
    public int getRAM_Memory(){
        return RAM;
    }
    public void setHardDiskModel(String value){
        hard_disk_model = value;
    }
    public String getHardDiskModel(){
        return hard_disk_model;
    }
    public void setHardDisk(int value){
        hard_disk = value;
    }
    public int getHardDisk(){
        return hard_disk;
    }
    public void setPowerSupplyModel(String value){
        power_supply_model = value;
    }
    public String getPowerSupplyModel(){
        return power_supply_model;
    }
    public void setPowerSupply(int value){
        power_supply = value;
    }
    public int getPowerSupply(){
        return power_supply;
    }
    public void setCabinet(String value){
        cabinet = value;
    }
    public String getCabinet(){
        return cabinet;
    }
    public void setNetPrice(double value){
        net_price = value;
    }
    public double getNetPrice(){
        return net_price;
    }

    public void printData(){
        System.out.println("    -- Description --");
        System.out.println("Proccesor: " + processor);
        System.out.println("Operative System: " + oper_Syst);
        System.out.println("RAM Memory: " + RAM_Model + RAM + "GB");
        System.out.println("Power Supply: " + power_supply_model + power_supply + "W");
        System.out.println("Hard Disk: " + hard_disk_model + hard_disk + "GB");
        System.out.println("Graphic Card: " + graphic_card + graphic_card_model);
        System.out.println("Cabinet: " + cabinet);
        System.out.println("Net Price: $" + net_price);
        System.out.println("Total Price: $" + net_price*1.16);
    }
}
