package dieren;

//deze class kan je hergebruiken voor elke soort Dier
public class DierenShowroom {
    public void show(Dier dier) {
        System.out.println("=============================");
        System.out.println("========= ShowRoom ==========");
        System.out.println("=============================");
        System.out.println("===== " + dier.getNaam() );
        System.out.println("=============================");
        System.out.println(dier.getNaam() + " maakt geluid: ");
        System.out.print("   ");
        dier.maakGeluid();
        System.out.println(dier.getNaam() + " verplaatst zich: ");
        System.out.println("=============================");
        System.out.println();
    }
}
