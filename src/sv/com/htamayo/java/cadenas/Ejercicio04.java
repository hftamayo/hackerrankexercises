package sv.com.htamayo.java.cadenas;

public class Ejercicio04 {
    public static void main(String[] args){
        String a = "palabra";
        String b= "palabra";
        char currentChar = Character.MIN_VALUE;
        int hits = 0;

        if(a.length() != b.length()){
            System.out.println("Not Anagrams");
        }
        else{
            for(int i=0; i<a.length(); i++){
                currentChar = a.charAt(i);
                //System.out.println("char function: " + currentChar);
                //System.out.println("substring function: "+a.substring(i, i+1));

                if(a.substring(i, i+1).equals(currentChar)) {
                    hits++;
                }

            }//for
        }//fin de else
        System.out.println("numbero de coincidencias de "+currentChar+ " es: "+hits);
    }//fin de main
}
