package clase01;

import java.util.Scanner;

/*
    Script en Java que dada una cantidad en bodega y una cantidad minima requerida indique si es necesario
    o no solicitar el producto al proveer
*/

public class clase01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int bodega, existencias_requeridas;
        System.out.print("Ingrese la candtidad en bodega: ");
        bodega = entrada.nextInt();
        System.out.print("Ingrese la candtidad minima requerida: ");        
        existencias_requeridas = entrada.nextInt();
        // System.out.print("Bodega: "+bodega+" - Existencias requeridas: "+existencias_requeridas);
        if (bodega < existencias_requeridas) {
            System.out.print("Debe realizar el pedido al proveedor.");
        } else {
            System.out.print("No es necesario realizar el pedido al proveedor.");
        }
        entrada.close();
    }
}
