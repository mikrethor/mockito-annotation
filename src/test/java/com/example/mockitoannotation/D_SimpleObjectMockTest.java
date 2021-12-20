package com.example.mockitoannotation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class D_SimpleObjectMockTest {

    private SimpleObject simpleObject = mock(SimpleObject.class);

    private AnotherSimpleObject anotherSimpleObject = mock(AnotherSimpleObject.class);

    private static final String NAME = "mock()";

    @Test
    void simpleTest() {
        when(simpleObject.name()).thenReturn(NAME);
        assertThat(simpleObject).isNotNull();
        assertThat(simpleObject.name()).isEqualTo(NAME);
    }

    @Test
    void anotherSimpleTest() {
        when(anotherSimpleObject.name()).thenReturn(NAME);
        assertThat(anotherSimpleObject).isNotNull();
        assertThat(anotherSimpleObject.name()).isEqualTo(NAME);
    }
}
