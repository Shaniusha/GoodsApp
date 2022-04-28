package OPP_20_04_22;

public class Doctor extends Employee{
    private int mCategory;

    public Doctor(String fullName, long date, long salary, int category) {
            super(fullName, date, salary);
            mCategory = category;
        }
        // переопределить  из родительского класса
        @Override
        // должен быть точно такой же метод как и родителя,но return свой,переопределенный
        //для Doctor он такой
        public double getSalaryUah() {
            return mSalary / 100f * 1.2;
        }
}

