import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;

public class somaValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LinkedList<Integer> valores;
        float soma=0;

        valores = new LinkedList<Integer>();

        System.out.println("digite varios valores");

        int valor = -1;
        while(valor != 0) {
            valor = entrada.nextInt();
            if(valor != 0) {
                valores.add(valor);
            }
        }

        for(int i =0; i<valores.size(); i++) {
            soma += valores.get(i);
        }

        System.out.println(soma);
        System.out.println(soma / valores.size());
    
    }
}
