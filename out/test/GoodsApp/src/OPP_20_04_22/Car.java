package OPP_20_04_22;

public class Car {

    private String color;
    private String form; // форма
    private double engineV; // обЪем двигателя
    private double fuelConsumption; // расход на 100 км
    private String id; // регистрационный номер
    private double fuelInTank; // остаток топлива

    //конструктор пустой
     public Car(){
        fuelInTank = 0; // бак пустой
        id = "BB001";
    }
    //конструктор
    public Car(String color, String form, double engineV, double fuelConsumption, String id, double fuelInTank) {
        this.color = color;
        this.form = form;
        this.engineV = engineV;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
        this.fuelInTank = fuelInTank;
    }

    //заправить авто
   public void fillTank(int fuelV){
        fuelInTank = fuelInTank + fuelV;
    }

    //проехать расстояние
   public void drive(double distance){
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }

    public double getFuelInTank(){
         return fuelInTank;
    }

    public String getColor() {
        return color;
    }

    public String getForm() {
        return form;
    }

    public double getEngineV() {
        return engineV;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getId() {
        return id;
    }

    public void setColor(String color) {
         if (color.compareTo("red") !=0)//если значение не = "red",
        this.color = color;//то color устанавливаем
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setEngineV(double engineV) {
        this.engineV = engineV;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

}

