// Dos arreglos
package arreglopareimpar;
import java.util.Scanner;
import java.util.Arrays;
public class Arreglopareimpar {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
    
int numpar = 0;
int numimp = 0;
    
int [] A = new int [10];

int [] par = new int [A.length];
int [] impar = new int [A.length];

for(int i = 0; i<A.length; i++){
    System.out.println(" Ingrese los numeros "  + (i+ 1) +  ":"); //(i+1) sirve para ponerlo del 1 al 10, (los arreglos empiezan en 0)
A[i] = teclado.nextInt();   // A[i] es el valor de A que esta en esa posicion   
}

for (int i = 0; i<A.length; i++){
if (A[i]% 2 == 0){
    par[numpar] = A[i];
    numpar++;
    }
else {
    impar[numimp] = A[i];
    numimp++;
}
}

int [] parexacto = Arrays.copyOf(par,numpar); // Significa (origen, tamaño) los compara y saca el nuevo tamaño
int [] imparexacto = Arrays.copyOf(impar, numimp); // Se deben crear despues de haberle dados los valores a los otros, si no quedaran en (0)


// Mostrar datos
System.out.println("Arreglo par:");
for(int i = 0; i<parexacto.length; i++){
  System.out.println(parexacto[i]+ " ");
}    

System.out.println("Arreglo impar:");
for(int i = 0; i<imparexacto.length; i++){
    System.out.println(imparexacto[i]+ " ");
}    


 

    }
    
}
