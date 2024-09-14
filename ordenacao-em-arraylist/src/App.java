import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<String> cidades = new ArrayList<>();

        cidades.add("Limoeiro");
        cidades.add("Vitória");
        cidades.add("Recife");
        cidades.add("Carpina");
        cidades.add("Passira");

        for(String cidade : cidades){
            System.out.println(cidade);
        }

        Collections.sort(cidades);
        System.out.println();

        for(String cidade : cidades){
            System.out.println(cidade);
        }

    }
}
