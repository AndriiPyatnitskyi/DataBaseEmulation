package com.apyatnitskiy;

public class Launch {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.init(new User("petrov", "Петров",  222), new  User("ivanov", "Иванов",  111));

        dataBase.printAll();
    }
}
