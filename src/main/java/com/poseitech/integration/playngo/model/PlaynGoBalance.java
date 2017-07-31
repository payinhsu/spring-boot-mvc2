package com.poseitech.integration.playngo.model;

import java.io.Serializable;

public final class PlaynGoBalance  implements Serializable{
   
   private static final long serialVersionUID = 5128714634310757803L;
   private String sn; //ExternalTransactionId
   private double total;
   private double transferAmount;
   private long exTransId; //web service transactionId

   /**
    * PlaynGo 帳戶金額
    */
   public double getTotal() {
      return total;
   }
   public void setTotal(double pTotal) {
      total = pTotal;
   }   

   /**
    * 此次交易轉帳金額
    */
   public double getTransferAmount() {
      return transferAmount;
   }
   public void setTransferAmount(double pTransferAmount) {
      transferAmount = pTransferAmount;
   }

   public String getSn() {
      return sn;
   }

   public void setSn(String sn) {
      this.sn = sn;
   }
   
   public long getExTransId() {
      return exTransId;
   }
   public void setExTransId(long exTransId) {
      this.exTransId = exTransId;
   }
   @Override
   public String toString() {
      return "PlaynGoBalance [total=" + total + ", transferAmount=" + transferAmount + "]";
   }
}
