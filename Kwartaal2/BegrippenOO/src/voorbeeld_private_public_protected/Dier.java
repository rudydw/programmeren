package voorbeeld_private_public_protected;


public class Dier {
    //only objects of class Dier can use privateNaam
    private String privateNaam;

    //all objects use publicNaam
    //never make public fields in a class!!!!
    public String publicNaam;

    public Dier(String privateNaam, String publicNaam) {
        this.privateNaam = privateNaam;
        this.publicNaam = publicNaam;
    }

    //only objects of class Dier can use privateFunction
    private void privateFunction() {
        System.out.println("this is a private function");
    }

    //all objects use publicFunction
    public void publicFunction() {
        System.out.println("this is a public function");
    }

    //objects in same package or objects of a subclass can use this function
    protected void protectedFunction() {
        System.out.println("this is a protected function");
    }

    //objects in same package can use this function
    void defaultScopedFunction() {
        System.out.println("this is a protected function");
    }
}
