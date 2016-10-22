package practica3;

import java.math.BigInteger;

public class Primo {
    
    public static boolean esPrimo(int n, int m){
        if (n==1)return true;
        int limite= n<=m? n-1:m;
        int [] mEnteros = new int [limite];
        BigInteger big = BigInteger.ONE;
        for (int i = 0; i < limite; i++)
            mEnteros[i] = (int) ( (Math.random()-0.0001)*(n-1))+1;
        
        for (int i = 0; i < limite; i++) {
            big = new BigInteger(""+mEnteros[i]);
            big = big.pow(n-1).mod(new BigInteger(""+n));
            if (big.compareTo(BigInteger.ONE)!=0) 
                return false;
            int mcd,j=0;
            double k = (n-1) / (Math.pow(2, j));
            while (true) {
                if (k%1==0){ 
                    mcd = AlgoritmoDeEuclides.AlgoritmoDeEuclides((int) Math.pow(mEnteros[i], k)-1 , n);
                    if (1<mcd && mcd<n){
                        return false;
                    }else {
                        j++;
                        k = (n-1) / (Math.pow(2, j));
                    }
                }else break;
            }
        }
        return true;
    }
}
