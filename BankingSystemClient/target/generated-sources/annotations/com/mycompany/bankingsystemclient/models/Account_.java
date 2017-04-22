package com.mycompany.bankingsystemclient.models;

import com.mycompany.bankingsystemclient.models.Customer;
import com.mycompany.bankingsystemclient.models.Transaction;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-22T22:20:23")
@StaticMetamodel(Account.class)
public class Account_ { 

    public static volatile SingularAttribute<Account, Date> closeDate;
    public static volatile CollectionAttribute<Account, Transaction> transactionCollection;
    public static volatile SingularAttribute<Account, Date> createdAt;
    public static volatile SingularAttribute<Account, Integer> accountNo;
    public static volatile SingularAttribute<Account, Integer> currentBalance;
    public static volatile SingularAttribute<Account, String> type;
    public static volatile SingularAttribute<Account, Integer> sortCode;
    public static volatile SingularAttribute<Account, Customer> customerNo;

}