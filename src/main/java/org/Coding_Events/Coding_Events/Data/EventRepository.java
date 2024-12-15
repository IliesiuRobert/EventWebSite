package org.Coding_Events.Coding_Events.Data;

import org.Coding_Events.Coding_Events.Models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

}
