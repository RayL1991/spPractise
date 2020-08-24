
public class ProblemsToSolve{

	public static int minNumber(int[] pleasantness, int variety){

		int min_index = 0;
		int max_index = 0;

		int target_index = 0;
		int stop_index = -1;

		int minDistance = 0;
		int maxDistance = 0;

		int minValue = pleasantness[0];
		int maxValue = pleasantness[0];

		for(int i = 1; i< pleasantness.length; i++){

			// keep recording the min value;
			minValue = Math.min(minValue, pleasantness[i-1]);
			maxValue = Math.max(maxValue, pleasantness[i-1]);

			// record the least value that fit the distance;
			if (minValue != minValue)
				min_index = i -1;

			if (maxValue != max_index)
				max_index = i -1;

			minDistance = Math.abs(pleasantness[i] - minValue);
			maxDistance = Math.abs(pleasantness[i] - maxValue);

			if ( minDistance >= variety){
				target_index = min_index;
				stop_index = i;
				break;
			}

			if (maxDistance >= variety){
				target_index = max_index;
				stop_index = i;
				break;
			}

		}

		// calculat the the minNumber;

		if(stop_index != -1){
			return getMaxIntRes(target_index) + getMaxIntRes(stop_index - target_index) + 1;
		}else{
			return pleasantness.length;
		}
		
	}

	public static int getMaxIntRes(int n){
		if (n%2 != 0)	return n/2 + 1;
		else 	return n/2;
	}

	public static void main(String[] args) {
		// int[] pleasantness = {6, 2, 6, 2, 6, 3, 3, 3, 7};
		// int variety = 4;

		// int[] pleasantness = {10,1};
		// int variety = 9;

		// int[] pleasantness = {10, 1, 12, 101};
		// int variety = 100;

		int[] pleasantness = {1, 2, 3, 4, 5};
		int variety = 4;

		System.out.println(minNumber(pleasantness, variety));
	}
		
}