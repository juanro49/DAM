<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text" />
  <xsl:template match="Universidad">
    <xsl:apply-templates/>
  </xsl:template>
  <xsl:template match="nombre"/>
  <xsl:template match="pais"/>
  <xsl:template match="carreras/carrera">
    insert into carreras (id,nombre,plan,creditos,centro)
    values('<xsl:value-of select="@id"/>', <xsl:value-of select="nombre"/>,<xsl:value-of select="plan"/>,<xsl:value-of select="créditos"/>, <xsl:value-of select="centro"/>);
  </xsl:template>
  <xsl:template match="asignaturas/asignatura">
    insert into asignaturas (id,titulación,nombre,trimestre)
    values('<xsl:value-of select="@id"/>', <xsl:value-of select="@titulacion"/>,<xsl:value-of select="nombre"/>,<xsl:value-of select="trimestre"/>);
  </xsl:template>
  <xsl:template match="alumnos/alumno">
    insert into alumnos (id,apellido1,nombre,proyecto)
    values('<xsl:value-of select="@id"/>', '<xsl:value-of select="apellido1"/>',<xsl:value-of select="nombre"/>,<xsl:value-of select="estudios/proyecto"/>);
  </xsl:template>
</xsl:stylesheet>
