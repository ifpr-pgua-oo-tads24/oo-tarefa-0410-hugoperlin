package src;

public class App {
    

    public static void main(String[] args) {
        System.out.println("Inicio...");

        VetorInteirosUnicos vetor;

        vetor = new VetorInteirosUnicos(5);

        vetor.inserir(1);
        vetor.inserir(2);
        vetor.inserir(3);
        vetor.inserir(4);
        
        System.out.println(vetor.soma());
        System.out.println(vetor.maior());
        System.out.println(vetor.menor());
        System.out.println(vetor.media());
        System.out.println(vetor);
        vetor.remover(3);
        System.out.println(vetor);
        System.out.println(vetor.soma());
        System.out.println(vetor.maior());
        System.out.println(vetor.menor());
        System.out.println(vetor.media());
        vetor.limpa();
        System.out.println(vetor);


        System.out.println("Fim!");


    }
}
