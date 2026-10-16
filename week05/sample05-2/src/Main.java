public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int price, discountRate;
    char grade;
    double discount;
    int extraDiscount = 0;
    int finalPrice;

    System.out.print("구입 가격 입력 : ");
    price = keyboard.nextInt();

    System.out.print("회원 등급을 입력(VIP, GOLD, SILVER, NONE) 예) V,v : ");
    grade = keyboard.next().charAt(0);

    String gradeTemp = grade == 'V' || grade == 'v' ? "VIP"
            : grade == 'G' || grade == 'g' ? "GOLD"
            : grade == 'S' || grade == 's' ? "SILVER"
            : "NONE";

    discountRate = grade == 'V' || grade == 'v' ? 20
            : grade == 'G' || grade == 'g' ? 15
            : grade == 'S' || grade == 's' ? 10
            : 0;

    discount = price * ((double) discountRate / 100);

    if (price >= 100000) {
        extraDiscount = (int) ((price - discount) * 0.10);
    }

    finalPrice = (int) (price - discount - extraDiscount);

    System.out.printf("회원 등급 : %s (%d%% 할인)%n",
            gradeTemp, discountRate);
    System.out.printf("구입 가격 : %d원%n", price);
    System.out.printf("회원 할인 : %d원%n", (int) discount);
    System.out.printf("추가 할인 : %d원%n", extraDiscount);
    System.out.printf("최종 금액 : %d원%n", finalPrice);

    keyboard.close();
}
