package com.myEcommerce.userService.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByUserId(String userId);

    UserEntity findByEmail(String userName);


}
