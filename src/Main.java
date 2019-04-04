import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        int nums[] = new int[4];
        String teste;
        Palavra palavra = new Palavra();
        do {
            System.out.println("----- Permutação -----");
            System.out.println("Escolha");
            System.out.println("1 - Quantidade de permutações possiveis.");
            System.out.println("2 - Imprimir Anagramas");
            System.out.println("0 - Sair");
            op=in.nextInt();
            if (op==1){
                System.out.print("Entre com a palavra: ");
                palavra.setPalavra(in.next());
                System.out.println("A palavra "+palavra.getPalavra()+ " possui " + palavra.Fatorial(palavra.tamanho()) +" permutações.");
            }else if (op==2){
                System.out.println("Digite uma palavra: ");
                teste=in.next();
                palavra.imprimeAnagramas("",teste);
            }
        }while(op != 0);
    }
}
