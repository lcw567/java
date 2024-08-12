package test240719.object3;

public class Cargoplane extends Plane {

    public Cargoplane() {
    }

    public Cargoplane(String planeName, int fuelSize) {
        super(planeName, fuelSize);
    }

    @Override
    public void flight(int distance) {
        // 100 운항 시 연료 50 감소
        setFuelSize(getFuelSize() - (distance / 10) * 5);
    }
}