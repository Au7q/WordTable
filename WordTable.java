import java.util.*;

class WordTable{
	private String str;//入力された文字列
	private int count = 1;//ある一つの単語のカウント
	ArrayList<String> word = new ArrayList<String>();//単語
	Map<String,Integer> map = new HashMap<String,Integer>();//単語と頻度の組み合わせ

	public WordTable(String str){//コンストラクタ
		this.str = str;
	}

	private void splitWord(){//文字列を単語に分割して単語リストに登録
		String[] splitStr = str.split("[\t,.]");//文字列を区切ったもの

		for(int i = 0;i < splitStr.length;i++){
			word.add(splitStr[i]);//文字列を区切ったものを単語として登録
		}
	}

	public void overlayWord(){//単語の重複を無くし、同じ単語のカウントを行う
		splitWord();

		int a;//mapに重複する単語が存在するか判定用の変数

		for(int i = 0;i < word.size();i++){//単語の数だけ繰り返す(1)
			a = 0;

			for(int j = 0;j < map.size();j++){//頻度表に登録されている単語の数だけ繰り返す(2)

				if(map.containsKey(word.get(i))){//「wordリストのi番目の単語」がmapリストに含まれているか
					//「mapリストのj番目の単語」のcountを1増やす処理開始
					count = map.get(word.get(i)) + 1;//countに重複した単語の頻度と1の和を代入
					map.remove(word.get(i));//重複した単語をHashmapから消す
					map.put(word.get(i),count);//重複した単語をHashmapに登録
					//「mapリストのj番目の単語」のcountを1増やす処理終了
					a = 1;
					break;//(2)を抜け出す
				}
			}

			if(a == 0){
				map.put(word.get(i),1);//mapに新しい単語を追加
			}
		}
	}

	public Map<String,Integer> returnWordTable(){//mapを返却する
		overlayWord();
		return map;
	}
}