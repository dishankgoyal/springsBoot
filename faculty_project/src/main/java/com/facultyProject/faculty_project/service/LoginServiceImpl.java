package com.facultyProject.faculty_project.service;

import com.facultyProject.faculty_project.dao.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoginServiceImpl extends JpaRepository<Login,Long> {



   @Query("SELECT e FROM LOGIN e WHERE e.login_name =:login_name and e.password=:password")
   Optional<Login> fetchByLoginId(@Param("login_name") String login_name, @Param("password") String password);


}
