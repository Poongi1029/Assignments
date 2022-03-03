package testing;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
class JunitQ4 {
	static int beforeClassCount=1;
	static int afterClassCount=1;
	static int beforeCount=1;
	static int afterCount=1;
  @BeforeAll
  static void runOnceBeforeAllTests() {
    System.out.println("@BeforeAll executed"+beforeCount++);
  }
  @BeforeEach
  void runBeforeEveryTest() {
    System.out.println("@BeforeEach executed"+beforeClassCount++);
  }
  @Test
  void testMethod() {
    System.out.println("@Test method executed");
  }
    @RepeatedTest(2)
  void repeatedTestExample() {
    System.out.println("@RepeatedTest");
  }
  @AfterEach
  void runAfterEveryTest() {
    System.out.println("@AfterEach executed"+afterCount++);
  }
  @AfterAll
  static void runOnceAfterAllTests() {
    System.out.println("@AfterAll executed"+afterClassCount++);
  }
}