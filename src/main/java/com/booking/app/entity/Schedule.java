package com.booking.app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Nasim Salmany
 */

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {

    private String bookTime;
    private String bookDate;
    private String userId;
    private String bookType;
    private String duration;

}
