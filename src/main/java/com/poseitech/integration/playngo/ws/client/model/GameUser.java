
/**
 * GameUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */

package com.poseitech.integration.playngo.ws.client.model;

import com.poseitech.integration.playngo.ws.client.v1.ExtensionMapper;

/**
 * GameUser bean class
 */

public class GameUser implements org.apache.axis2.databinding.ADBBean {
   /*
    * This type was generated from the piece of schema that had name = GameUser
    * Namespace URI = http://playngo.com/v1 Namespace Prefix = ns3
    */

   /**
    * 
    */
   private static final long serialVersionUID = 4306500872473842281L;

   /**
    * field for ExternalUserId
    */
   protected java.lang.String localExternalUserId;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localExternalUserIdTracker = false;

   /**
    * field for Username
    */
   protected java.lang.String localUsername;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localUsernameTracker = false;

   /**
    * field for Nickname
    */
   protected java.lang.String localNickname;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localNicknameTracker = false;

   /**
    * field for Currency
    */
   protected java.lang.String localCurrency;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localCurrencyTracker = false;

   /**
    * field for Country
    */
   protected java.lang.String localCountry;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localCountryTracker = false;

   /**
    * field for Birthdate
    */
   protected String localBirthdate;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localBirthdateTracker = false;

   /**
    * field for Registration
    */
   protected String localRegistration;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localRegistrationTracker = false;

   /**
    * field for BrandId
    */
   protected java.lang.String localBrandId;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localBrandIdTracker = false;

   /**
    * field for Language
    */
   protected java.lang.String localLanguage;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localLanguageTracker = false;

   /**
    * field for IP
    */
   protected java.lang.String localIP;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localIPTracker = false;

   /**
    * field for Locked
    */
   protected boolean localLocked;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localLockedTracker = false;

   /**
    * field for Gender
    */
   protected java.lang.String localGender;

   /*
    * This tracker boolean wil be used to detect whether the user called the set
    * method for this attribute. It will be used to determine whether to include
    * this field in the serialized XML
    */
   protected boolean localGenderTracker = false;

