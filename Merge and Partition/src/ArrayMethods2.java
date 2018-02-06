import java.util.Arrays;

// Vivian Yee
// 2/5/18
// In place sorts lab 2

public class ArrayMethods2 {
	
	public static void main(String[] args) {
		int[] test1 = {1, 5, 2, 4, 3, 17, 0};
		String[] test2 = {"huh","wassup","lmao"};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		merge(test3, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(merge(test3, test2)));
		System.out.println("");
		
		start = System.nanoTime();
		partition(test1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(partition(test1));
	}
	
	public static String[] merge(String[] list1, String[] list2) {
		String[] newArr = {};
		
	}
	
	public static int partition(int[] list) {
		int x = 0;
		int y = list.length-1;
		while(x != y) {
			if((list[x]>list[y])&&(x<y)) {
				SwapInt(list,x,y);
				x = y;
				y = x+1;
			}else if((list[x]<list[y])&&(x>y)){
				SwapInt(list,x,y);
				x = y;
				y = x-1;
			}else if(x<y){
				y--;
			}else if(x>y){
				y++;
			}
		}
		return x;
	}
	
	public static void SwapInt(int[] arr, int index, int index2) {
		int x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
	
	public static void SwapString(String[] arr, int index, int index2) {
		String x = arr[index];
		arr[index] = arr[index2];
		arr[index2] = x;
	}
}
