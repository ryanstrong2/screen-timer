package org.ryanstrong.models.data;

import org.ryanstrong.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by ryanstrong on 4/20/17.
 */
@Repository
@Transactional
public interface UserDao
        extends CrudRepository<User, Integer>
{User findByName(String name);


}
