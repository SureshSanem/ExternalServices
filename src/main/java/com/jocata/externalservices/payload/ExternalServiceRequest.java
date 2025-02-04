package com.jocata.externalservices.payload;

import java.io.Serializable;

public class ExternalServiceRequest implements Serializable {

    private String txnId;
    private PanPayload panPayload;

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public PanPayload getPanPayload() {
        return panPayload;
    }

    public void setPanPayload(PanPayload panPayload) {
        this.panPayload = panPayload;
    }
}
