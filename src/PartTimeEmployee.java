
public class PartTimeEmployee extends Employee {
   
    public PartTimeEmployee(){
        super();
        LOW_HOURS=1;
    }
    public double getPay(){
      //  totalPay +=LOW_HOURS*LOW_RATE;
        return (LOW_HOURS*LOW_RATE);
    }
}
