import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    calculomaças c = new calculomaças();

    System.out.print("Digite o número de maçãs compradas:");
    c.setNummaca(scanner.nextInt());

    System.out.println("total de maças:"+ c.getNummaca());
    System.out.printf("O custo total das maçãs é: $%.2f", c.getPreco());

}
}