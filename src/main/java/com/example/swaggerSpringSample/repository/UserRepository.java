package com.example.swaggerSpringSample.repository;

import com.example.swaggerSpringSample.entity.User;
import io.swagger.annotations.Api;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Api
public interface UserRepository extends CrudRepository<User, Long> {
}