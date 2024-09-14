import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Tiago");
        arrayList.add("Splish Splash");
        arrayList.add("Optmus Prime");
        arrayList.add("The Devil Went Down To Georgia");
        arrayList.add("This is Elon Musk");

        arrayList.remove(1);

        arrayList.add("Crazy Dave");

        for(String nome : arrayList){
            System.out.println(nome);
        }

    }
}
