package org.danielfc.fibonacci;

public class Fibonacci {
    public int compute(int value)
    {
        int resultado;
        if (value>1){
            resultado= compute(value-1) + compute(value-2);  //función recursiva
        }
        else if (value==1) {  // caso base
            resultado = 1;
        }
        else if (value==0){  // caso base
            resultado= 0;
        }
        else{ //error
            throw new RuntimeException("The value is negative: "+value);
        }
        return resultado;
    }
}
