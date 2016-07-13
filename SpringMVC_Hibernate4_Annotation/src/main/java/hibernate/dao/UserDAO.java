package hibernate.dao;


import java.util.List;

import hibernate.model.User;
 
 
public interface UserDAO {
    public List<User> list();
}