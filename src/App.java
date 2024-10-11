package src;

public class App {
    

    public static void main(String[] args) {
        System.out.println("Inicio...");

        VetorInteirosUnicos vetor;

        vetor = new VetorInteirosUnicos(5);

        boolean ret = vetor.adicionar(-1);
        
        ret = vetor.adicionar(1);
        ret = vetor.adicionar(1);

        ret = vetor.adicionar(2);
        ret = vetor.adicionar(3);
        ret = vetor.adicionar(4);
        ret = vetor.adicionar(5);
        ret = vetor.adicionar(6);



        System.out.println("Fim!");


    }
}
