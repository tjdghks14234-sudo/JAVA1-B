import java.sql.SQLOutput;

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int width, height, area;
    char type;
    String result;

    System.out.println(" 사각형의 가로 길이입력(예:5): ");
    width = keyboard.nextInt( );
    System.out.println(" 사각형의 세로 길이입력(예:5): ");
    height = keyboard.nextInt( );

    type = width == height ? '정':'직';
    area = width * height;

    System.out.printf("\n**** %c사각형 넓이 ****\n",type);
    System.out.printf("\t가로 : %d Cm\n",width);
    System.out.printf("\t세로 : %d Cm\n",height);
    System.out.printf("\t넓이 : %d \u33A0",area);
}

