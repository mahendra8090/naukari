package com.example.administrator.nauraki;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class GetArray {

    public GetArray() {
           }
           public ArrayList<ArrayList<String>> getdownloadurl(String s) throws JSONException {
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        ArrayList<String> s1=new ArrayList<>();
        ArrayList<String> s2=new ArrayList<>();
        ArrayList<String> s3=new ArrayList<>();

               JSONObject jsonObject=new JSONObject(s);
               String nameofexam=jsonObject.getString("name");
               s1.add(nameofexam);
               JSONArray jsonArray=jsonObject.getJSONArray("papers");
               for(int i=0;i<jsonArray.length();i++){
                   JSONObject jsonObject1=jsonArray.getJSONObject(i);
                   String nameofpaper=jsonObject1.getString("key");
                   s2.add(nameofexam);
                   String url=jsonObject1.getString("url");
                   s3.add(url);
               }
st.add(s1);
               st.add(s2);
               st.add(s3);


        return st;
           }
    public ArrayList<String> getdownload_list() {
        ArrayList<String> Paribhasalist=new ArrayList<>();
        Paribhasalist.add("https://firebasestorage.googleapis.com/v0/b/fir-storage-ef11b.appspot.com/o/ssc%20papers%2Fjune%202018.pdf?alt=media&token=7391d5e3-d22d-469e-8d95-d0a0caf1ac97");
        Paribhasalist.add("https://firebasestorage.googleapis.com/v0/b/fir-storage-ef11b.appspot.com/o/ssc%20papers%2Fjune%202018%202.pdf?alt=media&token=650a6935-fc1d-4abc-9f1e-7913cc35fc84");
        Paribhasalist.add("https://firebasestorage.googleapis.com/v0/b/fir-storage-ef11b.appspot.com/o/ssc%20papers%2F2103.pdf?alt=media&token=4d7e71f4-aed2-4af7-83db-b0bec5361bc8");
        Paribhasalist.add("https://firebasestorage.googleapis.com/v0/b/fir-storage-ef11b.appspot.com/o/ssc%20papers%2F2018.pdf?alt=media&token=67b79e8b-def9-4691-8447-953975deccd0");

        return Paribhasalist;
    }
    public ArrayList<String> getExamname_list() {
        ArrayList<String> Paribhasalist=new ArrayList<>();
        Paribhasalist.add("SSC");
        Paribhasalist.add("UPP");
        Paribhasalist.add("UP SI");
        Paribhasalist.add("JUNIOR ASSISTENT");
        Paribhasalist.add("LEKHPAL");
        Paribhasalist.add("VDO");
        Paribhasalist.add("STENOGRAPHER");

        return Paribhasalist;
    }
    public ArrayList<String> getParibhasa_list() {
        ArrayList<String> Paribhasalist=new ArrayList<>();
        Paribhasalist.add("संज्ञा");
        Paribhasalist.add("सर्वनाम");
        Paribhasalist.add("संज्ञा");
        Paribhasalist.add("क्रिया");
        Paribhasalist.add("विशेषण");
        Paribhasalist.add("छंद");
        Paribhasalist.add("रोला");
        Paribhasalist.add("सोरठा");
        Paribhasalist.add("चौपाई");
        Paribhasalist.add("रस");
        return Paribhasalist;
        }

    public ArrayList<String> getMathlist() {
        ArrayList<String> mathtopics=new ArrayList<>();
        mathtopics.add("Average Questions");
        mathtopics.add("Speed time distance");
        mathtopics.add("Pipe and Cistern");
        mathtopics.add("Time and Work");
        mathtopics.add("Partnership");
        mathtopics.add("Percentage");
        mathtopics.add("Ratio and Proportion");
        mathtopics.add("Boat and Stream");
        mathtopics.add("Permutation and combination");
        mathtopics.add("Profit and loss");
        mathtopics.add("Simplification");
        mathtopics.add("Approximation");
        mathtopics.add("Number Series");
        mathtopics.add("Mensuration");
        mathtopics.add("Mixture and Alligation");
        mathtopics.add("Age Questions");
        return mathtopics;
         }

    public ArrayList<String> getGslist() {
        ArrayList<String> gstopics=new ArrayList<>();
        gstopics.add("Geography");
        gstopics.add("History");
        gstopics.add("General Biology");
        gstopics.add("Awareness");
        gstopics.add("Sports");
        gstopics.add("Book and Auther");
        gstopics.add("Indian Economy");
        gstopics.add("Govt policy");
        gstopics.add("Business and Economy");






        return gstopics;
         }

        public ArrayList<String> getKavi_name() {
        ArrayList<String> kaviname=new ArrayList<>();
        kaviname.add("जयशंकर प्रसाद");
        kaviname.add("महादेवी वर्मा");
        kaviname.add("मुंशी प्रेमचंद");
        kaviname.add("मैथिलीशरण गुप्त");
        kaviname.add("तुलसीदास");
        kaviname.add("सूर्यकांत त्रिपाठी");





        return kaviname;
         }

        public ArrayList<String> getReasoninglist() {
        ArrayList<String> reasoning_list=new ArrayList<>();
        reasoning_list.add("Blood Realation");
        reasoning_list.add("Coding Decoding");
        reasoning_list.add("Direction Sense");
        reasoning_list.add("Inequalities");
        reasoning_list.add("Order and Ranking");
        reasoning_list.add("Alphanumeric");

        return reasoning_list;

         }
         }
