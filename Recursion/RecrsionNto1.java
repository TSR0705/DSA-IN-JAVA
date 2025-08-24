
/*
====================================================
📝 Understanding Recursion: Print Numbers (N→1 vs 1→N)
====================================================

👉 Base Condition (common to both):
- Every recursion must have a stopping condition.
- Here, when count == 0 → recursion stops.
- Without this, infinite recursion would cause a StackOverflowError.

----------------------------------------------------
👉 Case 1: Printing N → 1 (Decreasing Order)
----------------------------------------------------
Code logic:
    if(count == 0) return;
    System.out.println(count);   // work first
    number(count - 1);           // recursive call

- Here, printing is done BEFORE recursion.
- That means as soon as function is called, it prints the current number.
- Then it goes deeper until 0 is reached.

⚡ Dry Run (n = 5):
    number(5) → prints 5 → number(4)
    number(4) → prints 4 → number(3)
    number(3) → prints 3 → number(2)
    number(2) → prints 2 → number(1)
    number(1) → prints 1 → number(0) stops

✅ Output:
5 4 3 2 1

📌 Observation:
- Work happens in the **expansion phase**.
- This is NOT backtracking — it’s just recursion expanding downwards.

----------------------------------------------------
👉 Case 2: Printing 1 → N (Increasing Order)
----------------------------------------------------
Code logic:
    if(count == 0) return;
    number(count - 1);           // recursive call first
    System.out.println(count);   // work after recursion

- Here, recursion first goes all the way down to 0.
- Nothing is printed until we start returning.
- Printing happens while coming back (unwinding).

⚡ Dry Run (n = 5):
    number(5) → number(4) → number(3) → number(2) → number(1) → number(0) stops
    Returning back:
        number(1) prints 1
        number(2) prints 2
        number(3) prints 3
        number(4) prints 4
        number(5) prints 5

✅ Output:
1 2 3 4 5

📌 Observation:
- Work happens in the **unwinding phase**.
- This is a classic example of **backtracking** 
  because we do the task only while coming back.

----------------------------------------------------
👉 Complexity Analysis (common to both):
- Each call does O(1) work → total O(N) time.
- Recursion depth = N → stack size O(N).
- Iteration (loops) can solve the same with O(1) space.

----------------------------------------------------
👉 DSA Connections:
- **Work before recursion** → like Preorder traversal (root before children).
- **Work after recursion** → like Postorder traversal (children before root).
- Backtracking problems (N-Queens, Sudoku, Rat in a Maze) 
  often rely on "do something while returning" → same as Case 2.

----------------------------------------------------
✅ Final Takeaway:
- N→1: Work before recursion → direct recursion, no backtracking.
- 1→N: Work after recursion → action on unwind → backtracking.
- Both run in O(N) time and O(N) space.
- The difference in output order depends only on 
  **whether you place work before or after the recursive call**.
====================================================
*/


import java.util.Scanner;

public class RecrsionNto1 {

    // Recursive function to print numbers from N down to 1
    public static void number(int count) {
        
        // 1️⃣ Base Condition
        // When count becomes 0 → stop recursion.
        // This prevents infinite recursion.
        if (count == 0) return;

        // 2️⃣ Work (Do something at this level of recursion)
        // Printing is done BEFORE the recursive call,
        // so numbers will print in decreasing order (N → 1).
        System.out.println(count);

        // 3️⃣ Recursive Call (smaller subproblem)
        // Function calls itself with count - 1.
        // This reduces the problem size each time.
        number(count - 1);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for 'n'
        System.out.print("Enter how many numbers you want to print: ");
        int n = sc.nextInt();
     
        // Start recursion with n
        number(n);

        sc.close();
    }
}



        /*
           🔎 Dry Run Example (if user enters n = 5):

           number(5):
             prints 5
             calls number(4)
           number(4):
             prints 4
             calls number(3)
           number(3):
             prints 3
             calls number(2)
           number(2):
             prints 2
             calls number(1)
           number(1):
             prints 1
             calls number(0)
           number(0):
             base condition met → return

           ✅ Output:
           5
           4
           3
           2
           1

           ⚡ KEY IDEA:
           - Work happens BEFORE recursive call → N → 1 order
           - If we placed print AFTER recursive call, output would be 1 → N
        */



/*
====================================================
📝NOTES (In-Depth Understanding)
====================================================

👉 Why does this print N → 1?
- Because "print" happens BEFORE the recursive call.
- So each level prints immediately, then goes deeper.

👉 Time Complexity:
- Each call does O(1) work (just printing).
- There are 'n' recursive calls.
- ✅ Time Complexity = O(N)

👉 Space Complexity:
- Each recursive call is stored in the function call stack.
- For input 'n', recursion depth = n.
- ✅ Space Complexity = O(N)
- ⚠️ Iteration (loop) would use only O(1) space.

👉 Recursion Phases:
1. Expansion Phase (going down):
   - number(n) → number(n-1) → ... → number(0)
2. Unwinding Phase (returning back):
   - Functions return one by one until we reach main()

👉 DSA Connections:
- Placement of "work" (before/after recursion) is the same idea used in:
  - Tree traversals (Preorder, Inorder, Postorder)
  - Backtracking (decide before/after recursion)
  - Divide & Conquer algorithms

👉 Trade-off (Iteration vs Recursion):
- Iteration: O(N) time, O(1) space (memory efficient).
- Recursion: O(N) time, O(N) space (easier to write, closer to DSA logic).

====================================================
✅ Final Takeaway:
- Base condition is MUST in recursion (to avoid infinite loop).
- Printing before recursion → N to 1
- Printing after recursion → 1 to N
- Recursion is elegant, but uses extra stack space.
====================================================
*/


