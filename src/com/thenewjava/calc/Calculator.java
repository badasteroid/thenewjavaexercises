package com.thenewjava.calc;

/*Dichiarare una classe CalcolatriceSemplificata che dati n numeri definisca i metodi per:
        • Sommarli.
        • Sottrarre il secondo dal primo.
        • Moltiplicarli.
        • Dividerli.
        • Restituire il resto della divisione.
        • Restituire il numero più grande (il massimo).
        • Restituire il numero più piccolo (il minimo).
        • Restituire la media dei due numeri.
        Creare una classe che testa il funzionamento di tutti i metodi.
*/
public abstract class Calculator {

    private double firstOperand;
    private double secondOperand;
    private String operation;

    public Calculator(Double firstOperand, Double secondOperand, String operation ){ }


    private double result;

    public void setResult(Double result){}
    public void setResult(Double op1, Double op2) {}


}
