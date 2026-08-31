public class countWords{
    public static void main(String Args[]){
        String str="     Java is a    fun Language";
        int count=0;
        if(str.length()==0)
        System.out.print("String is empty");
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            if(!words[i].equals(""))
            count++;
            }
        System.out.print(count);
    } }