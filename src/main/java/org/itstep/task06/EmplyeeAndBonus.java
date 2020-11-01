package org.itstep.task06;

import org.itstep.task05.EmployeeAndOffshore;

public class EmplyeeAndBonus extends EmployeeAndOffshore {

protected int workHours;
    public EmplyeeAndBonus(String fullName, String paymentType, double payment) {
        super( fullName, paymentType, payment );
    }

    public EmplyeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild) {
        super( fullName, paymentType, payment, hasChild );
    }

    public EmplyeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild, boolean inOffshore) {
        super( fullName, paymentType, payment, hasChild, inOffshore );
    }
    public EmplyeeAndBonus(String fullName, String paymentType, double payment, boolean hasChild, boolean inOffshore,int workHours) {
        super( fullName, paymentType, payment, hasChild, inOffshore );
       setWorkHours( workHours );
    }
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours=workHours;
        if(getWorkHours()>200 && isInOffshore()==false)
        {
            double res=getPayment()+getPayment()*20.0/100.0;
            setPayment(res);
        }
    }
}
