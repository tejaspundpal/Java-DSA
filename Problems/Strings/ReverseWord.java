package Java_DSA.Problems.Strings;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "i am tejas";
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str)
    {
            //Write your code here
            // String trim_str =str.trim();
            // String[] arr = trim_str.split(" ");a
            // StringBuilder result = new StringBuilder();
            //     for(int i=arr.length-1;i>=0;i--)
            //         {
            //             result.append(arr[i]+" ");
            //         }

            // return result.toString();

            int i = str.length()-1;
            String ans = "";

            while(i >= 0){
                while(i>= 0 && str.charAt(i)==' ')
                    i--;
                int j = i;
                if(i < 0)break;
                while(i>=0 && str.charAt(i)!=' ')
                    i--;

                if(ans.isEmpty())
                    ans = ans.concat(str.substring(i+1,j+1));
                else
                    ans = ans.concat(" "+str.substring(i+1,j+1));
            }
            return ans;
    }
}


