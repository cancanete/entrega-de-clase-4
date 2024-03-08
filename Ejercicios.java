public class Ejercicios{
    public static int sumaIterativa(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    
    public static void main(String[] args) {
        int n = 5; // Cantidad de números naturales a sumar
        System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaIterativa(n));
    }
    #include <stdio.h>

int sumaIterativa(int n) {
    int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += i;
    }
    return suma;
}

int main() {
    int n = 5; // Cantidad de números naturales a sumar
    printf("La suma de los primeros %d números naturales es: %d\n", n, sumaIterativa(n));
    return 0;

}
public static int sumaRecursiva(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n + sumaRecursiva(n - 1);
    }
}

public static void main(String[] args) {
    int n = 5; // Cantidad de números naturales a sumar
    System.out.println("La suma de los primeros " + n + " números naturales es: " + sumaRecursiva(n));
}
}
#include <stdio.h>

int sumaRecursiva(int n) {
    if (n == 0) {
        return 0;
    } else {
        return n + sumaRecursiva(n - 1);
    }
}

int main() {
    int n = 5; // Cantidad de números naturales a sumar
    printf("La suma de los primeros %d números naturales es: %d\n", n, sumaRecursiva(n));
    return 0;
}