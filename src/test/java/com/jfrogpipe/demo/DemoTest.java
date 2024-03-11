package com.jfrogpipe.demo;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class DemoTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Assertions.assertTrue( true );
    }

    @Test
    public void generateMockTests() {
        for (int i = 1; i <= 1; i++) {
            String testName = "test" + i;
            String expected = "expected" + i;
            String actual = "actual" + i;
            Assertions.assertEquals(expected, actual);
            //Thread.currentThread().getStackTrace();
        }
    }

/*     @Test
    public void generateRuntimeTest() throws Exception {
        String testName = "test_dynamic";
        String expected = "expected";
        String actual = "actual";
        try{         
            for (int i = 1; i <= 5; i++) {
                testName = "test_dynamic" + i;
                Class<?> testClass = getClass();
                Method testMethod = testClass.getMethod(testName);
                Test annotation = testMethod.getAnnotation(Test.class);

                Assert.assertNotNull("Test annotation not found", annotation);
                Assert.assertNotEquals("Unexpected expected value", expected, actual);
                }

        } catch (AssertionError e) {
            System.out.println("Test failed: " + testName);
            e.printStackTrace();
        }

    }*/
}
