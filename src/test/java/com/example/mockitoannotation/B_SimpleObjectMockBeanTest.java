package com.example.mockitoannotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class B_SimpleObjectMockBeanTest {

    @MockBean
    SimpleObject simpleObject;

    @MockBean
    AnotherSimpleObject anotherSimpleObject;

    private static final String NAME="Mock";




    @Test
    void simpleTest(){
        when(simpleObject.name()).thenReturn(NAME);
        assertThat(simpleObject).isNotNull();
        assertThat(simpleObject.name()).isEqualTo(NAME);
    }

    @Test
    void anotherSimpleTest(){
        when(anotherSimpleObject.name()).thenReturn(NAME);
        assertThat(anotherSimpleObject).isNotNull();
        assertThat(anotherSimpleObject.name()).isEqualTo(NAME);
    }

}
