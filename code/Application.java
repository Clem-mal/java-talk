package code;

import org.w3c.dom.css.Counter;

import java.util.List;
import java.util.stream.Gatherer;

public class Application {

    static Gatherer<String, ?, String> filter() {
        return Gatherer.of((state, element, downstream) -> {
            if (element.endsWith("1")) {
                return downstream.push(element); // -> on  propage l element a l'operation suivante
            }
            return true; // on renvoit vrai, car les élements d'après doivent être filtrer également
        });
    }
    static Gatherer<String, ?, String> tantQue() {
        return Gatherer.of((state, element, downstream) -> {
            if (element.startsWith("item")) {
                return downstream.push(element); // -> on  propage l element a l'operation suivante
            }
            return false; // on renvoit false, car on a plus besoin de poursuivre la liste
        });
    }


    static Gatherer<String, ?, String> limit() {

        class Counter{
            int counter;
            Counter(int counter){
                this.counter = counter;
            }
        }
        return Gatherer.of(
                //initialize
                () -> new Counter(0),
                (state, element, downstream) -> {
                    //integrator
            if (state.counter++ == 3) {
                return false;
            }
            return downstream.push(element);
        },
                //combiner
                (c1, c2) -> new Counter(c1.counter + c2.counter ),
                //finisher
                (_,_) ->  {}
        );
    }




    public static void main(String[] args) {

        List<String> texts = List.of("item1", "item2", "otem3", "item11");

        /*var result = texts.stream()
                .filter(s -> s.endsWith("1"))
                .toList();*/

        var result = texts.stream()
              /*  .gather(filter())*/
                /*.gather(tantQue())*/
                .gather(limit())
                .toList();

        System.out.println(result);
    }
}