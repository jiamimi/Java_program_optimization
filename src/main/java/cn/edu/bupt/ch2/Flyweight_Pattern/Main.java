package cn.edu.bupt.ch2.Flyweight_Pattern;

/**
 * Created by FirenzesEagle on 2016/5/16 0016.
 * Email:liumingbo2008@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        ReportManagerFactory reportManagerFactory = new ReportManagerFactory();
        IReportManager iReportManager = reportManagerFactory.getFinancialReportManager("A");
        System.out.println(iReportManager.createReport());
    }

}
