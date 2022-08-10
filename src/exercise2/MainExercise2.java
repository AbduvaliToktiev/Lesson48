package exercise2;

import java.util.Map;

public class MainExercise2 {
    public static void main(String[] args) {
        Connect connect = new Connect();
        connect.connection();
        Map<Car, CarsInformation> carsInformationMap = connect.dataBaseInHashMap();
        if (carsInformationMap.isEmpty()) {
            System.out.println("EMPTY AUTO");
        } else {
            for (Map.Entry<Car, CarsInformation> entryCars : carsInformationMap.entrySet()) {
                System.out.println(entryCars.getKey() + " " + entryCars.getValue());
                System.out.println("-------");
            }
        }
    }
}
