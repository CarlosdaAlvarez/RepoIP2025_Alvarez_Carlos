package proyect001;

import java.util.Scanner;

public class Proyect001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int  numCalif=0;
        
        System.out.println("Ingrese el numero de calificaciones: ");
        numCalif=entrada.nextInt();
        double [] notas=new double[numCalif];
        
        for(int i=0; i<numCalif;i++){
            System.out.println("Ingrese las notas del estudiante: ");
            notas[i]=entrada.nextDouble();
        }
        
        Libretas libreta = new Libretas("Ramiro", "111111","Computacion",notas);
        libreta.mostrarInfo();
        double pro=libreta.calcularPromedio();
        libreta.notaCualitativa(pro);
        
    }

}
