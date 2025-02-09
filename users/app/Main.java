package ru.itis.users.app;

import ru.itis.users.controllers.UsersController;
import ru.itis.users.notifiers.CallNotifier;
import ru.itis.users.notifiers.EmailNotifier;
import ru.itis.users.notifiers.SmsNotifier;
import ru.itis.users.notifiers.WhatsAppNotifier;
import ru.itis.users.services.UsersService;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        UsersController usersController = new UsersController();
        usersController.run();
        CallNotifier callNotifier = new CallNotifier();
        SmsNotifier smsNotifier = new SmsNotifier();
        EmailNotifier emailNotifier = new EmailNotifier();
        WhatsAppNotifier whatsappNotifier = new WhatsAppNotifier();
        UsersService usersService = new UsersService();
        usersService.addUser("sidikov@gmail.com", "+7999", "qwerty007");
    }
}