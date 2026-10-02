void main() {
    int a;
    int b;
    Scanner Keyboard = new Scanner(System.in);

    System.out.print("첫번째 수를 입력(분자):");
    a = Keyboard.nextInt();
    System.out.print("두번째 수를 입력(분모):");
    b = Keyboard.nextInt();

    System.out.printf("%d를 %d로 나누면 몫=%d,나머지=%d",a,b,a/b,a%b);
    System.out.printf("%d를 %d로 나누면= %.2f",a,b, (float)a / b );
}
