package sv.com.htamayo.java.datastructs;
import java.io.*;
import java.math.*;
import java.util.*;

public class Exercise018 {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int currentNumber = 0;
        int coincidences = 0;
        int maxValue = 0;
        int answer = 0;

        Map<Integer, Integer> results = new HashMap<>();
        List<Integer> targetKeys = new LinkedList<Integer>();

        for(int i = 0; i<arr.size(); i++){
            currentNumber = arr.get(i);
            for(int j = 0; j<arr.size(); j++){
                if(arr.get(j) == currentNumber){
                    coincidences++;
                }
            }
            results.put(currentNumber, coincidences);
            coincidences = 0;
        }
        System.out.println(results);
        maxValue = Collections.max(results.values());
        for(Map.Entry<Integer, Integer> entry: results.entrySet()){
            if(entry.getValue() == maxValue){
                targetKeys.add(entry.getKey());
            }
        }
        Collections.sort(targetKeys);
        System.out.println(targetKeys);
        return targetKeys.get(0);
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println(migratoryBirds(arr));
    }
}
