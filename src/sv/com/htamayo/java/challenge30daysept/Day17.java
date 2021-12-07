package sv.com.htamayo.java.challenge30daysept;
/*
link: https://www.hackerrank.com/challenges/30-more-exceptions/problem?isFullScreen=false
score: 30 of 30
*/
public class Day17 {
    class Calculator{
        int xn;
        int xp;

        public Calculator(){
        }

        int power(int n, int p) throws Exception {
            this.xn = n;
            this.xp = p;
            int answer = 0;

            if(xn < 0 || xp < 0){
                throw new Exception("n and p should be non-negative");
            }

            return (int)Math.pow(xn, xp);
        }
    }
}
