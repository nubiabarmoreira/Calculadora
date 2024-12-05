import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Agora digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Informe a operação que deseja realizar, sendo: \n a= adição \n b= subtração \n c= multiplicação \n d= divisão");
        String operador = scanner.next();

        if (operador == "a"){
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        } else if (operador == "b") {
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        } else if (operador == "c") {
            System.out.println(num1 + " * " + num2 + " = " + num1*num2);
        } else if (operador == "d") {
            if(num2 != 0){
                System.out.println(num1 + " / " + num2 + " = " + num1/num2);
            } else{
                System.out.println("A divisão está ocorrendo para um número zero. Insira um número válido.");
            }
        } else{
            System.out.println("Insira um operador válido.");
        }
    }
}
