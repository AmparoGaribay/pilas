/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import pilas.Pila;

/**
 *
 * @author AMPARO
 */
public class Pilas {
    Pila pila1= new Pila();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila listp= new Pila();
        int opcion=0;
        String nom;
         Scanner lector =new Scanner(System.in);
         Scanner lector2= new Scanner(System.in);
         
        // TODO code application logic here
        try{
            
       
                    do{
                            System.out.println("........................................");
                            System.out.println("............PILAS Y NODOS..............");
                            System.out.println("........................................");
                            System.out.println("............. M  E  N  Ú ...............");
                            System.out.println("........................................");
                            System.out.println("               INSERTAR");
                            System.out.println("   1. Insertar Pila");
                            System.out.println("........................................");
                            System.out.println("              SACAR PILA");
                            System.out.println("   2. Sacar pila");//VALERIA
                            System.out.println("........................................");
                            System.out.println("               BUSCAR");
                            System.out.println("   3. Buscar por posicion");
                            System.out.println("   4. Buscar por valor"); 
                            System.out.println("........................................");
                            System.out.println("               IMPRIMIR");
                            System.out.println("   5. Mostrar todo");
                            System.out.println("   6. Numero de elementos");//yo
                            System.out.println("........................................");
                            System.out.println("........................................");
                            opcion=lector.nextInt();

                            switch(opcion){
                                case 1:
                                    System.out.println(".........................................");
                                        System.out.println("Insertar en pila");
                                        System.out.println("Ingrese nombre");
                                        nom=lector2.nextLine();
                                        listp.setPila(listp.insertarPila(nom, listp.getPila()));
                                        break;

                                    case 2:
                                        System.out.println(".........................................");
                                        System.out.println("   Sacar pila");

                                        break;

                                    case 3:
                                        System.out.println(".........................................");
                                         System.out.println("Buscar por posicion");
                                         System.out.println("Ingresa la posicion.");
                                          int indice=lector2.nextInt();
                                          int contador=0;  
                                         listp.BuscarIndice(listp.getPila(), indice, contador+1);
                                        break;

                                    case 4:
                                        System.out.println(".........................................");
                                         System.out.println(" Buscar por valor");  
                                         System.out.println("Ingresa el valor de coincidencia");


                                        break;

                                    case 5:
                                        System.out.println("..................MOSTRAR.................");
                                        System.out.println(listp.Mostrar(listp.getPila()));
                                        break;

                                    case 6:
                                         System.out.println(".........................................");
                                        System.out.println("   Numero de elementos");//no terminado
                                        break;


                            }//switch     



                    }while(opcion!=6);
                    
            }catch(Exception e){
                JOptionPane.showMessageDialog(null , e);
            } 
    }//main
    
}//c
