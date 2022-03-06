package org.example_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing the constructor of person & it's getters
 */

class MainTest {

    @Test
    public void testNameAge() {
        Person p = new Person("Kim", 20);
        assertEquals("Kim", p.getName(), "Name not matching");
        assertEquals(20, p.getAge(), "Age not matching");
    }

}