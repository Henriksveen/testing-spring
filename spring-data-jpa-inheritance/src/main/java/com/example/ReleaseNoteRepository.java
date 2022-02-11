package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseNoteRepository extends JpaRepository<ReleaseNote, Long> {
}