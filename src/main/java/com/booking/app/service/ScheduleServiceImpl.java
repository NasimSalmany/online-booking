package com.booking.app.service;

import com.booking.app.entity.Schedule;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Nasim Salmany
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {
    @Override
    public Mono<Schedule> book(Schedule schedule) {
        return null;
    }

    @Override
    public Flux<Schedule> findAll() {
        return null;
    }
}
