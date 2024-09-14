public class App {
    public static void main(String[] args) {

        int[] arrayOriginal = {73,22,89,5,64,35,11,97,50,26};

        int[] arrayOrdenado = {0,0,0,0,0,0,0,0,0,0};

        for(int i=0; i<arrayOrdenado.length; i++){
            arrayOrdenado[i] = arrayOriginal[i];
        }

        for(int i=0; i<arrayOrdenado.length-1; i++){
            int min = i;
            for(int j=i+1; j<arrayOrdenado.length; j++){
                if(arrayOrdenado[min] > arrayOrdenado[j]){
                    int temp = arrayOrdenado[j];
                    arrayOrdenado[j] = arrayOrdenado[min];
                    arrayOrdenado[min] = temp;
                }
            }
        }

        System.out.print("Array Original: ");
        for(int index : arrayOriginal){
            System.out.print("["+index+"] ");
        }

        System.out.print("\nArray Ordenado: ");
        for(int index : arrayOrdenado){
            System.out.print("["+index+"] ");
        }

    }
}
