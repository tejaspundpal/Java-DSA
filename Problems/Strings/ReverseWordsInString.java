package Java_DSA.Problems.Strings;
import java.util.* ;

class ReverseWordsInString {

    static String reverseEachWord(String input)
    {
        String[] words =input.split(" ");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();

//        int previous = -1;
//        input += " ";
//        int n = input.length();
//        char[] arr = input.toCharArray();
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == ' ') {
//                // reverse the current word
//                int st = previous + 1, end = i - 1;
//                while (st < end) {
//                    char temp = arr[st];
//                    arr[st] = arr[end];
//                    arr[end] = temp;
//
//                    st++;
//                    end--;
//                }
//                previous = i;
//            }
//        }
//
//        String output = new String(arr);
//        return output;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}