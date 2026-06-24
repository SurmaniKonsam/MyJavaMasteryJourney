package org.example.thirtyLPAPackage.collection.ArraysArraylist;

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

    //swap using arraylist setter method.
    static void swapArraylist(ArrayList<Integer> arrList,int index1,int index2){
        int temp = arrList.get(index1);
        //to have an existing index with updated value, use set
        arrList.set(index1,arrList.get(index2));
        arrList.set(index2,temp);
        for(int alist : arrList){
            System.out.print(alist+"|");
        }
    }

    //20-03-2026/8:06PM
    static void arrayListMethods(ArrayList<Integer> arLst){
        //this is possible, because Arraylist have extended Iterable.
        for (Integer integer : arLst) {
            System.out.print(integer + "|");
        }
        System.out.println();
    }

    //adding elements in array and passing it to the list
    static void listElements(String[] nms){
        List<String> rd = Arrays.asList(nms);
        for(String r : rd){
            System.out.print(r+"|");
        }
    }

    //jarvis approach using Map.
    void frequencyLetters(String word) {
        //Until here it's clear.
        Map<Character, Integer> freq = new HashMap<>();

        /**
         * getOrDefault(key,defaultValue);
         * Returns the value mapped to the key if present,
         * otherwise returns the default value you provide.
         */
        for (char ch : word.toLowerCase().toCharArray()) {
            freq.put(ch,
                    freq.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }


    //Mine approach to repeated frequency words.

    /**
     * Few learnings to point out.
     * Keep track of the incremented variable, make sure to reset it for next outer iteration, if not
     * it will keep incrementing because of the nested loop.
     * Learn Hashmap.
     */
    void repeatedLetters(String word){
        char[] letters = word.toCharArray();
        int countWordsRepeated;
        List<String> repeated = new ArrayList<>();
        for(int i = 0;i<letters.length;i++){
            countWordsRepeated = 0;
            if(!repeated.contains(String.valueOf(letters[i]))){
                String cmp = String.valueOf(letters[i]).toLowerCase();
                for(int j = i;j<letters.length;j++){
                    if(cmp.equalsIgnoreCase(String.valueOf(letters[j]))) {
                        countWordsRepeated++;
                    }
                }
                repeated.add(cmp);
                System.out.println(letters[i]+" : "+countWordsRepeated);
            }
        }
    }

    //array 2d test
    public static void main(String[] args) {

        //Repeated Letters
        ArrayArraylist arrayArraylist = new ArrayArraylist();
        //arrayArraylist.repeatedLetters("Apple");
        arrayArraylist.frequencyLetters("Apppplllleeee");

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

        //Sorting
        Collections.sort(numbers);

        //print using iterator
        arrayListMethods(numbers);

        List<Integer> lst = Arrays.asList(1,2);
        for(Integer it : lst){
            //System.out.print(it+"|");
        }
        System.out.println();

        //asList demo
        String[] fruits = {"Sir","Mam","Junior"};
        listElements(fruits);
        //System.out.println();
        /**
         * In order for you to convert array into list, the return type of the array must be wrapper class
         * but not primitive type.
         * That's why String[] str; worked earlier when converted into list
         * but not int[] arr = {1,2};
         */
        Integer[] arr = {1,2,2,4};
        //int[] arr2 = {1,2,2,4};


        List<Integer> checkIntArr = Arrays.asList(arr);
        List<Integer> bulkUpdate = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13);
        ArrayList<Integer> swapIntegers = new ArrayList<>(bulkUpdate);
        swapArraylist(swapIntegers,0,11);

        //let's sort this out.

        System.out.println();

        //removeDuplicatesPointerConcept();
        //swapArray(arr);
        //removeDuplicateUsedArraylist(arr);
        System.out.println();
        //uniqueInPlaceArrayPointer(arr);
        System.out.println();
        //shiftZero(arr,11);

        //let's check the default size of ArrayList
        ArrayList<Integer> defAList = new ArrayList<>();
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);
        defAList.add(12);

        //System.out.println(defAList.size());
    }
}
