package model.dao;

import java.util.ArrayList;

import model.objects.Usuario;


public class UsuarioDAO {
	public  synchronized static boolean insert(Usuario u){return true;}
	public  synchronized static boolean delete(Usuario u){return true;}
	public  synchronized static boolean update(Usuario u, String login){return true;}
	public 	synchronized static ArrayList<Usuario> selectAll(){return null;}
	public synchronized static Usuario validarLogin(String login, String senha){return null;}
}
