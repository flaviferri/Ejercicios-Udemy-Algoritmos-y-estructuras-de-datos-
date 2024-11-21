package Flaviaf.algoritmosEstructuradeDatos.arrayStringHashTable.twoSum;/*
 * Dado un array de números enteros y un target, retorna los índices de dos
 * números para los que la suma de ambos sea igual al target.
 *
 * Puedes asumir que hay solamente una solución.
 *
 * Ejemplo 1:
 *  Input: nums = [9,2,5,6], target = 7
 *  Output: [1,2]
 *  Explicación: nums[1] + nums[2] == 7, devolvemos [1, 2].
 *
 * Ejemplo 2:
 *  Input: nums = [9,2,5,6], target = 100
 *  Output: null
 */

import java.util.HashMap;
import java.util.Map;

/*
 * Dado un array de números enteros y un target, retorna los índices de dos
 * números para los que la suma de ambos sea igual al target.
 *
 * Puedes asumir que hay solamente una solución.
 *
 * Ejemplo 1:
 *  Input: nums = [9,2,5,6], target = 7
 *  Output: [1,2]
 *  Explicación: nums[1] + nums[2] == 7, devolvemos [1, 2].
 *
 * Ejemplo 2:
 *  Input: nums = [9,2,5,6], target = 100
 *  Output: null
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> numMap = new HashMap<>();

        for ( int i= 0; i<nums.length; i++){
            int complement = target - nums[i];
            if(numMap.containsKey(complement)){
                return new int[]{numMap.get(complement),i};
            }
            numMap.put(nums[i],i);
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }
}