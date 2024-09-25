package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.createUsersTable();

        userService.saveUser("Oleg", "Petrov", (byte) 24);
        System.out.println("User с именем - Oleg добавлен в базу данных");
        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем - Ivan добавлен в базу данных");
        userService.saveUser("Igor", "Nikolayiv", (byte) 64);
        System.out.println("User с именем - Igor добавлен в базу данных");
        userService.saveUser("Rita", "Romanova", (byte) 45);
        System.out.println("User с именем - Rita добавлен в базу данных");

        userService.removeUserById(2);

        userService.getAllUsers();
        List<User> users = userService.getAllUsers();
        System.out.println(users);

        userService.cleanUsersTable();
        List<User> users2 = userService.getAllUsers();
        System.out.println(users2);
        userService.dropUsersTable();



    }
}
