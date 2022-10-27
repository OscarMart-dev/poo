package com.mycompany.poo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * 
 * @author oscar
 */
public class Poo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        //datos quemados OJO
        usuario v_usu = new usuario(1024503182, "Oscar", "Martinez", "Soltero", "E");
        empleado v_emp = new empleado("Ciencias", 22, 0256);
        estudiante v_est = new estudiante("Calculo");

        while (!salir) {
        //menu
            System.out.println("1. Usuario");
            System.out.println("2. Empleado");
            System.out.println("3. Estudiante");
            System.out.println("4. Salir");

            try {
            //seleccionar uuna opción 
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();
                //seleccionar uuna opción segundo menu
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion usuario");

                        System.out.println("1. Actualizar estado civil");
                        System.out.println("2. Imprimir o mostrar datos");
                        opcion = scanner.nextInt(); //captura la opcion
                        switch (opcion) { //ingreso de datos 
                            case 1:
                                System.out.println("por favor, digita estado civil:");
                                scanner.nextLine();
                                String estadoCivil = scanner.nextLine();
                                v_usu.setEstcivil(estadoCivil);
                                System.out.println("El estado civil ahora es:" + v_usu.getEstcivil());
                                break;

                            case 2:
                                System.out.println("codigo: " + v_usu.getCodigo() + " |Nombre: " + v_usu.getNombre() + " |Apellido: " + v_usu.getApellido() + " |Estado civil: " + v_usu.getEstcivil());
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion empleado");
                        System.out.println("1. Reasignación de despacho");
                        System.out.println("2. Cambio de departamento");
                        System.out.println("3. Traslado de sección");
                        opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("por favor, digita el numero del despacho:");
                                scanner.nextLine();
                                int codDespacho = scanner.nextInt();
                                v_emp.setCod_despacho(codDespacho);
                                System.out.println("El despacho ahora es:" + v_emp.getCod_despacho());
                                break;

                            case 2:
                                System.out.println("por favor, digita el nuevo departamento:");
                                scanner.nextLine();
                                String departament = scanner.nextLine();
                                v_emp.setDepartamanto(departament);
                                System.out.println("El departamento ahora es:" + v_emp.getDepartamanto());
                                break;

                            case 3:
                                System.out.println("por favor, digita el numero de sección :");
                                scanner.nextLine();
                                int sec = scanner.nextInt();
                                v_emp.setSeccion(sec);
                                System.out.println("la sección ahora es:" + v_emp.getSeccion());
                                break;
                        }

                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion estudiante");
                        System.out.println("por favor, escribe la materia a matricular");
                        scanner.nextLine();
                        String cur = scanner.nextLine();
                        v_est.setCurso(cur);
                        System.out.println("Haz matriculado " + v_est.getCurso());
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }

    }
}
