package spielwiese2.ex3;

import spielwiese2.abgabe9.ex3.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AirportSystemTest {


    @Test
    public void testPrintMethod() throws NotAllowedToViewListException {
        //given
        List<Human>list= new ArrayList<>();
        CrewMember crewMember= new CrewMember("Lola",26);
       list.add(crewMember);

        //then
       // Assert.assertEquals("Lola",AirportSystem.printPassengerList(crewMember));
    }


  @Test(expected = NotAllowedToViewListException.class)
    public void testException() throws NotAllowedToViewListException{
      //given
      List<Human>list= new ArrayList<>();
      Passenger passenger= new Passenger("Lola",26);
      list.add(passenger);
      //when
      AirportSystem.printPassengerList(passenger);

  }
}
