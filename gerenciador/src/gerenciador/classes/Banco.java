package gerenciador.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	static {
		  Usuario usuario = new Usuario();
		  usuario.setNome("Lucas");
		  Usuario usuario2 = new Usuario();
		  usuario2.setNome("Daniel");
		  Banco.usuarios.add(usuario);
		  Banco.usuarios.add(usuario2);
		}
	
	public void adiciona(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public static List<Usuario> getUsuarios() {
		return Collections.unmodifiableList(usuarios);
	}
}
