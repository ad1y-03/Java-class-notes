public class whileloop {
    public static void main(String[] args) {
        int numbers = 12345;
        int sum = 0;
        while(numbers>0){
            int digit = numbers%10;
            sum+=digit;
            numbers = numbers/10;
        }System.out.println("Sum of the digits = " + sum);
    }
    
}
