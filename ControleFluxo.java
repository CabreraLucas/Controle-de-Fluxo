import java.util.Scanner;
public class ControleFluxo {
    public static void main(String[]args){
        int valor1;
        int valor2;

        Scanner leitura=new Scanner(System.in);

        System.out.println("Digite um número");
        valor1=leitura.nextInt();
        System.out.println("Digite outro número");
        valor2=leitura.nextInt();

        System.out.println((valor1>valor2 ? +valor1+" é maior" : +valor2+" é maior"));
        
        if (valor1>valor2){
            System.out.println(valor1+" é maior");
        } else {
            System.out.println(valor2+" é maior");
        }
    }
}