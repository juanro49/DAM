<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
  <museos>
    <xsl:apply-templates/>
  </museos>
</xsl:template>
<xsl:template match="museo">
  <museo>
    <nombre>
      <xsl:value-of select="nombre"/>
    </nombre>
    <ubicacion>
      <xsl:attribute name="ciudad">
        <xsl:value-of select="ciudad"/>
      </xsl:attribute>
      <xsl:attribute name="pais">
        <xsl:value-of select="pais"/>
      </xsl:attribute>
    </ubicacion>
  </museo>
</xsl:template>
</xsl:stylesheet>