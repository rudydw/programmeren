package oefening3;

public class TestMagazijn {
    public static void main(String[] args) {
        Magazijn m = new Magazijn("2820");
        Product p1 = new Product(1, "product1");
        Product p2 = new Product(10, "product1");
        Product p3 = new Product(111, "product1");
        Product p4 = new Product(3, "product1");
        m.add(p1);
        m.add(p2);
        m.add(p3);
        m.add(p4);
        m.toonProducten();
        //m.toonProducten2();
        //m.remove(3);  // exception!
    }
}
