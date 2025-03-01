package me.dio;

import me.dio.persistence.migration.MigrationStrategy;
import me.dio.ui.MainMenu;

import java.sql.SQLException;

import static me.dio.persistence.config.ConnectionConfig.getConnection;

public class Application {

	public static void main(String[] args) throws SQLException {
		try(var connection = getConnection()){
			new MigrationStrategy(connection).executeMigration();
		}
		new MainMenu().execute();
	}

}
