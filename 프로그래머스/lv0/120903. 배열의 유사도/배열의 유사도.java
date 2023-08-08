import java.util.stream.Stream;

class Solution {
    public int solution(String[] s1, String[] s2) {
        String[] answer = Stream.of(s1, s2)
                           .flatMap(Stream::of)
                           .distinct()
                           .toArray(String[]::new);
        
        return s1.length + s2.length - answer.length;
    }
}