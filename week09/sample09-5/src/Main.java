
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    int start;
    int last;
    int odd = 0;
    int even = 0;
    char answer;

    do {
        while (true) {
            System.out.println("어디부터 더할까요?");
            start = keyboard.nextInt();

            System.out.printf("어디까지 더할까요 (최소값 : %d)?", start + 5);
            last = keyboard.nextInt();

            if (last >= start + 5)
                break;
            else {
                System.err.println("ERROR: 입력오류");
            }
        }

        odd = 0;
        even = 0;

        for (int i = start; i <= last; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.printf("%d ~ %d 까지의 합 = %,d\n", start, last, even + odd);
        System.out.printf("\t짝수의 합 = %,d\n", even);
        System.out.printf("\t홀수의 합 = %,d\n", odd);

        System.out.print("계속 할까요?(Y/N)");
        keyboard.nextLine();
        answer =keyboard.nextLine().charAt(0);
        if (answer == 'N' || answer == 'n'){
            break;
        }

    } while (true);
}
