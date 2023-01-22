package hiber.dao;

import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    User getUserByModelAndSeriesOfCar(String model, int series);

}
