import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        int nums[] = new int[4];
        String teste;
        Palavra palavra = new Palavra();
        do {
            palavra.limpaTela();
            System.out.println("----- Permutação -----");
            System.out.println("Escolha");
            System.out.println("1 - Descobrir se duas palavras são anagramas");
            System.out.println("2 - Quantidade de permutações possiveis.");
            System.out.println("3 - Imprimir todos Anagramas");
            System.out.println("0 - Sair");
            op=in.nextInt();
            if (op==2){
                System.out.print("Entre com a palavra: ");
                palavra.setPalavra(in.next());
                System.out.println("A palavra "+palavra.getPalavra()+ " possui " + palavra.Fatorial(palavra.tamanho()) +" permutações.");
            }else if (op==3){
                palavra.zerarAux();
                System.out.println("Digite uma palavra: ");
                palavra.imprimeAnagramas("",in.next());
            }else if (op==1){
                System.out.println("Entre com as duas palavras");
                palavra.setPalavra(in.next());
                palavra.setPalavra2(in.next());
                if (palavra.anagrama()){
                    System.out.println("Correto são Anagramas!");
                }else{
                    System.out.println("Não são anagramas!");
                }
            }
            if (op!=0){
                System.out.println("Clear?");
                in.next();
                palavra.limpaTela();
            }
        }while(op != 0);
    }
}
