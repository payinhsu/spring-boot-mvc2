
/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */

package com.poseitech.integration.playngo.ws.client.model.appendix;

/**
 * Currency bean class
 */
public class Currency implements org.apache.axis2.databinding.ADBBean {
   /**
    * 
    */
   private static final long serialVersionUID = -2603058042678593871L;
   public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://playngo.com/v1",
         "Currency", "ns3");
   private static java.util.HashMap _table_ = new java.util.HashMap();
   public static final java.lang.String _Unknown = org.apache.axis2.databinding.utils.ConverterUtil
         .convertToString("Unknown");
   public static final java.lang.String _EUR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("EUR");
   public static final java.lang.String _USD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("USD");
   public static final java.lang.String _SEK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SEK");
   public static final java.lang.String _NOK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NOK");
   public static final java.lang.String _DKK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DKK");
   public static final java.lang.String _ARS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ARS");
   public static final java.lang.String _CAD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CAD");
   public static final java.lang.String _GBP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GBP");
   public static final java.lang.String _HUF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("HUF");
   public static final java.lang.String _ILS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ILS");
   public static final java.lang.String _INR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("INR");
   public static final java.lang.String _ISK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ISK");
   public static final java.lang.String _JPY = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("JPY");
   public static final java.lang.String _ZAR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ZAR");
   public static final java.lang.String _RUB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RUB");
   public static final java.lang.String _AUD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AUD");
   public static final java.lang.String _CHF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CHF");
   public static final java.lang.String _PLN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PLN");
   public static final java.lang.String _CNY = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CNY");
   public static final java.lang.String _EEK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("EEK");
   public static final java.lang.String _LTL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LTL");
   public static final java.lang.String _LVL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LVL");
   public static final java.lang.String _MXN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MXN");
   public static final java.lang.String _NZD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NZD");
   public static final java.lang.String _CZK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CZK");
   public static final java.lang.String _HRK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("HRK");
   public static final java.lang.String _RON = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RON");
   public static final java.lang.String _BGN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BGN");
   public static final java.lang.String _TRY = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TRY");
   public static final java.lang.String _VEF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("VEF");
   public static final java.lang.String _BRL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BRL");
   public static final java.lang.String _HKD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("HKD");
   public static final java.lang.String _SGD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SGD");
   public static final java.lang.String _IDR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IDR");
   public static final java.lang.String _GEL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GEL");
   public static final java.lang.String _PEN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PEN");
   public static final java.lang.String _MYR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MYR");
   public static final java.lang.String _THB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("THB");
   public static final java.lang.String _TWD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TWD");
   public static final java.lang.String _RMB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RMB");
   public static final java.lang.String _AED = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AED");
   public static final java.lang.String _BAM = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BAM");
   public static final java.lang.String _MBC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MBC");
   public static final java.lang.String _CRD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CRD");
   public static final java.lang.String _KRW = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KRW");
   public static final java.lang.String _VND = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("VND");
   public static final java.lang.String _CLP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CLP");
   public static final java.lang.String _AFN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AFN");
   public static final java.lang.String _ALL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ALL");
   public static final java.lang.String _DZD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DZD");
   public static final java.lang.String _AOA = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AOA");
   public static final java.lang.String _AMD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AMD");
   public static final java.lang.String _AWG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AWG");
   public static final java.lang.String _AZN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("AZN");
   public static final java.lang.String _BSD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BSD");
   public static final java.lang.String _BHD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BHD");
   public static final java.lang.String _BDT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BDT");
   public static final java.lang.String _BBD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BBD");
   public static final java.lang.String _BYR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BYR");
   public static final java.lang.String _BZD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BZD");
   public static final java.lang.String _BMD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BMD");
   public static final java.lang.String _BTN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BTN");
   public static final java.lang.String _BOB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BOB");
   public static final java.lang.String _BWP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BWP");
   public static final java.lang.String _BND = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BND");
   public static final java.lang.String _BIF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("BIF");
   public static final java.lang.String _KHR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KHR");
   public static final java.lang.String _CVE = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CVE");
   public static final java.lang.String _KYD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KYD");
   public static final java.lang.String _XAF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("XAF");
   public static final java.lang.String _XPF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("XPF");
   public static final java.lang.String _KMF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KMF");
   public static final java.lang.String _CDF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CDF");
   public static final java.lang.String _CRC = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CRC");
   public static final java.lang.String _CUP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("CUP");
   public static final java.lang.String _DJF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DJF");
   public static final java.lang.String _DOP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("DOP");
   public static final java.lang.String _XCD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("XCD");
   public static final java.lang.String _EGP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("EGP");
   public static final java.lang.String _ETB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ETB");
   public static final java.lang.String _FKP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FKP");
   public static final java.lang.String _FJD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("FJD");
   public static final java.lang.String _GMD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GMD");
   public static final java.lang.String _GHS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GHS");
   public static final java.lang.String _GIP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GIP");
   public static final java.lang.String _GTQ = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GTQ");
   public static final java.lang.String _GNF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GNF");
   public static final java.lang.String _GYD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("GYD");
   public static final java.lang.String _HTG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("HTG");
   public static final java.lang.String _HNL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("HNL");
   public static final java.lang.String _IRR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IRR");
   public static final java.lang.String _IQD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("IQD");
   public static final java.lang.String _JMD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("JMD");
   public static final java.lang.String _JOD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("JOD");
   public static final java.lang.String _KZT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KZT");
   public static final java.lang.String _KES = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KES");
   public static final java.lang.String _KWD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KWD");
   public static final java.lang.String _KGS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KGS");
   public static final java.lang.String _LAK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LAK");
   public static final java.lang.String _LBP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LBP");
   public static final java.lang.String _LSL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LSL");
   public static final java.lang.String _LRD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LRD");
   public static final java.lang.String _LYD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LYD");
   public static final java.lang.String _MOP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MOP");
   public static final java.lang.String _MKD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MKD");
   public static final java.lang.String _MGA = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MGA");
   public static final java.lang.String _MWK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MWK");
   public static final java.lang.String _MVR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MVR");
   public static final java.lang.String _MRO = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MRO");
   public static final java.lang.String _MUR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MUR");
   public static final java.lang.String _MDL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MDL");
   public static final java.lang.String _MNT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MNT");
   public static final java.lang.String _MAD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MAD");
   public static final java.lang.String _MZN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MZN");
   public static final java.lang.String _MMK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("MMK");
   public static final java.lang.String _NAD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NAD");
   public static final java.lang.String _NPR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NPR");
   public static final java.lang.String _ANG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ANG");
   public static final java.lang.String _NIO = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NIO");
   public static final java.lang.String _NGN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("NGN");
   public static final java.lang.String _KPW = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("KPW");
   public static final java.lang.String _OMR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("OMR");
   public static final java.lang.String _PKR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PKR");
   public static final java.lang.String _PGK = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PGK");
   public static final java.lang.String _PYG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PYG");
   public static final java.lang.String _PHP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PHP");
   public static final java.lang.String _QAR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("QAR");
   public static final java.lang.String _RWF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RWF");
   public static final java.lang.String _SHP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SHP");
   public static final java.lang.String _WST = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("WST");
   public static final java.lang.String _STD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("STD");
   public static final java.lang.String _SAR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SAR");
   public static final java.lang.String _RSD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("RSD");
   public static final java.lang.String _SCR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SCR");
   public static final java.lang.String _SLL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SLL");
   public static final java.lang.String _SBD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SBD");
   public static final java.lang.String _SOS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SOS");
   public static final java.lang.String _LKR = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("LKR");
   public static final java.lang.String _SDG = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SDG");
   public static final java.lang.String _SRD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SRD");
   public static final java.lang.String _SZL = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SZL");
   public static final java.lang.String _SYP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("SYP");
   public static final java.lang.String _TJS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TJS");
   public static final java.lang.String _TZS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TZS");
   public static final java.lang.String _TOP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TOP");
   public static final java.lang.String _TTD = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TTD");
   public static final java.lang.String _TND = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TND");
   public static final java.lang.String _TMT = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("TMT");
   public static final java.lang.String _UGX = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UGX");
   public static final java.lang.String _UAH = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UAH");
   public static final java.lang.String _UYU = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UYU");
   public static final java.lang.String _UZS = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("UZS");
   public static final java.lang.String _VUV = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("VUV");
   public static final java.lang.String _XOF = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("XOF");
   public static final java.lang.String _YER = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("YER");
   public static final java.lang.String _ZMW = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ZMW");
   public static final java.lang.String _COP = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("COP");
   public static final java.lang.String _ERN = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("ERN");
   public static final java.lang.String _PAB = org.apache.axis2.databinding.utils.ConverterUtil.convertToString("PAB");
   public static final Currency Unknown = new Currency(_Unknown, true);
   public static final Currency EUR = new Currency(_EUR, true);
   public static final Currency USD = new Currency(_USD, true);
   public static final Currency SEK = new Currency(_SEK, true);
   public static final Currency NOK = new Currency(_NOK, true);
   public static final Currency DKK = new Currency(_DKK, true);
   public static final Currency ARS = new Currency(_ARS, true);
   public static final Currency CAD = new Currency(_CAD, true);
   public static final Currency GBP = new Currency(_GBP, true);
   public static final Currency HUF = new Currency(_HUF, true);
   public static final Currency ILS = new Currency(_ILS, true);
   public static final Currency INR = new Currency(_INR, true);
   public static final Currency ISK = new Currency(_ISK, true);
   public static final Currency JPY = new Currency(_JPY, true);
   public static final Currency ZAR = new Currency(_ZAR, true);
   public static final Currency RUB = new Currency(_RUB, true);
   public static final Currency AUD = new Currency(_AUD, true);
   public static final Currency CHF = new Currency(_CHF, true);
   public static final Currency PLN = new Currency(_PLN, true);
   public static final Currency CNY = new Currency(_CNY, true);
   public static final Currency EEK = new Currency(_EEK, true);
   public static final Currency LTL = new Currency(_LTL, true);
   public static final Currency LVL = new Currency(_LVL, true);
   public static final Currency MXN = new Currency(_MXN, true);
   public static final Currency NZD = new Currency(_NZD, true);
   public static final Currency CZK = new Currency(_CZK, true);
   public static final Currency HRK = new Currency(_HRK, true);
   public static final Currency RON = new Currency(_RON, true);
   public static final Currency BGN = new Currency(_BGN, true);
   public static final Currency TRY = new Currency(_TRY, true);
   public static final Currency VEF = new Currency(_VEF, true);
   public static final Currency BRL = new Currency(_BRL, true);
   public static final Currency HKD = new Currency(_HKD, true);
   public static final Currency SGD = new Currency(_SGD, true);
   public static final Currency IDR = new Currency(_IDR, true);
   public static final Currency GEL = new Currency(_GEL, true);
   public static final Currency PEN = new Currency(_PEN, true);
   public static final Currency MYR = new Currency(_MYR, true);
   public static final Currency THB = new Currency(_THB, true);
   public static final Currency TWD = new Currency(_TWD, true);
   public static final Currency RMB = new Currency(_RMB, true);
   public static final Currency AED = new Currency(_AED, true);
   public static final Currency BAM = new Currency(_BAM, true);
   public static final Currency MBC = new Currency(_MBC, true);
   public static final Currency CRD = new Currency(_CRD, true);
   public static final Currency KRW = new Currency(_KRW, true);
   public static final Currency VND = new Currency(_VND, true);
   public static final Currency CLP = new Currency(_CLP, true);
   public static final Currency AFN = new Currency(_AFN, true);
   public static final Currency ALL = new Currency(_ALL, true);
   public static final Currency DZD = new Currency(_DZD, true);
   public static final Currency AOA = new Currency(_AOA, true);
   public static final Currency AMD = new Currency(_AMD, true);
   public static final Currency AWG = new Currency(_AWG, true);
   public static final Currency AZN = new Currency(_AZN, true);
   public static final Currency BSD = new Currency(_BSD, true);
   public static final Currency BHD = new Currency(_BHD, true);
   public static final Currency BDT = new Currency(_BDT, true);
   public static final Currency BBD = new Currency(_BBD, true);
   public static final Currency BYR = new Currency(_BYR, true);
   public static final Currency BZD = new Currency(_BZD, true);
   public static final Currency BMD = new Currency(_BMD, true);
   public static final Currency BTN = new Currency(_BTN, true);
   public static final Currency BOB = new Currency(_BOB, true);
   public static final Currency BWP = new Currency(_BWP, true);
   public static final Currency BND = new Currency(_BND, true);
   public static final Currency BIF = new Currency(_BIF, true);
   public static final Currency KHR = new Currency(_KHR, true);
   public static final Currency CVE = new Currency(_CVE, true);
   public static final Currency KYD = new Currency(_KYD, true);
   public static final Currency XAF = new Currency(_XAF, true);
   public static final Currency XPF = new Currency(_XPF, true);
   public static final Currency KMF = new Currency(_KMF, true);
   public static final Currency CDF = new Currency(_CDF, true);
   public static final Currency CRC = new Currency(_CRC, true);
   public static final Currency CUP = new Currency(_CUP, true);
   public static final Currency DJF = new Currency(_DJF, true);
   public static final Currency DOP = new Currency(_DOP, true);
   public static final Currency XCD = new Currency(_XCD, true);
   public static final Currency EGP = new Currency(_EGP, true);
   public static final Currency ETB = new Currency(_ETB, true);
   public static final Currency FKP = new Currency(_FKP, true);
   public static final Currency FJD = new Currency(_FJD, true);
   public static final Currency GMD = new Currency(_GMD, true);
   public static final Currency GHS = new Currency(_GHS, true);
   public static final Currency GIP = new Currency(_GIP, true);
   public static final Currency GTQ = new Currency(_GTQ, true);
   public static final Currency GNF = new Currency(_GNF, true);
   public static final Currency GYD = new Currency(_GYD, true);
   public static final Currency HTG = new Currency(_HTG, true);
   public static final Currency HNL = new Currency(_HNL, true);
   public static final Currency IRR = new Currency(_IRR, true);
   public static final Currency IQD = new Currency(_IQD, true);
   public static final Currency JMD = new Currency(_JMD, true);
   public static final Currency JOD = new Currency(_JOD, true);
   public static final Currency KZT = new Currency(_KZT, true);
   public static final Currency KES = new Currency(_KES, true);
   public static final Currency KWD = new Currency(_KWD, true);
   public static final Currency KGS = new Currency(_KGS, true);
   public static final Currency LAK = new Currency(_LAK, true);
   public static final Currency LBP = new Currency(_LBP, true);
   public static final Currency LSL = new Currency(_LSL, true);
   public static final Currency LRD = new Currency(_LRD, true);
   public static final Currency LYD = new Currency(_LYD, true);
   public static final Currency MOP = new Currency(_MOP, true);
   public static final Currency MKD = new Currency(_MKD, true);
   public static final Currency MGA = new Currency(_MGA, true);
   public static final Currency MWK = new Currency(_MWK, true);
   public static final Currency MVR = new Currency(_MVR, true);
   public static final Currency MRO = new Currency(_MRO, true);
   public static final Currency MUR = new Currency(_MUR, true);
   public static final Currency MDL = new Currency(_MDL, true);
   public static final Currency MNT = new Currency(_MNT, true);
   public static final Currency MAD = new Currency(_MAD, true);
   public static final Currency MZN = new Currency(_MZN, true);
   public static final Currency MMK = new Currency(_MMK, true);
   public static final Currency NAD = new Currency(_NAD, true);
   public static final Currency NPR = new Currency(_NPR, true);
   public static final Currency ANG = new Currency(_ANG, true);
   public static final Currency NIO = new Currency(_NIO, true);
   public static final Currency NGN = new Currency(_NGN, true);
   public static final Currency KPW = new Currency(_KPW, true);
   public static final Currency OMR = new Currency(_OMR, true);
   public static final Currency PKR = new Currency(_PKR, true);
   public static final Currency PGK = new Currency(_PGK, true);
   public static final Currency PYG = new Currency(_PYG, true);
   public static final Currency PHP = new Currency(_PHP, true);
   public static final Currency QAR = new Currency(_QAR, true);
   public static final Currency RWF = new Currency(_RWF, true);
   public static final Currency SHP = new Currency(_SHP, true);
   public static final Currency WST = new Currency(_WST, true);
   public static final Currency STD = new Currency(_STD, true);
   public static final Currency SAR = new Currency(_SAR, true);
   public static final Currency RSD = new Currency(_RSD, true);
   public static final Currency SCR = new Currency(_SCR, true);
   public static final Currency SLL = new Currency(_SLL, true);
   public static final Currency SBD = new Currency(_SBD, true);
   public static final Currency SOS = new Currency(_SOS, true);
   public static final Currency LKR = new Currency(_LKR, true);
   public static final Currency SDG = new Currency(_SDG, true);
   public static final Currency SRD = new Currency(_SRD, true);
   public static final Currency SZL = new Currency(_SZL, true);
   public static final Currency SYP = new Currency(_SYP, true);
   public static final Currency TJS = new Currency(_TJS, true);
   public static final Currency TZS = new Currency(_TZS, true);
   public static final Currency TOP = new Currency(_TOP, true);
   public static final Currency TTD = new Currency(_TTD, true);
   public static final Currency TND = new Currency(_TND, true);
   public static final Currency TMT = new Currency(_TMT, true);
   public static final Currency UGX = new Currency(_UGX, true);
   public static final Currency UAH = new Currency(_UAH, true);
   public static final Currency UYU = new Currency(_UYU, true);
   public static final Currency UZS = new Currency(_UZS, true);
   public static final Currency VUV = new Currency(_VUV, true);
   public static final Currency XOF = new Currency(_XOF, true);
   public static final Currency YER = new Currency(_YER, true);
   public static final Currency ZMW = new Currency(_ZMW, true);
   public static final Currency COP = new Currency(_COP, true);
   public static final Currency ERN = new Currency(_ERN, true);
   public static final Currency PAB = new Currency(_PAB, true);

   /**
    * field for Currency
    */
   protected java.lang.String localCurrency;

   // Constructor
   protected Currency(java.lang.String value, boolean isRegisterValue) {
      localCurrency = value;

      if (isRegisterValue) {
         _table_.put(localCurrency, this);
      }
   }

   public java.lang.String getValue() {
      return localCurrency;
   }

   public boolean equals(java.lang.Object obj) {
      return (obj == this);
   }

   public int hashCode() {
      return toString().hashCode();
   }

   public java.lang.String toString() {
      return localCurrency.toString();
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
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":Currency",
                  xmlWriter);
         } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Currency", xmlWriter);
         }
      }

      if (localCurrency == null) {
         throw new org.apache.axis2.databinding.ADBException("Currency cannot be null !!");
      } else {
         xmlWriter.writeCharacters(localCurrency);
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

      public static Currency fromValue(java.lang.String value) throws java.lang.IllegalArgumentException {
         Currency enumeration = (Currency) _table_.get(value);

         // handle unexpected enumeration values properly
         if (enumeration == null) {
            throw new java.lang.IllegalArgumentException();
         }

         return enumeration;
      }

      public static Currency fromString(java.lang.String value, java.lang.String namespaceURI)
            throws java.lang.IllegalArgumentException {
         try {
            return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(value));
         } catch (java.lang.Exception e) {
            throw new java.lang.IllegalArgumentException();
         }
      }

      public static Currency fromString(javax.xml.stream.XMLStreamReader xmlStreamReader, java.lang.String content) {
         if (content.indexOf(":") > -1) {
            java.lang.String prefix = content.substring(0, content.indexOf(":"));
            java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext().getNamespaceURI(prefix);

            return Currency.Factory.fromString(content, namespaceUri);
         } else {
            return Currency.Factory.fromString(content, "");
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
      public static Currency parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
         Currency object = null;

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
                           "The element: " + "Currency" + "  cannot be null");
                  }

                  java.lang.String content = reader.getElementText();

                  if (content.indexOf(":") > 0) {
                     // this seems to be a Qname so find the namespace and send
                     prefix = content.substring(0, content.indexOf(":"));
                     namespaceuri = reader.getNamespaceURI(prefix);
                     object = Currency.Factory.fromString(content, namespaceuri);
                  } else {
                     // this seems to be not a qname send and empty namespace
                     // incase of it is
                     // check is done in fromString method
                     object = Currency.Factory.fromString(content, "");
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
