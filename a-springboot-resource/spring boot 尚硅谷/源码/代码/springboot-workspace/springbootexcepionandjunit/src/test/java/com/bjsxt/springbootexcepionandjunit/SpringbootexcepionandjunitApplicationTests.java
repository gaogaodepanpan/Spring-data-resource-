package com.bjsxt.springbootexcepionandjunit;

import com.bjsxt.springbootexcepionandjunit.service.UsersServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootexcepionandjunitApplicationTests {

    @Autowired
    private UsersServiceImpl usersService;

	@Test
	void suibian() {
	    this.usersService.addUser();
	}

}
