package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Jakub");
        names.add("Klaudia");
        names.add("Mateusz");
        names.add("Marek");
        names.add("Ania");


      List<String> newNames = names.stream()
              .filter(n->n.startsWith("M"))
              .filter(n->n.endsWith("a"))
              .map(n->n.toUpperCase())
              .collect(Collectors.toList());
      newNames.forEach(System.out::println);





    }
}
