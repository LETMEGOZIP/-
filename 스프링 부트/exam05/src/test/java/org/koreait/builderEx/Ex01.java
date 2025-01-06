package org.koreait.builderEx;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex01 {

    @Test
    void test1(){
        User user = User.builder()
                .email("asdf@asdf.asdf")
                .name("asdf")
                .password("asdf")
                .build();
    }
}
