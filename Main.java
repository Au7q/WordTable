class Main{
	public static void main(String[] args){
		Input input = new Input();//Inputインスタンス
		WordTable wordtable = new WordTable(input.getString());//WordTableインスタンス
		Output output = new Output();//Outputインスタンス

		output.printWordTable(wordtable.returnWordTable());
	}
}