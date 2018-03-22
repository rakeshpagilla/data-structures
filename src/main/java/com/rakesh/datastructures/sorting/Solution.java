package com.rakesh.datastructures.sorting;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public ArrayList<Integer> repeatedNumber( List<Integer> a) {

        if(a.size() ==0)
            return null;

        ArrayList<Integer> toReturn = new ArrayList<Integer>();
        for(int i=0; i < a.size() ; i++){
            if(a.get(a.get(i)-1) > 0){
                a.add(a.get(a.get(i)-1) , -a.get(a.get(i)-1));
            }else{
                toReturn.add(a.get(i));
            }
        }
        
        int j =0;
        while(j < a.size()){
            if(a.get(j) > 0){
                toReturn.add(a.get(j));
                return toReturn;
            }
            j++;
        }
        return toReturn;
    }
}
