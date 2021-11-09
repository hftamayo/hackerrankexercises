package sv.com.htamayo.java.datastructures.easy;

/*
link: https://www.hackerrank.com/challenges/migratory-birds/problem?isFullScreen=true
category: data structure
score obtained: 5 of 10 (time limit)
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class A02MigratoryBirds {
    class Result {

        /*
         * Complete the 'migratoryBirds' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static int migratoryBirds2(List<Integer> arr) {
            // esta version elimina el uso de una variable bandera y tambien reduce el numero de lineas
            // sin embargo sigue presentando timeLimit
            int coincidences = 0;
            int maxValuesPerCategory = 0;
            //I'm using TreeMap because sort isthe key on this exercise
            Map<Integer, Integer> results = new TreeMap<>();
            List<Integer> targetKeys = new ArrayList<>();

            //1. classifying values by coincidences
            for(Integer element: arr){
                coincidences = Collections.frequency(arr, element);
                results.put(element, coincidences);
            }

            /*
            2. filtering categories by highest coincidences,
            if there are more than 1, choose the label with the lowest value
            example: 4=5; 3=5 ->output= 3
            */
            //getting the value with most coincidences
            maxValuesPerCategory = Collections.max(results.values());
            //iterate the map to identify which keys have the maxvalue
            Set<Integer> keySet = results.keySet();
            for(Integer key : keySet){
                if(results.get(key) == maxValuesPerCategory){
                    targetKeys.add(key);
                }
            }

            //3. sorting the list ascending to obtain the lowest value
            Collections.sort(targetKeys);
            //get the first value (it should be the lowest label category)
            return targetKeys.get(0);
        }

        public static int migratoryBirds1(List<Integer> arr) {
            //esta version presenta timeLimit
            // Write your code here
            int currentNumber = 0;
            int coincidences = 0;
            int maxValuesPerCategory = 0;
            //I'm using TreeMap because sort isthe key on this exercise
            Map<Integer, Integer> results = new TreeMap<>();
            List<Integer> targetKeys = new ArrayList<>();

            //1. classifying values by coincidences, a partir de la version 1.5 de java se desaconseja iterar de la siguiente manera
        /*
            for(int i = 0; i < arr.size(); i++){
                currentNumber = arr.get(i);
                for(int j = 0; j < arr.size(); j++){
                    if(arr.get(j) == currentNumber){
                        coincidences++;
                    }
                }
                results.put(currentNumber, coincidences);
                coincidences = 0;
            }
        */
            //el mecanismo minimo de iteracion esperado es el siguiente: (sin embargo no mejora el performance)
            for(Integer element: arr){
                currentNumber = element;
                for(Integer coincidence: arr){
                    if(coincidence == currentNumber){
                        coincidences++;
                    }
                }
                results.put(currentNumber, coincidences);
                coincidences = 0;
            }


            /*
            2. filtering categories by highest coincidences,
            if there are more than 1, choose the label with the lowest value
            example: 4=5; 3=5 ->output= 3
            */
            //getting the value with most coincidences
            maxValuesPerCategory = Collections.max(results.values());
            for(Map.Entry<Integer, Integer> entry: results.entrySet()){
                if(entry.getValue() == maxValuesPerCategory){
                    targetKeys.add(entry.getKey());
                }
            }

            //3. sorting the list ascending to obtain the lowest value
            Collections.sort(targetKeys);
            //get the first value (it should be the lowest label category)
            return targetKeys.get(0);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds2(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
