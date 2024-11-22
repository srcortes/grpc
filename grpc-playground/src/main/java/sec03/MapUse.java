package sec03;

import com.grpc.models.sec04.BodyStyle;
import com.grpc.models.sec04.Car;
import com.grpc.models.sec04.Dealer;
import org.checkerframework.checker.units.qual.C;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class MapUse {
    private static final Logger log  = LoggerFactory.getLogger(MapUse.class);

    public static void main(String[] args) {

        Car car = Car.newBuilder().setMake("Mazda").setModel("CX - 30")
                .setType(BodyStyle.SUV).setYear(2021).build();
        Car car1 = car.toBuilder().setMake("Mazda").setModel("CX - 5")
                .setType(BodyStyle.SUV)
                .setYear(2025).build();

        Map<Integer, Car> map = new HashMap<>();
        map.put(car.getYear(), car);
        map.put(car1.getYear(), car1);



        Dealer dealer  =Dealer.newBuilder().putAllInventory(map).build();

        log.info("{}", dealer.getInventoryOrThrow(2008));
    }
}
