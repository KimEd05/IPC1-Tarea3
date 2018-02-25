/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201700507;

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
        System.out.println("");
        System.out.println("[IPC1]Tarea3_201700507");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de dígitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        
        
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
                              
                            case 1: System.out.println("Ingresar Usuario 1");
                                    Scanner usuario1scann = new Scanner (System.in);
                                    String usuario1 = usuario1scann.nextLine();
                                    listausuario[0] = usuario1;
                                    System.out.println("Ingresar Usuario 2");
                                    Scanner usuario2scann = new Scanner (System.in);
                                    String usuario2 = usuario2scann.nextLine();
                                    listausuario[1] = usuario2;
                                    System.out.println("Ingresar Usuario 3");
                                    Scanner usuario3scann = new Scanner (System.in);
                                    String usuario3 = usuario3scann.nextLine();
                                    listausuario[2] = usuario3;
                                    System.out.println("Ingresar Usuario 4");
                                    Scanner usuario4scann = new Scanner (System.in);
                                    String usuario4 = usuario4scann.nextLine();
                                    listausuario[3] = usuario4;
                                    System.out.println("Ingresar Usuario 5");
                                    Scanner usuario5scann = new Scanner (System.in);
                                    String usuario5 = usuario5scann.nextLine();
                                    listausuario[4] = usuario5;
                                    break;
                        
                            case 2: System.out.println(listausuario[4]);
                                    System.out.println(listausuario[3]);
                                    System.out.println(listausuario[2]);
                                    System.out.println(listausuario[1]);
                                    System.out.println(listausuario[0]);
                                    break;
                                    
                            case 3: System.out.println(listausuario[0]);
                                    System.out.println(listausuario[1]);
                                    System.out.println(listausuario[2]);
                                    System.out.println(listausuario[3]);
                                    System.out.println(listausuario[4]);
                                    break;
                                    
                            case 4: 
                                    break;
                                    
                            default: System.out.println("Ingrese un número dentro del listado");
                                    break;
                        }
                        }
                        while (usuario);
                    break;
                    
                case 2: System.out.println("Menú Contador");  
                    break;
                case 3: System.out.println("Menú tres");
                    break;
                case 4: System.out.println("Menu calcular");
                    break;
                case 5: System.out.println("Saliendo");
                    salida = false;
                    break;
                default: System.out.println("Ingrese un número dentro del listado");
                    break;
            }
        }
        while (salida);

    }
}
