package com.booking.app.service;

import com.booking.app.entity.Schedule;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Nasim Salmany
 */
public interface ScheduleService {
    Mono<Schedule> book(Schedule schedule);

    Flux<Schedule> findAll();
}
