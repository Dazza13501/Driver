import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

   Driver Dan = new Driver("Dan", 25);

   @Test
   public void getDriver() {
      assertEquals("Dan, 25", Dan.getDriverName());

   }

   @Test
   public void isWorking() {
      Dan.checkBanned();
      assertTrue(Dan.check_status());

   }

   @Test
   public void isNotWorking() {
      assertFalse(Dan.check_status());
   }
}