import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        int[] array = {5,7,6,8,4};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int index : array){
            arrayList.add(index);
        }

        int[] arrayB = new int[arrayList.size()];
        for(int i=0; i<arrayList.size(); i++){
            arrayB[i] = arrayList.get(i);
        }

        for(int index : arrayB){
            System.out.println(index);
        }

    }
}
