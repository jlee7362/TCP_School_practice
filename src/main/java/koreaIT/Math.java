package koreaIT;

public class Math {
    int recrusiveSum(int n){    // n이 1이면, 그냥 1을 반환함.
        if(n==1){
            return 1;
        }
        return n + recrusiveSum(n-1);//n이 1이 아니면, n을 1부터 (n-1)까지의 합과 더한 값을 반환함.
    }
}
