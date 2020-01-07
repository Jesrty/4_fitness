public class Administration extends Employee {

    private int vacation;
    private Car car;

    public Administration(int hours, String name, int vacation, int carId) {
        car = new Car(carId);
        setHours(hours);
        setName(name);
        this.vacation = vacation;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }



}
