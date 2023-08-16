package com.anyaudit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;




@SpringBootTest(properties = "spring.profiles.active=test")
@ExtendWith(SpringExtension.class)
@Transactional
public class BaseTest extends Assertions {

}
