package com.apyatnitskiy;

public class Launch {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        FileWorker fileWorker = new FileWorker();

        dataBase.init(new User("petrov", "Petrov",  222), new  User("ivanov", "Ivanov",  111));
        fileWorker.flush(dataBase.getAll());

        System.out.println(dataBase.getAll());
    }
}
