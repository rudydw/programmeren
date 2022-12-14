public class TestOefString {
    public static void main(String[] args) {
        OefString oef = new OefString();
        oef.veranderZin();
        System.out.println("-------------------------");
        System.out.println(oef);
        System.out.println("- - - - - - - - - - - - -");
        System.out.println(oef.dubbels());
        System.out.println("=========================");
        System.out.println(oef.nieuw("kiekeboe"));
    }
}
