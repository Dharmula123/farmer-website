
/*public class Main{
    public static void main(String[] args){
        String str = "hello";
        String reverse = " ";
        for (int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
} */
/*
public class Main{
    public static void main(String[] args){
        String str = "madam";
        String reverse = "";
        for (int i = str.length() -1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("Palindrom");
        } else {
            System.out.println("not Palindrom");
        }
    }
} */
/*
public class Main{
    public static void main(String[] args){
        String str = "hello";
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count++;
            }
        }
        System.out.println("Vowels:" + count);
    }
} */
/*
public class Main{
    public static void main(String[] args){
        String str = "hello";
        int count = 0;
        for (int i =0;i< str.length() ; i++){
            char ch = str.charAt(i);
            if (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                count++;
            }
        }
        System.out.println("Consonent:" + count);
        
        
    }
} */

public class Main{
    public static void main(String[] args){
        String str = "hello";
        for(int i = 0; i< str.length();i++){
            int count = 0;
            for (int j = 0; j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i) + "=" + count);
        }
    }
}

