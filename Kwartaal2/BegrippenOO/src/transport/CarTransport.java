package transport;

public class CarTransport extends Transport {
    @Override
    public String calculateRoute(String startingPoint, String destination) {
        return "best way from " + startingPoint + " to " + destination + " by car ";
    }

}
