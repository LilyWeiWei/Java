package ru.itis.users.services;

import ru.itis.users.models.User;
import ru.itis.users.notifiers.AbstractNotifier;
import ru.itis.users.notifiers.EmailNotifier;
import ru.itis.users.repositories.UsersRepository;

import java.util.UUID;

/**
 * Lesson_4
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class UsersService {

    private UsersRepository repository;

    private final AbstractNotifier notifier;

    public UsersService(AbstractNotifier notifier) {
        this.notifier = notifier;
    }

    public UsersService() {
        this.repository = new UsersRepository();
        this.notifier = new EmailNotifier();
    }

    public void addUser(String email, String phone, String password) {
        User user = new User(UUID.randomUUID().toString(), email, phone, password);

        notifier.notifyUser(user, "Ваш аккаунт был создан");
        repository.save(user);
    }

    public void removeUser(String email) {
        repository.removeByEmail(email);
    }
}