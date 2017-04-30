package org.ryanstrong.models.data;

import org.ryanstrong.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by ryanstrong on 4/30/17.
 */
@Repository
@Transactional
public interface SignUpDao extends CrudRepository<User, Integer> {
}
