void main() {
    Scanner Keyboard = new Scanner(System.in);
    double PI = 3.141592;
    int rediws;
    double area;

    System.out.println("원의 반지름 입력(정수형)?");
    rediws = Keyboard.nextInt();

    area = PI * rediws * rediws ;
    System.out.printf("원의 반지름: %,d Cm, 면적 : %,2f\u33A0\n",rediws, area);
}
