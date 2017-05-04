package org.ryanstrong.models.data;

import org.ryanstrong.models.Minute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by ryanstrong on 5/3/17.
 */
@Repository
@Transactional
public interface MinuteDao extends CrudRepository<Minute, Integer> {}