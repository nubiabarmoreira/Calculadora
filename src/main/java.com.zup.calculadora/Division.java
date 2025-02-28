public class Division {
    public double divide (double num1, double num2) {
        double divisionResult = num1/num2;
        if(num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + divisionResult);
        } else {
            System.out.println("A divisão está ocorrendo para um número zero. Insira um número válido.");
        }
        return divisionResult;
    }
}
