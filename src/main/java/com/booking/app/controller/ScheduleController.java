package com.booking.app.controller;

import com.booking.app.entity.Schedule;
import com.booking.app.service.ScheduleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Nasim Salmany
 */

@Controller
@RequestMapping(path = "/book")
public class ScheduleController {
    private ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @PostMapping()
    public @ResponseBody
    Mono<Schedule> addSchedule(@RequestBody Schedule schedule) {
        return scheduleService.book(schedule);
    }

    @GetMapping()
    public @ResponseBody
    Flux<Schedule> getAllSchedule() {
        return scheduleService.findAll();
    }


}
