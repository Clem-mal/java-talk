package code;

import code.jep447.Voiture;

import java.util.List;
import java.util.Random;
import java.util.stream.Gatherer;

public class Application {



    public static void main(String[] args) {
        List<String> artistes = List.of("Les Casseurs Flotteurs",
                "Les Cowboys Fringuants",
                "Hans Zimmer",
                "The offspring");


        var result = artistes.stream()
                .gather(filterEndWithS())
                .toList();
        System.out.println(result);




}


    public String check(Object o) {
        return switch(o) {
            case Integer integer -> "C'est un entier";
            case String  string -> "C'est un string";
            case Voiture voiture -> "C'est un objet Car";
            default -> "Je ne sais pas ce que c'est";
        };
    }
}
/*
    static Gatherer<String, ?, String> filter() {
        return Gatherer.of((state, element, downstream) -> {
            if (element.endsWith("1")) {
                return downstream.push(element);
            }
            return true;
        });

        //resultat [item1, item11]
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

        class Counter {
            int counter;

            Counter(int counter) {
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
                (c1, c2) -> new Counter(c1.counter + c2.counter),
                //finisher
                (_, _) -> {
                }
        );
        BiFunction<Integer, String, Integer> processAOnly = (a, _) -> a * 2;


    }


    }


    public static void main(String[] args) {

        List<String> texts = List.of("item1", "item2", "otem3", "item11");

        var result = texts.stream()
                .gather(filter())
                .toList();

        System.out.println(result);
    }

    public String check(Object o) {
        return switch(o) {
            case int i -> "C'est un entier";
            case float  s -> "C'est un nombre à virgule";
            case Car c -> "C'est un objet Car";
            default -> "Je ne sais pas ce que c'est";
        };
    }
*/





/*    var result = texts.stream()
            .gather(filter())
            .gather(tantQue())
            .gather(limit())
            .toList();*/


/// Returns a hash code value for the object. This method is
/// supported for the benefit of hash tables such as those provided by
/// [java.util.HashMap].
///
/// The general contract of `hashCode` is:
///
///   - Whenever it is invoked on the same object more than once during
///     an execution of a Java application, the `hashCode` method
///     must consistently return the same integer, provided no information
///     used in `equals` comparisons on the object is modified.
///     This integer need not remain consistent from one execution of an
///     application to another execution of the same application.
///   - If two objects are equal according to the
///     [equals][#equals(Object)] method, then calling the
///     `hashCode` method on each of the two objects must produce the
///     same integer result.
///   - It is _not_ required that if two objects are unequal
///     according to the [equals][#equals(Object)] method, then
///     calling the `hashCode` method on each of the two objects
///     must produce distinct integer results.  However, the programmer
///     should be aware that producing distinct integer results for
///     unequal objects may improve the performance of hash tables.
///
/// @implSpec
/// As far as is reasonably practical, the `hashCode` method defined
/// by class `Object` returns distinct integers for distinct objects.
///
/// @return  a hash code value for this object.
/// @see     java.lang.Object#equals(java.lang.Object)
/// @see     java.lang.System#identityHashCode