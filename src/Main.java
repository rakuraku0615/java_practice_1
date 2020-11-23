
public class Main {
	public static void main(String[] args) {
		int val0 = 0;
		int val1 = 0;
		
		if (args.length != 3) {
			System.out.println("パラメータエラー(Err01)");
			System.exit(0);
		}
		
		try {
			val0 = Integer.parseInt(args[0]);
			val1 = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("パラメータ型エラー(Err02)");
			System.exit(0);
		}
		
		System.out.println("入力値1 : " + val0);
		System.out.println("入力値2 : " + val1);
		
		String calc_way[] = {"kake", "waru", "tasu", "hiku"};
		String calc_param = args[2];
		boolean err_flag = true;
		
	    for (int i = 0 ; i < 4 ; i++){
	        if (calc_param.equals(calc_way[i])){
	        	err_flag = false;
	        }
	    }
	    if (err_flag) {
			System.out.println("パラメータエラー(Err03)");
			System.exit(0);
	    }
    	System.out.println("入力値3 : " + calc_param);
		
    	int result = 0;
    	Calculate machine = new Calculate();
    	result = machine.calc(val0, val1, calc_param);
	    
    	System.out.println("計算結果 : " + result);
	}
}

class Calculate {
	public int calc (int val1, int val2, String param) {
		int result = 0;
		switch (param) {
			case "tasu" :
				result = val1 + val2;
				break;
			case "hiku" : 
				result = val1 - val2;
				break;
			case "kake" : 
				result = val1 * val2;
				break;
			case "waru" : 
				result = val1 / val2;
				break;
		}
		return result;
	}
}