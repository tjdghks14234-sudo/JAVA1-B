void main() {
    Scanner kyboard = new Scanner(System.in);
    final int HEART = 65;
    int age;


    System.out.print("당신은 몇년동안 사셨나요");
    age = kyboard.nextInt();

    int day = age * 365;
    int hour = day * 24;
    int minute = hour * 60;
    long count = (long)minute * HEART;
    //long count = (long)(((age * 365) * 24) * 60) * HEART;

    System.out.printf("사람은 평균 분당 %d회 심장이 박동한다\n", HEART);
    System.out.printf("심장은 %d 년동안 %d회 벅동합니다",age,count);
}
