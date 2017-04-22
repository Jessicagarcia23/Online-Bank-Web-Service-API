/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankingsystemclient.models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")
    , @NamedQuery(name = "Account.findByAccountNo", query = "SELECT a FROM Account a WHERE a.accountNo = :accountNo")
    , @NamedQuery(name = "Account.findByType", query = "SELECT a FROM Account a WHERE a.type = :type")
    , @NamedQuery(name = "Account.findBySortCode", query = "SELECT a FROM Account a WHERE a.sortCode = :sortCode")
    , @NamedQuery(name = "Account.findByCurrentBalance", query = "SELECT a FROM Account a WHERE a.currentBalance = :currentBalance")
    , @NamedQuery(name = "Account.findByCreatedAt", query = "SELECT a FROM Account a WHERE a.createdAt = :createdAt")
    , @NamedQuery(name = "Account.findByCloseDate", query = "SELECT a FROM Account a WHERE a.closeDate = :closeDate")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "accountNo")
    private Integer accountNo;
    @Basic(optional = false)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "sortCode")
    private int sortCode;
    @Basic(optional = false)
    @Column(name = "currentBalance")
    private int currentBalance;
    @Basic(optional = false)
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Basic(optional = false)
    @Column(name = "close_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closeDate;
    @JoinColumn(name = "customerNo", referencedColumnName = "customerNo")
    @ManyToOne(optional = false)
    private Customer customerNo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fromAccountNo")
    private Collection<Transaction> transactionCollection;

    public Account() {
    }

    public Account(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public Account(Integer accountNo, String type, int sortCode, int currentBalance, Date createdAt, Date closeDate) {
        this.accountNo = accountNo;
        this.type = type;
        this.sortCode = sortCode;
        this.currentBalance = currentBalance;
        this.createdAt = createdAt;
        this.closeDate = closeDate;
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Customer getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(Customer customerNo) {
        this.customerNo = customerNo;
    }

    @XmlTransient
    public Collection<Transaction> getTransactionCollection() {
        return transactionCollection;
    }

    public void setTransactionCollection(Collection<Transaction> transactionCollection) {
        this.transactionCollection = transactionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountNo != null ? accountNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.accountNo == null && other.accountNo != null) || (this.accountNo != null && !this.accountNo.equals(other.accountNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.bankingsystemclient.models.Account[ accountNo=" + accountNo + " ]";
    }
    
}
