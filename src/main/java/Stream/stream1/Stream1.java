package Stream.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("Tom","Mat","John","Rob");

        Stream<String> streamName = names.stream();
        Stream<Integer> streamInt= stream(new Integer[]{1,2});
        DoubleStream doubleStream = DoubleStream.of(1,2,3,4);
        IntStream intStream= IntStream.range(1,100);

        //przetwarzanie danych
        //filter -filtrowanie
        //map - zmiana na cos innego
        //limit- zwraca okreslona ilosc elementow
        // peek - pozwala przeprowadzic operacje na kzdym elemncie

        //forEach - wykonanie akcji dla kazdego elementu strumienia
        //count - zwroci ilosc elemtow w strumieniu
        // allMatch -sprawdza czy element sprawdza jakis warunek
        // collect - zwaraca nowy typ na podstawie strumienia

        List<String>modifiedNames=
        names.stream().filter(el->el.startsWith("T"))
                    .map(el->el.toUpperCase())
                    .collect(Collectors.toList());
        System.out.println(modifiedNames.get(0));
        System.out.println(modifiedNames.size());

        intStream.filter(el->el>20)
                .map(el->el*2)
                .forEach(el->System.out.println(el));

    }
}
