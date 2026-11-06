void main() {
    Scanner keyboard = new Scanner(System.in);
    int SIZE = 5;
    char answer;
    String result;

    /*
    if (answer == 'Y' || answer == 'y') {
        result = "출석";
    } else {
        result = "결석";
    } */

    //for문 사용
    for (int i =1; i <= SIZE; i++) { //제어변수
        System.out.printf("%d 번 학생이 출석했나요(Y/N)?",i);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번학생 -> %s \n",i, result);
    }


    //while문
    int j = 1;
    while (j <= SIZE) {
        System.out.printf("%d 번 학생이 출석했나요(Y/N)?",j);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번학생 -> %s \n",j++, result);

    }



    //do ~ wjile()
    int k = 1;
    do {
        System.out.printf("%d 번 학생이 출석했나요(Y/N)?",k);
        answer = keyboard.nextLine().charAt(0);

        if (answer == 'Y' || answer == 'y') {
            result = "출석";
        } else {
            result = "결석";
        }

        System.out.printf("%d번 학생 -> %s \n",k++, result);

    }while (k <= SIZE);
}
