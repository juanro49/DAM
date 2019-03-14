<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text" />
  <xsl:template match="persona">
  insert into personas (nombre,edad)
  values('<xsl:value-of select="nombre"/>', <xsl:value-of select="edad"/>);
  </xsl:template>
</xsl:stylesheet>
