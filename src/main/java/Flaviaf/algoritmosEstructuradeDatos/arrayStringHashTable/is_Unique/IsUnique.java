package Flaviaf.algoritmosEstructuradeDatos.arrayStringHashTable.is_Unique;

import java.util.HashSet;

/*
 * Dado un método que recibe una String, comprobar si todos los caracteres son únicos o no.
 *
 * isUnique("abcde") => true;
 * isUnique("abcded") => false;
 */
public class IsUnique {



    public boolean isUnique(String s) {
        HashSet<Character> uniqueChar = new HashSet<>();

        for(int i =0 ; i < s.length(); i++){
            char charact = s.charAt(i);

            if (uniqueChar.contains(charact)){
                return false;
            }else {
                uniqueChar.add(charact);
            }

        }
        return true;

    }
}
