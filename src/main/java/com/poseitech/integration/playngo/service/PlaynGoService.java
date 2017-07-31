/**
 * PlaynGoService.java created 2016年11月5日
 *
 */
package com.poseitech.integration.playngo.service;

import java.util.List;

import com.poseitech.integration.playngo.model.PlaynGoBalance;
import com.poseitech.integration.playngo.model.PlaynGoOpenGame;
import com.poseitech.integration.playngo.model.PlaynGoUser;

/**
 * @author B.J Lin
 */
public interface PlaynGoService {
    
   public boolean register(PlaynGoUser pUser) throws PlaynGoException;
   
   public PlaynGoBalance credit(PlaynGoUser pUser, PlaynGoBalance pBalance) throws PlaynGoException;
   
   public PlaynGoBalance debit(PlaynGoUser pUser, PlaynGoBalance pBalance) throws PlaynGoException;
   
   public PlaynGoBalance getBalance(PlaynGoUser pUser) throws PlaynGoException;
   
   public PlaynGoBalance getBalance(String pExternalUserId) throws PlaynGoException;
   
   public String getTicket(String pExternalUserId) throws PlaynGoException;
   
   public List<PlaynGoOpenGame> getUnfinishedGames(String pExternalUserId) throws PlaynGoException;
}
