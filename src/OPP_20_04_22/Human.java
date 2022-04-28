package OPP_20_04_22;

public class Human {
    String name;
    int salary; //зарплата
    int experience;

    // создаем конструктор
    Human(String name){
        this.name = name;
    }
    int calcSalary(){
        return salary*(1+experience/5);
    }
}
