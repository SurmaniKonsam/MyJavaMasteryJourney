package TwentyLPAPackage.Collection;

import java.util.*;

public class ArrayArraylist {
    //arraylist comes now
    static void printMaxArraylistTuts(List<Integer> arr){
        //size is fixed to 10 I believe internally but if we increase, maybe it gets increased by 3/4.
        int max = 0;
        for(Integer a: arr){
            max = Math.max(max,a);
        }
        System.out.println("Max value : "+max);
    }

    //removing duplicate using Set.
    //Set takes only unique elements.
    static void removeDuplicateSort(){
        int[] arr = new int[]{2, 2, 2, 5};
        //or int[] arr = {4, 2, 7, 2, 5, 4, 8};
        //use swap with max.
        //compare with extreme left to right moving from right to left.
        //use swap inside if condition.
        //ArrayList<Integer> unique = new ArrayList<>();
        Set<Integer> unique = new HashSet<>();

        //persist the element inside arraylist for using remove function
        for(int a: arr){
            unique.add(a);
        };

        List<Integer> lst = new ArrayList<>(unique);
        for(int a : lst){
            System.out.println(a);
        }
    }

    //remove duplicate via arraylist
    static void removeDuplicateUsedArraylist(int[] arrays){
        ArrayList<Integer> arrLst = new ArrayList<>();
        for(int a: arrays){
            arrLst.add(a);
        }

        for(int i = 0;i<arrLst.size();i++){
            for(int j = i+1;j< arrLst.size();j++){
                //i+1, because we are comparing from the adjacent element.
                if(Objects.equals(arrLst.get(i),arrLst.get(j))){
                    arrLst.remove(j);
                    j--;
                    //also j is decremented, so that the iteration could happen back from the duplicate index
                    //after removal, so that the shifted element won't get miss.
                }
            }
        }
        for(int a: arrLst){
            System.out.print(a+"|");
        }
    }

    //remove duplicate using pointers
    static void uniqueInPlaceArrayPointer(int[] arr){
        int uniqueIndex = 0;
        for(int i = 0;i<arr.length;i++){
            boolean findDup = false;
            //unique element finder.
            //if no element found, add the element up in the unique domain.
            for(int j = 0;j< uniqueIndex;j++){
                if(arr[i] == arr[j]){
                    findDup = true;
                    break;
                }
            }
            if(!findDup){
                //arr[i] => are the unique element.
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
        for(int i = 0;i<uniqueIndex;i++){
            System.out.print(arr[i]+"|");
        }
    }

    //shift zero to the given position from array
    static void shiftZero(int[] arr, int position){
        int zerothIndex = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0){
                System.out.println("i + "+i);
                zerothIndex = i;
                break;
            }
        }
        System.out.println("zerothIndex : "+zerothIndex);
        //just swap it now.
        int temp = arr[zerothIndex];
        arr[zerothIndex] = arr[position];
        arr[position] = temp;
        for(int a: arr){
            System.out.print(a+"|");
        }
    }

    //swap array used for reverse.
    static void swapArray(int[]  numbers){
        int temp;
        int midIndex = numbers.length/2;
        int size = numbers.length;
        if(numbers.length%2 == 0){
            midIndex = midIndex - 1;
        }
        for(int i = 0;i<midIndex;i++){
            temp = numbers[i];
            numbers[i] = numbers[(size-1) - i];
            numbers[(size-1)-i] = temp;
        }

        for(int a : numbers){
            System.out.print(a+"|");
        }
    }

    //array 2d test
    public static void main(String[] args) {
        //int[][] array2d = new int[row][column];
        int[][] arr2d = {
                {1, 2, 2},
                {2, 3, 4},
                {12, 3, 4}
        };
        //System.out.println(arr2d[0][0]);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(23);
        numbers.add(232);
        numbers.add(999);
        numbers.add(100);
        //printMaxArraylistTuts(numbers);

        int[] arr = {1,2,2,0,4,4,4,5,6,4,9,11,11,12};

        System.out.println();

        //removeDuplicatesPointerConcept();
        //swapArray(arr);
        //removeDuplicateUsedArraylist(arr);
        System.out.println();
        //uniqueInPlaceArrayPointer(arr);
        System.out.println();
        shiftZero(arr,11);
    }
}
