package aplicacion;

import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

import operaciones.Operaciones;

public class Main {

    public static void main(String[] args) 
    {
        System.out.println("1) La suma de los primeros 10 numeros es: " + Operaciones.suma(10));
        System.out.println("2) El factorial de 5 es: " + Operaciones.factorial(5) );
        System.out.println("3) La potencia 5 de 4 es: " + Operaciones.potencia(4, 5));
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1); 
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("4) La suma de la lista de numeros es: " + Operaciones.sumaLista(lista));
        ArrayList<Double> l = new ArrayList<>();
        l.add(3.0);
        l.add(4.0);
        l.add(5.0);
        //System.out.println("5) La media aritmetica de (3,4,5) es: " + Operaciones.media(l));

        System.out.println("7) La suma de los numeros pares hasta el 9 es: " + Operaciones.sumaParesN(9));
        ArrayList<Integer> lista4 = new ArrayList<>();
        lista4.add(4);
        lista4.add(5);
        lista4.add(6);
        System.out.println("8) La suma de los pares de la lista (4,5,6) es: " + Operaciones.sumaPares(lista4));
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.add(1);
        lista3.add(2);
        lista3.add(5);
        lista3.add(6);
        lista3.add(4);
        lista3.add(6);
        lista3.add(7);
        System.out.println("9) La nueva lista de numeros pares dada (1,2,5,6,4,8,7) es: " + Operaciones.listaPares(lista3));
        System.out.println("10) La lista de los pares hasta el numero 9 es: " + Operaciones.nLPares(9));
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(1);
        lista1.add(2);
        lista1.add(3);

        lista2.add(2);  
        lista2.add(4);  
        lista2.add(6);

        System.out.println("11) El producto escalar de las dos listas (1,2,3) y (2,4,6) es: " + Operaciones.productoEscalar(lista1, lista2));
        System.out.println("12) El termino 9 de la serie de Fibonacci es: " + Operaciones.fibonacci(9));
    }
}
