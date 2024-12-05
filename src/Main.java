public class Main {
    public static void main (String[] args) {
        int num1 = 15;
        int num2 = 1;
        char operador = 'c';

        if (operador == 'a'){
            System.out.println(num1 + " + " + num2 + " = " + num1+num2);
        } else if (operador == 'b') {
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        } else if (operador == 'c') {
            System.out.println(num1 + " * " + num2 + " = " + num1*num2);
        } else if (operador == 'd') {
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