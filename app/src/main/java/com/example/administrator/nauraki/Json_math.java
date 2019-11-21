package com.example.administrator.nauraki;

import android.content.Context;
import android.content.res.AssetManager;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Json_math {
    ArrayList<String> st1=new ArrayList<>();
    ArrayList<String> st2=new ArrayList<>();
    ArrayList<String> st3=new ArrayList<>();
    ArrayList<String> st4=new ArrayList<>();
    ArrayList<String> st5=new ArrayList<>();
    ArrayList<String> st6=new ArrayList<>();

    ArrayList<String> st=new ArrayList<>();







ArrayList<ArrayList<String>> math=new ArrayList<>();

    public ArrayList<ArrayList<String>> getJSon1_titledata_math(Context context,String j){
        String filename=new String();
        filename=null;
        filename="averagejson.json";
switch (j){

case "9": {
    filename="profitloss.json";

    break;
}
    case "1": {
        filename="timeanddistance.json";

        break;
    }



}
    try {
        String resource = AssetJSONFile(filename, context);

        JSONArray jsonArray = new JSONArray(resource);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String s1 = jsonObject.getString("A");
            String s2 = jsonObject.getString("B");
            String s3 = jsonObject.getString("C");
            String s4 = jsonObject.getString("D");
            String s5 = jsonObject.getString("E");
            String s6 = jsonObject.getString("F");
            st1.add(s1);
            st2.add(s2);
            st3.add(s3);
            st4.add(s4);
            st5.add(s5);
            st6.add(s6);


            // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
        }
        math.add(st1);
        math.add(st2);
        math.add(st3);
        math.add(st4);
        math.add(st5);
        math.add(st6);

    } catch (IOException e) {
        e.printStackTrace();
    } catch (JSONException e) {
        e.printStackTrace();
    }





        return math;
    }

    public ArrayList<String> getJSon1_titledata_prayawachi(Context context){

        String[] strings=new String[3];
        try { String resource = AssetJSONFile("prayawachi.json",context);

      JSONArray jsonArray=new JSONArray(resource);
      for(int i=0;i<jsonArray.length();i++) {
          JSONObject jsonObject = jsonArray.getJSONObject(i);
          String s=jsonObject.getString("A");
          st.add(s);

         // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
      }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return st;
    }
    public ArrayList<ArrayList<String>> getJSon1_titledata_vilom(Context context){
        ArrayList<ArrayList<String>> st=new ArrayList<>();
ArrayList<String> st1 =new ArrayList<>();
        ArrayList<String> st2=new ArrayList<>();
        try { String resource = AssetJSONFile("vilom.json",context);

            JSONArray jsonArray=new JSONArray(resource);
            for(int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String s1=jsonObject.getString("A");
                String s2=jsonObject.getString("B");
                st1.add(s1);
                st2.add(s2);

                // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
            }
            st.add(st1);
            st.add(st2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return st;
    }
    public ArrayList<ArrayList<String>> getJSon1_titledata_vyakansh(Context context){
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        ArrayList<String> st1 =new ArrayList<>();
        ArrayList<String> st2=new ArrayList<>();
        try { String resource = AssetJSONFile("vyakansh.json",context);

            JSONArray jsonArray=new JSONArray(resource);
            for(int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String s1=jsonObject.getString("A");
                String s2=jsonObject.getString("B");
                st1.add(s1);
                st2.add(s2);

                // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
            }
            st.add(st1);
            st.add(st2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return st;
    }
    public ArrayList<ArrayList<String>> getJSon1_titledata_rachna(Context context){
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        ArrayList<String> st1 =new ArrayList<>();
        ArrayList<String> st2=new ArrayList<>();
        try { String resource = AssetJSONFile("jaysankar.json",context);

            JSONArray jsonArray=new JSONArray(resource);
            for(int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String s1=jsonObject.getString("A");
                String s2=jsonObject.getString("B");
                st1.add(s1);
                st2.add(s2);

                // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
            }
            st.add(st1);
            st.add(st2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return st;
    }
    public ArrayList<ArrayList<String>> getJSon1_titledata_tatsam(Context context){
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        ArrayList<String> st1 =new ArrayList<>();
        ArrayList<String> st2=new ArrayList<>();
        try { String resource = AssetJSONFile("tatsam.json",context);

            JSONArray jsonArray=new JSONArray(resource);
            for(int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String s1=jsonObject.getString("A");
                String s2=jsonObject.getString("B");
                st1.add(s1);
                st2.add(s2);

                // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
            }
            st.add(st1);
            st.add(st2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return st;
    }
    public ArrayList<ArrayList<String>> getJSon1_titledata_anekarthi(Context context){
        ArrayList<ArrayList<String>> st=new ArrayList<>();
        ArrayList<String> st1 =new ArrayList<>();
        ArrayList<String> st2=new ArrayList<>();
        try { String resource = AssetJSONFile("anekarthi.json",context);

            JSONArray jsonArray=new JSONArray(resource);
            for(int i=0;i<jsonArray.length();i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String s1=jsonObject.getString("A");
                String s2=jsonObject.getString("B");
                st1.add(s1);
                st2.add(s2);

                // Toast.makeText(context, "" + jsonObject, Toast.LENGTH_SHORT).show();
            }
            st.add(st1);
            st.add(st2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return st;
    }


    public static String AssetJSONFile (String filename, Context context) throws IOException {
        AssetManager manager = context.getAssets();
        InputStream file = manager.open(filename);
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();

        return new String(formArray);
    }

}
