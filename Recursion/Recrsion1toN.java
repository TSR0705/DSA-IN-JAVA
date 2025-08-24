import java.util.Scanner;

public class Recrsion1toN {

    // Recursive method to print numbers from 1 to 'count'
    public static void number(int count) {
        
        // 1️⃣ Base Condition
        // When count == 0, we stop the recursion.
        // This prevents infinite calls and starts the unwinding phase.
        if (count == 0) return;
        
        // 2️⃣ Recursive Call (smaller problem)
        // First, call the function with (count - 1).
        // This will keep going deeper until count reaches 0.
        number(count - 1);
        
        // 3️⃣ Work after recursion (on the way back)
        // Once the recursion starts returning (unwinding),
        // we print the current value of 'count'.
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter how many numbers you want to print: ");
        int n = sc.nextInt();
     
        // Start recursion with 'n'
        number(n);

        sc.close();
    }
}

/*
📝 Explanation (Step-by-Step Execution):

Suppose user enters: n = 5

👉 Function Calls (stack expansion):
main() → number(5)
             → number(4)
                   → number(3)
                         → number(2)
                               → number(1)
                                     → number(0)  <-- base condition reached, stop here

👉 Now stack starts UNWINDING (LIFO order):
- number(0) returns (nothing printed)
- number(1) continues → prints 1
- number(2) continues → prints 2
- number(3) continues → prints 3
- number(4) continues → prints 4
- number(5) continues → prints 5

⚡ Output:
1
2
3
4
5

✅ Why does this print 1 to N in order?
- Because we first go all the way DOWN (recursive calls),
- And only on the way BACK (unwinding), we print the numbers.
- This ensures 1 is printed first, and N is printed last.

---

📌 Key Learnings About Recursion Here:
1. Recursion works in two phases:
   - **Expansion Phase** → function keeps calling itself until base case.
   - **Unwinding Phase** → functions start returning back in reverse order.

2. Placement of the "work" (printing) matters:
   - If you print **before** the recursive call → prints N to 1 (reverse order).
   - If you print **after** the recursive call → prints 1 to N (in order).

3. The call stack is like a stack of plates (LIFO):
   - The last function called (number(0)) returns first,
     then number(1), then number(2), etc.

*/


/*
====================================================
📝NOTES: Print 1 → N using Recursion
====================================================

👉 Problem Statement:
- Print numbers linearly from 1 up to N using recursion.

👉 How it Works:
1. Base Condition:
   - If count == 0 → stop recursion.
   - This prevents infinite calls and starts the return (unwinding).

2. Recursive Call:
   - We first call number(count - 1).
   - This goes deeper into recursion until count becomes 0.

3. Work After Recursion:
   - On the way back (unwinding), we print the number.
   - Because printing is AFTER recursion, 
     smaller numbers print first → 1, 2, …, N.

⚡ Example (n = 5):

Expansion Phase (going deeper):
  number(5) → number(4) → number(3) → number(2) → number(1) → number(0)

Unwinding Phase (coming back):
  number(0) returns → number(1) prints 1
                    → number(2) prints 2
                    → number(3) prints 3
                    → number(4) prints 4
                    → number(5) prints 5

✅ Output:
1
2
3
4
5

----------------------------------------------------
⏱ Time Complexity:
- Each recursive call does O(1) work (just print).
- There are N calls.
- ✅ O(N)

💾 Space Complexity:
- Each recursive call is stored in the call stack.
- Depth of recursion = N.
- ✅ O(N)

----------------------------------------------------
🔗 DSA Connections:
- Recursion always has 2 phases:
  1. Expansion Phase (going down)
  2. Unwinding Phase (coming back)

- Placement of "work" defines the order:
  - Print BEFORE recursion → N to 1
  - Print AFTER recursion  → 1 to N

- This pattern is used in:
  - Tree traversals (Inorder, Preorder, Postorder)
  - Backtracking (decisions before/after recursion)
  - Divide & Conquer algorithms

----------------------------------------------------
⚖️ Iteration vs Recursion:
- Iteration (loop): O(N) time, O(1) space → more memory efficient.
- Recursion: O(N) time, O(N) space → less efficient but elegant, 
  forms the backbone of many advanced DSA problems.

====================================================
✅ Final Takeaway:
- Base condition is mandatory to avoid infinite recursion.
- Printing AFTER recursion ensures ascending order (1 → N).
- Recursion teaches you how problems break into smaller subproblems,
  which is key in mastering Data Structures & Algorithms.
====================================================
*/
