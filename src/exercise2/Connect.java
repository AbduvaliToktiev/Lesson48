package exercise2;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Connect {
    private final String url = "jdbc:postgresql://localhost:5432/praktik";
    private final String user = "postgres";
    private final String password = "abdutokt2004";

    public Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public Map<Car, CarsInformation> dataBaseInHashMap() {
        Map<Car, CarsInformation> hashMap = new HashMap<>();
        String sql = "select ci.id as car_i_id, * from \"Lesson49\".cars " +
                "inner join \"Lesson49\".cars_information ci on cars.id = ci.cars_id";
        try (Connection connection = connection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Car car = new Car();
                car.setId(resultSet.getInt("ID"));
                car.setAutoNumber(resultSet.getString("AUTO_NUMBER"));

                CarsInformation carsInformation = new CarsInformation();
                carsInformation.setCarsId(resultSet.getInt("CARS_ID"));
                carsInformation.setId(resultSet.getInt("CAR_I_ID"));
                carsInformation.setYearOfIssue(resultSet.getInt("YEAR_OF_ISSUE"));
                carsInformation.setModel(resultSet.getString("MODEL"));
                carsInformation.setPrice(resultSet.getInt("PRICE"));
                carsInformation.setColor(resultSet.getString("COLOR"));
                hashMap.put(car, carsInformation);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return hashMap;
    }
}
