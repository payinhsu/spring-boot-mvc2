/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:48:01 BST)
 */

package com.poseitech.integration.playngo.ws.client.v1;

import com.poseitech.integration.playngo.ws.client.model.user.UserBalance;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ExtensionMapper {

   public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName,
         javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {

      if ("http://playngo.com/v1".equals(namespaceURI) && "UserBalance".equals(typeName)) {
         return UserBalance.Factory.parse(reader);
      }

      throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
   }

}
