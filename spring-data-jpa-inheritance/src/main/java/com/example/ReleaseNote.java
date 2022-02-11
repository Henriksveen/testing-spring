package com.example;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;


@ToString
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ReleaseNote")
public class ReleaseNote extends Activity {
    @Column
    private LocalDateTime deadline;
}
