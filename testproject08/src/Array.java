
public class Array {

	public static void main(String[] args) {
		// 配列の基礎
		// 配列とは、 同じ型の複数の数字や文字などを 1つに格納して管理するもの
		// 一度サイズが決められると 変更することはできない
		// 配列の各要素は、配列変数[インデックス] という形で記述します。
		// 配列は、同じ変数で複数の要素を持つため、
		// インデックスの数値で何番目の要素かを特定します。
		// 配列のインデックスは、0から始まります。
		// 配列の書き方には、2通りの方法があります。
		
		// 1つ目の書き方
		//String[] name = new String[3];
		
		//name[0]="田中";
		//name[1]="高橋";
		//name[2]="斉藤";
		
		// 2つ目の書き方
		//String[] name = {"田中","高橋","斉藤"};
		
		String[] name = new String[3];
		name[0]="田中";
		name[1]="高橋";
		name[2]="斉藤";
		System.out.println(name[0] + "\n");
		
		String[] name2 = {"田中","高橋","斉藤"};
		System.out.println(name2[0]);

	}

}
