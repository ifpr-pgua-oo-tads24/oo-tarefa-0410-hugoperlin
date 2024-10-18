package src;

public class VetorInteirosUnicos{

    private int tamanho;
    private int[] vetor;

    private int contadorValidos=0;


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

    public boolean inserir(int valor){
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
        contadorValidos += 1;

        return true;
    }

    public boolean remover(int valor){
        for(int i=0;i<tamanho;i++){
            if(vetor[i] == valor){
                vetor[i] = -1;
                contadorValidos -=1;
                return true;
            }
        }
        return false;
    }

    public int soma(){
        int soma = 0;
        for(int i=0;i<tamanho;i++){
            if(vetor[i] != -1){
                soma += vetor[i];
            }
            
        }
        return soma;
    }

    

    public double media(){
        int soma = soma();
        return (soma/(double)contadorValidos);
    }

    public int maior(){
        int maior = Integer.MIN_VALUE;
        int posMaior = -1;
        for(int i=0;i<tamanho;i++){
            if(vetor[i] != -1){
                if(vetor[i] > maior){
                    maior = vetor[i];
                    posMaior = i;
                }
            }

        }
        return posMaior;
    }

    public int menor(){
        int menor=Integer.MAX_VALUE;
        int posMenor = -1;
        for(int i=0;i<tamanho;i++){
            if(vetor[i] != -1){
                if(vetor[i] < menor){
                    menor = vetor[i];
                    posMenor = i;
                }
            }
        }

        return posMenor;
    }

    public boolean estaCheio(){
        return contadorValidos == tamanho;
    }

    public void limpa(){
        for(int i=0;i<tamanho;i++){
            vetor[i] = -1;
            contadorValidos = 0;
        }
    }

    public int valor(int pos){
        return vetor[pos];
    }

    public String imprimir(){
        String str = "[";

        for(int i=0;i<tamanho;i++){
            if(vetor[i] == -1){
                str += "#";
            }else{
                str += vetor[i];
            }
            if(i!=tamanho-1){
                str += ",";
            }
        }
        str += "]";

        return str;
    }

    public String toString(){
        return imprimir();
    }


}