public class Main{
    public static void main(String[] args) {

        //Criação da fila com capacidade 5:
        Fila fila = new Fila(5);

        //Método para verificar se a fila está vazia:
        System.out.println(fila.estaVazia());
        System.out.println(); // <<< QUEBRA DE LINHA

        //Enfileiramento da primeira instância da classe Carro na fila:
        fila.enfileirar(new Carro("Uno", "Fiat", 2024, 550000));

        //Enfileiramento de mais 3 carros:
        fila.enfileirar(new Carro("Civic", "Honda", 2022, 120000));
        fila.enfileirar(new Carro("Corolla", "Toyota", 2023, 130000));
        fila.enfileirar(new Carro("Model S", "Tesla", 2025, 450000));

        //Método para mostrar o carro que está na frente da fila(Deve mostrar Fiat Uno):
        fila.frente();
        System.out.println(); // <<< QUEBRA DE LINHA

        //Método para desfileirar o carro que está na frente:
        fila.desfileirar();

        //Usando método frente() mais uma vez para mostrar que o carro da frente foi desfileirado(Deve mostrar Honda Civic)
        fila.frente();
        System.out.println(); // <<< QUEBRA DE LINHA

        //Enfileirado carros até a fila ficar cheia(Deve enfileirar todos MENOS Chevrolet Onix, e imprimir que a fila está cheia.).
        fila.enfileirar(new Carro("Mustang", "Ford", 2021, 300000));
        fila.enfileirar(new Carro("Polo", "Volkswagen", 2024, 90000));
        fila.enfileirar(new Carro("Onix", "Chevrolet", 2023, 80000));
        System.out.println(); // <<< QUEBRA DE LINHA

        //Método para verificar se a fila está cheia:
        System.out.println(fila.estaCheia());
        System.out.println(); // <<< QUEBRA DE LINHA

        //Deslifeirando carros mais que a quantidade de carros na fila (a ultima deve imprimrir "a fila está vazia.")
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        fila.desfileirar();
        System.out.println(); // <<< QUEBRA DE LINHA

        //Enfileirando mais 3 carros para mostrar os métodos tamanho() e imprimirtFila();
        fila.enfileirar(new Carro("A4", "Audi", 2022, 250000));
        fila.enfileirar(new Carro("X5", "BMW", 2023, 400000));
        fila.enfileirar(new Carro("Sandero", "Renault", 2022, 75000));
        System.out.println(); // <<< QUEBRA DE LINHA
        
        fila.imprimirFila(); // <<< Método para imprimir os carros que estão na fila.
        System.out.println(); // <<< QUEBRA DE LINHA

        System.out.println("Tamanho da fila: "+fila.tamanho()); // <<< Método fila.tamanho() retorna um valor inteiro com o tamanho da fila.

    }
}