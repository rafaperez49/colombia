package elcolombiano.model;

import java.util.List;

import elcolombiano.task.Diligenciamiento;

public class DiligenciarBuilder {
	public Diligenciamiento con(List<UsuarioColombiano> laInformacionDeRegistro) {
		return new Diligenciamiento(laInformacionDeRegistro);
	}
}
