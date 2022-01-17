package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Oleg", "Petrov", (byte) 24);
        System.out.println("User с именем - Oleg добавлен в базу данных");
        user.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем - Ivan добавлен в базу данных");
        user.saveUser("Igor", "Nikolayiv", (byte) 64);
        System.out.println("User с именем - Igor добавлен в базу данных");
        user.saveUser("Rita", "Romanova", (byte) 45);
        System.out.println("User с именем - Rita добавлен в базу данных");

        user.removeUserById(2);

        user.getAllUsers();
        List<User> users = user.getAllUsers();
        System.out.println(users);

        user.cleanUsersTable();
        List<User> users2 = user.getAllUsers();
        System.out.println(users2);
        user.dropUsersTable();



    }
}
