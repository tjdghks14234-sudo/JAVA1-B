void main() {
    Scanner Keyboard = new Scanner(System.in);
    String name = "";
    int age = 0;

    System.out.print("당신의 이름은?");
    name = Keyboard.nextLine();
    System.out.printf("%s님의 나이는 ?", name);
    age = Keyboard.nextInt();
}