package org.example.TwentyLPAPackage.Exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class FindMaxNumber {

    //My approach
    static void maxAndNegativeValue(int[] numbers){
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(Integer nm : numbers){
            uniqueNumbers.add(nm);
        }

        List<Integer> maxNegative = new ArrayList<>();
        List<Integer> maxPositive = new ArrayList<>();


        //Instead of stream() we can use forEach directly as well.
        for(Integer in: uniqueNumbers){
            if(in<0){
                maxNegative.add(in);
            }maxPositive.add(in);
        }

        int maxNegativeValue = 0;
        int maxPositiveValue = 0;

        for(Integer maxNeg : maxNegative){
            if(maxNeg<maxNegativeValue){
                maxNegativeValue = maxNeg;
            }
        }

        for(Integer maxPos : maxPositive){
            if(maxPos>maxPositiveValue){
                maxPositiveValue = maxPos;
            }
        }

        System.out.println("Max negative value : "+maxNegativeValue+" |  max positive value : "+maxPositiveValue);
    }

    //Claude approach simple and efficient
    static void claudeMaxMin(int[] numbers){
        int maxNegative = Integer.MIN_VALUE;

        int grabNegativeValue = 0;
        int grabPositiveValue = 0;
        for(Integer nm: numbers){
            if(nm<0){
                if(nm>maxNegative){
                    grabNegativeValue = nm;
                }
            }if(nm>0){
                //grabPositiveValue = Math.max(grabPositiveValue,nm); //grabPositiveValue needs to be dynamic.
                /*
                Math.max(a,b) -> {
                    if(b>a){
                        a = b;
                    }
                    }

                 */
                //Another approach
                if(nm>grabPositiveValue){
                    grabPositiveValue = nm;
                }
            }
        }
        System.out.println("Max positive value : "+grabPositiveValue+" | max negative value : "+grabNegativeValue);
    }


    public static void main(String[] args) {
        int[] numbers = {-1,-99,-99,-99,23,0,-9,0,12,3,1,12,323,-9998989,999,9999999,431,3};
        claudeMaxMin(numbers);

    }

}
