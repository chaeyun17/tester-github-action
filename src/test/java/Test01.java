import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test01 {

  @Test
  void test01_success(){
    assertEquals("test", "test");
  }

  @Test
  void test02_failed(){
    assertEquals("test", "failedTest11");
  }
}
