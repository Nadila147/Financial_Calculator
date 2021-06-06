package sample;

import com.sun.xml.internal.fastinfoset.stax.events.CommentEvent;

public class test {
    public static void main(String[] args){
        double futureVal = 1000000;
        double endPrincipal = 20000;
        double interestRate = 8.7/100;
        double totalInterest = 0;
        double interest = 0;
        double pmt = 1000;
        double numOfPeriods = 5/12;

        double p = (futureVal*interestRate-pmt*(Math.pow(1+interestRate,numOfPeriods)-1))/(interestRate*Math.pow(1+interestRate,numOfPeriods));
        System.out.println(p);

//        double futureVal = 1000000;
//        double endPrincipal = 20000;
//        double startBalance = 20000;
//        double interestRate = 0.06;
//        double totalInterest = 0;
//        double interest = 0;
//        double pmt = 1000;
//        double numOfPeriods = 0;
//
//        while (true){
//            interest = startBalance*interestRate;
//            System.out.println(interest);
//            totalInterest = totalInterest + interest;
//            startBalance = startBalance + interest + pmt;
//            endPrincipal = endPrincipal + pmt;
//            numOfPeriods++;
//            if ((startBalance + interest + pmt)>=futureVal){
//                break;
//            }
//        }
//        totalInterest = totalInterest+(futureVal-startBalance);
//        double presentVal = futureVal/(Math.pow(1+interestRate,numOfPeriods));
//        System.out.println(totalInterest);
//        System.out.println(endPrincipal);
//        System.out.println(startBalance);
//        System.out.println(numOfPeriods+1);
//        System.out.println(presentVal);
//        double homePrice = 0;
//        double downPayment = 5000;
//        double interestRate = 0.045;
//        double r = interestRate;
//        double y = 5;
//        double monPaymnt = 380;
//        double n = 12;
//
//        double P = monPaymnt*(1-(Math.pow(1+r/n,(-n*y))))/(r/n);
//        homePrice = P + downPayment;
//        System.out.println(homePrice);
//        double homePrice = 25000;
//        double downPayment = 5000;
//        double P = homePrice-downPayment;
//        double interestRate = 0.045;
//        double r = interestRate;
//        double y = 5;
//
//        double n = 12;
//
//        double monPaymnt = (P*(r/n))/(1-(Math.pow(1+r/n,(-n*y))));
//        System.out.println(monPaymnt);
//        double startPrincipal = 20000;
//        double nop = 5;
//        double intRate = 6;
//        double pmt = 10;
//        double endPrincipal = startPrincipal;
//        double interest = 0;
//        double startBal = startPrincipal;
//        double endBal = 0;
//
//        for (int i = 0; i < nop; i++){
//            interest = (startBal)*intRate/100;
//            System.out.println(Math.round(interest*100.00)/100.00);
//            startBal = startBal + interest + pmt;
//            endBal = startBal;
//            endPrincipal = endPrincipal + pmt;
//        }
//        System.out.println(Math.round(endBal*100.00)/100.00);
//        double pv = endBal/Math.pow((1+intRate/100),nop);
//        System.out.println(Math.round(pv*100.00)/100.00);
//        System.out.println(endPrincipal);
//        double Fv = 1000000;
//        double Pv = 20000;
//        double n = 12;
//        double r = 0;
//        double startPrincipal = 20000;
//        double startBalance = startPrincipal;
//        double endPrincipal = startPrincipal;
//        double interest = 0;
//        double totalInterest = 0;
//        double pmt = 10;
//        r = (Math.pow(Fv/Pv,(1/n)))-1;
//        System.out.println(r*100);
//
//        for (int i = 0; i < n; i++){
//            interest = startBalance*r;
//            startBalance = startBalance + interest + pmt;
//            endPrincipal = endPrincipal + pmt;
//            totalInterest = totalInterest + interest;
//        }
//        System.out.println(endPrincipal);
//        System.out.println(startBalance);
//        System.out.println(totalInterest);
//        double Fv = 1000000;
//        double n = 12;
//        double startPrincipal = 20000;
//        double r = 0.047;
//        double Pv = Fv/(Math.pow(1+r,n));
//        double totalInterest = 0;
//        double endPrinciple = startPrincipal;
//        System.out.println(Pv);
//        double pmt = Pv*r/(1-(1-r/n)/(Math.pow(1+r,n)));
//        System.out.println(pmt);
//        for (int i = 0; i < n; i++){
//            double interest = startPrincipal*r;
//            totalInterest = totalInterest + interest;
//            startPrincipal = startPrincipal + interest + pmt;
//            endPrinciple = endPrinciple + pmt;
//        }
//        System.out.println(totalInterest);
//        System.out.println(endPrinciple);
//        double Fv = 1000000;
//        double Pv = 20000;
//        double St = 20000;
//        double Iy = 10;
//        double Pmt = 10;
//
//        double t = (Math.log(Fv+Pmt/St+Pmt))/(Math.log(1+Iy));
//        System.out.println(t*12);
//        double autoPrice = 25000;
//        double loanTerm = 1;
//        double interestRate = 4.5;
//        double downPay = 5000;
//        double salesTax = 7;
//        double title = 300;
//
//        double beginningBal = autoPrice - downPay;
//        double interest = beginningBal*(Math.pow(1+interestRate/(100*5),loanTerm));
//        System.out.println(interest);
    }
}
