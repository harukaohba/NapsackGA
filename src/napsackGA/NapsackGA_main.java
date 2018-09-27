package napsackGA;

public class NapsackGA_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		int kotai_num = 2000;// 個体数
		int sedai_max = 50;// 世代数
		int item_num = 20;// 商品数
		int cros_rate = 90;// 交差率
		int muta_rate = 5;// 突然変異率
		int weight_max = 70;// 重量制限

		// 処理前の時刻を取得
        long startTime = System.currentTimeMillis();
        
		NapsackGA_lib nlib = new NapsackGA_lib(kotai_num, sedai_max, item_num, cros_rate, muta_rate, weight_max);
		
		// 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
 
        System.out.println("開始時刻：" + startTime + " ms");
        System.out.println("終了時刻：" + endTime + " ms");
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}

}
