package lab13.Builder.exercise;

public interface Builder {

    Builder reset();

    Builder setSeats(int number);

    Builder setEngine(Engine engine);

    Builder setTripComputer(TripComputer tripComputer);

    Builder setGPS(GPS gps);
}

