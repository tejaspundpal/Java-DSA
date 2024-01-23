package Java_DSA.Problems;

public class Same {
    static long sameDigits(long n) {
        String s = Long.toString(n);
        int start = s.charAt(0)-'0';
        int l = s.length();
        if(l == 1){
            return Long.parseLong(s);
        }
        else{
            StringBuilder one = new StringBuilder();
            for(int i = 0;i < l;i++){
                one.append('1');
            }
            long number = Long.parseLong(one.toString());
            long min = start*number;
            long max = (start+1)*number;
            if(n-min < max - n)
                return min;
            else
                return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(sameDigits(277));
    }
}
