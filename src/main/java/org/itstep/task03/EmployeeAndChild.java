package org.itstep.task03;

import org.itstep.task02.EmployeeAndTax;

public class EmployeeAndChild extends EmployeeAndTax {
    private boolean hasChild;
    public EmployeeAndChild(String fullName, String paymentType, double payment) {
        this( fullName, paymentType, payment,false );
    }
    public EmployeeAndChild(String fullName, String paymentType, double payment,boolean hasChild) {
        super( fullName, paymentType, payment );
        setHasChild( hasChild );
    }
    public boolean isHasChild(){
        return hasChild;
    }
    public void setHasChild(boolean hasChild){
        this.hasChild=hasChild;
        if(!hasChild){
            tax+=5;
        }

    }

}
