package org.Coding_Events.Coding_Events.Data;

import org.Coding_Events.Coding_Events.Models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {
}
