/**
 * Definition for singly-linked list.
 * */
 class ListNode {
	 int val;
     ListNode next;
     ListNode() {}
 	 ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 		}
 
class MergeTwoSortedLists {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;//if list1 is null simply return list2
		if(list2 == null) return list1;//if list2 is null simply return list1
		//find the smalller value as we are going in asc order
        if(list1.val < list2.val){
            //recursively call the method until list 2 has a smaller value than list1
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else{
            //recursively call the method until list1 has a smaller value than list2
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
    }

}