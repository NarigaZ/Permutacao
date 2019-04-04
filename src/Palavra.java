public class Palavra {
    private String palavra;
    private char[] letras = null;
    private int nLetras , letrasRep,permutacoes , fat;
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
        letras = palavra.toCharArray();
    }

    public int letrasRep (){
        int cont=0;
        for (int i=0 ; i<letras.length ; i++){
            for (int j=i+1 ; j<letras.length ; j++) {
                if (letras[i] == letras[j]){
                    cont++;
                }
            }
        }
        letrasRep=cont;
        return letrasRep;
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

    public void imprimeAnagramas(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                imprimeAnagramas(prefix + cur, before + after);
            }
        }
    }

}
