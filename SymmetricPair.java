
import java.util.HashMap;
import java.util.Scanner;

class SymmetricPair {

	
	static void pair(int arr[][])
	{
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		
		for (int i = 0; i < arr.length; i++)
		{
			
			int key = arr[i][0];

			int value = arr[i][1];
			// System.out.println("key"+key+"val:"+value);
			
			Integer val = map.get(value);

			if (val != null && val == key){
                System.out.println("(" + value + ", " + key + ")");
            }
				
			else {
			    map.put(key, value);
            }

		}
	}


	public static void main(String arg[])
	{
		System.out.println("enter the number of pairs you wish to check");
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        sc.nextLine();
        int arr[][]= new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the pair: "+i);
            System.out.println("first data:");
            arr[i][0]= sc.nextInt();
            sc.nextLine();
            System.out.println("second data:");
            arr[i][1]= sc.nextInt();
            sc.nextLine();
        }
		pair(arr);
	}
}

