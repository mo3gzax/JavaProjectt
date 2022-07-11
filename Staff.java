import java.util.Date;
    
    public class Staff extends Employee {
    
    double hourly_rate;
    
    public Staff() {
    
    /*default constructor*/
    
    }
    
    public Staff(String firstname,String lastname,String id,char sex,Date dob,double hourly_rate){
    
    super(firstname,lastname,id, sex,dob); /*passing values to superclass constructor*/
    
    this.hourly_rate=hourly_rate;
    
    }
    
    @Override
    
    public double monthlyEarning() {
    
    return hourly_rate*160;
    
    }
    
    public double getHourly_rate() {
    
    return hourly_rate;
    
    }
    
    public void setHourly_rate(float hourly_rate) {
    
    this.hourly_rate = hourly_rate;
    
    }
    
    public String toString(){
    
    String str=super.toString()+"\nMonthly Salary: "+monthlyEarning();
    
    return str;
    
    }
    
    }
