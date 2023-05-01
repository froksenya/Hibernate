package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserService user = new UserServiceImpl();
        user.createUsersTable();
        user.saveUser("Petr", "Tyt", (byte) 30);
        user.saveUser("Jon", "Weak", (byte) 45);
        user.saveUser("Monica", "Bellucci", (byte) 40);
        user.saveUser("Leo", "Dicaprio", (byte) 45);
        user.getAllUsers();

        user.cleanUsersTable();
        user.dropUsersTable();



    }
}
