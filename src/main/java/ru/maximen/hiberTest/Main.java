package ru.maximen.hiberTest;

import ru.maximen.hiberTest.models.Auto;
import ru.maximen.hiberTest.models.User;
import ru.maximen.hiberTest.services.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Eblan", 29);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari","Green");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "Blue");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);

    }

}
