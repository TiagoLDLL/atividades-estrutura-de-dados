import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(13);
        arrayList.add(1);
        arrayList.add(23);
        arrayList.add(52);
        arrayList.add(8);
        arrayList.add(88);
        arrayList.add(97);
        arrayList.add(2);
        arrayList.add(41);
        arrayList.add(11);

        System.out.println(buscarIndice(arrayList, 23));
        System.out.println(buscarIndice(arrayList, 89));
        System.out.println(buscarIndice(arrayList, 97));
        System.out.println(buscarIndice(arrayList, 3));

    }

    public static int buscarIndice(ArrayList<Integer> arrayList, int valor){
        for(int i=0; i<arrayList.size(); i++){
            if(valor==arrayList.get(i)){
                return i;
            }
        }
        return -1;
    }
}
