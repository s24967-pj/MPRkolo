package com.example.kolokwium;

import java.util.ArrayList;
import java.util.List;

public class BankStorage {
    private List<Bank> reportList;

    public ReportStorage() {
        this.reportList = new ArrayList<>();
    }

    public List<Report> getReportList() {
        return reportList;
    }

    public void addReportToList(Report report){
        reportList.add(report);
    }
}
