package com.ac.yy.Repository;

import com.ac.yy.Entity.CourseQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseQuestionRepository extends JpaRepository<CourseQuestionEntity, Integer> {
}
