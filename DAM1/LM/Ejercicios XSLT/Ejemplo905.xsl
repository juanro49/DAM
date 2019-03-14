<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"> 
<xsl:template match="/">
  <xsl:text>
    &lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"&lt;
  </xsl:text>
  <html>
    <head>
      <title>Ejemplo 905</title>
      <link rel="stylesheet" type="text/css" href="Ejemplo905.css"/>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
      <xsl:apply-templates/>
    </body>
  </html>
</xsl:template>
<xsl:template match="ciudad">
  <h2><xsl:value-of select="nombre"/></h2>
</xsl:template>
</xsl:stylesheet>