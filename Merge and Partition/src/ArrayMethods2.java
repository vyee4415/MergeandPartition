import java.util.Arrays;

// Vivian Yee
// 2/5/18
// In place sorts lab 2

public class ArrayMethods2 {
	
	public static void main(String[] args) {
		int[] test1 = {3,4,2,7,12,22,0,1};
		String[] test2 = {"apple","cucumber","microsoft","zorro"};
		String[] test3 = {"banana", "cherry", "mahogany","oreos","pinata"};
		
		long start = System.nanoTime();
		String[] mergeResult = merge(test3, test2);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Merge test took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(mergeResult));
		System.out.println("");
		
		start = System.nanoTime();
		int pivotFinalPoint = partition(test1);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Partition test took: " + time + " nanoseconds");
		System.out.println("Final pivot position is " + pivotFinalPoint);
	}
	
	public static String[] merge(String[] list1, String[] list2) {
		String[] newArr = new String[list1.length+list2.length];
		int x = 0, y = 0, i = 0;
		while((x<list1.length)&&(y<list2.length)) {
			if(list1[x].compareTo(list2[y])>0) {
				newArr[i] = list2[y];
				y++;
				i++;
			}else if(list2[y].compareTo(list1[x])>0) {
				newArr[i] = list1[x];
				x++;
				i++;
			}
		}
		while(x<list1.length) {
			newArr[i] = list1[x];
			x++;
			i++;
		}
		while(y<list2.length) {
			newArr[i] = list2[y];
			y++;
			i++;
		}
		return newArr;
	}
	
	public static int partition(int[] list) {
		int x = 0;
		int y = list.length-1;
		int w = 0, z = 0;
		while(x != y) {
			if((list[x]>list[y])&&(x<y)) {
				SwapInt(list,x,y);
				z = x;
				x = y;
				y = z + 1;
			}else if((list[x]<list[y])&&(x>y)){
				SwapInt(list,x,y);
				w = x;
				x = y;
				y = w - 1;
			}else if(x<y){
				y--;
			}else if(x>y){
				y++;
			}
		}
		return x;
	}
	
	public static void SwapInt(int[] arr, int index, int index2) {
		int num = arr[index];
		arr[index] = arr[index2];
		arr[index2] = num;
	}
	
}
