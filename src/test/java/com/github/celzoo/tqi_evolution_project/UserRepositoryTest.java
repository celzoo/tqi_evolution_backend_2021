package com.github.celzoo.tqi_evolution_project;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.hamcrest.MatcherAssert.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user  = new User();
        user.setPassword("J819O");
        user.setEmail("someemail@email.com");
        user.setAdress("somewheres");
        user.setName("SomeName");
        user.setCPF("192094848-9");
        user.setRG("19387219-0");
        user.setIncome(0);


        User savedUser = repo.save(user);
        User existUser = entityManager.find(User.class, savedUser.getId());

        Assertions.assertThat(existUser.getEmail().equals(user.getEmail()));
    }


}
