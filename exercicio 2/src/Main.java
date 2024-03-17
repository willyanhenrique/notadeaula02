import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Media m = new Media();

        System.out.println("digite a quantidade minima:");
        m.setQuantmin(sc.nextInt());
        System.out.println("Digite a quantidade maxima:");
        m.setQuantmax(sc.nextInt());
        System.out.println("Digite a quantidade em seu estoque:");
        m.setQuanttotal(sc.nextInt());



        System.out.println("quantidade de "+ m.getQuanttotal() + " no estoque!");

    }
}
