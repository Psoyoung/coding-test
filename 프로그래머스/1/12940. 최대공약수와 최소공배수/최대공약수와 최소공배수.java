class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
    }
    
    //최대 공약수
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
    
    //최소 공배수
    public static int lcm(int a,int b){
        int g = gcd(a,b);
        return g * (a/g) * (b/g);
    }
}