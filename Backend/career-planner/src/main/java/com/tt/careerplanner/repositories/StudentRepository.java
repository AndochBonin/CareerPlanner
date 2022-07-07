package com.tt.careerplanner.repositories;
import com.tt.careerplanner.dto.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentDto,Long> {
    Optional<StudentDto> findByEmailAddress(String email);

}
