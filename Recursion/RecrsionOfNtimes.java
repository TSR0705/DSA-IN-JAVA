
// Iteration Example: Print "Tanmay" 5 times using a loop
// public class IterationExample {
//     public static void main(String[] args) {
        // Loop runs 5 times
//         for (int i = 0; i < 5; i++) {
            // Each time, it simply calls the function name()
//             name();
//         }
//     }

//     public static void name() {
        // This method just prints "Tanmay"
//         System.out.println("Tanmay");
//     }
// }

/*
👉 Explanation:
- The 'for' loop controls how many times the method is executed.
- The method 'name()' itself does NOT call itself.
- This is called ITERATION because repetition is handled by the loop.
*/






// Example: Printing "Tanmay" 5 times using recursion
public class RecrsionOfNtimes {

    // Recursive method that prints "Tanmay" 'count' times
    public static void name(int count) {
        
        // 1️⃣ Base Condition (Stopping Rule)
        // Every recursion needs a base condition, otherwise it will call itself forever
        // Here, when count becomes 0, we stop the recursion.
        if (count == 0) {
            return; // exit the current function call
        }

        // 2️⃣ Work to be done in the current call
        // Print "Tanmay"
        System.out.println("Tanmay");

        // 3️⃣ Recursive Call
        // Call the same method again, but with (count - 1).
        // This reduces the problem size → moving closer to the base condition.
        name(count - 1);

        /*
           🔎 Behind the scenes (How it works in STACK MEMORY):

           Suppose main() calls name(5):
           → name(5) prints "Tanmay" → calls name(4)
           → name(4) prints "Tanmay" → calls name(3)
           → name(3) prints "Tanmay" → calls name(2)
           → name(2) prints "Tanmay" → calls name(1)
           → name(1) prints "Tanmay" → calls name(0)
           → name(0) meets base condition → returns without printing.

           ⚡ Execution order (top to bottom stack expansion):
           main() → name(5) → name(4) → name(3) → name(2) → name(1) → name(0)

           ⚡ Return order (stack unwinding):
           name(0) returns → name(1) returns → name(2) returns → name(3) returns → name(4) returns → name(5) returns → back to main()

           ✅ This is why recursion always needs a BASE CONDITION, otherwise stack overflow will occur.
        */
    }

    public static void main(String[] args) {
        // Start recursion with count = 5
        // This means: print "Tanmay" 5 times
        name(5);
    }
}

/*
📝 Key Takeaways about Recursion:

1. **Recursion = Function calling itself.**
2. **Base Condition** is mandatory to stop recursion.
3. Each recursive call is stored in a "stack frame" in memory.
   - Think of it like a pile of books: the last call must finish first (LIFO).
4. Recursion is powerful for problems that can be broken into smaller sub-problems 
   (factorial, Fibonacci, tree traversal, etc.).
5. But recursion is usually less memory-efficient than loops because of the call stack.

⚡ In this example:
- Iteration (loop) could also do the same thing easily.
- But recursion shows *how the same task can be achieved by reducing the problem size step by step*.
*/


/*
👉 Explanation:
- No loop is used here.
- Instead, the method calls itself until a stopping condition is reached.
- Each function call is stored in the call stack.
- Base condition (count == 0) ensures recursion stops, preventing infinite calls.
- This is RECURSION because repetition is handled by the method itself.
*/