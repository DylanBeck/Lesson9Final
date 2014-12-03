
public class PartTimeEmployee extends Employee {
   
    public PartTimeEmployee(){
        super();}
        
    
    public double getPay(){
      //  totalPay +=LOW_HOURS*LOW_RATE;
        totalpay += rate*hours;
        return (rate * hours);
    }
}
