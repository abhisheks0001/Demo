public class palindromeStr{
    static void reversed(String str){
        String newstr="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            newstr+=ch;
        }
        if(str.equalsIgnoreCase(newstr))
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");

        }
        
    public static void main(String args[]){
        String str="ji Madam ji";
        reversed(str);
    }
}