<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    CICLOS DE GRADO SUPERIOR
    <xsl:for-each select="//ciclo">
        <xsl:if test="grado='Superior'">
          Código: <xsl:value-of select="@id"/>
          Nombre: <xsl:value-of select="nombre"/>
          Decreto título: <xsl:value-of select="decretotitulo/@año"/>
        </xsl:if>
      </xsl:for-each>
  </xsl:template>
</xsl:stylesheet>
