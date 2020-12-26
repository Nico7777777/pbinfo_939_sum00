import java.util.Scanner;

public class sum00{
    public static void main(String[] args) {
        int a, b, rez;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        rez = a + b;
        System.out.println(rez);
    }
}