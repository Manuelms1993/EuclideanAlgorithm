package practica3;

import java.util.ArrayList;
import java.util.Iterator;

public class Pruebas {

    public static void ejecutaPruebaPrimos() {
        int nPrimos=0, nPruebas=1000, verdadero=0,falso=0;
        ArrayList<Integer> fallos = new ArrayList<>();
        System.out.println("Se ejecutaran "+nPruebas+" pruebas con numeros primos");
        ListaDePrimos L = new ListaDePrimos();
        Iterator i = L.iterator();
        System.out.print("Calculando ");
        while (nPrimos++<nPruebas) {
            int primo= (int) i.next();
            if (Primo.esPrimo(primo , 4))
                verdadero++;
            else{
                falso++;
                fallos.add(primo);
            }
            if (nPrimos%200==0)
                System.out.print(".");
        }
        System.out.println("");
        System.out.println(verdadero+" numeros primos encontrados. ");
        System.out.println(falso+" numeros compuestos encontrados. ");
        System.out.println("Primos que el algoritmo dice que son compuestos: "+fallos.size());
        for (Integer integer : fallos)
            System.out.print(integer+"   ");
        System.out.println("");
    }
    
    public static void ejecutaPruebaCompuesto() {
        int nCompuestos=0, nPruebas=1000, verdadero=0,falso=0;
        ArrayList<Integer> fallos = new ArrayList<>();
        System.out.println("Se ejecutaran "+nPruebas+" pruebas con numeros Compuestos");
        ListaDeCompuestos L = new ListaDeCompuestos();
        Iterator i = L.iterator();
        System.out.print("Calculando ");
        while (nCompuestos++<nPruebas) {
            int primo= (int) i.next();
            if (Primo.esPrimo(primo , 4)){
                falso++;
                fallos.add(primo);
            }else{
                verdadero++;
            }
            if (nCompuestos%200==0)
                System.out.print(".");
        }
        System.out.println("");
        System.out.println(verdadero+" numeros compuestos encontrados.");
        System.out.println(falso+" numeros primos encontrados. ");
        System.out.println("Compuestos que el algoritmo dice que son primos: "+fallos.size());
        for (Integer integer : fallos)
            System.out.print(integer+"   ");
        System.out.println("");
    }
    
}
