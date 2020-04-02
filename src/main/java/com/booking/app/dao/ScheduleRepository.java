package com.booking.app.dao;

import com.booking.app.entity.Schedule;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Nasim Salmany
 */
public interface ScheduleRepository extends ReactiveMongoRepository<Schedule, Long> {
}
