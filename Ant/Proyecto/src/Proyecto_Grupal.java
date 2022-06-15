import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stalin
 */
public class Proyecto_Grupal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       byte op = 0;
        Scanner entrada = new Scanner(System.in);
        do {

            System.out.println("");
            System.out.println("     BIENVENIDOS AL MUNDO DE MATRICES  ");
            System.out.println( " -MENU-");
            System.out.println("1. SUMA DE DOS MATRICES");
            System.out.println("2. MATRIZ TRANSPUESTA");
            System.out.println("3. MAYOR Y MENOR DE 5 NUMEROS INGRESADOS:");
            System.out.println("4. ROMBOIDE ");
            System.out.println("5. SISTEMA DE ECUACIONES LINEALES 2X2");
            System.out.println("6. SALIR");
            System.out.println("ELIJA UNO DE LOS PARAMETROS ESTABLECIDOS~");
            op = entrada.nextByte();
            if (op >= 7 || op <= 0) {
                System.out.println("INGRESE OTRA OPCION");
            }

            switch (op) {
                case 1:
                    Scanner ingreso = new Scanner(System.in);
                    System.out.println("SUMA DE DOS MATRICES CUADRADAS");
                    System.out.print("INGRESE LA DIMENSION DE LAS MATRICES CUADRADAS: ");
                    int f = ingreso.nextInt();
                    System.out.println(" ");
                    int[][] array1 = new int[f][f];
                    int[][] array2 = new int[f][f];
                    System.out.println("DANDO DATOS PRIMERA MATRIZ");
                    System.out.println("INGRESE POR FILAS LOS VALORES: ");
                    //PRIMERA MATRIZ
                    for (int i = 0; i < f; i++) {
                        for (int j = 0; j < f; j++) {
                            System.out.print("INGRESE LOS VALORES " + (i + 1) + " x " + (j + 1) + " :");
                            int n = ingreso.nextInt();
                            array1[i][j] = n;                   
                        }
                    } //IMPRESION DE LA MATRIZ 1 IMAGEN
                    System.out.println("MATRIZ 1:\n");
                    for (int i = 0; i < f; i++) {
                        for (int j = 0; j < f; j++){
                             System.out.print("[" + array1[i][j] + "]");
                            
                        }System.out.println("");
                        }
                    //SEGUNDA MATRIZ
                    System.out.println("\n ");
                    System.out.println("DANDO DATOS SEGUNDA MATRIZ");
                    System.out.println("INGRESE POR FILAS LOS VALORES: ");
                    for (int k = 0; k < f; k++) {
                        for (int l = 0; l < f; l++) {
                            System.out.print("INGRESE LOS VALORES " + (k + 1) + " x " + (l + 1) + " :");
                            int a = ingreso.nextInt();
                            array2[k][l] = a;
                        }
                    } //IMPRESION DE LA MATRIZ 2 IMAGEN 
                    System.out.println("MATRIZ 2:\n");
                    for (int k = 0; k < f; k++) {
                        for (int l = 0; l < f; l++) {
                             System.out.print("[" + array2[k][l] + "]");
                        }System.out.println("");
                        }

                    System.out.println(" ");
                    System.out.println(" LA SUMA DE LAS DOS MATRICES CUADRADAS  " + f + " x " + f);
                    for (int i = 0, k = 0; (i < f & k < f); i++, k++) {
                        for (int j = 0, l = 0; (j < f & k < f); j++, l++) {
                            System.out.print("  |  " + ((array1[i][j]) + (array2[k][l])) + "  |  ");
                        }
                        System.out.println(" ");
                    }

                    break;

                case 2:
                    Scanner leer = new Scanner(System.in);
                    System.out.println("MATRIZ TRANSPUESTA");
                    System.out.print("INGRESE EL NUMERO DE FILAS: ");
                    int fi = leer.nextInt();
                    System.out.println(" ");
                    System.out.print("INGRESE EL NUMERO DE COLUMNAS: ");
                    int co = leer.nextInt();
                    System.out.println(" ");
                    int[][] arre1 = new int[fi][co];
                    System.out.println("DANDO DATOS A LA MATRIZ");
                    System.out.println("INGRESE POR FILAS LOS VALORES: ");

                    for (int i = 0; i < fi; i++) {
                        for (int j = 0; j < co; j++) {
                            System.out.print("INGRESE LOS VALORES " + (i + 1) + " x " + (j + 1) + " :");
                            int n = leer.nextInt();
                            arre1[i][j] = n;
                        }
                    }
                    System.out.println("\n ");
                    System.out.println(" LA MATRIZ TRANSPUESTA DE ORDEN " + fi + " x " + co);
                    for (int i = 0; (i < co); i++) {
                        for (int j = 0; (j < fi); j++) {

                            System.out.print("  |  " + (arre1[j][i]) + "  |  ");
                        }
                        System.out.println(" ");
                    }
                    break;

                case 3:
                    Scanner dan = new Scanner(System.in);

                    int mayor = 0;
                    int menor = 0;

                    int[] numeros = new int[5];
                    for (int i = 0; i < 5; i++) {
                        System.out.print("INGRESE EL " + (i + 1) + " NUMERO :");
                        numeros[i] = dan.nextInt();

                    }
                    for (int i = 1; i < numeros.length; i++) {
                        if (mayor < numeros[i]) {
                            mayor = numeros[i];
                        }
                    }
                    menor = mayor;
                    for (int i = 1; i < numeros.length; i++) {
                        if (menor > numeros[i]) {
                            menor = numeros[i];
                        }
                    }
                    System.out.println(" EL NUMERO MAYOR ES: " + mayor + " .   EL NUMERO MENOR ES: " + menor);
                    break;

                case 4:
                    Scanner and = new Scanner(System.in);
                    System.out.println("FIGURA GEOMETRICA TRAPECIO: ");
                    System.out.println("INGRESE LA DIMENSION: ");
                    int nume = and.nextInt();
                    //         //romboide//
                    for (int i = 1; i <= nume; i++) {
                        for (int j = 0; j < nume - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = nume - 1; j >= 0; j--) {
                            System.out.print("* ");
                        }
                        System.out.println(" ");

                    }
                    break;
                case 5:
                    int determinante = 0,
                     x = 0,
                     y = 0;
                    Scanner ent = new Scanner(System.in);

                    System.out.println("SISTEMA DE ECUACIONES LINEALES 2X2");
                    System.out.println("ax + by = c |");
                    System.out.println("dx + ey = f |");
                    int[][] arreglo1 = new int[2][3];
                    System.out.println("DANDO DATOS PRIMERA MATRIZ");
                    System.out.println("INGRESE POR FILAS LOS VALORES: ");

                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 3; j++) {
                            System.out.print("INGRESE LOS VALORES " + (i + 1) + " x " + (j + 1) + " :");
                            int n = ent.nextInt();
                            arreglo1[i][j] = n;
                        }
                    }

                    System.out.println("\n ");
                    System.out.println(" LA MATRIZ DE " + 2 + " x " + 3);
                    for (int i = 0; (i < 2); i++) {
                        for (int j = 0; (j < 3); j++) {

                            System.out.print("  |  " + (arreglo1[i][j]) + "  |  ");
                        }
                        System.out.println(" ");
                    }
                    determinante = (arreglo1[0][0] * arreglo1[1][1]) - (arreglo1[0][1] * arreglo1[1][0]);
                    x = (arreglo1[0][2] * arreglo1[1][1]) - (arreglo1[0][1] * arreglo1[1][2]);
                    y = (arreglo1[0][0] * arreglo1[1][2]) - (arreglo1[0][2] * arreglo1[1][0]);
                    if (determinante == 0) {
                        System.out.println("NO TIENE SOLUCION");
                    } else {
                        System.out.println("");
                        System.out.println("LOS VALORES QUE SATISFACEN A LAS ECUACIONES SON: ");
                        System.out.println("EL VALOR DE X = " + x / determinante);
                        System.out.println("EL VALOR DE Y = " + y / determinante);
                    }
                    break;

            }
        } while (op >= 7 || op <= 5);
    }
}