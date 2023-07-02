package Java_DSA.Problems.Strings;

public class ExcelSheet {
    public static long titleToNumber(String str)
    {
        long result = 0;
        for(int i = 0;i < str.length();i++){
            result = result*26;
            result = result + (str.charAt(i)-'A'+1);
        }
        return result;
    }

    public static void main(String[] args) {
        long ans = titleToNumber("AB");
        System.out.println(ans);
    }
}

//    Sample Input :
//        A
//        AB
//        F
//        AZ
//        COD
//        ZZZ
//    Sample Output :
//        1
//        28
//        6
//        52
//        2422
//        18278