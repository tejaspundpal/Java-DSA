package Java_DSA.Problems.Strings;

public class Split {
    public static void splitFun(String str){
        str += " ";
        String[] arr = new String[255];
        int j = 0;
        int k = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i)==' '){
                arr[k] = str.substring(j,i);
                j = i+1;
                k++;
            }
        }
        for(int i = 0;i < k;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("length of the array : "+k);
    }
    public static void main(String[] args) {
        String str = "Hi i am Tejas";
        splitFun(str);
    }
}
