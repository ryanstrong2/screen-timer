package org.ryanstrong.models.data;

import org.ryanstrong.models.Time;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//TODO START CLOCK
/**
 * Created by ryanstrong on 4/22/17.
 */
@Repository
@Transactional
public interface TimeDao
        extends

//    Object findAll();
        CrudRepository<Time, Integer> {
}
