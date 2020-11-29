package ejercicioejerciciou3e5;

import java.util.Scanner;

public class EjercicioEjercicioU3E4 {

     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Pila p = new Pila();
        boolean salir = false;
        int dato;
        do {
             salir = false;
             System.out.println("~~~~~~~~~~~~~~~~Método de una pila~~~~~~~~~~~~~~~~");
             System.out.println("1.- Insertar");
             System.out.println("2.- Sacar");
             System.out.println("3.- Mostar Cima");
             System.out.println("4.- Numeros Random");
             System.out.println("5.- Vaciar Pila");
             System.out.println("6.- Mostar Pila Vacia");
             System.out.println("7.- Mostar Pila");
             System.out.println("8.- Mostrar Tamaño Pila");
             int opc = leer.nextInt();
             switch (opc) {
                case 1:
                    System.out.println("Ingrese un numero");
                    dato = leer.nextInt();
                    p.push(dato);
                    break;
                case 2:
                    if (!p.isEmpty()) {
                        System.out.println("Numero elimidado: " + p.pop());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 3:
                    if (!p.isEmpty()) {
                        System.out.println("Ultimo numero agregado: " + p.peek());
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 4:
                    p.Random();
                    System.out.println("Numeros random generados");
                    break;
                case 5:
                    p.Empty();
                    break;
                case 6:
                    if (p.isEmpty()) {
                        System.out.println("La pila esta vacia");
                    } else {
                        System.out.println("La pila tiene " + p.size());
                    }
                    break;
                case 7:
                    if (!p.isEmpty()) {
                        p.Mostrar();
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    break;
                case 8:
                    System.out.println("Tamaño de la pila: " + p.size());
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("");
        } while (!salir);
    }
}
