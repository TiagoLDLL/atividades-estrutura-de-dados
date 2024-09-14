public class App {
    public static void main(String[] args) {
        int[] array = {51,82,3,14,9};

        System.out.println("Index: "+buscaEmArray(array, 14));
        System.out.println("Index: "+buscaEmArray(array, 55));
        System.out.println("Index: "+buscaEmArray(array, 9));
        System.out.println("Index: "+buscaEmArray(array, 83));

    }

    public static int buscaEmArray(int[] array, int valor){
        for(int i=0; i<array.length; i++){
            if(array[i]==valor){
                return i;
            }
        }
        return -1;
    }

}

