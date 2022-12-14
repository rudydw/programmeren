public class TestOefArray {
    public static void main(String[] args) {

        OefArray o = new OefArray();
        int som = o.inVullen();
        System.out.println(o + "\nDe som hiervan is : " + som);
        System.out.println(o.isTien());
    }

}
