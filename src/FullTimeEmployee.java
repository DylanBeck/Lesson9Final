
public class FullTimeEmployee extends Employee {
    FullTimeEmployee(){
        super();
    }
    public double getPay(){
        double pay;
        if(hours<=40)
            pay=rate*hours;
        else
            pay=(hours-40) * rate *2+40*rate;
        totalpay+=pay;
        return pay;
    }
}
