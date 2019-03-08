package com.example.vsysuev.industrialcalendar.Api;


import com.example.vsysuev.industrialcalendar.Date;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//301f1d9bf23570648d5913a49660b8af - Tokin key @Path("dataset") String dataset,@Path("version") String version

public interface DateApi {
    @GET("/api/json/dataset/7708660670-proizvcalendar/version/20151123T183036/content/?access_token=b21c33b9ca9045a57960ef4f352689fd")
    Call<List<Date>>getData();
}
