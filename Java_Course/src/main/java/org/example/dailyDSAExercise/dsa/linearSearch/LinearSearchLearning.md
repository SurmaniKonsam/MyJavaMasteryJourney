## Linear Search
```
Visit every element exactly once and keep updating an answer based on a condition.
Time complexity is O(1) -> one time that's the key only one time.

Every linear search problem is secretly this:

**Pattern:**
answer = initialValue

for(each element){
    
    if(condition){
        update answer
    }
}
```

## Findings

### Linear Search Optimization

#### Tried deducing binary search with linear search.

```Java
/*the very logic or template of binary search can be applied here,
        if the array is sorted.
*/

//Binary Partition + Linear Scan -> my optimized theory
public static int whileLogic(int target,int low, int high, int ...arr){
    while(low<=high){
        if(arr[low]==target){
            return low;
        }
        low++;
    }
    return -1;
}

public static int checkTheTargetElement(int target,int ...arr){
    int low = 0;
    int high = arr.length-1;
    int mid = low + (high-low)/2;
    if(arr[mid]==target){
        return mid;
    }else if(arr[mid]>target){
        high = mid-1;
        return whileLogic(target,low,high,arr);
    }else{
        low = mid+1;
        return whileLogic(target,low,high,arr);
    }

}

```