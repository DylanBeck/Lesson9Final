
public class PartTimeEmployee extends Employee {
   
    public PartTimeEmployee(){
        super();
        LOW_HOURS=1;
    }
    public double getPay(){
        return (LOW_HOURS*LOW_RATE);
    }
}
