void main() {
    /*
    long test1 = 3000000000L;
    long test2 = 4000000000L;
    long result = test1 * test2;

    System.out.printf("%d * %d = %d",test1,test2,result);
    */


    /*
    byte test1 = 127;
    byte test2 = 1;
    int result = test1 + test2;

    System.out.printf("%d + %d = %d",test1,test2,result);
    */

    short test1 = 32767;
    short test2 = 1;
    short result = (short)(test1 + test2); //캐스트 연산자

    System.out.printf("%d + %d = %d",test1,test2,result);
}
