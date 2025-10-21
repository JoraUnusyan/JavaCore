package FullLessons.lesson7.ObjectParametr;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1900);  //stexcink mer obyekt@, balance-@ tvink
        Bank banktest = new Bank();  //stexcink mer banki obyekt@

        banktest.deposit(account, 200);  //hmi banki obyekti deposit metodin tvink account-i link@, u amount@
        //talov, poxink nayev mer account-i meji balance-@, vornor andzamp obyekti mej arten poxvav.
        System.out.println(account.balance);


        // i tarberucyun primitiv tiberin, ete metodin kudank obyekt@ vorpes parametr, menk ira link@ kudank vochte
        // obyekti kopyan, u ete metodi mej k poxenk mer obyekti meji popoxakanner@, k poxvin irank naev andzamp obyektum.
        // isk primitiv tiberi depkum ink@ metodi mej kuda kopyan, bayc originalner@ chen poxvi.

    }
}
