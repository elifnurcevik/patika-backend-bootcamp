package Task51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mayin tarlasina hosgeldiniz !");
        System.out.println("lutfen oynemk istediginiz boyutlari gir !");
        System.out.print("satir sayisi = ");
        int row = input.nextInt();
        System.out.print("sutun sayisi = ");
        int col = input.nextInt();
        MinesweeperGame mine = new MinesweeperGame(row, col);
        mine.run();
    }
}
