package com.mycompany.bankingsystemclient.models;

import com.mycompany.bankingsystemclient.models.Account;
import com.mycompany.bankingsystemclient.models.Transaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-24T01:45:45")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile CollectionAttribute<Customer, Transaction> transactionCollection;
    public static volatile CollectionAttribute<Customer, Account> accountCollection;
    public static volatile SingularAttribute<Customer, String> password;
    public static volatile SingularAttribute<Customer, String> address;
    public static volatile SingularAttribute<Customer, String> fullname;
    public static volatile SingularAttribute<Customer, Integer> customerNo;
    public static volatile SingularAttribute<Customer, String> email;

}