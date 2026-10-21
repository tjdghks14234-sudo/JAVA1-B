void main() {
    Scanner kyboard = new Scanner(System.in);
    final int LTFE = 7; //단위 분
    final int PRICE = 4500;
    int year;
    int ciga;

    System.out.print("당신은 몇년간 담배를 피웠나요");
    year = kyboard.nextInt();
    System.out.print("하루에 몇 개비를 피우나요");
    ciga = kyboard.nextInt();

    int day = year * 365;
    int count = day * ciga;
    int minute = count * LTFE;
    int hour = minute / 60;
    minute -= (hour * 60);
    int day1 = hour / 24;
    hour -=(day1 *24);
    int year1 = day1 /365;
    day1 -=(year1 * 365);

    int gap = count / 20 + (count % 20 != 0? 1:0);
    int money = gap * PRICE;

    System.out.printf("담배 1개피를 피우면 수명이 %d분 단축 된다고 합니다.\n",LTFE);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, %d년 %d일%d시간%d분 수명이 단축됩니다.",
            year,ciga,year1,day1,hour,minute);
    System.out.printf("%d년 동안 하루에 %d 개피의 담배를 피우면, 담배 금액은 %,d원 입니다",
            year,ciga,money);
}
