public class Demo {
    public static double calculateTollFee(String vehicleType, boolean hasRFID) {
        double fee = 0;
        if (vehicleType.equalsIgnoreCase("Car")) {
            fee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            fee = 200;
        }
        if (hasRFID) {
            fee *= 0.9; 
        }
        return fee;
    }
    public static void main(String[] args) {
        String[] vehicleTypes = {"Car", "Truck", "Car"};
        boolean[] hasRFID = {true, false, true};
        for (int i = 0; i < vehicleTypes.length; i++) {
            double tollFee = calculateTollFee(vehicleTypes[i], hasRFID[i]);
            System.out.println("Toll fee for vehicle " + (i + 1) + ": ₹" + tollFee);
        }
    }
}
