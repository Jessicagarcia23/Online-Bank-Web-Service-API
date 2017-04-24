/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingsystemclient.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "transaction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaction.findAll", query = "SELECT t FROM Transaction t")
    , @NamedQuery(name = "Transaction.findByTransactionNo", query = "SELECT t FROM Transaction t WHERE t.transactionNo = :transactionNo")
    , @NamedQuery(name = "Transaction.findByType", query = "SELECT t FROM Transaction t WHERE t.type = :type")
    , @NamedQuery(name = "Transaction.findByToAccountNo", query = "SELECT t FROM Transaction t WHERE t.toAccountNo = :toAccountNo")
    , @NamedQuery(name = "Transaction.findByAmount", query = "SELECT t FROM Transaction t WHERE t.amount = :amount")
    , @NamedQuery(name = "Transaction.findByPostBalance", query = "SELECT t FROM Transaction t WHERE t.postBalance = :postBalance")
    , @NamedQuery(name = "Transaction.findByTransDate", query = "SELECT t FROM Transaction t WHERE t.transDate = :transDate")
    , @NamedQuery(name = "Transaction.findByDescription", query = "SELECT t FROM Transaction t WHERE t.description = :description")})
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transactionNo")
    private Integer transactionNo;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "toAccountNo")
    private int toAccountNo;
    @Basic(optional = false)
    @Column(name = "amount")
    private long amount;
    @Basic(optional = false)
    @Column(name = "postBalance")
    private long postBalance;
    @Column(name = "TransDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transDate;
    @Column(name = "Description")
    private String description;
    @JoinColumn(name = "fromAccountNo", referencedColumnName = "accountNo")
    @ManyToOne(optional = false)
    private Account fromAccountNo;
    @JoinColumn(name = "customerNo", referencedColumnName = "customerNo")
    @ManyToOne
    private Customer customerNo;

    public Transaction() {
    }

    public Transaction(Integer transactionNo) {
        this.transactionNo = transactionNo;
    }

    public Transaction(Integer transactionNo, String type, int toAccountNo, long amount, long postBalance) {
        this.transactionNo = transactionNo;
        this.type = type;
        this.toAccountNo = toAccountNo;
        this.amount = amount;
        this.postBalance = postBalance;
    }

    public Integer getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(Integer transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getToAccountNo() {
        return toAccountNo;
    }

    public void setToAccountNo(int toAccountNo) {
        this.toAccountNo = toAccountNo;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public long getPostBalance() {
        return postBalance;
    }

    public void setPostBalance(long postBalance) {
        this.postBalance = postBalance;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getFromAccountNo() {
        return fromAccountNo;
    }

    public void setFromAccountNo(Account fromAccountNo) {
        this.fromAccountNo = fromAccountNo;
    }

    public Customer getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(Customer customerNo) {
        this.customerNo = customerNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionNo != null ? transactionNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.transactionNo == null && other.transactionNo != null) || (this.transactionNo != null && !this.transactionNo.equals(other.transactionNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bankingsystemclient.models.Transaction[ transactionNo=" + transactionNo + " ]";
    }
    
}
