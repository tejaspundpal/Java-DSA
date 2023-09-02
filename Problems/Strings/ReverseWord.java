package Java_DSA.Problems.Strings;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "i am tejas";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String input)
    {
        // Write your code here
        // String[] arr = input.split(" ");
        // StringBuffer str = new StringBuffer();
        // for(int i = arr.length-1;i >= 0;i--){
        //     str.append(arr[i]);
        //     str.append(" ");
        // }
        // return str.toString();

        int len= input.length();
        int wordEnd = len ;
        String ans = "";
        for ( int i = len -1; i>= 0; i --){
            char ch = input.charAt(i);
            if(ch == ' '){
                ans += input.substring( i+1 , wordEnd );
                wordEnd = i;
                ans += " ";
            }
            if( i == 0){
                ans += input.substring( i , wordEnd);
            }
        }
        return ans;
    }
}


