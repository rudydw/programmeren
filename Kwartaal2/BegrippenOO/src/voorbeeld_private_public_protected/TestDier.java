package voorbeeld_private_public_protected;

public class TestDier {
    public static void main(String[] args) {
        Dier dier = new Dier("private", "public");
        Dier hond = new Hond("private", "public");

        //everyone can access publicNaam ---- DOE DIT NOOIT !!!!!!!!!!!!!
        System.out.println(dier.publicNaam);

        //no-one can access privateNaam
//        System.out.println(dier.privateNaam);

        //everyone can access publicFunction
        dier.publicFunction();

        //no-one can access privateFunction
//        dier.privateFunction();

        //only subclasses can access protectedFunction
        dier.protectedFunction();
        hond.protectedFunction();

        //objects in the same package can access functions of default scope
//        dier.defaultScopedFunction();
    }
}
