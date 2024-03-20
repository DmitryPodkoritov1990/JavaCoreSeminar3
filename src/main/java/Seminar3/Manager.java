package Seminar3;

import java.time.LocalDate;

public class Manager extends Worker{
    public Manager(String surname, String name, String middleName, String position, String phoneNumber, int salary, LocalDate birthDate) {
        super(surname, name, middleName, position, phoneNumber, salary, birthDate);
    }

    public Manager(String surname, String name, String middleName) {
        super(surname, name, middleName);
    }



    public static void addSalary(Worker[] workers, int age, int addAmount){
        for (Worker worker: workers) {
            if(worker.getAge() >= age){
                worker.setSalary(worker.getSalary() + addAmount);
            }

        }
        System.out.println("Salary is raised ");

    }
    public static void addSalaryToWorkers(Worker[] workers,  int addAmount){
        for (Worker worker: workers) {
            if(!(worker instanceof Manager)){
            worker.setSalary(worker.getSalary() + addAmount);

        }
        //System.out.println("Salary is raised only workers !!!! ");
        }

    }


    public static void takeTask(Worker[] workers) {
        for (Worker worker:workers) {
            worker.takeTask("job in day-off ");
        }
    }
}
