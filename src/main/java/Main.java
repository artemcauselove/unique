import java.util.*;

public class Main {
    public static void main(String[] args) {
    }
    static int findUniqueWithoutMap(int[] array) {
        if(array.length == 0){
            System.out.println("Array is empty");
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        Arrays.sort(array);
        int n = 0;
        while(n < array.length-1) {
            if(array[n] != array[n + 1]) {
                return array[n];
            }
            n = n + 2;
        }
        if (array[array.length - 1] != array[array.length - 2]) {
            return array[array.length - 1];
        }
        return - 1;
    }

    static int findUnique(int[] array) {
        if(array.length == 0){
            System.out.println("Array is empty");
            return 0;
        }
        if(array.length == 1){
            return array[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>(array.length);
        for (int num : array) {
            Integer occurrence = map.get(num);
            map.put(num, occurrence == null ? 1 : occurrence + 1);
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) { //it's uqique then
                return e.getKey();
            }
        }
        return -1;
    }
}
