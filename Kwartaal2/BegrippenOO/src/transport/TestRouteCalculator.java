package transport;


//oefening 1: maak een nieuw transport-middel TrainTransport en voeg die toe aan de array van transport-middelen

//oefening 2: maak in main een array met daarin de verschillende transport-middelen.
//  Maak in RouteCalculator een method calculateAllPossibleRoutes met als parameter deze array
//  de functie print de route met de verschillende transportmiddelen

//oefening 3: maak in Transport een nieuwe functie calculateDistance() met dezelfde parameters als calculateRoute
//  Deze functie returnt een integer - de berekende afstand met dit transportmiddel (test purposes: geef gewoon een getal terug)

//oefening 4: maak in RouteCalculator een nieuwe functie shortestDistance() met als parameters :
//  een array van Transport objecten, een startingPoint-string en een destination-string
//  Deze functie returnt de route-description (String) die de kortste route beschrijft

//oefening 5: maak in Transport een nieuwe functie calculatedTime() met dezelfde parameters als calculateRoute.
//  Deze functie returnt een double - de berekende tijd nodig met dit transportmiddel (test purposes: geef gewoon een getal terug)
// Maak in RouteCalculator een nieuwe functie fastest() met als parameters :
//  een array van Transport objecten, een startingPoint-string en een destination-string
//  Deze functie returnt de route-description (String) die de snelste route beschrijft


public class TestRouteCalculator {

    public static void main(String[] args) {
        Transport transportByCar = new CarTransport();
        System.out.println(transportByCar.calculateRoute("centraal station", "restaurant"));

        Transport transportByBycicle = new BycicleTransport();
        System.out.println(transportByBycicle.calculateRoute("centraal station", "restaurant"));

        Transport transportByFoot  = new FootTransport();
        System.out.println(transportByFoot.calculateRoute("centraal station", "restaurant"));

        Transport transportByTrain  = new TrainTransport();
        System.out.println(transportByTrain.calculateRoute("centraal station", "restaurant"));

        RouteCalculator routeCalculator = new RouteCalculator();
        System.out.println(routeCalculator.calculate(transportByCar, "centraal station", "restaurant"));

//        ArrayList<Transport> transportArrayList = new ArrayList<>();
//        transportArrayList.add(transportByBycicle);
//        transportArrayList.add(transportByCar);
//        transportArrayList.add(transportByFoot);
//        transportArrayList.add(transportByTrain);

        Transport[] allTransports = new Transport[] {
                new BycicleTransport(),
                new CarTransport(),
                new FootTransport(),
                new TrainTransport()
        };

        routeCalculator.calculateAllPossibleRoutes(allTransports, "centraal station", "restaurant");
    }
}
