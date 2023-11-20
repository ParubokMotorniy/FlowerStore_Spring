package com.app.Fools;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer>
{
    @Query("SELECT u FROM AppUser u WHERE u.email = :email")
    Optional<AppUser>FindUserByEmail(@Param("email")String email);
}
