## Binary Search Algorithm
```
Binary Search:

What is monotonic movement?
Once it changes...
it never changes back.
-> Means if true changes to false, it never changes back
to true again.

Non-monotonic state
true -> false -> back to true.
Its not monotonic.

1. Check middle
2. Check if the target element is greater than or smaller than middle.

Pattern:
5 steps.

1. Is the search space ordered?

        ↓

2. Can I eliminate half?

        ↓

3. Maintain the invariant

        ↓

4. Shrink the window

        ↓

5. Stop when answer is found or window collapses

That's the entire algorithm.