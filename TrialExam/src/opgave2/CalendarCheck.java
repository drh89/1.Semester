package opgave2;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class CalendarCheck implements CalendarCheckInterface {

    @Override
    public boolean isItFriday(LocalDate date) {
       String day = date.getDayOfWeek().toString().toLowerCase();
        
       
       
      if (day.equalsIgnoreCase("friday")){
        return true;
      }
      return false;
    }
    
        
}
