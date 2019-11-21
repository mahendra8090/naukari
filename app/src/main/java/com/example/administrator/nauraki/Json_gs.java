package com.example.administrator.nauraki;

import android.content.Context;
import android.content.res.AssetManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Json_gs {
    ArrayList<String> st1 = new ArrayList<>();
    ArrayList<String> st2 = new ArrayList<>();
    ArrayList<String> st3 = new ArrayList<>();
    ArrayList<String> st4 = new ArrayList<>();
    ArrayList<String> st5 = new ArrayList<>();
    ArrayList<String> st6 = new ArrayList<>();

    ArrayList<String> st = new ArrayList<>();


    ArrayList<ArrayList<String>> math = new ArrayList<>();

    public ArrayList<ArrayList<String>> getJSon1_titledata_math(Context context, int j) {
        String st = new String();
        switch (j) {

            case 1: {
                st = "history";

                break;
            }
            case 2: {
                st = "history";

                break;
            }
        }

        try {
            String resource = AssetJSONFile("history.json", context);

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





    public static String AssetJSONFile (String filename, Context context) throws IOException {
        AssetManager manager = context.getAssets();
        InputStream file = manager.open(filename);
        byte[] formArray = new byte[file.available()];
        file.read(formArray);
        file.close();

        return new String(formArray);
    }

}
