import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Sum sum = new Sum();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        System.out.println("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        System.out.println("Agora digite o segundo número: ");
        double num2 = scanner.nextInt();
        System.out.println("Informe a operação que deseja realizar, sendo: \n a= adição \n b= subtração \n c= multiplicação \n d= divisão");
        char operador = scanner.next().charAt(0);

        if (operador == 'a'){
            sum.add(num1, num2);
        } else if (operador == 'b') {
            subtraction.subtract(num1, num2);
        } else if (operador == 'c') {
            multiplication.multiply(num1, num2);
        } else if (operador == 'd') {
            division.divide(num1, num2);
        } else {
            System.out.println("Insira um operador válido.");
        }
    }
}
