## Sliding Window.

```
length cannot be < 1 this is gold.
```

### Invariants
````
Expand:
    sum < target -> add more elements.
Shrink:
    sum >= target -> try to reduce window.

Execution Order.
- Measure it -> measure the length
- Update minimumLength -> since we are talking about minimum length here.
- Then shrink

But why this order?
````

### Execution flow

````
window check
↓
Found a valid window
↓
"Take a photo" 📸
(length calculation)
↓
Store answer
↓
Now try to make it smaller
↓
Still valid?
    Take another photo 📸
    Store again
↓
Continue

Conclusion:
- Preserve first
- Then modify
````