   public boolean isExternalUserIdSpecified() {
      return localExternalUserIdTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getExternalUserId() {
      return localExternalUserId;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           ExternalUserId
    */
   public void setExternalUserId(java.lang.String param) {
      localExternalUserIdTracker = true;

      this.localExternalUserId = param;
   }

   public boolean isUsernameSpecified() {
      return localUsernameTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getUsername() {
      return localUsername;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Username
    */
   public void setUsername(java.lang.String param) {
      localUsernameTracker = true;

      this.localUsername = param;
   }

   public boolean isNicknameSpecified() {
      return localNicknameTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getNickname() {
      return localNickname;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Nickname
    */
   public void setNickname(java.lang.String param) {
      localNicknameTracker = true;

      this.localNickname = param;
   }

   public boolean isCurrencySpecified() {
      return localCurrencyTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getCurrency() {
      return localCurrency;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Currency
    */
   public void setCurrency(java.lang.String param) {
      localCurrencyTracker = true;

      this.localCurrency = param;
   }

   public boolean isCountrySpecified() {
      return localCountryTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getCountry() {
      return localCountry;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Country
    */
   public void setCountry(java.lang.String param) {
      localCountryTracker = true;

      this.localCountry = param;
   }

   public boolean isBirthdateSpecified() {
      return localBirthdateTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.util.Calendar
    */
   public String getBirthdate() {
      return localBirthdate;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Birthdate
    */
   public void setBirthdate(String param) {
      localBirthdateTracker = true;

      this.localBirthdate = param;
   }

   public boolean isRegistrationSpecified() {
      return localRegistrationTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.util.Calendar
    */
   public String getRegistration() {
      return localRegistration;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Registration
    */
   public void setRegistration(String param) {
      localRegistrationTracker = true;

      this.localRegistration = param;
   }

   public boolean isBrandIdSpecified() {
      return localBrandIdTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getBrandId() {
      return localBrandId;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           BrandId
    */
   public void setBrandId(java.lang.String param) {
      localBrandIdTracker = true;

      this.localBrandId = param;
   }

   public boolean isLanguageSpecified() {
      return localLanguageTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getLanguage() {
      return localLanguage;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Language
    */
   public void setLanguage(java.lang.String param) {
      localLanguageTracker = true;

      this.localLanguage = param;
   }

   public boolean isIPSpecified() {
      return localIPTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getIP() {
      return localIP;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           IP
    */
   public void setIP(java.lang.String param) {
      localIPTracker = true;

      this.localIP = param;
   }

   public boolean isLockedSpecified() {
      return localLockedTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return boolean
    */
   public boolean getLocked() {
      return localLocked;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Locked
    */
   public void setLocked(boolean param) {
      // setting primitive attribute tracker to true
      localLockedTracker = true;

      this.localLocked = param;
   }

   public boolean isGenderSpecified() {
      return localGenderTracker;
   }

   /**
    * Auto generated getter method
    * 
    * @return java.lang.String
    */
   public java.lang.String getGender() {
      return localGender;
   }

   /**
    * Auto generated setter method
    * 
    * @param param
    *           Gender
    */
   public void setGender(java.lang.String param) {
      localGenderTracker = true;

      this.localGender = param;
   }

   /**
    *
    * @param parentQName
    * @param factory
    * @return org.apache.axiom.om.OMElement
    */
   public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
         final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {
      return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
   }

   public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
         throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
   }

   public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter,
         boolean serializeType) throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      java.lang.String prefix = null;
      java.lang.String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {
         java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://playngo.com/v1");

         if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", namespacePrefix + ":GameUser",
                  xmlWriter);
         } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "GameUser", xmlWriter);
         }
      }

      if (localExternalUserIdTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "ExternalUserId", xmlWriter);

         if (localExternalUserId == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localExternalUserId);
         }

         xmlWriter.writeEndElement();
      }

      if (localUsernameTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Username", xmlWriter);

         if (localUsername == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localUsername);
         }

         xmlWriter.writeEndElement();
      }

      if (localNicknameTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Nickname", xmlWriter);

         if (localNickname == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localNickname);
         }

         xmlWriter.writeEndElement();
      }

      if (localCurrencyTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Currency", xmlWriter);

         if (localCurrency == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localCurrency);
         }

         xmlWriter.writeEndElement();
      }

      if (localCountryTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Country", xmlWriter);

         if (localCountry == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localCountry);
         }

         xmlWriter.writeEndElement();
      }

      if (localBirthdateTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Birthdate", xmlWriter);

         if (localBirthdate == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBirthdate));
         }

         xmlWriter.writeEndElement();
      }

      if (localRegistrationTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Registration", xmlWriter);

         if (localRegistration == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter
                  .writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRegistration));
         }

         xmlWriter.writeEndElement();
      }

      if (localBrandIdTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "BrandId", xmlWriter);

         if (localBrandId == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localBrandId);
         }

         xmlWriter.writeEndElement();
      }

      if (localLanguageTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Language", xmlWriter);

         if (localLanguage == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localLanguage);
         }

         xmlWriter.writeEndElement();
      }

      if (localIPTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "IP", xmlWriter);

         if (localIP == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localIP);
         }

         xmlWriter.writeEndElement();
      }

      if (localLockedTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Locked", xmlWriter);

         if (false) {
            throw new org.apache.axis2.databinding.ADBException("Locked cannot be null!!");
         } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocked));
         }

         xmlWriter.writeEndElement();
      }

      if (localGenderTracker) {
         namespace = "http://playngo.com/v1";
         writeStartElement(null, namespace, "Gender", xmlWriter);

         if (localGender == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
         } else {
            xmlWriter.writeCharacters(localGender);
         }

         xmlWriter.writeEndElement();
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

      /**
       * static method to create the object Precondition: If this object is an
       * element, the current or next start element starts this object and any
       * intervening reader events are ignorable If this object is not an
       * element, it is a complex type and the reader is at the event just after
       * the outer start element Postcondition: If this object is an element,
       * the reader is positioned at its end element If this object is a complex
       * type, the reader is positioned at the end element of its outer element
       */
      public static GameUser parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
         GameUser object = new GameUser();

         int event;
         javax.xml.namespace.QName currentQName = null;
         java.lang.String nillableValue = null;
         java.lang.String prefix = "";
         java.lang.String namespaceuri = "";

         try {
            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            currentQName = reader.getName();

            if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
               java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                     "type");

               if (fullTypeName != null) {
                  java.lang.String nsPrefix = null;

                  if (fullTypeName.indexOf(":") > -1) {
                     nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                  }

                  nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                  java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                  if (!"GameUser".equals(type)) {
                     // find namespace for the prefix
                     java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);

                     return (GameUser) ExtensionMapper.getTypeObject(nsUri, type, reader);
                  }
               }
            }

            // Note all attributes that were handled. Used to differ normal
            // attributes
            // from anyAttributes.
            java.util.Vector handledAttributes = new java.util.Vector();

            reader.next();

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "ExternalUserId").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "ExternalUserId").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setExternalUserId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Username").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Username").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setUsername(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Nickname").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Nickname").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setNickname(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Currency").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Currency").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setCurrency(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Country").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Country").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setCountry(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Birthdate").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Birthdate").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

//                  object.setBirthdate(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                  object.setBirthdate(content);
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Registration").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Registration").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

//                  object.setRegistration(org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                  object.setRegistration(content);
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "BrandId").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "BrandId").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setBrandId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Language").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Language").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setLanguage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "IP").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "IP").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setIP(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Locked").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Locked").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                  throw new org.apache.axis2.databinding.ADBException("The element: " + "Locked" + "  cannot be null");
               }

               java.lang.String content = reader.getElementText();

               object.setLocked(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if ((reader.isStartElement()
                  && new javax.xml.namespace.QName("http://playngo.com/v1", "Gender").equals(reader.getName()))
                  || new javax.xml.namespace.QName("", "Gender").equals(reader.getName())) {
               nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");

               if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {
                  java.lang.String content = reader.getElementText();

                  object.setGender(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
               } else {
                  reader.getElementText(); // throw away text nodes if any.
               }

               reader.next();
            } // End of if for expected property start element

            else {
            }

            while (!reader.isStartElement() && !reader.isEndElement())
               reader.next();

            if (reader.isStartElement()) {
               // 2 - A start element we are not expecting indicates a trailing
               // invalid property
               throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
            }
         } catch (javax.xml.stream.XMLStreamException e) {
            throw new java.lang.Exception(e);
         }

         return object;
      }
   } // end of factory class
}
