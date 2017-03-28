/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02.programa02;
import java.util.Scanner;
/**
 *
 * @author carlos
 */
public class Proyecto02Programa02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        System.out.println("Intoducir tamaño del arrreglo");
        a=PedirDato();
        int [][]matriz1=new int[a][a];
        int [][]matriz2=new int[a][a];
        System.out.println("Introducir valores del primer arreglo");
        matriz1= matriz(a);
        System.out.println("Introducir valores del segundo arreglo");
        matriz2 =matriz(a);
        calcular (matriz1, matriz2);
    }
    public static int PedirDato(){
        Scanner entrada=new Scanner(System.in);
        boolean flag;
        int v=0;
                do{
                    System.out.println("Introducir un valor entero");
                    try{
                        v=entrada.nextInt();
                        flag=false;
                    } catch(Exception er){
                        System.out.println("No es entero, introduce otro");
                        flag=true;
                        entrada.nextLine();
                    }
                } while (flag);
                return v;
    }
    public static int [][]matriz(int a){
   int[][]matriz=new int [a][a];
   for (int i=0;i<matriz.length;i++)
   {
       for(int j=0;j<matriz.length; j++)
       {
           matriz[i][j]=PedirDato();
       }
   }
   return matriz;
}
    public static void calcular(int[][]matriz1,int[][]matriz2){
    int x=0;
            for(int i=0;i<matriz1.length;i++){
                for(int j=0;j<matriz1.length;j++){
             x=matriz1[i][j]-matriz2[i][j];
            if( x==0){   
                    }else{
                        System.out.println("Sus arreglos son diferentes");
                        x=2;
                        break;
                    }
                }
            }
            if(x==0){
                System.out.println("Sus arreglos son iguales");
            }else{    
             }
}
}