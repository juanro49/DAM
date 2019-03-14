<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <xsl:text disable-output-escaping="yes">
      &lt;!DOCTYPE paises SYSTEM "Ejercicio903d.dtd"&gt;
    </xsl:text>
    <paises>
      <xsl:apply-templates/>
    </paises>
  </xsl:template>
  <xsl:template match="museo">
    <pais>
      <xsl:attribute name="nombre">
        <xsl:value-of select="@pais"/>
      </xsl:attribute>
      <ciudad>
        <xsl:attribute name="nombre">
          <xsl:value-of select="@ciudad"/>
        </xsl:attribute>
        <museo>
          <xsl:attribute name="nombre">
            <xsl:value-of select="@nombre"/>
          </xsl:attribute>
        </museo>
      </ciudad>
    </pais>
  </xsl:template>
</xsl:stylesheet>
