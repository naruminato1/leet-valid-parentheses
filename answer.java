
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode ans=new ListNode();
        ListNode st=ans;
        ans.val=0;
        ans.next=null;
        while(temp1 !=null && temp2 !=null){
           int v=temp1.val+temp2.val;
           int c=0;
            if(v>=10)
            {
                c=v/10;
                v=v%10;
            }
            ans.val=ans.val+v;
            if(ans.val>=10){
              c+=ans.val/10;
              ans.val=ans.val%10;   
            }

            ListNode x=new ListNode();
            ans.next=x;
            ans=ans.next;
            ans.val=c;
        
            
           temp1=temp1.next;
           temp2=temp2.next;  
        }
        while(temp1!=null){
          int v=temp1.val;
          int c=0;
            ans.val=ans.val+v;
            if(ans.val>=10){
              c=ans.val/10;
              ans.val=ans.val%10;   
            }
            ListNode x=new ListNode();
            ans.next=x;
            ans=ans.next;
            ans.val=c;          
           temp1=temp1.next;  
        }
        while(temp2!=null){
          int v=temp2.val;
          int c=0;
            ans.val=ans.val+v;
            if(ans.val>=10){
              c=ans.val/10;
              ans.val=ans.val%10;   
            }
            ListNode x=new ListNode();
            ans.next=x;
            ans=ans.next;
            ans.val=c;          
           temp2=temp2.next;  
        }



        if(ans.val==0)
        {ListNode temp=st;
        while(temp.next!=ans)
         temp=temp.next;
        temp.next=null;}
    return st;
    }
}
