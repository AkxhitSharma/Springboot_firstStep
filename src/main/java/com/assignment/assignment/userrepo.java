package com.assignment.assignment;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userrepo extends JpaRepository<userModel, Integer>
{
    userModel findByemail(String email);
}
