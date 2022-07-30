public class Ex6c{
    public static void main(String[] args){
        System.out.println(maxDigit(1,0));
    }
    public static int maxDigit(int n, int max){
        if (n!=0){
            if ( n%10 > max){
                max = n%10;
                return maxDigit(n/10,max);
            }else{
                return maxDigit(n/10,max);
            }
        }
        return max;
    }
}