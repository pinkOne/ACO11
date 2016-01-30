package ua.artcode.university.model.role;

/**
 * Created by serhii on 30.01.16.
 */
public class Secretary extends Worker {

    private String data;
    private long amountStudentMoney;

    public Secretary(String data, long amountStudentMoney) {
        this.data = data;
        this.amountStudentMoney = amountStudentMoney;
    }

    public String makeMoneyReport(){
        return data + " " + amountStudentMoney;
    }


    @Override
    public void makeReport() {
        System.out.println("sec report");
    }
}
