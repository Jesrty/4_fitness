public class Member extends Person{

    private double fee;

    public Member(double fee, String name) {
        setName(name);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}




