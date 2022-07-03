public class Task_2 {
    public static void main(String[] args) {

        System.out.println(prime_N(5));
    }

    static int prime_N(int N)
    {

        int x, y, flg,res=1;
        int counter=0;

        for (x = 1; x <= N; x++) {

            if (x == 1 || x == 0)
                continue;

            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                res=res*x;
            if(x==N)
                //For count last 0 of res
                for (int i = 0; i < String.valueOf(res).length(); i++) {
                    if(res%10==0){
                        counter++;
                        res=res/10;
                    }
                }
        }
        return counter;
    }

}
