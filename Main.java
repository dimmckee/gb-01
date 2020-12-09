package J3.HomeWrk_05.prev;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        FuelStation fuelStation = new FuelStation();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Car("H4-SFD2", fuelStation));
        executorService.submit(new Bus("67DDS-560", fuelStation));
        executorService.submit(new Truck("YEGBRE-676",fuelStation));
        executorService.submit(new Car("AK89117BG", fuelStation));
        executorService.submit(new Bus("YUUF-665", fuelStation));
        executorService.submit(new Bus("67DSDDF-58", fuelStation));
        executorService.submit(new Truck("FDSGHDFE-446",fuelStation));
        executorService.submit(new Car("AERWWRT-547", fuelStation));
        executorService.submit(new Truck("YSFDGE-009",fuelStation));
        executorService.shutdown();
    }
}
