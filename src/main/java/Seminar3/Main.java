package Seminar3;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Ivanov", "Ivan", "Ivanovich",
                        "backend-devloper", "8588", 100,
                        LocalDate.of(1990, 10, 17)),
                new Worker("Petrov", "Sergey", "Pavlovich",
                        "lawer", "8589", 200,
                        LocalDate.of(1991, 11, 17)),
                new Worker("Sidorov", "Nikolay", "Igorevich",
                        "accounter", "8587", 200,
                        LocalDate.of(1965, 11, 17)),
                new Worker("Nikonov", "Oleg", "Michailovich",
                        "teacher", "8586", 200,
                        LocalDate.of(1970, 11, 17)),
                new Manager("Stepanov","Vasiliy", "Alekseevich",
                        "manager", "89996", 2000,
                        LocalDate.of(1990, 10, 01))
        };


        System.out.println("Average age " + getAverageAge(workers));
        System.out.println("Average salary " + getAverageSalary(workers));
        //Worker.addSalary(workers, 45, 50);
        Manager.addSalaryToWorkers(workers, 150);
        

        System.out.println(Arrays.toString(workers));
        List<Worker> workerList = Arrays.asList(workers);

        System.out.println("/////".repeat(5));
        Collections.sort(workerList);
        System.out.println(workerList);

        System.out.println("/////".repeat(5));
        workerList.sort(new WorkerSalaryComparator());
        System.out.println(workerList);
        System.out.println("+++++".repeat(5));
        workerList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(workerList);
        System.out.println("&&&&&".repeat(5));
        workerList.sort(new SurnameComporator());
        System.out.println(workerList);


    }

    public static double getAverageAge(Worker[] array){
        int sumAge =0;
        for (Worker worker: array) {
            sumAge += worker.getAge();
        }
        return sumAge / (double) array.length;
    }
    public static double getAverageSalary(Worker[] array){
        int sumSalary =0;
        for (Worker worker: array) {
            sumSalary += worker.getSalary();
        }
        return sumSalary / (double) array.length;
    }
}
