import java.util.Date;
    
    public class Faculty extends Employee{
    
    Level level;
    
    Education education;
    
    public Faculty(String firstname,String lastname,String id,char sex,Date dob,Level level,Education education) {
    
    /**
    
    * parameterized constructor
    
    */
    
    super(firstname,lastname,id, sex,dob); /*passing values to superclass constructor*/
    
    this.level=level;
    
    this.education=education;
    
    }
    
    public Faculty() {
    
    /*default constructor*/
    
    }
    
    @Override
    
    public double monthlyEarning() {
    
    if(level==Level.AS){
    
    return EmployeeInfo.FACULTY_MONTHLY_SALARY;/**return the salary of Assistant proff*/
    
    }else if(level==Level.AO){
    
    return (1.5*EmployeeInfo.FACULTY_MONTHLY_SALARY); /**return the salary of Assoc proff*/
    
    }else if(level==Level.FU){
    
    return (2*EmployeeInfo.FACULTY_MONTHLY_SALARY);/**return the salary of full time proff*/
    
    }
    
    return 0;
    
    }
    
    enum Level{
    
    /**
    
    * an enumeration variable to store the level of
    
    * professor. AS- Assistant,AO- Associate and
    
    * FU for Full time.
    
    */
    
    AS,
    
    AO,
    
    FU
    
    }
    
    public Level getLevel() {
    
    return level;
    
    }
    
    public void setLevel(Level level) {
    
    this.level = level;
    
    }
    
    public Education getEducation() {
    
    return education;
    
    }
    
    public void setEducation(Education education) {
    
    this.education = education;
    
    }
    
    public String toString() {
    
    String role="";
    
    if(level==Level.AS){
    
    role="Assistant Professor";
    
    }else if(level==Level.AO){
    
    role="Associate Professor";
    
    }else if(level==Level.FU){
    
    role="Full Professor";
    
    }
    
    String str=super.toString()+"\n"+role+"\nMonthly Salary: "+monthlyEarning();
    
    return str;
    
    }
    
    @Override
    
    protected Object clone() throws CloneNotSupportedException {
    
    return this;
    
    }
    
    }
