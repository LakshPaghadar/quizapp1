package com.example.quizapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText que;
    Button yesbtn;
    Button nobtn;

    int index = 0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] questions= {"is java invented in 1983?","is java invented by james gosling?",
                          "is java have multiple inheritance feature?","java is oop language?","is java id high level language?"};
        Boolean[] ans={false,true,false,true,true};


        que = findViewById(R.id.editTextTextPersonName);
        que.setText(questions[index]);

        yesbtn = findViewById(R.id.yes);
        nobtn = findViewById(R.id.no);

        yesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > questions.length-1)
                {
                    Toast.makeText(MainActivity.this, "Your Score is: "+score, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (ans[index])
                    {
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1)
                    {
                        que.setText(questions[index]);
                    }
                }

            }
        });
        nobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > questions.length-1)
                {
                    Toast.makeText(MainActivity.this, "Your Score is: "+score, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (!ans[index])
                    {
                        score++;
                    }
                    index++;
                    if (index <= questions.length-1)
                    {
                        que.setText(questions[index]);
                    }

                }

            }
        });
    }
}