class Main {
  public static void main(String[] args) {
    int number1 = 3;
    
    // int型の変数number2を定義し、7を代入してください
    int number2 = 7;
    
    // number1 * number2を出力してください
    System.out.println(number1*number2);
    
    // 変数textに「プログラミングを勉強しよう」を代入してください
    String text = "プログラミングを勉強しよう";
    
    // 「Progateで」と変数textを連結して出力してください
    System.out.println("毎日"+text);
    
    
    String restart = "!!ここから!!";
    // -------------------------------
    System.out.println(restart);
    

    int number = 11;
    
    System.out.println(number);
    System.out.println(text);
    
    // 変数numberを9で上書きしてください
    number = 9;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数textを「Java」で上書きしてください
    text = "Java";
    
    // 変数textを出力してください
    System.out.println(text);
    
    // -------------------------------
    System.out.println(restart);
    
    number = 3;
    System.out.println(number);
    
    // 変数numberの値に7を足して、変数numberを上書きしてください
    number = number+7;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    
    
    number = 8;
    
    // 変数numberに7をかけて、変数numberを上書きしてください
    number = number*7;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数numberの値に1を足して、変数numberを上書きしてください
    number++;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    
    int length = 6;
    int height = 8;
    
    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea = length * height;
    
    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);
    
    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = length * height / 2;
    
    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    
     // double型の変数number1を定義し、8.5を代入してください。
    double number01 = 8.5;
    
    // double型の変数number2を定義し、3.4を代入してください。
    double number02 = 3.4;
    
    // number1にnumber2を足した値を出力してください
    System.out.println(number1 + number2);
    
    // number1からnumber2を引いた値を出力してください
    System.out.println(number1 - number2);
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!自動型変換!!");
    
    int month = 12;
    int date = 31;
    
    // 「12月31日」となるように変数と文字列を連結して出力してください
    System.out.println(month+"月"+date+"日");
    
    // 7を2で割った値を出力してください
    System.out.println(7/2);
    
    // 7.0を2.0で割った値を出力してください
    System.out.println(7.0/2.0);
    
    // 7を2.0で割った値を出力してください
    System.out.println(7/2.0);
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!強制型変換!!");
    
    number1 = 7;
    number2 = 2;
    System.out.println(number1 / number2);
    
    // number1をdouble型にキャストし、number2で割った値を出力してください
    System.out.println((double)number1 / number2);
  }
}