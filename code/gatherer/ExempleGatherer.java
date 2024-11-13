package code.gatherer;

import java.util.List;
import java.util.Optional;

public class ExempleGatherer {

// implementer filter
    List<String> texts = List.of("item1","item2","item3","item4");

    private Optional<String> filterWithGather(List<String> texts){
       return texts.stream()
                .filter(s -> s.endsWith("1"))
                .findFirst();
    }

}

//downstream, ce qui vient après la configuration du stream