package com.company;
/*Usted fue contratado por el centro educativo ABC para crear un programa de consola que maneje un modulo del sistema
de matricula para los cursos de educacion en linea. Los cursos disponibles son Programacion C++, Programacion en PYTHON,
Progrmacion en JAVA. Los datos a solicitar por cada estudiante son su nombre, apellido, cedula y telefono. El programa
debe solicitar los datos del estudiante y el curso a tomar. Además, debe mantener estadísticas de cuantos estudiantes
hay por curso.*/

import java.util.Scanner;
public class Main {

    private static Scanner captura;


    public static void main(String[] args) {
        char seguir = 's';
        //char seguir = captura.next().charAt(0);
        String nomb, apel;
        int cedu, tele, contC = 0, contJ = 0, contP = 0, curso = 0;

        do {
                System.out.println("Introduzca el Nombre:");
                nomb = captura.next();
                System.out.println("Introduzca el Apellido:");
                apel = captura.next();
                System.out.println("Introduzca la cedula:");
                cedu = captura.nextInt();
                System.out.println("Introduzca el Telefono:");
                tele = captura.nextInt();

                System.out.println("Introduzca la opción del Curso:");
                System.out.println("1 para Programacion C++:");
                System.out.println("2 para Programacion en PYTHON:");
                System.out.println("3 para Programacion en JAVA:");
                curso = captura.nextInt();

                if (curso == 1 ) {
                   contC++;
                    } else if (curso == 2 ) {
                   contP++;
                    } else   {
                    contJ++;
                    }

                 System.out.println("Pulse s para continuar n para salir:");
                 seguir = captura.next().trim().charAt(0);

            } while (seguir != 'n');

        System.out.println (contC);
        System.out.println (" Estudiantes matriculados en Programacion en C++");
        System.out.println (contP);
        System.out.println ( " Estudiantes matriculados en Programacion en PYTHON");
        System.out.println (contJ);
        System.out.println (  " Estudiantes matriculados en Programacion en JAVA");
    }
}
