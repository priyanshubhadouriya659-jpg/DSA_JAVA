import java.util.*;
public class prime_number {

    public static boolean isPrime(int n) {
        
        int count=0;
       for(int i=1;i<=n;i++){
                    if(n%i==0)
            {
                count++;
            }
        }
        if(count==2) 
        
        {
    return true; 
        }
        else
        {
            return false;
        }
       
    }
    public static void main(String[] args) {
        int n=5;
        System.out.print(isPrime(n));
    }
    }
