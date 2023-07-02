package Java_DSA.Problems.Strings;

public class AlternateString {
    public static void main(String[] args) {
        String str = "01011";
        int result = findMinOperation(str);
        System.out.println(result);
    }

    private static int findMinOperation(String str) {
        int len = str.length();
        StringBuilder str0 = new StringBuilder("0");
        StringBuilder str1 = new StringBuilder("1");
        int count0=0,count1 = 0;
        for(int i = 1;i < len;i++){
            if(str0.charAt(i-1)=='0')
                str0.append('1');
            if(str0.charAt(i-1)=='1')
                str0.append('0');

            if(str1.charAt(i-1)=='0')
                str1.append('1');
            if(str1.charAt(i-1)=='1')
                str1.append('0');
        }
        for (int i = 0;i < len;i++){
            if(str.charAt(i)!=str0.charAt(i))
                count0++;
            if(str.charAt(i)!=str1.charAt(i))
                count1++;
        }
        return Math.min(count0,count1);
    }
}
