package OPP_20_04_22;

public class Main {
    public static void main(String[] args) {
        // создаем обЪект
        Car myCar = new Car();
        // создаем обЪект и инициализирую его свойствами
        Car myWifeCar = new Car("pink","sedan",1.8,6.3,"PINKY",9.8);

        Human h1 = new Human("Vasa");
        Human h2 = new Human("Vasia");

        // заполняем свойства
        myCar.fillTank(10);
        myWifeCar.getColor();
        myWifeCar.drive(100);


        // используем метод
        myCar.fillTank(20);
        myWifeCar.drive(100);

        System.out.println("Текущий уровень топлива = " + myCar.getFuelInTank());

        myCar.setColor("orange");
        System.out.println("Цвет моей машины = " + myCar.getColor());

        Employee[] employees = new Employee[3];//создаем обЪект(массив) из 3 сотрудников
        employees[0] = new Doctor("Vas",1234,300000,1);
        employees[1] = new Lawyer("Pit",2345,900000,"Criminal");
        employees[2] = new Lawyer("Piter",23456,1900000,"Criminal");

        //применяем метод getSalaryUah() из Employee
        double totalSalary = 0;
        for (int i =0; i < employees.length; i++)
            totalSalary += employees[i].getSalaryUah();
        //для доктора вызывается переопределенный метод  @Override

        System.out.println("Общая зарплата доктора и юриста = " + totalSalary);
    }
}
