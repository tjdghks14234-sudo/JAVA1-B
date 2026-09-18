void main() {
    Scanner Keyboard = new Scanner(System.in);

    double circle_area;
    final double PI = 3.141592;
    double area;
    int base;
    int rectagular_area;
    double radius;

    System.out.printf("정사각형의 한 변의 길이 입력:");
    base = Keyboard.nextInt();

    rectagular_area = base * base;
    radius = base / 2.0;
    circle_area = PI * radius * radius;
    area = rectagular_area - circle_area;

    System.out.printf("한변의 길이가 %,d Cm인 정사각형의 면적 = %,d \u33A0\n", base, rectagular_area);
    System.out.printf("이 정사각형 내부의 원의 면적 : %,2f \u33A0\n", circle_area);
    System.out.printf("구하려는 면적 : %,2f \u33A0\n", area);
}