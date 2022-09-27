package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bd_maldivastravel", "root","88147320");
					
	}catch (Exception e) {
		System.out.println (e);
	}                  
		return con;
	}
	public static List <DAO> getAllusuario() {
		return null;
	} {
		List <usuario> list = new ArrayList <usuario>();
		
		try {
			Connection con = getConnection();
			PreparedStatement ps = (PreparedStatement) ((Object) con)preparedStatement("SELECT * FROM usuario");
			ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			usuario usuario = new usuario ();
			usuario.setIdcliente(rs.getInt("idcliente"));
			usuario.setNome(rs.getString("nome"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setDestino_interesse(rs.getString("destino_interesse"));
			list.add(usuario);
			}
					
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}

	}

		
	
	
	
	
	

