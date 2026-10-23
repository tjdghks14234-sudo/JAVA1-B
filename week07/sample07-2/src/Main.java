void main() {
    Scanner keyboard = new Scanner(System.in);
    int num1 , num2;
    float result;

    System.out.print("분자 입력 :");
    num1 = keyboard.nextInt();
    System.out.print("분모 입력 :");
    num2 = keyboard.nextInt();

    result = (float)num1/num2;

    String message;

    if (num2 == 0){
        message = "계산할수 없음";
    }
    else {
        message = String.format("%d / %d = %.2f \n",num1,num2,result);
    }
    System.out.println(message);
}
