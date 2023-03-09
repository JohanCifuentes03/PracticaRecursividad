import java.util.stream.IntStream;

public class Main {
    public static int sum(int max ){
        int resultado = 0;
        for (int i = 0; i <= max; i++){
            resultado+= i;
        }
        return resultado;
    }

    public static double sumaFraction(double n){
        double resultado = 0.0;
        for (double i = 1; i<= (n + 1); i++){
            resultado = resultado + (1/i);
        }
        return resultado;
    }

    public static double recursiveFraction(double n ){
        if(n == 0)return 0;
        return (1/n) + recursiveFraction(n-1);
    }

    //-> 5-1
    //   ->4-1
    //       ->3-1
    //           ->2-1
    //               ->1-1
    //                   ->0-1
    // sumRecursive(5)
    //   sumRecursive(4) -- 5-1
    //      sumRecursive(3) -- 4-1
    //          sumRecursive(2) -- 3-1
    // .....
    //              sumRecursive(0) .. finish
    public static int sumRecursive(int n){
        if(n == 0) return 0;
        return n + (sumRecursive(n-1 ));
    }

    // suma en una funcion Funcional, usando Stream
    public static int functionalSum(int n){
        return IntStream.rangeClosed(1,n)
                .reduce(0,(a,b) -> a + b);
    }


    // Factorial in a ciclic structure
    public static int factorial(int n){
        int total = 1;
        for (int i = n; i >= 1 ; i--){
            total*= i;
        }
        return total;
    }

    // Factorial usando recursividad, bastante bien a mi parecer.
    public static int recursiveFactorial(int n){
        if (n == 0) return 1;
        return n * (recursiveFactorial(n-1));
    }
    // Factorial usando funcion pura, algo complejo a mi parecer
    public static int functionalFactorial(int n){
        return IntStream.rangeClosed(1,n)
                .reduce(1,(a,b) -> a * b);
    }

    public static void main(String[] args) {
        // -> 1 + 2 + 3 + 4 + 5 => 15
        //System.out.println(sum(5));


        /*
        -> (1/1) + (1/2) + (1/3) + (1/4) + (1/5) => 2...
        System.out.println(sumaFraction(5));

        System.out.println(sumRecursive(5));
        System.out.println(recursiveFraction(5));
        System.out.println(functionalSum(5));


        System.out.println(factorial(4));
        System.out.println(recursiveFactorial(4));
        System.out.println(functionalFactorial(4));
         */




        long tInicial = System.currentTimeMillis();
        for(int i = 0; i <= 1000000; i++){
            sumRecursive(5);
        }
        long tFinal   =  System.currentTimeMillis();

        System.out.println("Tiempo en MS: " + (tFinal-tInicial));


    }
}