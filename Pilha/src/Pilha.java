public class Pilha {
    
    //===== ===== ATRIBUTOS ===== =====
    private Curriculo[] pilha;
    private int topo;
    private int capacidade;
    private int tamanho;
    
    //===== ===== CONSTRUTOR ===== =====
    public Pilha(int capacidade){
        this.pilha = new Curriculo[capacidade];
        this.capacidade = capacidade;
        this.topo = -1;
        this.tamanho = 0;
    }

    //Método para empilhar um curriculo na pilha
    public void empilhar(Curriculo curriculo){
        if(estaCheia()){
            System.out.println("A pilha está cheia.");
            return;
        }
        System.out.println("Currículo: "+curriculo.getNome()+" empilhado.");
        topo++;
        pilha[topo] = curriculo;
        tamanho++;
    }

    //Método para desempilhar um curriculo da pilha
    public void desempilhar(){
        if(estaVazia()){
            System.out.println("A pilha está vazia.");
            return;
        }
        System.out.println("Currículo: "+pilha[topo].getNome()+" desempilhado.");
        pilha[topo] = null;
        topo--;
        tamanho--;
    }

    //Método que retorna um boolean correspondente à pilha está cheia.
    public boolean estaCheia(){
        return tamanho == capacidade;
    }
    
    //Método que retorna um boolean correspondente à pilha está vazia.
    public boolean estaVazia(){
        return tamanho == 0;
    }

    //Método que imprime as informações do curriculo do topo da pilha.
    public void topo(){
        System.out.println(pilha[topo].toString());
    }

    //Método que imprime as informações do curriculo do final da pilha
    public void fundo(){
        System.out.println(pilha[0].toString());
    }

    //Método que imprime os elementos da pilha, e em que lugar eles estão na pilha.
    public void imprimirPilha(){
        if(estaVazia()){
            System.out.println("A pilha está vazia.");
            return;
        }
        int i = topo;
        int colocacao = 1;
        while(i>=0){
            System.out.println(colocacao+"º: "+pilha[i].getNome());
            colocacao++;
            i--;
        }
    }
}
