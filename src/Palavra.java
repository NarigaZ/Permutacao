import java.util.Arrays;

public class Palavra {
    private String palavra , palavra2 , np , np2;
    private char[] letras = null , letras2 = null;
    int aux2=1;

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
        letras = palavra.toCharArray();
    }

    public void setPalavra2(String palavra2) {
        this.palavra2 = palavra2;
        letras2 = palavra2.toCharArray();
    }


    public int tamanho(){
        return letras.length;
    }

    public int Fatorial (int num){
        if (num <=1 ){
            return 1;
        }else{
            return Fatorial(num-1)*num;
        }
    }
    public void zerarAux (){
        aux2 = 1;
    }

    public void imprimeAnagramas(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println("[" + aux2 + "]" + prefix + word);
            aux2++;
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                imprimeAnagramas(prefix + cur, before + after);
            }
        }
    }

    public boolean anagrama (){
        if (letras.length != letras2.length){
            return false;
        } else {
            Arrays.sort(letras);
            Arrays.sort(letras2);
            np = new String(letras);
            np2 = new String(letras2);
            if (np.equalsIgnoreCase(np2)){
                return true;
            }else {
                return false;
            }
        }
    }

    public void limpaTela (){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
