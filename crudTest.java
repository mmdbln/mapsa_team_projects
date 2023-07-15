package org.example.hiproject;

import org.example.hiproject.Services.AccountService;
import org.example.hiproject.Services.BaseService;
import org.example.hiproject.Services.BranchService;
import org.example.hiproject.Services.CustoomerService;
import org.example.hiproject.entities.*;


import java.util.List;

public class crudTest {
    public static void main(String[] args) {

        //bank,branch-oneToMany

//        BaseService baseService=new BaseService<>(SessionFactoryProvider.getSessionFactory());

        BranchService branchService=new BranchService(SessionFactoryProvider.getSessionFactory());
        AccountService accountService=new AccountService(SessionFactoryProvider.getSessionFactory());
        CustoomerService custoomerService=new CustoomerService(SessionFactoryProvider.getSessionFactory());


        Branch firstBranch=new Branch("1234");
//        Branch secondBranch=new Branch("1834");
//        Branch thirdBranch=new Branch("1874");
//        Branch fourthBranch=new Branch("2234");
//        Branch fifthBranch=new Branch("174");
//        Branch sixthBranch=new Branch("1864");
//        Branch seventhBranch=new Branch("1434");
//        Branch eighthBranch=new Branch("1824");
//        Branch ninthBranch=new Branch("143");
//        Branch tenthBranch=new Branch("1034");

        Bank bank=new Bank("Pasargad");


        //bank.setBranches(List.of(firstBranch,secondBranch,thirdBranch,fourthBranch,fifthBranch,sixthBranch,seventhBranch,eighthBranch,ninthBranch,tenthBranch));
        firstBranch.setBank(bank);
        branchService.getAll();
        //secondBranch.setBank(bank);
//        thirdBranch.setBank(bank);
//        fourthBranch.setBank(bank);
//        fifthBranch.setBank(bank);
//        sixthBranch.setBank(bank);
//        seventhBranch.setBank(bank);
//        eighthBranch.setBank(bank);
//        ninthBranch.setBank(bank);
//        tenthBranch.setBank(bank);
//        branchService.add(firstBranch);
//        branchService.add(secondBranch);
//        branchService.add(thirdBranch);
//        branchService.add(fourthBranch);
//        branchService.add(fifthBranch);
//        branchService.add(sixthBranch);
//        branchService.add(seventhBranch);
//        branchService.add(eighthBranch);
//        branchService.add(ninthBranch);
      //  branchService.add(tenthBranch);


        //account-branch-oneToManay
//
//        Branch branch=new Branch("3555");
//        Account firstAccount=new Account(12);
//        Account secondAccount=new Account(32);
////
//        branch.setAccounts(List.of(firstAccount,secondAccount));
//        firstAccount.setBranch(branch);
//        secondAccount.setBranch(branch);
//        branchService.add(branch);
//
//        //account-customer-manyToMany
//        Custoomer firstCustoomer=new Custoomer(123);
//        Custoomer secondCustoomer=new Custoomer(933);
//
//        firstCustoomer.setAccounts(List.of(firstAccount,secondAccount));
//        secondCustoomer.setAccounts(List.of(secondAccount));
//
//        firstAccount.setCustoomers(List.of(secondCustoomer));
//        secondAccount.setCustoomers(List.of(firstCustoomer,secondCustoomer));
////
//        //accountService.create(firstAccount);
////        accountService.create(secondAccount);
////        custoomerService.create(firstCustoomer);
////        custoomerService.create(secondCustoomer);
//
//
//        //account-transaction-onetomany
//        Transaction firstTransaction=new Transaction("first");
//        Transaction secondTransaction=new Transaction("second");
//
//        secondAccount.setTransactions(List.of(firstTransaction,secondTransaction));
//        firstTransaction.setAccount(secondAccount);
//        secondTransaction.setAccount(secondAccount);
//        accountService.add(secondAccount);













    }
}
