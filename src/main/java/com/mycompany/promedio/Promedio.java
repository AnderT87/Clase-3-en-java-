/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.promedio;

/**
 *
 * @author tribe
 */
//Calculo del promedio de semestre
import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        double[] notas = new double[20];

        Scanner sc = new Scanner(System.in);

        int tamanos;
        double division;
        double division2;
        double promedioAcumulado;
        int sumas = 0;
        int suma = 0;
        int i;
        double recuperacion;

        System.out.println("CALCULO DEL PROMEDIO DE LAS NOTAS DEL SEMESTRE");
        System.out.println(" ");
        System.out.println("Cuantas notas va a ingresar");
        tamanos = sc.nextInt();

        System.out.println(" ");
        System.out.println("---NOTAS DE MEDIO CICLO---");
        System.out.println(" ");

        for (i = 0; i < tamanos; i++) {
            System.out.println((i + 1) + ".Ingrese las notas");
            notas[i] = sc.nextInt();
            sumas += notas[i];
        }
        division = sumas / tamanos;
        System.out.println("Su nota del medio ciclo es de:" + division);

        System.out.println(" ");
        System.out.println("---NOTAS FIN DE CICLO---");
        System.out.println(" ");

        System.out.println("Cuantas notas va a ingresar");
        tamanos = sc.nextInt();

        for (i = 0; i < tamanos; i++) {
            System.out.println((i + 1) + ".Ingrese las notas");
            notas[i] = sc.nextInt();
            suma += notas[i];
        }
        division2 = suma / tamanos;
        System.out.println("Su nota de fin de ciclo es de:" + division2);
        System.out.println(" ");
        
        promedioAcumulado = ((division + division2) / 2);
        System.out.println("Su nota final es de:" + promedioAcumulado);
        System.out.println(" ");
        if (promedioAcumulado < 6.99) {
            System.out.println("Su nota no a alcanzado el  minimo aprobatorio");
            System.out.println("Ingrese su nota del examen de recuperacion:");
            recuperacion = sc.nextDouble();
            if (recuperacion < 6.99) {
                System.out.println(" ");
                System.out.println("Su nota no alcanzo la nota aprobatoria,usted pierde la materia");
            } else {
                System.out.println(" ");
                System.out.println("Felicidades a logrado aprobar la materia");
            }
        } else {
            System.out.println(" ");
            System.out.println("Felicidades has aprobado");
            
        }
    }
}
