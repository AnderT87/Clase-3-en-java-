/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.terceraclases;

/**
 *
 * @author SO-LAB-PC6
 */
public class TerceraClases {

    public static void main(String[] args) {
        
        //int contador = 5;
        //Sintaxis de while
        /*
        while (contador < 5)
        {    
            System.out.println("Hola"+ contador);
            //contador = contador + 2;
        }
        
        //Sintaxis de do while
        
        do {            
            System.out.println("Hola"+ contador);
            contador++;
            
        } while (contador < 5);
        
        double ancho = 25;
        double altura = 15;
        
        double area = 0;
        
        area= ancho * altura ;
        
        System.out.println("EL area del rectangula es:"+ area);
        
        
        int num1 = -23;
        if (num1 > 0)
        {
            System.out.println("Su numero es positivo:"+num1);
        }
        else 
        {
            System.out.println("Su numnero es negativo:"+num1);
        }
        
        
        int num = 2;
        int op = num % 2;

        if (op == 0) {
            System.out.println("EL numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        */
        int nota = 70;
        if ((nota >= 0) && (nota <= 100)) {
            if (nota >= 90) {
                System.out.println("Excelente: " + nota);
            } else if ((nota >= 70) && (nota <= 89)) {
                System.out.println("Aprobado: " + nota);
            } else if (nota < 70) {
                System.out.println("Reprobado: " + nota);
            }
        }else{
            System.out.println("La nota ingresada es invalida");
        }
    }
}
