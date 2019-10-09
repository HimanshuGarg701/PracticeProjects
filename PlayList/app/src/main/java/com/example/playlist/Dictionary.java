package com.example.playlist;

import android.util.Log;

import java.util.*;
/**
 * @author Himanshu Garg
 */
public class Dictionary {
    static HashMap<String, HashMap<String, String[]>> container = new HashMap<>();
    HashMap<String, String[]> subContainer = new HashMap<>();
    static ArrayList<String> result = new ArrayList<>();
    public Dictionary(){
        // empty Constructor
    }
    public Dictionary(String keyword, DataBase i){
        subContainer.put("adjective", i.adjectives);
        subContainer.put("adverb", i.adverbs);
        subContainer.put("verb", i.verbs);
        subContainer.put("noun", i.nouns);
        subContainer.put("preposition", i.prepositions);
        subContainer.put("conjunction", i.conjuctions);
        subContainer.put("interjection", i.interjections);
        subContainer.put("pronoun", i.pronouns);
        container.put(keyword, subContainer);
    }

    public static ArrayList<String> querryDictionary(String keyword, String pos, boolean distinct){

        keyword = keyword.toLowerCase();
        ArrayList <String> answer = new ArrayList<>();
        LinkedHashSet <String> noDuplicate = new LinkedHashSet<>();
        if(container.containsKey(keyword) && keyword!=null){
            if(pos==null){
                if(!distinct){
                    for(String x : container.get(keyword).keySet()){
                        for(String i : container.get(keyword).get(x)){
                            Log.d("debug" , "there you goo");
                            if(!i.equals(""))
                                answer.add(keyword + " [" + x + "]: " + i);
                        }
                    }
                }else{
                    for(String x : container.get(keyword).keySet()){
                        for(String i : container.get(keyword).get(x)){
                            if(!i.equals("") && !noDuplicate.contains(x + i)){
                                answer.add(keyword + " [" + x + "]: " + i);
                                noDuplicate.add(x + i);
                            }
                        }
                    }
                    noDuplicate.clear();
                }
            }else{
                String[] arr = container.get(keyword).get(pos);
                if(!distinct){
                    for(String x: arr){
                        if(!x.equals(""))
                            answer.add(keyword + "[" + pos + "]: " + x);
                    }
                }
                else{
                    for(String x : arr){
                        if(!x.equals("") && !noDuplicate.contains(pos + x)){
                            answer.add(keyword + "[" + pos + "]: " + x);
                            noDuplicate.add(pos + x);
                        }
                    }
                    noDuplicate.clear();
                }
            }
        }
        if(answer.isEmpty())
            answer.add("<Not found>");
        return answer;
    }
}
