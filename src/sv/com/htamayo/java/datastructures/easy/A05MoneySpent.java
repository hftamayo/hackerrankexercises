package sv.com.htamayo.java.datastructures.easy;
import java.util.stream.*;

public class A05MoneySpent {
    public class Solution {
        static String  iterateList = "";
        static int mostExpensiveValue = 0;
        /*
         * Complete the getMoneySpent function below.
         */
        static int getMoneySpent(int[] keyboards, int[] drives, int b) {
            //1. copy the array's values to a list
            List<Integer> lstKb = IntStream.of(keyboards).boxed().collect(Collectors.toList());
            Collections.sort(lstKb);
            List<Integer> lstDrives = IntStream.of(drives).boxed().collect(Collectors.toList());
            Collections.sort(lstDrives);
            //2. getting the highest value of each list
            int mostExpensiveValue = lstKb.get(keyboards.length-1);
            int mostExpensiveDv = lstDrives.get(drives.length-1);

            //3. compare which is the list with highest value to iterate the other one
            if(mostExpensiveKb > mostExpensiveDv ){
                iterateList = "lstDrives"; //lstDrives
                mostExpensiveValue = lstKb.get(keyboards.length-1);
            } else{
                iterateList = "lstKb"; //listKb
                mostExpensiveValue = lstDrives.get(keyboards.length-1);
            }


            for(Integer currentElement : iterateList){
                if((mostExpensiveValue + currentElement) > b){
                    result = -1;
                }

            }
            //3. checking if the user can afford the buy of 2 items
            if((mostExpensiveKb+mostExpensiveDv) > b){
                return -1;
            }
            return (mostExpensiveKb+mostExpensiveDv);
        }
    }
