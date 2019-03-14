<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">   
	<xsl:template match="libro">
	<xsl:if test="fechapublicacion/@año=1973">
      		<xsl:value-of select="titulo"/>
    	</xsl:if>
</xsl:template>
<xsl:template match="revista"/>
</xsl:stylesheet>