package operaciones;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;

public class Operaciones {

    //1
    public static int suma(int n)
    {
        int resultado = IntStream.rangeClosed(1, n).sum();
        return resultado;
    }
    //2
    public static int factorial(int n)
    {
        int resultado = IntStream.rangeClosed(1, n).reduce(1, (x,y) -> (x*y));
        return resultado;

    }
    //3
    public static int potencia(int base, int exponente)
    {
        int resultado = IntStream.range(0, exponente).reduce(1, (acumulador, elemento) -> acumulador * base);               
        return resultado;

    }
    //4
    public static int sumaLista(ArrayList<Integer> lista)
    {
        int resultado = lista.stream().reduce(0, (a, b) -> a + b); 
        return resultado;
    }

    //7
    public static int sumaParesN(int n)
    {
        return IntStream.rangeClosed(0, n).filter(x ->  x % 2 == 0).sum();
    }
    //8
    public static int sumaPares(ArrayList<Integer> lista4)
    {
        return lista4.stream().filter(p -> p % 2 == 0).reduce(0, (x,y) -> x+y);
    }
    //9
    public static ArrayList<Integer> listaPares(ArrayList<Integer> lista3)
    {
        return lista3.stream().filter(n -> n >= 2).filter(n -> n%2 == 0).collect(Collectors.toCollection(ArrayList::new));
    }

    //10
    public static ArrayList<Integer> nLPares(int n)
    {
        ArrayList<Integer> nuevaListaPares = new ArrayList<>();
        IntStream.rangeClosed(2, n).boxed().sorted(Comparator.reverseOrder()).filter(e -> e % 2 == 0).forEach(i -> nuevaListaPares.add(i));
        return nuevaListaPares;
    }
    //11
    public static int productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) 
     {
        int resultado = IntStream.range(0, lista1.size()).map(i -> lista1.get(i) * lista2.get(i)).sum();    
        return resultado;
     }

     //12
     public static int fibonacci(int n) {
        return IntStream.range(0, n).reduce((x, y) -> {
                    if (y == 0) return y;
                    else if (y == 1) return 1;
                    else return x + y;
                })
                .orElse(0);
    }
}