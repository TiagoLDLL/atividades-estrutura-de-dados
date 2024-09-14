public class App {
    public static void main(String[] args) {

        int[] array = {74,82,14,80,70,77,5,91,95,13};

        System.out.print("Elementos: ");
        for(int index : array){
            System.out.print("["+index+"] ");
        }

        //===== ===== ===== ===== =====

        System.out.print("\nSoma dos Elementos: ");
        int soma = 0;
        for(int i=0; i<array.length; i++){
            soma += array[i];
        }
        System.out.print(soma);

        //===== ===== ===== ===== =====

        System.out.print("\nValor máximo: ");
        int maximo = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > maximo){
                maximo = array[i];
            }
        }
        System.out.print(maximo);

        //===== ===== ===== ===== =====

        System.out.print("\nValor mínimo: ");
        int minimo = maximo;
        for(int i=0; i<array.length; i++){
            if(array[i] < minimo){
                minimo = array[i];
            }
        }
        System.out.print(minimo);
    }
}
