package µÚK¸öÊı;

public class KthNumber {
	public int findKth(int k) {
        // write code here
		int i = 3;
		int count = 0;
		while(count < k){
			if(i % 2 != 0){
				int b = i;
				while(b % 3 == 0||b % 5 == 0||b % 7 == 0){
					if(b % 3 == 0){
						b = b / 3;
					}else if(b % 5 == 0){
						b = b / 5;
					}else if(b % 7 == 0){
						b = b / 7;
					}
					if(b == 1){
						count ++;
					}
				}
			}
			i++;
		}
		return --i;
    }
}
