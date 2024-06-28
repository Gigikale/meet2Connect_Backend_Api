package com.meet2Connect.meet2Connect.repository;

import com.meet2Connect.meet2Connect.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
