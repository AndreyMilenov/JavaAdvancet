package Z03SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumtionPer1Km;

    private int travelledDistance;

    public Car(String model, double fuelAmount, double fuelConsumtionPer1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumtionPer1Km = fuelConsumtionPer1Km;
        this.travelledDistance = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelConsumtionPer1Km() {
        return fuelConsumtionPer1Km;
    }

    public void setFuelConsumtionPer1Km(double fuelConsumtionPer1Km) {
        this.fuelConsumtionPer1Km = fuelConsumtionPer1Km;
    }

    public int getTravelledDistance() {
        return travelledDistance;
    }

    public void setTravelledDistance(int travelledDistance) {
        this.travelledDistance = travelledDistance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",model,fuelAmount,travelledDistance);
    }
    public double calculateRequiredFuel(int distance){
        return this.getFuelConsumtionPer1Km() * distance;
    }
    public boolean hasEnoughFuel(int distance){
        return fuelAmount >= calculateRequiredFuel(distance);
    }
    public void drive (int distance){
        if (hasEnoughFuel(distance)){
            this.fuelAmount-= calculateRequiredFuel(distance);
            this.travelledDistance+=distance;
        }else {
            System.out.println("Insufficient fuel for the drive");
        }
    }
}
