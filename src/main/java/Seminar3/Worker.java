package Seminar3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Worker implements Comparable<Worker>{
    private String surname;
    private String name;
    private String middleName;
    private String position;
    private String phoneNumber;
    private int salary;
    private LocalDate birthDate;


    public Worker(String surname, String name, String middleName, String position, String phoneNumber,
                  int salary, LocalDate birthDate) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        setBirthDate(birthDate);
    }

    public Worker(String surname, String name, String middleName) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.birthDate == null ? -1 : (int) this.birthDate.until(LocalDate.now(),ChronoUnit.YEARS);
    }

    public void setBirthDate(LocalDate birthDate) {
        if(birthDate == null || birthDate.isAfter(LocalDate.now().minusYears(14))){
            System.out.println("Date of birth is incorrect ");
        }else {
            this.birthDate = birthDate;
        }

    }

    @Override
    public String toString() {
        return "Worker{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + this.getAge() +
                '}';
    }

    //public static void addSalary(Worker[] workers, int age, int addAmount){
       // for (Worker worker: workers) {
            //if(worker.getAge() >= age){
                //worker.setSalary(worker.getSalary() + addAmount);
            //}

       // }
        //System.out.println("Salary is raised ");

    //}
    public void takeTask(String task){
        System.out.println("task is ready");
    }

    @Override
    public int compareTo(Worker o) {
        return this.getAge() - o.getAge();
    }
}
