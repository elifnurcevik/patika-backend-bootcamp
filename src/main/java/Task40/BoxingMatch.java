package Task40;

public class BoxingMatch {

    public static void main(String[] args) {
        float CoinFlip=(float) Math.random()*100;
        Boxer marc = new Boxer("Marc" , 15 , 100, 90, 0);
        Boxer alex = new Boxer("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();

        System.out.println("Kimin ilk baslayacagini belirlemek icin yazi tura atiliyor...");
        if(CoinFlip>50) {
            System.out.println("Ilk hamleyi "+marc.name+" yapacak...");
            r.BeginFightOp1First();
        } else {
            System.out.println("Ilk hamleyi "+alex.name+" yapacak...");
            r.BeginFightOp2First();
        }
    }
}
