package koreaIT;

public class Main {
    public static void main(String[] args) {
        Test myfunc = new Test();

        myfunc.display(10);
        myfunc.display(10, 20);
        myfunc.display(10, 3.14);
        myfunc.display(10, 'a'); //자동 형변환 ( char 'a' = 97 )

    }
}