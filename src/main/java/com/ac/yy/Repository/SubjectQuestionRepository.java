package com.ac.yy.Repository;

import com.ac.yy.Entity.SubjectQuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectQuestionRepository  extends JpaRepository<SubjectQuestionEntity, Integer> {
}
