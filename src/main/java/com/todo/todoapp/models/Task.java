/**
 * @author mohnishkumar on 11 Jul, 2025 at 14:58:17
 */

package com.todo.todoapp.models;

//this class will translate into database table
//jpa will convert it into table


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean completed;
    private String title;


}
