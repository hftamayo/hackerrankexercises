package sv.com.htamayo.java.cadenas;

public class Ejercicio03 {
    public static void main(String args[]){
// Pointers pointing to the beginning
        // and the end of the string
        String A = "pocoyo";
        int inc = 0;
        int des = A.length()-1;
        boolean bError = false;

        while ((inc<des) && (!bError)){

            if (A.charAt(inc)==A.charAt(des)){
                inc++;
                des--;
            } else {
                bError = true;
            }
        }

        if (!bError)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
