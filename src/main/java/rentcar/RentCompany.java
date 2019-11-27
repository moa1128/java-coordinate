package rentcar;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private static final String NEWLINE = System.getProperty("line.separator");
    private List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < cars.size(); i++) {
            int fuel = (int)(cars.get(i).getTripDistance() / cars.get(i).getDistancePerLiter());
            sb.append(cars.get(i).getName() + " : ");
            sb.append(fuel + "리터" + NEWLINE);
        }
        return sb.toString();
    }
}
