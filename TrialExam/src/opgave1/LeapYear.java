package opgave1;

public class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public int numberOfLeapYears(int start, int end) {
        if (start > end) {
            return -1;
        }

        int leapYears = 0;

        for (int i = start; i <= end; i++) {

            if (i % 4 == 0 && i % 100 != 0) {
                leapYears++;
            }
            if (i % 400 == 0) {
                leapYears++;
            }
        }
        return leapYears;

    }
}
