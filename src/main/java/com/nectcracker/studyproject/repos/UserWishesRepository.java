package com.nectcracker.studyproject.repos;

import com.nectcracker.studyproject.domain.UserWishes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserWishesRepository extends JpaRepository<UserWishes,Long> {
    List<UserWishes> findByUserId(Long userId);
}
