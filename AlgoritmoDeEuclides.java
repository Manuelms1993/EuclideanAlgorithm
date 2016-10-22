package practica3;

public class AlgoritmoDeEuclides {
    
    public static int AlgoritmoDeEuclides (int a , int b){
        int t=1;
        while(a>0){
            t=a;
            a=b%a;
            b=t;
	}
        return t;
    } 
}
