package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcDeleteSample {
	private static final String DRIVER = "com.mysql.jdbc.Driver";

    private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&useSSL=false";

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            // com.mysql.cj.jdbc.Driverクラスをロードして、初期化処理を行う
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            // ドライバのクラスがクラスパスに見つからなかった場合にClassNotFoundExceptionが発生します。
            e.printStackTrace();
            // ドライバが見つからない場合は、後続の処理を続行できませんので、例外をthrowして処理を中断します。
            throw e;
        }

        // Connection（データベースとの接続を表す）、PreparedStatement（発行するSQLを表す）を、それぞれ生成します。
        try (Connection connection = DriverManager.getConnection(URL);
        		PreparedStatement statement = connection.prepareStatement("delete from user where id = ?")) {
        	statement.setLong(1, 3L);
            int r = statement.executeUpdate();

            if (r != 0) {
            	System.out.println("削除しました。");
            } else {
            	System.out.println("失敗しました。");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
