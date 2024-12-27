package rekrutacyjne;

import java.util.HashMap;
import java.util.Map;

public class LiczbaWystapien {
    public static void main(String[] args) {
        //int[] numbers = new int[]{1,2,3,2,5,3}
        liczWystąpienia(new int[]{1,2,3,2,5,3});

    }

    public static void liczWystąpienia(int[]numbers){
        Map<Integer, Integer> occurences = new HashMap<>();
        for(int i = 0; i< numbers.length; i++){
            if(occurences.containsKey(numbers[i])){
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i], value+1);
            }else {
                occurences.put(numbers[i], 1);
            }
        }

        System.out.println("Liczba wystaien w mapie:"+ occurences.size());
    }


}
