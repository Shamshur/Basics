package Inventory;

public class Main {
    public static void main(String[] args) {
Items mechanical= new Items("booster","exhaust");
String mechanicalFirst= mechanical.getMotor();
String mechanicalSecond= mechanical.getFan();
        System.out.println("Item motor:"  + mechanicalFirst );
        System.out.println("Item fan:" + mechanicalSecond);
    }
}
 