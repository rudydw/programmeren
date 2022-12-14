package transport;

public class FootTransport extends Transport {
    @Override
    public String calculateRoute(String startingPoint, String destination) {
        return "best way from " + startingPoint + " to " + destination + " by foot ";
    }

}
