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

package com.thenewjava;
import java.util.ListIterator;
import java.util.List;



public class Calculator {
    //all the operations possible (all the simple ones)
    public enum Operation {SUMMATION, DIFFERENCE, PRODUCT, DIVISION, REMINDER, MAX, MIN, AVG, EXIT};

    //takes two operands and check which operation to compute
    public double compute (List <Double> operands, List <Operation> operations){
        double result = 0;
        if(operands!= null && operations!=null ) {

            ListIterator<Double> operand = operands.listIterator();
            ListIterator<Operation> operation = operations.listIterator();
            for (operation:operations) {
                for (operand:operands) {

                    result += getResult(operand, operation);
                    operand.next();
                    operand.next();
                }
            }
        }
        return result;
    }

    private double getResult(ListIterator<Double> operand, ListIterator<Operation> operation) {
        return getOperation(operand, operation, operand.next());
    }

    public double getOperation(Operation operation){
        double result=0;
        return result;
    }


    public static void main(String[] args) {
	// write your code here


    }
}
