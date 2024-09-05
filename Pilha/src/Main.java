public class Main {
    public static void main(String[] args) {

        //Criação de uma nova pilha
        Pilha pilha = new Pilha(5);

        //Método empilhar(colocar um novo elemento na pilha)
        pilha.empilhar(new Curriculo("Ana", "30/06/1980", "Doutorado em Engenharia Elétrica", "Robótica", 9.2));
        System.out.println(); // <<< QUEBRA DE LINHA

        //Método para mostrar o elemento que está no topo(como só tem apenas um, deve mostrar "Ana" e seus correspondentes atributos)
        pilha.topo();
        System.out.println(); // <<< QUEBRA DE LINHA

        //Empilhando mais 3 elementos
        pilha.empilhar(new Curriculo("João", "27/08/1971", "Ensino Superior Completo", "Sistemas Operacionais", 7.5));
        pilha.empilhar(new Curriculo("Maria", "15/03/1985", "Mestrado em Ciências da Computação", "Inteligência Artificial", 8.9));
        pilha.empilhar(new Curriculo("Carlos", "12/11/1990", "Ensino Médio Completo", "Administração", 6.5));
        System.out.println(); // <<< QUEBRA DE LINHA

        //Método para desempilhar(retirar o ultimo elemento que foi colocado).
        pilha.desempilhar();
        System.out.println(); // <<< QUEBRA DE LINHA

        //agora deve mostrar o último elemento a ser empilhado, "Maria"
        pilha.topo();
        System.out.println(); // <<< QUEBRA DE LINHA

        //Método que mostra o fundo da pilha A.K.A o primeiro a ser empilhado, "Ana"
        pilha.fundo();
        System.out.println(); // <<< QUEBRA DE LINHA

        //Método que imprime a fila, do ultimo empilhado (1º lugar na pilha), até o primeiro que foi empilhado (ultimo lugar na pilha).
        pilha.imprimirPilha();
        System.out.println(); // <<< QUEBRA DE LINHA
        
        //Auto explicativo. retorna true ou false correspondentemente.
        System.out.println(pilha.estaCheia());
        System.out.println(pilha.estaVazia());

    }
}
