public class App {
    public static void main(String[] args) throws Exception {

        int[][] array = {{6,2,3},{8,9,1},{4,5,7}};

        somaMatriz(array);

    }

    public static void somaMatriz(int[][] array){
        System.out.println("\nSoma das linhas:");
        for (int i = 0; i < array.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < array[i].length; j++) {
                somaLinha += array[i][j];
            }
            System.out.println("Linha " + (i + 1) + ": " + somaLinha);
        }
        //===== ===== ===== ===== =====
        System.out.println("\nSoma das colunas:");
        for (int j = 0; j < array[0].length; j++) {
            int somaColuna = 0;
            for (int i = 0; i < array.length; i++) {
                somaColuna += array[i][j];
            }
            System.out.println("Coluna " + (j + 1) + ": " + somaColuna);
        }
    }

}
