package com.github.dheerajhegde.esql.dto;

public class OrderRequest {
    private String partNo;
    private int partQuantity;

    // Getters and Setters
    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public int getPartQuantity() {
        return partQuantity;
    }

    public void setPartQuantity(int partQuantity) {
        this.partQuantity = partQuantity;
    }
}
