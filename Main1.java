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
    
   // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!復習!!");
    
    // 変数nameに、好きな名前を代入してください
    String name = "佐藤";
    
    // 変数ageに、好きな年齢を代入してください
    int age = 28;
    
    // 変数heightに、好きな身長を代入してください（例: 1.2）
    double myHeight = 171.0;
    
    // 変数weightに、好きな体重を代入してください（例: 20.0）
    double myWeight = 72.5;
    
    // 変数bmiに、BMIを計算して代入してください
    double bmi = myWeight / myHeight / myHeight;
    
    // 名前、年齢、身長、体重、BMIに関する情報を出力してください
    System.out.println("名前は"+name+"です");
    System.out.println("年齢は"+age+"歳です");
    System.out.println("身長は"+myHeight+"mです");
    System.out.println("体重は"+myWeight+"kgです");
    System.out.println("BMIは"+bmi+"です");
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!真偽値・比較演算子!!");
    
      // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);
    
    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);
    
    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 == 3);
    
    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12 / 4 != 3);
    
    // 変数を定義し、値を比較した結果を代入してください
    boolean bool = 3 * 9 == 27;
    
    // 変数boolの値を出力してください
    System.out.println(bool);
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!比較演算子（２）!!");
    
    // 「4 + 2」と「6」を比較し、falseとなるようにしてください
    System.out.println(4 + 2 < 6);
    
    // 「4 + 2」と「6」を比較し、trueとなるようにしてください
    System.out.println(4 + 2 <= 6);
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!論理演算子!!");
    
    
    // trueと出力されるようにしてください
    System.out.println(true || false);
    
    // falseと出力されるようにしてください
    System.out.println(false && true);
    
    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
    System.out.println(8<5 && 3>=2);
    
    // 「8 < 5」または「3 >= 2」の結果を出力してください
    System.out.println(8<5 || 3>=2);
    
    // 「8 < 5」でない、の結果を出力してください
    System.out.println(!(8<5));
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!if文!!");
    
    
    // 条件式に直接trueをいれてください
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }
    
    // 条件式に直接falseをいれてください
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }
    
    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2) {
      System.out.println("xは2より大きい");
    }
    
    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8) {
      System.out.println("xは8より大きい");
    }
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!else, else if!!");
    
    number = 12;
    
    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    }else if (number < 20) {
      System.out.println("10以上、20より小さい");
    }else {
      System.out.println("20以上");
    }
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!switch文!!");
    
    
    int n = 1;
    
    // switch文を用いて、変数nの値に応じて条件分岐をしてください
    switch(n){
      case 1 :
        System.out.println("大吉です");
        break;
      case 2 :
        System.out.println("吉です");
        break;
    }
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!switch文(2)!!");
    
    
    n = 0;
    
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("中吉です");
        break;
      // defaultを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述してください
      default:
        System.out.println("凶です");
        break;
    }
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!while文!!");
    
    
    number = 10;
    
    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while(number > 0){
      System.out.println(number);
      number--;
    }
    
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!for文!!");
    
    
    // for文を用いて、繰り返し処理をつくってください
    for(int i=1; i<=10; i++){
      System.out.println(i+"回目のループです");
    }
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!break, continue!!");
    
    
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i%5 == 0){
        break;
      }
      
      System.out.println(i);
      i++;
    }
    
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if (j%3 == 0){
        continue;
      }
      
      System.out.println(j);
    }
    
  }
}