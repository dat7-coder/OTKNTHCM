public class Ex6a{
    public static void main(String[] args){
        System.out.println(multiply(12345));
    }
    public static int multiply(int n){
        if (n<10)
            {return n;}
        else
            {return n%10*multiply(n/10);}
    }
}