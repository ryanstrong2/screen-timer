package org.ryanstrong.models.data;

import org.ryanstrong.models.Timer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ryanstrong on 4/22/17.
 */
@Repository
//@Transactional
public interface TimerDao extends {CrudRepository<Timer, Integer>
}
