package LinkedList;
import java.util.*;

public class ll_palindrom {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public boolean ispalindrome(Node head){
        return pali(head);
    }

    private boolean pali(Node head){
        List<Integer> arr = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            arr.add(temp.data);
            temp = temp.next;
        }
        return pal(arr);
    }

    private boolean pal(List<Integer> arr){
        int left = 0;
        int right = arr.size()-1;

        while(left < right){
            if(arr.get(left) != arr.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ll_palindrom checker = new ll_palindrom();
        
        // Test case 1: Palindrome list 1->2->3->2->1
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(1);
        
        System.out.println("Test 1 - List: 1->2->3->2->1");
        System.out.println("Is palindrome: " + checker.ispalindrome(head1));
        
        // Test case 2: Not a palindrome 1->2->3->4->5
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        
        System.out.println("\nTest 2 - List: 1->2->3->4->5");
        System.out.println("Is palindrome: " + checker.ispalindrome(head2));
        
        // Test case 3: Single node (always palindrome)
        Node head3 = new Node(1);
        
        System.out.println("\nTest 3 - List: 1");
        System.out.println("Is palindrome: " + checker.ispalindrome(head3));
        
        // Test case 4: Even length palindrome 1->2->2->1
        Node head4 = new Node(1);
        head4.next = new Node(2);
        head4.next.next = new Node(2);
        head4.next.next.next = new Node(1);
        
        System.out.println("\nTest 4 - List: 1->2->2->1");
        System.out.println("Is palindrome: " + checker.ispalindrome(head4));
    }
}