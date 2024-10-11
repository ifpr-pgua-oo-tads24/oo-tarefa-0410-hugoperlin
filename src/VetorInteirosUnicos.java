package src;

public class VetorInteirosUnicos{

    private int tamanho;
    private int[] vetor;


    public VetorInteirosUnicos(int tamanho){
        this.tamanho = tamanho;
        this.vetor = new int[tamanho];

        //inicializando as posições do vetor
        //-1 indica posição livre
        for(int i=0;i<tamanho;i++){
            vetor[i] = -1;
        }

    }

    private boolean jahExiste(int valor){
        for(int i=0;i<tamanho;i++){
            if(vetor[i] == valor){
                return true;
            }
        }

        return false;
    }

    private int posicaoLivre(){
        for(int i=0;i<tamanho;i++){
            if(vetor[i] == -1){
                return i;
            }
        }
        return -1;
    }

    public boolean adicionar(int valor){
        //verificação se positivo
        if(valor < 0){
            return false;
        }

        if(jahExiste(valor)){
            return false;
        }

        int posicao = posicaoLivre();

        if(posicao == -1){
            return false;
        }

        vetor[posicao] = valor;
        

        return true;
    }




}