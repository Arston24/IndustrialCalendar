package com.example.vsysuev.industrialcalendar;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vsysuev.industrialcalendar.Api.DateApi;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    DateApi dateApi;
    Retrofit retrofit;
    String res = "";
    List<Date> posts;
    TextView textView, textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CalendarView calendarView = (CalendarView) findViewById(R.id.calendarView1);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year,
                                            int month, int dayOfMonth) {
                int mYear = year;
                int mMonth = month;
                int mDay = dayOfMonth;
                String selectedDate = new StringBuilder().append(mMonth + 1)
                        .append("-").append(mDay).append("-").append(mYear)
                        .append(" ").toString();
                Toast.makeText(getApplicationContext(), selectedDate, Toast.LENGTH_LONG).show();

            }
        });

        calendarView.setFirstDayOfWeek(2);
//        Gson gson = new GsonBuilder()
//                .setLenient()
//                .create();

        posts = new ArrayList<>();

        textView = findViewById(R.id.textView);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://data.gov.ru")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        dateApi = retrofit.create(DateApi.class);

        Call<List<Date>> call = dateApi.getData();

        call.enqueue(new Callback<List<Date>>() {
            @TargetApi(Build.VERSION_CODES.O)
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onResponse(Call<List<Date>> call, Response<List<Date>> response) {
                Log.d("success", response.body().toString());
                Log.e("TAG", "response 33: " + new Gson().toJson(response.body()));
//                response.body();
                List<Date> date = response.body();

                Time today = new Time(Time.getCurrentTimezone());
                today.setToNow();
//
//                Locale loc = Locale.forLanguageTag("ru");
//                Month jan = Month.of(5);
//                textView.setText(jan.getDisplayName(TextStyle.FULL_STANDALONE, loc));
               // textView.setText(date.get(0).getJ);
                int i = 0;
                while (!date.isEmpty()) {
                    if (date.get(i).getYearMonth().equals(String.valueOf(today.year))){
                        textView.setText("Март " + date.get(i).getMarch());
                        textView1.setText("Всего рабочих дней: " + date.get(i).getAllWorkDay());
                        textView2.setText("Всего праздничных и выходных дней: " + date.get(i).getAllWeknDay());
                        textView3.setText("Количество рабочих часов при 40-часовой рабочей неделе: " + date.get(i).getWorkHours40());
                        return;
                    }
                    i++;
                }
//                String res  = date.get(19).getJanuary();

                //textView.setText(today.yearDay + "");
//                String jan = response.body().toString();


            }

            @Override
            public void onFailure(Call<List<Date>> call, Throwable t) {
                String message = t.getMessage();
                Toast.makeText(MainActivity.this, "An error occurred during networking " + message, Toast.LENGTH_SHORT).show();
                Log.d("failure!", message);

            }
        });

    }
}

