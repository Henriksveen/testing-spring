package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class InheritanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InheritanceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProjectRepository projectRepository,
                                        ReleaseNoteRepository releaseNoteRepository,
                                        TaskRepository taskRepository,
                                        ActivityRepository activityRepository) {
        return args -> {

            projectRepository.save(Project.builder()
                    .activities(List.of(
                            Task.builder().title("First task").description("this is a task").status(Status.READY).build(),
                            ReleaseNote.builder().title("First Release Note").description("this is a release note")
                                    .deadline(LocalDateTime.now().plusDays(100)).build()))
                    .build());

            System.out.println("-------------------------- RELEASE NOTES ----------------------------");
            releaseNoteRepository.findAll()
                    .forEach(System.out::println);


            System.out.println("-------------------------- TASKS ----------------------------");
            taskRepository.findAll()
                    .forEach(System.out::println);


            System.out.println("-------------------------- ACTIVITIES ----------------------------");
            activityRepository.findAll()
                    .forEach(System.out::println);
        };
    }
}
