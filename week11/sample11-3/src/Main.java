void main() {
    Scanner keyboard = new Scanner(System.in);
    final int ID = 0;
    final int NAME = 1;
    final int BASE = 0;
    final int SUDANG = 1;
    final int SALARY = 2;
    final int TAX = 3;
    final int NET = 4;

    String[][] employees = {
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}
    };
    char[] grade = {'1', '3', '2', '4', '5', '1', '3', '2', '4', '5'};
    //   int[][] salary = new int[employees.length][5]; // {기본급, 업무수당, 급여액, 세금, 지급액}
    int[][] salary = {
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}
    };
    int[] MONEY = {1650000, 1680000, 1700000, 1720000, 1750000};

 /*   int count = 0;
    while (count < employees.length) {
        System.out.printf("%s 사원의 업무 수당 입력 : ", employees[count][NAME]);
        salary[count][SUDANG] = keyboard.nextInt();

        if (salary[count][SUDANG] >= 0 && salary[count][SUDANG] <= 1000000)
            count++;
        else {
            System.err.println("ERROR");
            System.in.read();
        }
    } */


    for (int i = 0; i < employees.length; i++) {
        if (grade[i] == '1') {
            salary[i][BASE] = MONEY[0];
        } else if (grade[i] == '2') {
            salary[i][BASE] = MONEY[1];
        } else if (grade[i] == '3') {
            salary[i][BASE] = MONEY[2];
        } else if (grade[i] == '4') {
            salary[i][BASE] = MONEY[3];
        } else if (grade[i] == '5') {
            salary[i][BASE] = MONEY[4];
        } else {
            salary[i][BASE] = 0;
        }
    }

    for (int i = 0; i < employees.length; i++)
        salary[i][SALARY] = salary[i][BASE] + salary[i][SUDANG];

    for (int i = 0; i < employees.length; i++) {
        int temp = salary[i][SALARY] - (int) (salary[i][SALARY] * 15.0f / 100);
        if (temp < 1600000) {
            salary[i][TAX] = (int) (temp * 3.3f / 100);
        } else if (temp < 2300000) {
            salary[i][TAX] = (int) (temp * 7.5f / 100);
        } else {
            salary[i][TAX] = (int) (temp * 10.2f / 100);
        }

        salary[i][TAX] = salary[i][TAX] / 100 * 100;
    }

    for (int i = 0; i < employees.length; i++)
        salary[i][NET] = salary[i][SALARY] - salary[i][TAX];


    for (int i = 0; i < employees.length; i++) {
        for (int j = 0; j < employees.length - (i + 1); j++) {
            if (salary[j][NET] < salary[j + 1][NET]) {
                String[] tmp = employees[j + 1];
                employees[j + 1] = employees[j];
                employees[j] = tmp;

                char tmp1 = grade[j + 1];
                grade[j + 1] = grade[j];
                grade[j] = tmp1;

                int[] tmp2 = salary[j + 1];
                salary[j + 1] = salary[j];
                salary[j] = tmp2;
            }
        }
    }


    System.out.println("***************************************************");
    System.out.println(" 사번 이름 호봉 기본급  업무수당  급여액  세금  지급액 ");
    System.out.println("***************************************************");
    for (int i = 0; i < employees.length; i++) {
        System.out.printf(" %3s %4s %c %,10d %,10d %,10d %,8d %,10d\n",
                employees[i][ID], employees[i][NAME], grade[i],
                salary[i][BASE], salary[i][SUDANG], salary[i][SALARY],
                salary[i][TAX], salary[i][NET]);
    }
    System.out.println("***************************************************");

}