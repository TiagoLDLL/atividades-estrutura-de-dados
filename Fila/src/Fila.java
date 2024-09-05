public class Fila {
    
    //===== ===== ATRIBUTOS ===== =====
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;
    private Carro[] fila;

    //===== ===== CONSTRUTOR ===== =====
    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.fila = new Carro[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    // Método para enfileirar um carro(adicionar ele ao final da fila[ou começo, caso a fila esteja vazia]).
    public void enfileirar(Carro carro){
        if(estaCheia()){
            System.out.println("A fila está cheia.");
            return;
        }
        fim = (fim+1) % capacidade;
        fila[fim] = carro;
        tamanho++;
        System.out.println(carro.getMarca()+" "+carro.getModelo()+" enfileirado.");
    }

    // Método para desfileirar um carro(fazer a fila andar uma "casa" para a frente).
    public void desfileirar(){
        if(estaVazia()){
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.println(fila[inicio].getMarca()+" "+fila[inicio].getModelo()+" desfileirado.");
        //Duvida: Seria uma boa prática colocar "fila[inicio] = null;" nessa linha? para retirar o carro que está na frente da fila?
        inicio = (inicio+1) % capacidade;
        tamanho--;
    }

    //Método para retornar o carro que está na frente da fila e seus respectivos atributos usando o método toString() reescrito na classe Carro.
    public void frente(){
        if(estaVazia()){
            System.out.println("\nA fila está vazia.");
        }
        System.out.println(fila[inicio].toString());
    }

    //Método para verificar se a fila está cheia.
    public boolean estaCheia(){
        return tamanho == capacidade;
    }

    //Método para verificar se a fila está cheia.
    public boolean estaVazia(){
        return tamanho == 0;
    }

    //Método para retornar o tamanho da fila.
    public int tamanho(){
        return tamanho;
    }

    //Método para imprimir os carros que estão na fila, e em que posição eles estão.
    public void imprimirFila(){
        for(int i=0; i<tamanho; i++){
            System.out.println((i+1)+"º: "+fila[inicio+i].getMarca()+" "+fila[inicio+i].getModelo());
        }
    }

}
