# -*- coding: utf-8 -*-

from odoo import fields, models, api

class taller_clientes(models.Model):
    name = "taller_clientes"
    
    dni = fields.Char("DNI", required = True)
    nombre = fields.Char(string = "Nombre")
    apellidos = fields.Char(string = "Apellidos")
    coche = fields.One2many("taller_coches", "cliente", string = "Coches")


class taller_coches(models.Model):
    name = "taller_coches"

    matricula = fields.Char(string = "Matrícula", required = True)
    marca = fields.Char(string = "Marca")
    modelo = fields.Char(string = "Modelo")
    cliente = fields.Many2one("taller_clientes", string = "Cliente", required = True, ondelete = "cascade")
    reparaciones = fields.One2many("taller_reparaciones", "coche", string = "Reparaciones")


class taller_reparaciones(models.Model):
    name = "taller_reparaciones"
    
    id_rep = fields.Integer(string = "ID", required = True)
    tipo = fields.Selection([('0', 'Revisión'), ('1', 'Reparación')], string = "Tipo", default = "1")
    costePiezas = fields.Float(string = "Coste Piezas")
    manoObra = fields.Float(string = "Mano de Obra")
    total = fields.Float(strig = "Total", compute = 'importe', store = True)
    coche = fields.Many2one("taller_coches", string = "Coche", required = True, ondelete = "cascade")

    @api.depends('manoObra', 'costePiezas')
    def importe(self):
        self.total = self.costePiezas + self.manoObra
