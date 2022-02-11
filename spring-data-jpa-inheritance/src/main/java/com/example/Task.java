package com.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@ToString
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@Table(name = "task")
public class Task extends Activity {

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "TEXT CHECK (status IN ('READY', 'IN_PROGRESS', 'DONE'))")
    private Status status;
}

