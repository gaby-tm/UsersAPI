package com.UsersAPI.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import com.UsersAPI.model.User;


public interface UserRepository extends JpaRepositoryImplementation<User, String>{
	Optional <User> findById (String login);
}
