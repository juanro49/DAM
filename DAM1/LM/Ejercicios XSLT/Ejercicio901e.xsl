<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    CICLOS DE LOS AÑOS 2008 Y 2010
    <xsl:for-each select="//ciclo">
      <xsl:if test="decretotitulo/@año=2010 or decretotitulo/@año=2008">
        Código: <xsl:value-of select="@id"/>
        Grado: <xsl:value-of select="grado"/>
        Nombre: <xsl:value-of select="nombre"/>
        Decreto título: <xsl:value-of select="decretotitulo/@año"/>
      </xsl:if>
    </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
