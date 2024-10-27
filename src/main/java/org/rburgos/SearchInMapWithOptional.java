package org.rburgos;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SearchInMapWithOptional {
    public static void main(String[] args) {
        searchInMapWithOptional();
    }

    public static void searchInMapWithOptional() {

        //Carga un Map y busca un valor haciendo uso de un Optional

        Map<String, String> beingMap = new HashMap<String, String>(){
            {
                put("Dog", "Vertebrate");
                put("Jellyfish", "Invertebrate");
            }
        };

        String searchBeing = "Dolphin";

        Optional<String> dispositiion = Optional.ofNullable(beingMap.get(searchBeing));
        System.out.println(dispositiion.orElseGet(() -> "unknown"));
    }

}
