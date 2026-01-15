class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        if(denom1==denom2){
            a=numer1+numer2;
            b=denom1;
            c=a;
            d=b;
            while (d != 0) {
            int temp = c % d;
            c = d;
            d = temp;
            }
            answer[0]=a/c;
            answer[1]=b/c;
        }else {
            a=(numer1*denom2)+(numer2*denom1);
            b=denom2*denom1;
            c=a;
            d=b;
            
            while (d != 0) {
            int temp = c % d;
            c = d;
            d = temp;
            }
            answer[0]=a/c;
            answer[1]=b/c;
        }
        
        return answer;
    }
}