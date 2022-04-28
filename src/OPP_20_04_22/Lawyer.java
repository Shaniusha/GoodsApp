package OPP_20_04_22;

public class Lawyer extends Employee{
    private String mDepartment;

    public Lawyer(String fullName, long date, long salary, String mDepartment) {
        super(fullName, date, salary);//вызываем конструктор родительского класса
        this.mDepartment = mDepartment;
    }
}
