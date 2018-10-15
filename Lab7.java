import java.util.*;
public class Lab7 {

	public static void main(String[] args) {

		
		ArrayList<String> list  = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//Create List1
		list.add(0,"how");
		list.add(1,"are");
		list.add(2,"you?");
		list1.add(0,1);
		list1.add(1,4);
		list1.add(2,8);
		list1.add(3,9);
		list1.add(4,11);
		list1.add(5,15);
		list1.add(6,17);
		list1.add(7,28);
		list1.add(8,41);
		list1.add(9,59);
		
		//Create List2
		list2.add(0,4);
		list2.add(1,7);
		list2.add(2,11);
		list2.add(3,17);
		list2.add(4,19);
		list2.add(5,20);
		list2.add(6,23);
		list2.add(7,28);
		list2.add(8,37);
		list2.add(9,59);
		list2.add(10,81);
		
		System.out.println(list);
		doubleList(list);
		System.out.println(list);
		removeOddLength(list);
		System.out.println(list);
		System.out.println(intersect(list1,list2));
	}
	
		public static void doubleList(ArrayList<String>list) {
			for (int i = 0; i < list.size(); i+=2) {
				list.add(i,list.get(i));
			}
		}
		
		public static void removeOddLength(ArrayList<String>list) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).length()%2 != 0) {
					list.remove(i);
				}
			}
		}
		
		public static ArrayList intersect(ArrayList<Integer>list1, ArrayList<Integer>list2) {
			
			ArrayList<Integer> list3 = new ArrayList<Integer>();

			for (int i = 0; i < list2.size() - 1; i++) {
				
				if (list2.contains(list1.get(i))) {
					list3.add(list1.get(i));
				}
			}
			return list3;
		}
}
