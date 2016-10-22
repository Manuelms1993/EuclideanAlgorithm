package practica3;

import java.util.Iterator;

public class ListaDePrimos implements Iterable<Integer>{

    private int primo;
    
    public ListaDePrimos (){
        primo=0;
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
                return siguientePrimo();
            }

            private Integer siguientePrimo() {
                primo++;
                while (!esPrimo()) primo++;
                return primo;
            }

            private boolean esPrimo() {
                int raiz = (int) Math.sqrt(primo);
                for (int i = 2; i <= Math.sqrt(primo); i++) 
                    if (primo%i==0)
                        return false;
                return true;
            }

            @Override
            public void remove() {
                return;
            }
        };
    }
    
}
