package ar.edu.unlp.objetos.oo2.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Twitter {
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public void AgregarUsuario() {
		Scanner scanner = new Scanner(System.in);
		//Ingreso el nombre de usuario
		System.out.println("Ingresa el nombre de usuario");
		String nombre = scanner.next();
		//Recorro la lista de usuarios para verificar si ya existe
		boolean existe = usuarios.stream().anyMatch(user -> user.SonIguales(nombre));
		
		//Si no existe lo creo y lo agrego
		if (!existe) {
			Usuario usuarioNuevo = new Usuario(nombre);
			usuarios.add(usuarioNuevo);
			System.out.println("Usuario agregado correctamente.");
		}//Si existe notifico al usuario
		else {
			System.out.println("Error: El usuario ya existe.");
		}
		 scanner.close();
	}
	
	public void AgregarUsuario(String nombre) {
		//Recorro la lista de usuarios para verificar si ya existe
		boolean existe = usuarios.stream().anyMatch(user -> user.SonIguales(nombre));
		
		//Si no existe lo creo y lo agrego
		if (!existe) {
			Usuario usuarioNuevo = new Usuario(nombre);
			usuarios.add(usuarioNuevo);
		}//Si existe notifico al usuario
	}
	
	public void EliminarUsuario(String nombreBuscado) {
		boolean encontre = false;
		Iterator<Usuario> iterator = usuarios.iterator();
		//Mientas tenga elementos y no encontre el usuario
		while (iterator.hasNext() && encontre == false) {
			//Tomo el siguiente 
			Usuario user = iterator.next();
			//Si coinciden los datos 
			if (user.SonIguales(nombreBuscado)) {
				//Corto el while 
				encontre = true;
				//Elimino sus tweets
				user.EliminarTweets();
				//Borro al usuario de la lista 
				iterator.remove();
			}
		}
	}
	
	public List<Usuario> getUsuarios(){ return this.usuarios;}

}
