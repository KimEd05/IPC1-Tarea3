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
        System.out.println("");
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
                                    //int posicionFinal = listausuario.length;
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
                        do {
                        System.out.println("1. Ingresar Número");
                        System.out.println("2. Mostrar Número de Dígitos");
                        System.out.println("4. Menú Principal");
                        
                        Scanner teclado2 = new Scanner (System.in);
                        int menucontador = teclado2.nextInt();
                        
                        } while (contador);
                        
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
            System.out.println("El usuario ingresado ya existe. Ingrese un nuevo usuario.");
        
        } while(existe);      
    }
    
    
}
