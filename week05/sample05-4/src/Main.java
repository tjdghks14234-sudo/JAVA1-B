void main() {
    Scanner keyboard = new Scanner(System.in);

    int age;
    System.out.println("당신의 나이는?");
    age = keyboard.nextInt();

    boolean flag = (age > 0 && age < 120) ? true : false;
    int charge = (age <= 7 || age >= 65) ? 0 : 5000;

    String result = flag == true ? String.format("나이:%d살, 요금:%,d원",age,charge):"Data(나이를정확이 입력하시오).";
    System.out.println(result);
}