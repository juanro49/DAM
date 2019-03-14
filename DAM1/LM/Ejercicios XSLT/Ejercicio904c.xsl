<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
  <xsl:text disable-output-escaping="yes">
    &lt;!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"&gt;
  </xsl:text>
  <html>
    <head>
      <title>Ejercicio 904a</title>
      <link rel="stylesheet" type="text/css" href="Ejercicio904a.css"/>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
      <center>
      <h1>CIUDADES DE ESPAÑA</h1>
      <xsl:apply-templates/>
      </center>
    </body>
  </html>
</xsl:template>
<xsl:template match="ciudad">
  <xsl:if test="habitantes > 100000">
    <h2><xsl:value-of select="nombre"/></h2>
  </xsl:if>
</xsl:template>
</xsl:stylesheet>