package Console_Prj2.task3;

public class BankAccount {

        int TotalCount;
        int Number;
        int Persent;
        void printBankAccountInfo (){System.out.println(TotalCount+" "+Number+" "+Persent+" ");}

        double getDohod(){
            return TotalCount * Persent / 100;
        }
    }


