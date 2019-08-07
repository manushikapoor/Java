package com.manushi;
import org.springframework.data.repository.CrudRepository;

import com.manushi.model.User;

@org.springframework.beans.factory.annotation.Configurable

public interface UserRepository extends CrudRepository<User,Integer>{
	

}
