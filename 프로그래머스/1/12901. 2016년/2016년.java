import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String[] week = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        LocalDate date = LocalDate.of(2016, a, b);
        int weekNo = date.getDayOfWeek().ordinal();
        
        return week[weekNo];
    }
}