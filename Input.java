import java.util.*;

class Input{
	private String str;//入力された文字列

	public Input(){//コンストラクタ

	}

	Scanner scan = new Scanner(System.in);

	public String getString(){//文字列を取得
		System.out.println("単語を入力して下さい");
		str = scan.next();
		return str;
	}
}