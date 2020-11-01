package org.itstep.task04;

import org.itstep.PaymentTypes;
import org.itstep.task03.EmployeeAndChild;

public class EmployeeAndTugrik extends EmployeeAndChild {
   private int tugrickExchange;
    public EmployeeAndTugrik(String fullName, String paymentType, double payment) {
        super( fullName, paymentType, payment );
    }

    public EmployeeAndTugrik(String fullName, String paymentType, double payment, boolean hasChild) {
        super( fullName, paymentType, payment, hasChild );
    }
    public int getTugrickExchange(){
        return tugrickExchange;
    }
    public void setTugrikExchange(int tugrickExchange){
        this.tugrickExchange=tugrickExchange;
    }
    @Override
    public String toString(){
        if(PaymentTypes.HOURLY.equals( getPaymentType())) {
            return String.format( " %7s | %6d%% | %11s | %g / %g", getFullName(), getTax(), getPayment(), getPaymentWithTax()/2,getPaymentWithTax()/2/getTugrickExchange() );
        }
        else{
            return super.toString();
        }
    }
}
