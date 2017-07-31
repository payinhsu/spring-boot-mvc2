/**
 * PlaynGoException.java created 2016年11月5日
 *
 * \$LastChangedBy\$
 * \$Date\$
 * \$Revision\$
 */
package com.poseitech.integration.playngo.service;

import com.poseitech.exceptions.RootException;
import com.poseitech.lang.Assert;

/**
 * @author bj
 *
 */
public class PlaynGoException extends RootException {

   /**
    * 
    */
   private static final long serialVersionUID = -5897968742534289059L;
   
   final private String apiUrl;

   /**
    * @param pErrorCode
    * @param pMessage
    */
   public PlaynGoException(String pErrorCode, String pMessage, String aApiUrl) {
      super(pErrorCode, pMessage);
      
      Assert.notNull(aApiUrl, "PlaynGo reqeust api url must not be null.");
      
      this.apiUrl = aApiUrl;
      appendMessage("PlaynGo api url: " + this.apiUrl);
   }

   /**
    * @param pErrorCode
    * @param pMessage
    * @param pCause
    */
   public PlaynGoException(String pErrorCode, String pMessage, String aApiUrl, Throwable pCause) {
      super(pErrorCode, pMessage, pCause);
      
      Assert.notNull(aApiUrl, "PlaynGo reqeust api url must not be null.");
      
      this.apiUrl = aApiUrl;
      appendMessage("PlaynGo api url: " + this.apiUrl);
   }
}
