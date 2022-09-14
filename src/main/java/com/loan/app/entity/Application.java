package com.loan.app.entity;

import com.loan.app.constant.LoanAppConstant;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "application", schema = "LoanAppConstant.LOAN_SCHEMA")
public class Application implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private int applicationId;

    @Column(name="customer_id")
    private int customerId;

    @Column(name="prod_code")
    private final String prodCode= LoanAppConstant.PROD_CODE;

    @Column(name="create_date")
    private String createDate;

    @Column(name="update_date")
    private String updateDate;


    public int getApplicationId() { return applicationId; }

    public int getCustomerId() { return customerId; }

    public String getCreateDate() { return createDate; }

    public String getUpdateDate() { return updateDate; }



    public void setApplicationId(int applicationId) { this.applicationId = applicationId; }

    public void setCustomerId(int customerId) { this.customerId = customerId; }

    public void setCreateDate(String createDate) { this.createDate = createDate; }

    public void setUpdateDate(String updateDate) { this.updateDate = updateDate; }
}
