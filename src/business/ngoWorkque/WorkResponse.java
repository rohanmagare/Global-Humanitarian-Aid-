/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.ngoWorkque;

import business.enterprise.Enterprise;
import business.enterprise.funds.FundAllocation;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class WorkResponse {
    private int workResponseID;
    private static int count = 0;
    private String message;
    private Enterprise enterprise;
    private FundAllocation fundAllocation;
    
    public WorkResponse() {
        workResponseID = ++count;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public FundAllocation getFundAllocation() {
        return fundAllocation;
    }

    public void setFundAllocation(FundAllocation fundAllocation) {
        this.fundAllocation = fundAllocation;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.workResponseID);
    }
   

}
