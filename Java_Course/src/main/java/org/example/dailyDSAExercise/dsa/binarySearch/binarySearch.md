## Binary Search Algorithm

```
Binary Search:

Algorithm
1. Check middle -> always algorithm alwasy start with checking the mid element.
2. Check if the target element is greater than or smaller than middle.
3. If{
        target is greater than the middle -> move right -> low = mid -1;
        target is less than the middle -> move left -> high = mid + 1;
    }
4. mid -> is defined via high and low index, computed inside the target and mid value 
if comparing block.


That's the entire algorithm.
```
```Java
// Main template of binary search
public int binaryTemplate(int target, int ...arr){
    /*
    int low = 0;
    int high = arr.length-1;
    while(low<=high){
        int mid = low + (high-low)/2;
    }
    return -1;
     */
}
```

### Mid Index Formula
```Java
 int mid = low + (high - low) / 2;
 //Also, mid is dynamic, it will 
 //always change inside the loop.
```

### Confusion
```text
Lower Bound:
-> The element to be found must be either equal or just greater than the target element.
-> Means, if equal check if there is element 

Upper Bound
-> The first element that is strictly greater than the target.
```

### Quick Differences/Tricks
```textmate
Lower bound and upper bound have only one logic difference, insertion sort

____________
Lower bound,|
------------ 
-> We are considering inclusive of arr[mid]>=target, that is if equal return
the mid index altogether if no other element greater than the mid value is found.

____________
Upper Bound |
-------------
-> We are checking exclusively, that is check only if target>arr[mid], not equal to but
only when the target is greater than the arr[mid]
_______________
Coding example |
----------------
lower Bound -> if(arr[mid]>=target){
    high = mid-1;
}
/*
Even insertion sort, is same as the lower bound. 
check if the target is found, if its found then return the index, else, check if its value
is less than the arr[mid], if it is get the mid index, this is where the element
will be inserted.
*/

upper Bound -> if(arr[mid]>target){
    high = mid -1;
}

```

### Most Important Finding -> right/left movement.

```textmate
1. Move right -> low -> till -> high.
        Now, low can be:
                1 -> low = mid;
                2 -> low = mid+1;
                Both depends on the logic and the question requirement.
------------------------------------------------------------------------>               
2. Move left -> high -> till -> low.
        Now, high can be:
                1 -> high = mid;
                2 -> high = mid-1;
                Both depends on the logic and the question requirement.
```

