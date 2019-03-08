package com.example.vsysuev.industrialcalendar;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Date {

    @SerializedName("Год/Месяц")
    @Expose
    private String yearMonth;
    @SerializedName("Январь")
    @Expose
    private String january;
    @SerializedName("Февраль")
    @Expose
    private String feb;
    @SerializedName("Март")
    @Expose
    private String march;
    @SerializedName("Апрель")
    @Expose
    private String april;
    @SerializedName("Май")
    @Expose
    private String may;
    @SerializedName("Июнь")
    @Expose
    private String june;
    @SerializedName("Июль")
    @Expose
    private String july;
    @SerializedName("Август")
    @Expose
    private String august;
    @SerializedName("Сентябрь")
    @Expose
    private String september;
    @SerializedName("Октябрь")
    @Expose
    private String october;
    @SerializedName("Ноябрь")
    @Expose
    private String november;
    @SerializedName("Декабрь")
    @Expose
    private String december;
    @SerializedName("Всего рабочих дней")
    @Expose
    private String allWorkDay;
    @SerializedName("Всего праздничных и выходных дней")
    @Expose
    private String allWeknDay;
    @SerializedName("Количество рабочих часов при 40-часовой рабочей неделе")
    @Expose
    private String workHours40;
    @SerializedName("Количество рабочих часов при 36-часовой рабочей неделе")
    @Expose
    private String workHours36;
    @SerializedName("Количество рабочих часов при 24-часовой рабочей неделе")
    @Expose
    private String workHours24;

    public String getYearMonth() {
        return yearMonth;
    }

    public void setYearMonth(String yearMonth) {
        this.yearMonth = yearMonth;
    }

    public String getJanuary() {
        return january;
    }

    public void setJanuary(String january) {
        this.january = january;
    }

    public String getFeb() {
        return feb;
    }

    public void setFeb(String feb) {
        this.feb = feb;
    }

    public String getMarch() {
        return march;
    }

    public void setMarch(String march) {
        this.march = march;
    }

    public String getApril() {
        return april;
    }

    public void setApril(String april) {
        this.april = april;
    }

    public String getMay() {
        return may;
    }

    public void setMay(String may) {
        this.may = may;
    }

    public String getJune() {
        return june;
    }

    public void setJune(String june) {
        this.june = june;
    }

    public String getJuly() {
        return july;
    }

    public void setJuly(String july) {
        this.july = july;
    }

    public String getAugust() {
        return august;
    }

    public void setAugust(String august) {
        this.august = august;
    }

    public String getSeptember() {
        return september;
    }

    public void setSeptember(String september) {
        this.september = september;
    }

    public String getOctober() {
        return october;
    }

    public void setOctober(String october) {
        this.october = october;
    }

    public String getNovember() {
        return november;
    }

    public void setNovember(String november) {
        this.november = november;
    }

    public String getDecember() {
        return december;
    }

    public void setDecember(String december) {
        this.december = december;
    }

    public String getAllWorkDay() {
        return allWorkDay;
    }

    public void setAllWorkDay(String allWorkDay) {
        this.allWorkDay = allWorkDay;
    }

    public String getAllWeknDay() {
        return allWeknDay;
    }

    public void setAllWeknDay(String allWeknDay) {
        this.allWeknDay = allWeknDay;
    }

    public String getWorkHours40() {
        return workHours40;
    }

    public void setWorkHours40(String workHours40) {
        this.workHours40 = workHours40;
    }

    public String getWorkHours36() {
        return workHours36;
    }

    public void setWorkHours36(String workHours36) {
        this.workHours36 = workHours36;
    }

    public String getWorkHours24() {
        return workHours24;
    }

    public void setWorkHours24(String workHours24) {
        this.workHours24 = workHours24;
    }

}