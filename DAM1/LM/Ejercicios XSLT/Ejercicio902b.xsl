<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
  <ciudades>
    <xsl:apply-templates/>
  </ciudades>
</xsl:template>
<xsl:template match="museo">
  <ciudad>
    <xsl:attribute name="nombre">
      <xsl:value-of select="ciudad"/>
    </xsl:attribute>
    <xsl:attribute name="pais">
      <xsl:value-of select="pais"/>
    </xsl:attribute>.
    <museo>
      <xsl:value-of select="nombre"/>
    </museo>.
  </ciudad>
</xsl:template>
</xsl:stylesheet>