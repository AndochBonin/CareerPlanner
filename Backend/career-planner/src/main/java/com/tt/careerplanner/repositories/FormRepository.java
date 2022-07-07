package com.tt.careerplanner.repositories;
import com.tt.careerplanner.dto.FormDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<FormDto, Long> {
}
