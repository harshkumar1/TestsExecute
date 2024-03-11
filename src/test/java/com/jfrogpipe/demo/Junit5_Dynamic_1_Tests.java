package com.jfrogpipe.demo;

import org.junit.jupiter.api.TestFactory;
import java.util.stream.Stream;
import org.junit.jupiter.api.DynamicTest;
import java.util.Iterator;
import java.util.function.Function;
import org.junit.jupiter.api.function.ThrowingConsumer;
import org.junit.jupiter.api.Assertions;

public class Junit5_Dynamic_1_Tests {

  @TestFactory
  Stream<DynamicTest> generateRandomNumberOfTestsFromIterator() {

      // Generates random positive integers between 0 and 100 until
      // a number evenly divisible by 7 is encountered.
      Iterator<Integer> inputGenerator = new Iterator<Integer>() {
          int current = 0;
          int testCases = Integer.parseInt(System.getProperty("dynamic_1_count"));

          @Override
          public boolean hasNext() {
              current = current+1;
              return current % testCases != 0;
          }

          @Override
          public Integer next() {
              return current;
          }
      };

      // Generates display names like: input:5, input:37, input:85, etc.
      Function<Integer, String> displayNameGenerator = (input) -> "input:" + input;

      // Executes tests based on the current input value.
      ThrowingConsumer<Integer> testExecutor = (input) -> Assertions.assertEquals(1,2);
      
      // Returns a stream of dynamic tests.
      return DynamicTest.stream(inputGenerator, displayNameGenerator, testExecutor);
  }


}

