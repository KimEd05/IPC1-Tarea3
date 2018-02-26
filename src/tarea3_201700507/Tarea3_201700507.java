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
        
        boolean salida = true;
        //Asigna un valor de salida verdadero al programa por default.
        do {
        /*Ejecuta el proceso media vez se cumpla con la condición establecida en While, la cual es que "salida" sea verdadera. De no ser así, dejará de ejecutar dicha parte del proceso,
        que en este caso implica la finalización del programa*/
        System.out.println("[IPC1]Tarea3_201700507");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Contador de dígitos");
        System.out.println("3. Tres números de mayor a menor");
        System.out.println("4. Calcular promedio");
        System.out.println("5. Salir");
        //System.out.println(""); permite la impresión en pantalla, ya sea para leer algún texto en específico, o leer la información que contienen las variables.
        
        try {
        /*Permite "darle una prueba" al proceso, tomando en cuenta que se llevará a cabo según los parámetros establecidos (como el tipo de variable).
        De darse el caso de que se incumpla con los parámetros, "atrapa" el error que esto provoca, para poder brindar una solución o un proceso alterno, y así evitar que el programa deje
        de funcionar*/
        Scanner teclado = new Scanner (System.in);
        //Permite el ingreso de información.
            int menu = teclado.nextInt();
            //Guarda en una variable la información que se ingresó.       
            switch (menu) {
            //Redirige a una serie de diferentes procesos. Tiene un caso por default, que es el que se cumple al momento de que ninguna de las opciones lo haga.
                case 1: boolean usuario = true;
                        String [] listausuario = new String [5];
                        //Declara una lista de cadena, lo cual permite almacenar información en diferentes posiciones de un determinado para poder manipularla.
                        do {
                        //Mantiene ejecutando el submenú, media vez la condición usuario sea verdadera.
                        System.out.println("1. Ingresar Usuarios");
                        System.out.println("2. Mostrar Usuarios Ascendente");
                        System.out.println("3. Mostrar Usuarios Descendente");
                        System.out.println("4. Menú Principal");
                        
                        Scanner teclado1 = new Scanner (System.in);
                        int menuusuario = teclado1.nextInt();
                       
                        switch (menuusuario) {
                            case 1:
                                    for (int i = 0; i < listausuario.length; i++) {
                                    //Recorre un determinado proceso la cantidad de veces que es establecida en sus condiciones.
                                    Tarea3_201700507.ingresarUsuario(listausuario, i);
                                }
                                    break;
                                    //Hace que no se ejecuten las demás opciones de un Switch, sino únicamente el caso para el cual cumple.
                                                       
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
                                    //Debido a que la condición establecida por default (verdadera), se le asigna el valor de falsa, deja de ejecutar el proceso al cual contenía. 
                                    break;
                                    
                            default: System.out.println("Ingrese un número dentro del listado");
                            /*En el caso de que se escriba un número que no se encuentra dentro de las opciones de un switch, se acude a la opción por default para que el programa 
                            realice o notifique un error, en última instancia.*/
                                    break;
                        }
                        }
                        while (usuario);
                    break;
                    
                case 2: 
                        boolean contador = true;
                        String i = null;
                        //Inicialización de i, para indicar que la variable está vacía pero contendrá información.
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
                            case 2: if (Integer.parseInt(i) >= 0 && Integer.parseInt(i) <= 100000){
                                    //El número debe de encontrarse entre entre 0 y 100000. Debe de cumplir ambas condiciones.
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
                                    //Llama al método creado para ingresar números, la cantidad de veces para llenar los espacios establecidos por la lista declarada al iniciar el caso 3 (3).
                            }
                                    break;
                            case 2: 
                                    if (listaNumeros[0] > listaNumeros[1] && listaNumeros[0] > listaNumeros[2]){
                                    //Para ordenar la lista de mayor a menor, se establece si el primer número ingresado es mayor que los siguientes.
                                        if (listaNumeros[1] > listaNumeros[2]){
                                            /*De cumplirse que sea mayor que los dos siguientes, se procede a averiguar cual de los dos siguientes es que le sigue en tamaño, creando las
                                            dos condiciones, pues el segundo puede ser mayor que el tercero o viceversa. Y de cumplirse, se ordena según la condición que cumpla*/
                                            System.out.println(listaNumeros[0]);
                                            System.out.println(listaNumeros[1]);
                                            System.out.println(listaNumeros[2]);
                                        } else {
                                            System.out.println(listaNumeros[0]);
                                            System.out.println(listaNumeros[2]);
                                            System.out.println(listaNumeros[1]);
                                        }
                                    }
                                    
                                    if (listaNumeros[1] > listaNumeros[0] && listaNumeros[1] > listaNumeros[2]){
                                        if (listaNumeros[0] > listaNumeros[2]){
                                            System.out.println(listaNumeros[1]);
                                            System.out.println(listaNumeros[0]);
                                            System.out.println(listaNumeros[2]);
                                        } else {
                                            System.out.println(listaNumeros[1]);
                                            System.out.println(listaNumeros[2]);
                                            System.out.println(listaNumeros[0]);
                                        }
                                    }
                                    
                                    if (listaNumeros[2] > listaNumeros[0] && listaNumeros[2] > listaNumeros[1]){
                                        if (listaNumeros[0] > listaNumeros[1]){
                                            System.out.println(listaNumeros[2]);
                                            System.out.println(listaNumeros[0]);
                                            System.out.println(listaNumeros[1]);
                                        } else {
                                            System.out.println(listaNumeros[2]);
                                            System.out.println(listaNumeros[1]);
                                            System.out.println(listaNumeros[0]);
                                        }
                                    }
                                    
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
                        //Se insertan dos pares de corchetes, debido a que la lista es en dos dimensiones y se debe de permitir el acceso en ambas direcciones.
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
                                    //Llamada al método para ingresar el ID y las notas, debido a que es diferente para cada alumno.
                                }
                                    break;
                            case 2: for(fila = 0; fila<listaNotas.length; fila++){
                                    //Indica que se trabajará en determinada fila, hasta que cumpla con la condición del tamaño de la lista.
                                        for(columna = 0; columna<listaNotas.length; columna++){
                                        /*Simultáneamente, al trabajar dentro de una fila se procede a trabajar dentro de las columnas que se contienen en ella.
                                        Al momento de que el for de columna se termine al cumplir con sus condiciones, se regresa nuevamente al for de la fila para proceder a llenarse.
                                        El proceso se repite hasta que el for de la fila cumpla con sus condiciones.*/
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
        //Excepción encontrada al intentar ingresar caracter diferente de un número, al momento de realizar la selección del menú. Al encontrarse, regresa al menú principal.
            System.out.println("Ingrese un número válido");
        }    
        }
        
        while (salida);
    }
    
    
    public static boolean validarUsuario(String[] listadoUsuarios, String nombreUsuario){
    //Método para identificar si el usuario ya ha sido creado. Diferencia entre mayúsculas y minúsculas.
        for (int i = 0; i < listadoUsuarios.length; i++) {
        //Se ejecutará en todos los espacios de la lista creada para el ingreso de usuarios.
            if(listadoUsuarios[i] != null){
            /*Debido a que al inicio la lista se encuentra sin llenarse, sus espacios se identifican con null; por ende, no podría realizarse la comparación.
            Entonces, se procede a indicar que la comparación se debe de realizar cuando dicho espacio no sea null.*/
            if(nombreUsuario.compareTo(listadoUsuarios[i])==0){
            //Al momento de comparar el nombre de usuario con cada uno de los espacios de la lista, retornará un 0 de encontrar una coincidencia.
                return true;
                //Al encontrar una coincidencia y obtener un 0, retornará el valor de verdadero. Dicho valor será de utilidad en el método de ingresar usuario.
            }}
        }
        return false;
        //De no encontrarse una coincidencia en el nombre de usuario, retornará el valor de falso.
    }
    
    
    public static void ingresarUsuario(String[] listadoUsuario, int posicion){
                                   
        boolean existe = false;                            
        do{
        //Realiza el proceso, media vez no exista coincidencia el nombre de usuario.
            System.out.println("Ingresar Usuario " + (posicion + 1));
        Scanner usuario1scann = new Scanner (System.in);
        String usuario1 = usuario1scann.nextLine();
        existe = Tarea3_201700507.validarUsuario(listadoUsuario, usuario1);

        if(!existe)
            listadoUsuario[posicion] = usuario1;
        //Si no existe el nombre de usuario, éste se guardará en la memoria de la lista según la posición correspondiente.
        else
            System.out.println("El usuario ingresado ya existe, ingrese un nuevo usuario.");
        //Si el nombre de usuario existe, se procederá a solicitar nuevamente del proceso de escritura, validación, para asignarle el valor a la variable de la lista.
        
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
        //Cambia la variable de tipo cadena a entero, para poder utilizar los valores como números y poder realizar las comparaciones.
    }
 
    /**
     *
     * @param listadoNotas
     * @param fila
     * @param columna
     */
    public static void ingresarNotas (int [][] listadoNotas, int fila){
        
        System.out.println("Ingresar ID del alumno");
        Scanner identificador = new Scanner (System.in);
        String identif = identificador.nextLine();
        System.out.println("Ingresar notas de alumno " + (fila+1));
        Scanner num1 = new Scanner (System.in);
        String nota1 = num1.nextLine();
        Scanner num2 = new Scanner (System.in);
        String nota2= num2.nextLine();
        Scanner num3 = new Scanner (System.in);
        String nota3 = num3.nextLine();
        Scanner num4 = new Scanner (System.in);
        String nota4 = num4.nextLine();
       
        int id = Integer.parseInt(identif);
        int n1 = Integer.parseInt(nota1);
        int n2 = Integer.parseInt(nota2);
        int n3 = Integer.parseInt(nota3);
        int n4 = Integer.parseInt(nota4);
        int promedio = ((n1+n2+n3+n4)/4);
        //Para mayor facilidad de uso de variables, se declara una nueva en la cual ya se ha convertido el valor de cadena en entero, para poder realizar operaciones aritméticas.
        
        listadoNotas[fila][0] = id;
        listadoNotas[fila][1] = n1;
        listadoNotas[fila][2] = n2;
        listadoNotas[fila][3] = n3;
        listadoNotas[fila][4] = n4;
        listadoNotas[fila][5] = promedio;
        
    }


   }
