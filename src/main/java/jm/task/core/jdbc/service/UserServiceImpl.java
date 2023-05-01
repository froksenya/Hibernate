package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userHibernet = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userHibernet.createUsersTable();
    }

    public void dropUsersTable() {
        userHibernet.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userHibernet.saveUser(name, lastName, age);
        System.out.println("User с именем " + name + " добавлен в базу данных.");
    }

    public void removeUserById(long id) {
        userHibernet.removeUserById(id);
    }

    public List<User> getAllUsers() {
        userHibernet.getAllUsers().stream().map(Object::toString).forEach(System.out::println);
        return userHibernet.getAllUsers();
    }

    public void cleanUsersTable() {
        userHibernet.cleanUsersTable();
    }
}
