package org.itstep.task05;

import org.itstep.PaymentTypes;
import org.itstep.task04.EmployeeAndTugrik;

public class EmployeeAndOffshore extends EmployeeAndTugrik {
    private boolean inOffshore;
    public EmployeeAndOffshore(String fullName, String paymentType, double payment) {
        super( fullName, paymentType, payment );

    }

    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild) {
        super( fullName, paymentType, payment, hasChild );

    }
    public EmployeeAndOffshore(String fullName, String paymentType, double payment, boolean hasChild,boolean inOffshore) {
        super( fullName, paymentType, payment, hasChild );
        setInOffshore( inOffshore );
    }
    public boolean isInOffshore() {
        return inOffshore;
    }

    public void setInOffshore(boolean inOffshore) {
        this.inOffshore=inOffshore;
        if(isInOffshore())
        {
            tax=0;
        }
    }

}
