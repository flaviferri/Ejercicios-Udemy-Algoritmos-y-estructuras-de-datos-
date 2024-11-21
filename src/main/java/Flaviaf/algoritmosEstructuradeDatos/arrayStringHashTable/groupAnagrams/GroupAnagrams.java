package Flaviaf.algoritmosEstructuradeDatos.arrayStringHashTable.groupAnagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados. Cualquier orden es válido.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"].
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] words) {



        Map<String, List<String>> map = new HashMap<>();
        for (String word : words){
            char[] charArray = word.toCharArray();

            Array.sort(charArray);
            String orderWord = new String(charArray);

            if (!map.containsKey(orderWord)) {
                map.put(orderWord, new ArrayList<>());
            }
            map.get(orderWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

}

