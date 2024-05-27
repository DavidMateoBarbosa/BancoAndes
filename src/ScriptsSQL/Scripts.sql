db.createCollection("Empleado", {
  validator: {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "Tipo_persona", "Nombre", "Cedula", "Tipo_empleado"],
      properties: {
        _id: {
          bsonType: "int"
        },
        Tipo_persona: {
          bsonType: "string"
        },
        Nombre: {
          bsonType: "string"
        },
        Cedula: {
          bsonType: "string"
        },
        Tipo_empleado: {
          bsonType: "string"
        },
        Oficina: {
          bsonType: "object",
          required: ["_id", "nombre", "direccion"],
          properties: {
            _id: {
              bsonType: "int"
            },
            nombre: {
              bsonType: "string"
            },
            direccion: {
              bsonType: "string"
            }
          }
        }
      }
    }
  }
});

db.createCollection("Puntos_atencion", {
  validator: {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "tipo_puntoAtencion", "localizacion", "oficina"],
      properties: {
        _id: {
          bsonType: "int"
        },
        tipo_puntoAtencion: {
          bsonType: "string"
        },
        localizacion: {
          bsonType: "string"
        },
        oficina: {
          bsonType: "int"
        }
      }
    }
  }
});


db.createCollection("Cliente", {
  validator: {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "Tipo_persona", "Nombre", "Cedula"],
      properties: {
        _id: {
          bsonType: "int"
        },
        Tipo_persona: {
          bsonType: "string"
        },
        Nombre: {
          bsonType: "string"
        },
        Cedula: {
          bsonType: "string"
        },
        Cuenta: {
          bsonType: "object",
          required: ["_id", "tipo_Cuenta", "estado_cuenta", "saldo", "fechaUltimaTransaccion"],
          properties: {
            _id: {
              bsonType: "int"
            },
            tipo_Cuenta: {
              bsonType: "string"
            },
            estado_cuenta: {
              bsonType: "string"
            },
            saldo: {
              bsonType: "int"
            },
            fechaUltimaTransaccion: {
              bsonType: "date"
            },
            Operacion_Bancaria: {
              bsonType: "object",
              required: ["_id", "tipo_operacion", "fecha", "punto_atencion"],
              properties: {
                _id: {
                  bsonType: "int"
                },
                tipo_operacion: {
                  bsonType: "string"
                },
                fecha: {
                  bsonType: "date"
                },
                punto_atencion: {
                  bsonType: "int"
                }
              }
            }
          }
        }
      }
    }
  }
});