<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"> 
  	<xsl:template match="libro">
		Libro.
    		Autor:<xsl:value-of select="autor"/>
    		Título:<xsl:value-of select="titulo"/>
  	</xsl:template>
   	<xsl:template match="revista">
		Revista.
    		Director:<xsl:value-of select="director"/>
    		Título:<xsl:value-of select="titulo"/>
  	</xsl:template>
</xsl:stylesheet>