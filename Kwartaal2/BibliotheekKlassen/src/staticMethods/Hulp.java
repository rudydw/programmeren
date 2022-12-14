package staticMethods;

public class Hulp {
    private String woord;
    private int teller;

    public Hulp(String woord, int teller) {
        this.woord = woord;
        this.teller = teller;
    }

    public String getWoord() {
        return woord;
    }

    public void setWoord(String woord) {
        this.woord = woord;
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    @Override
    public String toString() {
        return "{" + woord +
                ", " + teller + "}";
    }
}
