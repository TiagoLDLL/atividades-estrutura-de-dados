public class App {
    public static void main(String[] args) throws Exception {

        int[] array = {4,1,3,2,7,5,8,6,9,0};

        for(int i=0; i<array.length-1; i++){
            int min = i;
            for(int j=i+1; j<array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for(int index : array){
            System.out.print("["+index+"] ");
        }

    }

}
