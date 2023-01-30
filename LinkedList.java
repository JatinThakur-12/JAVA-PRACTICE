public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        //Step-1 create a new node
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        //Step -2 newNode.next=head
        newNode.next=head;
        // Step -3 Changing head
        head=newNode;
        size++;
    }
    public void addLast(int data){
        //step-1 create new node
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        //step-2 tail.next=newNode
        tail.next=newNode;
        //change tail
        tail=newNode;
        size++;

    }
    public void print(){
        // //Optional-if you wanted to print customized message
        // if(head==null){
        //     System.out.println("Linked list is empty");
        //     return;
        // }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx==0){
            //we call addfirst because in this method we are not handling head or tail
            addFirst(data);
        }
        Node newNode= new Node(data);
        Node temp=head;
        int i=0;
        while(i<idx-1){//take the temp to the index previous to adding index
            temp=temp.next;
            i++;
        }
        //at this point i=idx-1
        newNode.next=temp.next;
        temp.next=newNode;
        size++;

    }

    public int removeFirst(){
        if(size==0){
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        //we need to reach the node previous to tail node and set its next=null
        Node prev=head;
        // for(int i=0;i<size-2;i++){
        //     prev=prev.next;
        // }
        while(prev.next.next!=null){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public int itrSearch(int key){
        if(head==null){
            return -1;
        }
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        //base case
        if(head==null){
            return -1;
        }
        else if(head.data==key){
            return 0;
        }
        //recursive call
        int idx= helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        //idx+1 is done because for every 
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;//at this point curr=null; prev=tail of linkedlist
    }

    public void deleteNthfromEnd(int n){
        //calculate size if not calculated
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }//size calculated here
        if(sz==1&&n==1){
            head=tail=null;
            return;
        }
        else if(n==sz){//nth node from last is 0th from starting 
            head=head.next;//remove first
            return;
        }
        //previous=sz-n;
        int i=1;//because firsr node is 1
        //index of previous
        int itofind=sz-n; 
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        if(n==1){
            tail=prev;
        }
        prev.next=prev.next.next;//breaking link of nth node from end 
    }
    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();
        ll.add(3,9);
        ll.print();
        ll.deleteNthfromEnd(1);
        ll.print();
        System.out.println(ll);
        
    }

} 
