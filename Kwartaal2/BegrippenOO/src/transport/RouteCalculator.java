package transport;

public class RouteCalculator {

    public String calculate(Transport transport, String startingPoint, String destination) {
        String result = "";
        result += "calculating....\n";
        result += "=================================\n";
        result += "this is the calculated route: \n";
        result += transport.calculateRoute(startingPoint, destination);
        result += "\n";
        result += "=================================\n";
        return result;
    }

    public void calculateAllPossibleRoutes (Transport[] lijst, String startingPoint, String destination) {
        for (Transport t : lijst) {
            System.out.println(t.calculateRoute(startingPoint, destination));
        }
    }
}
