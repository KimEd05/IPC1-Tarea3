/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201700507;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kimel
 */
public class Tarea3_201700507 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean salida = true;
        
        do {
        System.out.println("[IPC1]Tarea3_201700507");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de dígitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        
        try {
        Scanner teclado = new Scanner (System.in);
            int menu = teclado.nextInt();
                    
            switch (menu) {
                case 1: boolean usuario = true;
                        String [] listausuario = new String [5];
                        do {
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar Usuarios Ascendente");
                        System.out.println("3. Mostrar Usuarios Descendente");
                        System.out.println("4. Menú Principal");
                        
                        Scanner teclado1 = new Scanner (System.in);
                        int menuusuario = teclado1.nextInt();
                       
                        switch (menuusuario) {
                            case 1:
                                    for (int i = 0; i < listausuario.length; i++) {
                                    Tarea3_201700507.ingresarUsuario(listausuario, i);
                                }
                                    break;
                                                       
                            case 2: 
                                    for (int i = listausuario.length -1; i >= 0; i--){
                                        System.out.println((i + 1)  + ". " +listausuario[i]);
                            }
                                    break;
                                    
                            case 3: for (int i = 0; i < listausuario.length; i++){
                                    System.out.println((i + 1) + ". " + listausuario[i]);
                            }
                                    break;
                                    
                            case 4: usuario = false;
                                    break;
                                    
                            default: System.out.println("Ingrese un número dentro del listado");
                                    break;
                        }
                        }
                        while (usuario);
                    break;
                    
                case 2: 
                        boolean contador = true;
                        String i = null;
                        do {
                        System.out.println("1. Ingresar Número");
                        System.out.println("2. Mostrar Número de Dígitos");
                        System.out.println("4. Menú Principal");
                        
                        Scanner teclado2 = new Scanner (System.in);
                        int menucontador = teclado2.nextInt();
                        
                        switch (menucontador){
                            case 1: System.out.println("Ingrese un número entero"); 
                                    Scanner valorTeclado = new Scanner (System.in);
                                    i = valorTeclado.nextLine();
                                    break;
                            case 2: if (Integer.parseInt(i) <= 100000){
                                    System.out.println(i.length());
                                    }
                                    else {System.out.println("El número no se encuentra dentro del rango establecido.");}
                                    break;
                            case 4: contador = false;
                                    break;
                            default: System.out.println("Ingrese un número dentro del listado");
                                    break;
                        }
                        } while (contador);
                    break;
                    
                case 3: 
                        boolean ordenar = true;
                        int [] listaNumeros = new int [3];
                        do {
                        System.out.println("1. Ingresar Números");
                        System.out.println("2. Mostrar Ordenados");
                        System.out.println("4. Menú Principal");
                        
                        Scanner teclado3 = new Scanner (System.in);
                        int menuordenar = teclado3.nextInt();
                        
                        switch (menuordenar){
                            case 1: 
                                    for (int j = 0; j < listaNumeros.length; j++) {
                                    Tarea3_201700507.ingresarNumeros(listaNumeros, j);
                            }
                                    break;
                            case 2: 
                                    break;
                            case 4: ordenar = false;
                                    break;
                            default: System.out.println("Ingrese un número dentro del listado");
                                    break;
                        }
                        } while (ordenar);
                    break;
            

                case 4: 
                        boolean prom = true;
                        int listaNotas [][] = new int [6][6];
                        int fila;
                        int columna;
                        do {
                        System.out.println("1. Ingresar Notas");
                        System.out.println("2. Mostrar Resumen de Notas");
                        System.out.println("4. Menú Principal");
                        
                        Scanner teclado4 = new Scanner (System.in);
                        int menuprom = teclado4.nextInt();
                        
                        switch (menuprom){
                            case 1: 
                                    for (fila = 0; fila < listaNotas.length; fila++) {
                                    Tarea3_201700507.ingresarNotas(listaNotas, fila);
                                    
                                }
                                    
                                    break;
                            case 2: for(fila = 0; fila<listaNotas.length; fila++){
                                        for(columna = 0; columna<listaNotas.length; columna++){
                                            System.out.print("\t"+listaNotas[fila][columna]+" ");
                                        }
                                        System.out.println("");
                                    }
                                    break;
                            case 4: prom = false;
                                    break;
                            default: System.out.println("Ingrese un número dentro del listado");
                                    break;
                        }
                        } while (prom);
                    break;
                    
                case 5: System.out.println("El programa ha finalizado.");
                    salida = false;
                    break;
                    
                default: System.out.println("Ingrese un número dentro del listado");
                    break;
            }
        } catch (InputMismatchException e){
            System.out.println("Ingrese un número válido");
        }    
        }
        
        while (salida);
    }
    
    
    public static boolean validarUsuario(String[] listadoUsuarios, String nombreUsuario){
    
        for (int i = 0; i < listadoUsuarios.length; i++) {
            
            
            if(listadoUsuarios[i] != null){
            if(nombreUsuario.compareTo(listadoUsuarios[i])==0){
                
                return true;
            }}
        }
        
        
        return false;
    }
    
    
    public static void ingresarUsuario(String[] listadoUsuario, int posicion){
                                   
        boolean existe = false;                            
        do{     
            System.out.println("Ingresar Usuario " + (posicion + 1));
        Scanner usuario1scann = new Scanner (System.in);
        String usuario1 = usuario1scann.nextLine();
        existe = Tarea3_201700507.validarUsuario(listadoUsuario, usuario1);

        if(!existe)
            listadoUsuario[posicion] = usuario1;
        else
            System.out.println("El usuario ingresado ya existe, ingrese un nuevo usuario.");
        
        } while(existe);      
    }
    
    /**
     *
     * @param listadoNumeros
     * @param posicion
     */
    public static void ingresarNumeros (int [] listadoNumeros, int posicion){
        
        System.out.println("Ingresar número " + (posicion + 1));
        Scanner numero = new Scanner (System.in);
        String numeroAsignado = numero.nextLine();
        listadoNumeros[posicion] = Integer.parseInt(numeroAsignado);
    }
 
    /**
     *
     * @param listadoNotas
     * @param fila
     * @param columna
     */
    public static void ingresarNotas (int [][] listadoNotas, int fila){
        
        System.out.println("Ingresar notas de alumno " + (fila+1));
        Scanner num1 = new Scanner (System.in);
        String nota1 = num1.nextLine();
        Scanner num2 = new Scanner (System.in);
        String nota2= num2.nextLine();
        Scanner num3 = new Scanner (System.in);
        String nota3 = num3.nextLine();
        Scanner num4 = new Scanner (System.in);
        String nota4 = num4.nextLine();
       
        int n1 = Integer.parseInt(nota1);
        int n2 = Integer.parseInt(nota2);
        int n3 = Integer.parseInt(nota3);
        int n4 = Integer.parseInt(nota4);
        int promedio = ((n1+n2+n3+n4)/4);
        
        listadoNotas[fila][0] = fila + 1;
        listadoNotas[fila][1] = n1;
        listadoNotas[fila][2] = n2;
        listadoNotas[fila][3] = n3;
        listadoNotas[fila][4] = n4;
        listadoNotas[fila][5] = promedio;
        
    }


   }
