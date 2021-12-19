package com.example.mockitoannotation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SimpleObjectAnnotationTest {

    @Mock
    SimpleObject simpleObject;

    @Mock
    AnotherSimpleObject anotherSimpleObject;

    private static final String NAME="@Mock";

    @Test
    void simpleTest() {
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
