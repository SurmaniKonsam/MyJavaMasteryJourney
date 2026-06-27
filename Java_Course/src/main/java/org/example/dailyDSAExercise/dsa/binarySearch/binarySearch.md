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
```

### Mid Index Formula
```Java
 int mid = low + (high - low) / 2;
 //Also, mid is dynamic, it will 
 //always change inside the loop.
```

### Tricks

#### Core essence
```text
1. Target
2. High
3. Low
4. Mid
5. Preserve the answer
```

#### Firs Occurrence
```java
/*
-> For First occurrence.
-> first occurrence, means ascending order
-> fetch and preserve the answer when mid-index value matches the target
-> main key to remember is preserving the fetched value.

//This is the template.
while(low<=high){
    //answer
        }
return answer;
 */

void sample(){
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            answer = mid;      
            high = mid - 1; 
        }
        else if (target < arr[mid]) {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }
}
```

### Lower Bound Pattern.
```textmate
Found valid?

↓

Yes

↓

Save answer

↓

Search Left
```

