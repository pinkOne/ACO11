package ua.artcode.university.model.role;

/**
 * Buhgalteria
 */
public class Accountant {


    public void paySalary(Worker worker){
        // send money to worker
    }

    public void testVisitor(Worker worker){
        // instanceof

        //Dean ref2 = (Dean) worker;
        // CastClassException

        if(worker instanceof Dean){
            Dean ref = (Dean) worker;
            ref.setBlackMoney(23333);
            System.out.println("Dean came");
        } else if(worker instanceof Secretary){

        }
    }


}
