package com.github.zjjfly.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * @author Zi JunJie <a href="https://github.com/zjjfly"/>github</a>
 */
@SpringBootTest(classes = App.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void test() {
        Assertions.assertNotNull(applicationContext);
    }
}
