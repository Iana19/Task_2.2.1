package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void deleteAllUsers();
   User findHost(String car_name, String car_series);
}
