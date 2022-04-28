package OPP_20_04_22;

public class Employee {
    private String mFullName;
    private long mEmploymentDate;
    public long mSalary;//зарплата

    public Employee(String fullName, long date, long salary){
        mFullName = fullName;
        mEmploymentDate = date;
        mSalary = salary;
    }
    public double getSalaryUah(){
        return mSalary / 100f;
    }
}
