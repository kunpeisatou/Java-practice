class Main {
  public static void main(String[] args) {
     String restart = "!!ここから!!";
     
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
    
    int number = 12;
    
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
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!配列!!");
    
    
    // 変数namesに、配列を代入してください
    String[] names = {"太郎","二郎","三郎"};
    
    // インデックス番号が0の要素を出力してください
    System.out.println(names[0]);
    
    // インデックス番号が2の要素を出力してください
    System.out.println(names[2]);
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!配列の要素の上書き!!");
    
    
    // 変数languagesを定義し、配列を代入してください
    String[] languages = {"Ruby", "PHP", "Python"};
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
    // インデックス番号が「1」の要素を「Java」で上書きしてください
    languages[1] = "Java";
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!配列と繰り返し!!");
    
    
    // for文を用いて、「私の名前は◯◯です」と出力してください
    for (int i2=0; i2 < names.length; i2++){
      System.out.println("私の名前は"+names[i2]+"です");
    }
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!配列用のfor文!!");
    
    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for(String name:names){
      System.out.println("私の名前は"+name+"です");
    }
    
    
    
    
    // ---------------------------------------------------------------------
    System.out.println(restart);
    System.out.println("!!復習!!");
    
    // 変数numbersに、与えられた数字の配列を代入してください
    int[] numbers = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for(int number03:numbers){
      if(number03%2 == 1){
        oddSum += number03;
      }else{
        evenSum += number03;
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}