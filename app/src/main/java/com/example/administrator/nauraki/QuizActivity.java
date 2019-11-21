package com.example.administrator.nauraki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
 TextView  mQuestion,opt1,opt2,opt3,opt4;
 ImageView backward,forward;
 int ans=-1;
    ArrayList<String> que=new ArrayList<>();
    ArrayList<String> corr=new ArrayList<>();
    ArrayList<String> you=new ArrayList<>();
 int t=0;
 ArrayList<String> result=new ArrayList<>();
    ArrayList<ArrayList> questions= new ArrayList();
    ArrayList<Integer> colour=new ArrayList<>();
    TextView mSerial_no;
Button b1;
CheckBox mchech_box1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        mQuestion=(TextView)findViewById(R.id.question);
        opt1=(TextView)findViewById(R.id.option1);
        opt2=(TextView)findViewById(R.id.option2);
        opt3=(TextView)findViewById(R.id.option3);
        opt4=(TextView)findViewById(R.id.option4);
        b1=(Button)findViewById(R.id.selected);
        mSerial_no=(TextView) findViewById(R.id.serial_no);
        backward=(ImageView)findViewById(R.id.quiz_question_pre);
        forward=(ImageView)findViewById(R.id.quiz_question_next);
        mchech_box1=findViewById(R.id.checkbox_option1);

backward.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        if(t==0){
            return;
        }

        t--;
        mQuestion.setText(questions.get(t).get(0).toString());
        opt1.setText(questions.get(t).get(1).toString());
        opt2.setText(questions.get(t).get(2).toString());
        opt3.setText(questions.get(t).get(3).toString());
        opt4.setText(questions.get(t).get(4).toString());
        b1.setText(questions.get(t).get(6).toString());
        b1.setBackgroundColor(colour.get(t));
        mSerial_no.setText(""+(t+1)+"/10");
    }
});
forward.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      mforward();
    }
});

        for(int i=0;i<10;i++){
            ArrayList<String> s1=new ArrayList<>();
            s1.add("question"+(i+1));
            que.add("question"+(i+1));
            s1.add("option 1"+i);
            s1.add("option 2"+i);
            s1.add("option 3"+i);
            s1.add("option 4"+i);

            s1.add("ans"+i);
            corr.add("ans"+i);
            s1.add("select");
            s1.add("-1");
            you.add("-1");
            colour.add(R.color.colormain);
            questions.add(s1);
        }

        mQuestion.setText(questions.get(0).get(0).toString());
        opt1.setText(questions.get(0).get(1).toString());
        opt2.setText(questions.get(0).get(2).toString());
        opt3.setText(questions.get(0).get(3).toString());
        opt4.setText(questions.get(0).get(4).toString());
        b1.setText(questions.get(0).get(6).toString());
        mSerial_no.setText(""+1+"/10");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans!=-1){
                  // you.set(t,ans);

                    you.set(t,""+ans);
                    questions.get(t).set(6,"selected");
                    colour.set(t,R.color.colorblack);
                    b1.setText(questions.get(t).get(6).toString());
                    mforward();
                    ans=-1;
                }
                else
                {
                    Toast.makeText(QuizActivity.this, "select a option first", Toast.LENGTH_SHORT).show();
                }




            }
        });
        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=1;
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=2;
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=3;
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=4;
            }
        });
    }
    void mforward(){
        if(t==9){

            Intent i=new Intent(QuizActivity.this,ShowResult.class);
            i.putStringArrayListExtra("question",que);
            i.putStringArrayListExtra("your_ans",you);
            i.putStringArrayListExtra("correct_ans",corr);
            startActivity(i);
           return;
        }

        t++;
        b1.setBackgroundColor(colour.get(t));
        mQuestion.setText(questions.get(t).get(0).toString());
        opt1.setText(questions.get(t).get(1).toString());
        opt2.setText(questions.get(t).get(2).toString());
        opt3.setText(questions.get(t).get(3).toString());
        opt4.setText(questions.get(t).get(4).toString());
        b1.setText(questions.get(t).get(6).toString());

        mSerial_no.setText(""+(t+1)+"/10");
    }
}
