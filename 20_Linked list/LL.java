public class LL{

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size ++;
    }

    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i =1;i<index;i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        };
        size --;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size --;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        size --;

        return val;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;
        
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }


    //questions
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    //83. removes duplicates from sorted list
    public void duplicates(){
        Node node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node =node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //21. merge two sorted lists
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }
    //finding the length of cycle
    public int lengthCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               //calculate the length
               Node temp = slow;
               int length = 0;
               do{
                     temp = temp.next;
                     length++;
               }while(temp != slow);
               return length;
            }
        }
        return 0;
    }
    //202 . Happy Number
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);
        if(slow == 1){
            return true;
        }
        return false;
    }
    private int findSquare(int number){
        int ans = 0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
    //876. Middle of the Linked List
    //https://leetcode.com/problems/middle-of-the-linked-list/
     public ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }
    
    public void bubbleSort(){
        bubbleSort(size-1, 0);
    }
    private void bubbleSort(int row, int col){
        if(row == 0){
            return;
        }

        if(col<row){
            Node first = get(col);
            Node second = get(col+1);

            if(first.value > second.value){
                //swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else{
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);

        }else{
            bubbleSort(row-1, 0);
        }

    }

    //recursion reverse
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    //in place reversal of linked list
    //206. Reverse Linked List
    public ListNode reverse(ListNode head) {
        if(size<2){
            return head;
        }

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }
    //92. Reverse Linked List II
    //google, microsoft, facebook : https://leetcode.com/problems/reverse-linked-list-ii/description/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        //skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for(int i=0;current != null && i<left-1;i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current; 

        //reverse between left and right
        ListNode next = current.next;
        for(int i=0;current != null && i<right-left+1;i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;
        return head;

    }
    //linkedin, google, facebook, microsoft, amazon, apple
    //234. Palindrome Linked List
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headsecond = reverse(mid);
        ListNode rereverseHead = headsecond;

        //comaree both halves
        while(head != null && headsecond != null){
            if(head.val != headsecond.val){
                break;
            }
            head = head.next;
            headsecond = headsecond.next;
        }
        reverse(rereverseHead);
        if(head == null || headsecond == null){
            return true;
        }
        return false;
    }

    //143. Reorder List
    //Google, Facebook
     public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;

        //rearrange
        while(hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //next of tail to null
        if(hf != null){
            hf.next = null;
        }
        
    }


    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        // LL ans = LL.merge(first, second);
        // ans.display();

        LL list = new LL();
        for(int i=7; i>0; i--){
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();

        
    }
}