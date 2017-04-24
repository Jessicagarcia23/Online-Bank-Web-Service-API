package com.mycompany.bankingsystemclient.models;

import com.mycompany.bankingsystemclient.models.Account;
import com.mycompany.bankingsystemclient.models.Customer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-24T01:45:45")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, Long> postBalance;
    public static volatile SingularAttribute<Transaction, Long> amount;
    public static volatile SingularAttribute<Transaction, Integer> toAccountNo;
    public static volatile SingularAttribute<Transaction, Integer> transactionNo;
    public static volatile SingularAttribute<Transaction, Date> transDate;
    public static volatile SingularAttribute<Transaction, String> description;
    public static volatile SingularAttribute<Transaction, String> type;
    public static volatile SingularAttribute<Transaction, Account> fromAccountNo;
    public static volatile SingularAttribute<Transaction, Customer> customerNo;

}