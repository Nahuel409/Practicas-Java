package collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {

    public static void main(String[] args) {

        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        //System.out.println(cursos);

        Collections.sort(cursos); // ordena alfabeticamente

        System.out.println(cursos);

        //Collections.sort(cursos, Collections.reverseOrder()); //ordena descendente

        //System.out.println(cursos);

        //cursos.sort(Comparator.naturalOrder()); //Ordena alfabeticamente

        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList()); //Crea una nueva lista Ordenada alfabeticamente

        System.out.println(cursosList);

    }
}
