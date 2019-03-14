<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <xsl:text disable-output-escaping="yes">
      &lt;!DOCTYPE museos SYSTEM "Ejercicio903b.dtd"&gt;
    </xsl:text>
    <museos>
      <xsl:apply-templates/>
    </museos>
  </xsl:template>
  <xsl:template match="museo">
    <museo>
      <xsl:attribute name="ubicacion">
        <xsl:value-of select="@ciudad"/>
        <xsl:text>, </xsl:text>
        <xsl:value-of select="@pais"/>
      </xsl:attribute>
      <xsl:value-of select="@nombre"/>
    </museo>
  </xsl:template>
</xsl:stylesheet>
