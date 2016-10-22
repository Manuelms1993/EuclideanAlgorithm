package practica3;

import java.util.Iterator;

public class ListaDeCompuestos implements Iterable<Integer>{

    private int compuesto;
    
    public ListaDeCompuestos (){
        compuesto=1;
    }
            
    @Override
    public Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return siguienteCompuesto();
            }

            private Integer siguienteCompuesto() {
                compuesto++;
                while (!esCompuesto()) compuesto++;
                return compuesto;
            }

            private boolean esCompuesto() {
                int raiz = (int) Math.sqrt(compuesto);
                for (int i = 2; i <= Math.sqrt(compuesto); i++) 
                    if (compuesto%i==0)
                        return true;
                return false;
            }

            @Override
            public void remove() {
                return;
            }
        };
    }
    
}
