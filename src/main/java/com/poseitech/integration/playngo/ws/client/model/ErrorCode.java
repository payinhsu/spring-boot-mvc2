
/**
 * ErrorCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */

package com.poseitech.integration.playngo.ws.client.model;

/**
 * ErrorCode bean class
 */
public class ErrorCode implements org.apache.axis2.databinding.ADBBean {
   /**
    * 
    */
   private static final long serialVersionUID = -2233614584664345830L;
   public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://playngo.com/v1",
         "ErrorCode", "ns3");
   private static java.util.HashMap _table_ = new java.util.HashMap();
   public static final java.lang.String _Unknown = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("Unknown");
   public static final java.lang.String _Success = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("Success");
   public static final java.lang.String _InternalError = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InternalError");
   public static final java.lang.String _InvalidArguments = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidArguments");
   public static final java.lang.String _InvalidSession = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidSession");
   public static final java.lang.String _InvalidCurrency = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidCurrency");
   public static final java.lang.String _AccessRestricted = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("AccessRestricted");
   public static final java.lang.String _NicknameTaken = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NicknameTaken");
   public static final java.lang.String _UserDisabled = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UserDisabled");
   public static final java.lang.String _UnknownUser = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UnknownUser");
   public static final java.lang.String _UserLocked = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UserLocked");
   public static final java.lang.String _WrongUserPassword = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("WrongUserPassword");
   public static final java.lang.String _DepositFailed = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("DepositFailed");
   public static final java.lang.String _WithdrawFailed = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("WithdrawFailed");
   public static final java.lang.String _ActionDelayed = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("ActionDelayed");
   public static final java.lang.String _MandatoryFieldMissing = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("MandatoryFieldMissing");
   public static final java.lang.String _LoginExists = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("LoginExists");
   public static final java.lang.String _MaxLoginRetriesExceeded = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("MaxLoginRetriesExceeded");
   public static final java.lang.String _InvalidCampaign = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidCampaign");
   public static final java.lang.String _UserTooYoung = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UserTooYoung");
   public static final java.lang.String _IPBlocked = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("IPBlocked");
   public static final java.lang.String _InvalidCountryRegion = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidCountryRegion");
   public static final java.lang.String _MaxPasswordChangesExceeded = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("MaxPasswordChangesExceeded");
   public static final java.lang.String _FailedUserInfoUpdate = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("FailedUserInfoUpdate");
   public static final java.lang.String _IncorrectOldPassword = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("IncorrectOldPassword");
   public static final java.lang.String _FailedChangePassword = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("FailedChangePassword");
   public static final java.lang.String _NicknameOffensive = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NicknameOffensive");
   public static final java.lang.String _MaxRefillsReached = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("MaxRefillsReached");
   public static final java.lang.String _NoSuchExchangeRate = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NoSuchExchangeRate");
   public static final java.lang.String _NoSuchJackpot = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NoSuchJackpot");
   public static final java.lang.String _TournamentUnknown = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("TournamentUnknown");
   public static final java.lang.String _ServerFull = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("ServerFull");
   public static final java.lang.String _TransferNotAllowed = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("TransferNotAllowed");
   public static final java.lang.String _Timeout = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("Timeout");
   public static final java.lang.String _IncompleteUser = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("IncompleteUser");
   public static final java.lang.String _NotEnoughMoney = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NotEnoughMoney");
   public static final java.lang.String _UnknownLink = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UnknownLink");
   public static final java.lang.String _InvalidIP = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidIP");
   public static final java.lang.String _InvalidGame = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidGame");
   public static final java.lang.String _InvalidID = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidID");
   public static final java.lang.String _UserNotVerified = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UserNotVerified");
   public static final java.lang.String _MaxAccountsPerEmail = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("MaxAccountsPerEmail");
   public static final java.lang.String _InvalidLogin = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidLogin");
   public static final java.lang.String _InvalidPassword = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidPassword");
   public static final java.lang.String _InvalidNickname = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidNickname");
   public static final java.lang.String _InvalidFirstName = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidFirstName");
   public static final java.lang.String _InvalidMiddleName = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidMiddleName");
   public static final java.lang.String _InvalidLastName = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidLastName");
   public static final java.lang.String _InvalidAddress = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidAddress");
   public static final java.lang.String _InvalidCountry = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidCountry");
   public static final java.lang.String _InvalidRegion = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidRegion");
   public static final java.lang.String _InvalidZip = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidZip");
   public static final java.lang.String _InvalidCity = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidCity");
   public static final java.lang.String _InvalidPhone = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidPhone");
   public static final java.lang.String _InvalidEmail = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidEmail");
   public static final java.lang.String _InvalidMobileNr = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidMobileNr");
   public static final java.lang.String _InvalidBirthdate = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidBirthdate");
   public static final java.lang.String _InvalidReferAFriend = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidReferAFriend");
   public static final java.lang.String _InvalidDataState = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidDataState");
   public static final java.lang.String _UnknownOrderType = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UnknownOrderType");
   public static final java.lang.String _WithdrawalExceedsDeposits = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("WithdrawalExceedsDeposits");
   public static final java.lang.String _InvalidAmount = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidAmount");
   public static final java.lang.String _LimitExceededDaily = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("LimitExceededDaily");
   public static final java.lang.String _LimitExceededWeekly = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("LimitExceededWeekly");
   public static final java.lang.String _LimitExceededMonthly = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("LimitExceededMonthly");
   public static final java.lang.String _UnknownBonusCode = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UnknownBonusCode");
   public static final java.lang.String _BonusOfferUsed = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("BonusOfferUsed");
   public static final java.lang.String _SameCreatorAndSigner = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("SameCreatorAndSigner");
   public static final java.lang.String _DuplicateOnGameTicket = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("DuplicateOnGameTicket");
   public static final java.lang.String _SystemMessageDeleting = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("SystemMessageDeleting");
   public static final java.lang.String _ReferencedMessageDeleting = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("ReferencedMessageDeleting");
   public static final java.lang.String _NotRegisteredAtOnGame = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NotRegisteredAtOnGame");
   public static final java.lang.String _NotAllowed = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("NotAllowed");
   public static final java.lang.String _DuplicateEntry = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("DuplicateEntry");
   public static final java.lang.String _UnableToDeleteWhenInUse = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("UnableToDeleteWhenInUse");
   public static final java.lang.String _InvalidMultiplier = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidMultiplier");
   public static final java.lang.String _InvalidTimeSpan = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("InvalidTimeSpan");
   public static final ErrorCode Unknown = new ErrorCode(_Unknown, true);
   public static final ErrorCode Success = new ErrorCode(_Success, true);
   public static final ErrorCode InternalError = new ErrorCode(_InternalError, true);
   public static final ErrorCode InvalidArguments = new ErrorCode(_InvalidArguments, true);
   public static final ErrorCode InvalidSession = new ErrorCode(_InvalidSession, true);
   public static final ErrorCode InvalidCurrency = new ErrorCode(_InvalidCurrency, true);
   public static final ErrorCode AccessRestricted = new ErrorCode(_AccessRestricted, true);
   public static final ErrorCode NicknameTaken = new ErrorCode(_NicknameTaken, true);
   public static final ErrorCode UserDisabled = new ErrorCode(_UserDisabled, true);
   public static final ErrorCode UnknownUser = new ErrorCode(_UnknownUser, true);
   public static final ErrorCode UserLocked = new ErrorCode(_UserLocked, true);
   public static final ErrorCode WrongUserPassword = new ErrorCode(_WrongUserPassword, true);
   public static final ErrorCode DepositFailed = new ErrorCode(_DepositFailed, true);
   public static final ErrorCode WithdrawFailed = new ErrorCode(_WithdrawFailed, true);
   public static final ErrorCode ActionDelayed = new ErrorCode(_ActionDelayed, true);
   public static final ErrorCode MandatoryFieldMissing = new ErrorCode(_MandatoryFieldMissing, true);
   public static final ErrorCode LoginExists = new ErrorCode(_LoginExists, true);
   public static final ErrorCode MaxLoginRetriesExceeded = new ErrorCode(_MaxLoginRetriesExceeded, true);
   public static final ErrorCode InvalidCampaign = new ErrorCode(_InvalidCampaign, true);
   public static final ErrorCode UserTooYoung = new ErrorCode(_UserTooYoung, true);
   public static final ErrorCode IPBlocked = new ErrorCode(_IPBlocked, true);
   public static final ErrorCode InvalidCountryRegion = new ErrorCode(_InvalidCountryRegion, true);
   public static final ErrorCode MaxPasswordChangesExceeded = new ErrorCode(_MaxPasswordChangesExceeded, true);
   public static final ErrorCode FailedUserInfoUpdate = new ErrorCode(_FailedUserInfoUpdate, true);
   public static final ErrorCode IncorrectOldPassword = new ErrorCode(_IncorrectOldPassword, true);
   public static final ErrorCode FailedChangePassword = new ErrorCode(_FailedChangePassword, true);
   public static final ErrorCode NicknameOffensive = new ErrorCode(_NicknameOffensive, true);
   public static final ErrorCode MaxRefillsReached = new ErrorCode(_MaxRefillsReached, true);
   public static final ErrorCode NoSuchExchangeRate = new ErrorCode(_NoSuchExchangeRate, true);
   public static final ErrorCode NoSuchJackpot = new ErrorCode(_NoSuchJackpot, true);
   public static final ErrorCode TournamentUnknown = new ErrorCode(_TournamentUnknown, true);
   public static final ErrorCode ServerFull = new ErrorCode(_ServerFull, true);
   public static final ErrorCode TransferNotAllowed = new ErrorCode(_TransferNotAllowed, true);
   public static final ErrorCode Timeout = new ErrorCode(_Timeout, true);
   public static final ErrorCode IncompleteUser = new ErrorCode(_IncompleteUser, true);
   public static final ErrorCode NotEnoughMoney = new ErrorCode(_NotEnoughMoney, true);
   public static final ErrorCode UnknownLink = new ErrorCode(_UnknownLink, true);
   public static final ErrorCode InvalidIP = new ErrorCode(_InvalidIP, true);
   public static final ErrorCode InvalidGame = new ErrorCode(_InvalidGame, true);
   public static final ErrorCode InvalidID = new ErrorCode(_InvalidID, true);
   public static final ErrorCode UserNotVerified = new ErrorCode(_UserNotVerified, true);
   public static final ErrorCode MaxAccountsPerEmail = new ErrorCode(_MaxAccountsPerEmail, true);
   public static final ErrorCode InvalidLogin = new ErrorCode(_InvalidLogin, true);
   public static final ErrorCode InvalidPassword = new ErrorCode(_InvalidPassword, true);
   public static final ErrorCode InvalidNickname = new ErrorCode(_InvalidNickname, true);
   public static final ErrorCode InvalidFirstName = new ErrorCode(_InvalidFirstName, true);
   public static final ErrorCode InvalidMiddleName = new ErrorCode(_InvalidMiddleName, true);
   public static final ErrorCode InvalidLastName = new ErrorCode(_InvalidLastName, true);
   public static final ErrorCode InvalidAddress = new ErrorCode(_InvalidAddress, true);
   public static final ErrorCode InvalidCountry = new ErrorCode(_InvalidCountry, true);
   public static final ErrorCode InvalidRegion = new ErrorCode(_InvalidRegion, true);
   public static final ErrorCode InvalidZip = new ErrorCode(_InvalidZip, true);
   public static final ErrorCode InvalidCity = new ErrorCode(_InvalidCity, true);
   public static final ErrorCode InvalidPhone = new ErrorCode(_InvalidPhone, true);
   public static final ErrorCode InvalidEmail = new ErrorCode(_InvalidEmail, true);
   public static final ErrorCode InvalidMobileNr = new ErrorCode(_InvalidMobileNr, true);
   public static final ErrorCode InvalidBirthdate = new ErrorCode(_InvalidBirthdate, true);
   public static final ErrorCode InvalidReferAFriend = new ErrorCode(_InvalidReferAFriend, true);
   public static final ErrorCode InvalidDataState = new ErrorCode(_InvalidDataState, true);
   public static final ErrorCode UnknownOrderType = new ErrorCode(_UnknownOrderType, true);
   public static final ErrorCode WithdrawalExceedsDeposits = new ErrorCode(_WithdrawalExceedsDeposits, true);
   public static final ErrorCode InvalidAmount = new ErrorCode(_InvalidAmount, true);
   public static final ErrorCode LimitExceededDaily = new ErrorCode(_LimitExceededDaily, true);
   public static final ErrorCode LimitExceededWeekly = new ErrorCode(_LimitExceededWeekly, true);
   public static final ErrorCode LimitExceededMonthly = new ErrorCode(_LimitExceededMonthly, true);
   public static final ErrorCode UnknownBonusCode = new ErrorCode(_UnknownBonusCode, true);
   public static final ErrorCode BonusOfferUsed = new ErrorCode(_BonusOfferUsed, true);
   public static final ErrorCode SameCreatorAndSigner = new ErrorCode(_SameCreatorAndSigner, true);
   public static final ErrorCode DuplicateOnGameTicket = new ErrorCode(_DuplicateOnGameTicket, true);
   public static final ErrorCode SystemMessageDeleting = new ErrorCode(_SystemMessageDeleting, true);
   public static final ErrorCode ReferencedMessageDeleting = new ErrorCode(_ReferencedMessageDeleting, true);
   public static final ErrorCode NotRegisteredAtOnGame = new ErrorCode(_NotRegisteredAtOnGame, true);
   public static final ErrorCode NotAllowed = new ErrorCode(_NotAllowed, true);
   public static final ErrorCode DuplicateEntry = new ErrorCode(_DuplicateEntry, true);
   public static final ErrorCode UnableToDeleteWhenInUse = new ErrorCode(_UnableToDeleteWhenInUse, true);
   public static final ErrorCode InvalidMultiplier = new ErrorCode(_InvalidMultiplier, true);
   public static final ErrorCode InvalidTimeSpan = new ErrorCode(_InvalidTimeSpan, true);

   /**
    * field for ErrorCode
    */
   protected java.lang.String localErrorCode;

   // Constructor
   protected ErrorCode(java.lang.String value, boolean isRegisterValue) {
      localErrorCode = value;

      if (isRegisterValue) {
         _table_.put(localErrorCode, this);
      }
   }

   public java.lang.String getValue() {
      return localErrorCode;
   }

   public boolean equals(java.lang.Object obj) {
      return (obj == this);
   }

   public int hashCode() {
      return toString().hashCode();
   }

   public java.lang.String toString() {
      return localErrorCode.toString();
   }

   /**
    *
    * @param parentQName
    * @param factory
    * @return org.apache.axiom.om.OMElement
    */
   public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
         final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {
      return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
   }

   public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
         throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
   }

   public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
         boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      // We can safely assume an element has only one type associated with it
      java.lang.String namespace = parentQName.getNamespaceURI();
      java.lang.String _localName = parentQName.getLocalPart();

      writeStartElement(null, namespace, _localName, xmlWriter);

      // add the type details if this is used in a simple type
      if (serializeType) {
         java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://playngo.com/v1");

         if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":ErrorCode",
                  xmlWriter);
         } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ErrorCode", xmlWriter);
         }
      }

      if (localErrorCode == null) {
         throw new org.apache.axis2.databinding.ADBException("ErrorCode cannot be null !!");
      } else {
         xmlWriter.writeCharacters(localErrorCode);
      }

      xmlWriter.writeEndElement();
   }

   private static java.lang.String generatePrefix(java.lang.String namespace) {
      if (namespace.equals("http://playngo.com/v1")) {
         return "ns3";
      }

      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
   }

   /**
    * Utility method to write an element start tag.
    */
   private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

      if (writerPrefix != null) {
         xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
         if (namespace.length() == 0) {
            prefix = "";
         } else if (prefix == null) {
            prefix = generatePrefix(namespace);
         }

         xmlWriter.writeStartElement(prefix, localPart, namespace);
         xmlWriter.writeNamespace(prefix, namespace);
         xmlWriter.setPrefix(prefix, namespace);
      }
   }

   /**
    * Util method to write an attribute with the ns prefix
    */
   private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
         java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
         throws javax.xml.stream.XMLStreamException {
      java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

      if (writerPrefix != null) {
         xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
         xmlWriter.writeNamespace(prefix, namespace);
         xmlWriter.setPrefix(prefix, namespace);
         xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
   }

   /**
    * Util method to write an attribute without the ns prefix
    */
   private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue,
         javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
         xmlWriter.writeAttribute(attName, attValue);
      } else {
         xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
   }

   /**
    * Util method to write an attribute without the ns prefix
    */
   private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
         javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
         throws javax.xml.stream.XMLStreamException {
      java.lang.String attributeNamespace = qname.getNamespaceURI();
      java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

      if (attributePrefix == null) {
         attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }

      java.lang.String attributeValue;

      if (attributePrefix.trim().length() > 0) {
         attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
         attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
         xmlWriter.writeAttribute(attName, attributeValue);
      } else {
         registerPrefix(xmlWriter, namespace);
         xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
   }

   /**
    * method to handle Qnames
    */
   private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
         throws javax.xml.stream.XMLStreamException {
      java.lang.String namespaceURI = qname.getNamespaceURI();

      if (namespaceURI != null) {
         java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

         if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix, namespaceURI);
         }

         if (prefix.trim().length() > 0) {
            xmlWriter.writeCharacters(
                  prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
         } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
         }
      } else {
         xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
   }

   private void writeQNames(javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
         throws javax.xml.stream.XMLStreamException {
      if (qnames != null) {
         // we have to store this data until last moment since it is not
         // possible to write any
         // namespace data after writing the charactor data
         java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
         java.lang.String namespaceURI = null;
         java.lang.String prefix = null;

         for (int i = 0; i < qnames.length; i++) {
            if (i > 0) {
               stringToWrite.append(" ");
            }

            namespaceURI = qnames[i].getNamespaceURI();

            if (namespaceURI != null) {
               prefix = xmlWriter.getPrefix(namespaceURI);

               if ((prefix == null) || (prefix.length() == 0)) {
                  prefix = generatePrefix(namespaceURI);
                  xmlWriter.writeNamespace(prefix, namespaceURI);
                  xmlWriter.setPrefix(prefix, namespaceURI);
               }

               if (prefix.trim().length() > 0) {
                  stringToWrite.append(prefix).append(":")
                        .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
               } else {
                  stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
               }
            } else {
               stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
         }

         xmlWriter.writeCharacters(stringToWrite.toString());
      }
   }

   /**
    * Register a namespace prefix
    */
   private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
         throws javax.xml.stream.XMLStreamException {
      java.lang.String prefix = xmlWriter.getPrefix(namespace);

      if (prefix == null) {
         prefix = generatePrefix(namespace);

         javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

         while (true) {
            java.lang.String uri = nsContext.getNamespaceURI(prefix);

            if ((uri == null) || (uri.length() == 0)) {
               break;
            }

            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
         }

         xmlWriter.writeNamespace(prefix, namespace);
         xmlWriter.setPrefix(prefix, namespace);
      }

      return prefix;
   }

   /**
    * Factory class that keeps the parse method
    */
   public static class Factory {
      private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

      public static ErrorCode fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
         ErrorCode enumeration = (ErrorCode) _table_.get(value);

         // handle unexpected enumeration values properly
         if (enumeration == null) {
            throw new java.lang.IllegalArgumentException();
         }

         return enumeration;
      }

      public static ErrorCode fromString(java.lang.String value, java.lang.String namespaceURI)
            throws java.lang.IllegalArgumentException {
         try {
            return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
         } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException();
         }
      }

      public static ErrorCode fromString(javax.xml.stream.XMLStreamReader xmlStreamReader, java.lang.String content) {
         if (content.indexOf(":") > -1) {
            java.lang.String prefix = content.substring(0, content.indexOf(":"));
            java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

            return ErrorCode.Factory.fromString(content, namespaceUri);
         } else {
            return ErrorCode.Factory.fromString(content, "");
         }
      }

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current or next start element starts this object and any
       * intervening reader events are ignorable If this object is not an
       * element, it is a complex type and the reader is at the event just after
       * the outer start element Postcondition: If this object is an element,
       * the reader is positioned at its end element If this object is a complex
       * type, the reader is positioned at the end element of its outer element
       */
      public static ErrorCode parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
         ErrorCode object = null;

         // initialize a hash map to keep values
         java.util.Map attributeMap = new java.util.HashMap();
         java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

         int event;
         javax.xml.namespace.QName currentQName = null;
         java.lang.String nillableValue = null;
         java.lang.String prefix = "";
         java.lang.String namespaceuri = "";

         try {
            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            currentQName = reader.getName();

            // Note all attributes that were handled. Used to differ normal
            // attributes
            // from anyAttributes.
            java.util.Vector handledAttributes = new java.util.Vector();

            while (!reader.isEndElement()) {
               if (reader.isStartElement() || reader.hasText()) {
                  nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                     throw new org.apache.axis2.databinding.ADBException(
                           "The element: " + "ErrorCode" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  if (content.indexOf(":") > 0) {
                     // this seems to be a Qname so find the namespace and send
                     prefix = content.substring(0, content.indexOf(":"));
                     namespaceuri = reader.getNamespaceURI(prefix);
                     object = ErrorCode.Factory.fromString(content, namespaceuri);
                  } else {
                     // this seems to be not a qname send and empty namespace
                     // incase of it is
                     // check is done in fromString method
                     object = ErrorCode.Factory.fromString(content, "");
                  }
               } else {
                  reader.next();
               }
            } // end of while loop
         } catch (javax.xml.stream.XMLStreamException e) {
            throw new java.lang.Exception(e);
         }

         return object;
      }
   } // end of factory class
}
