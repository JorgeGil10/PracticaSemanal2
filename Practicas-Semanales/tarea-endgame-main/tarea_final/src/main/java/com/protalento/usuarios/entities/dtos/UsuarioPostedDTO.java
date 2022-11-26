package com.protalento.usuarios.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public final class UsuarioPostedDTO {
	private int id; 
	private String clave;
	private String mensaje;
}
