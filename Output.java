import java.util.*;

class Output{

	public Output(){//コンストラクタ

	}

	public void printWordTable(Map<String,Integer> map){//頻度表の出力
		for(Map.Entry<String,Integer> entry : map.entrySet()){//デバッグ用print
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}