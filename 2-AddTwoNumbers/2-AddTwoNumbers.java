// Last updated: 03/07/2025, 07:14:36
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
       
       
       
       /**  long a = 0, b = 0;
        

        while(l1!=null && l2!=null)
        {
            if(l1!= null)
            {
                a += l1.val;
                l1 = l1.next;
                a*=10;
            }
            if(l2!= null)
            {
                b += l2.val;
                l2 = l2.next;
                b*=10;
            }
        }


        a/=10;
        b/=10;
        long e = a+b;
        
        int length = String.valueOf(e).length();
         ListNode node1 = new ListNode((int)e%10);
        e/=10;
        length--;
        if (length>0)
        {
        ListNode node2 = new ListNode((int)e%10);
         e/=10;
            length--;
            node1.next = node2;
        
        while(length>0)
        {
            ListNode node3 = new ListNode((int)e%10);
            e/=10;
            length--;
            node2.next = node3;
            node2 = node3;
        }
        }


        // if(e!=0)
        // {
        // ListNode node2 = new ListNode(e%10);
        // e/=10;
        
        // node1.next = node2;
        
        // if(e!=0)
        // {
        // ListNode node3 = new ListNode(e%10);
        // e/=10;
        
        // node2.next = node3;

        // if(e!=0)
        // {
        // ListNode node4 = new ListNode(e%10);
        // e/=10;
        
        // node3.next = node4;
        // if(e!=0)
        // {
        // ListNode node5 = new ListNode(e%10);
        // e/=10;
        
        // node4.next = node5;
        // if(e!=0)
        // {
        // ListNode node6 = new ListNode(e%10);
        // e/=10;
        
        // node5.next = node6;
        // if(e!=0)
        // {
        // ListNode node7 = new ListNode(e%10);
        // e/=10;
        
        // node6.next = node7;
        // }}}}







        // }
        // }

         

        return node1;

*/




    // int sum = 0;
    // int digit = 0;
    int place = 0;
int val = 0, val2 = 0;

ListNode dummy = new ListNode(0); //dummy node for the code
ListNode current = dummy;
int carry =0;

    // ListNode sum = new ListNode();
    ListNode digit = new ListNode();
      int temp = 0;

    while(l1!=null || l2!=null)
    {

        //every round going tens, hundreds, thousands etc.

         int x = (l1 != null) ? l1.val : 0;  // If l1 is null, use 0
        int y = (l2 != null) ? l2.val : 0;  // If l2 is null, use 0




        int sum = carry+x+y;

        carry = sum/10;
        current.next = new ListNode(sum%10);//create new node with the digit
        current = current.next; //move to the next node

        if(l1!=null)
        l1 = l1.next;

        if(l2!=null)
        l2 = l2.next;


    }
if(carry>0)
current.next = new ListNode(carry);

return dummy.next;



//             digit.val = l1.val;
//             val2 = digit.val;

//             digit.val= l2.val;
//             val2 +=digit.val;
//             place*=10;
//             if(val2 > 9)
//             {
//                 carry = val2 - 9;
//                 val2 = 9;
//             }

//             val = sum.val;
//             val+=digit.val;
//             val*=10;
//             val+= carry*place;
//             ListNode node = new ListNode(val);
//             sum.next = node;

        
// l1 = l1.next;
// l2 = l2.next;
    
//     }




// return sum;

    }
}