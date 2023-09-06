import java.sql.*;
import java.util.Scanner;

public class Celulares {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***CELULARES***");

        int puntos = 0;
        int cantidadpersonas = 0;

        System.out.println("iPhone, Motorola, Samsung o Xiaomi");

        System.out.println("Cual es la mejor marca de celular?: ");
        String marca = scanner.nextLine();



        if (marca.equals("")) {
            System.out.println("Faltan ingresar credenciales correctamente.");

        } else {

                System.out.println("Puntuacion agregada exitosamente");
                System.out.println();

                puntos = Select_One(marca);

                cantidadpersonas = puntos +1;

                Editar(marca, cantidadpersonas);

            }

    } public static void Editar(String marca, int puntuacion) throws ClassNotFoundException, SQLException {
        String driver2 = "com.mysql.cj.jdbc.Driver";
        String url2 = "jdbc:mysql://localhost:3306/celulares";
        String username2 = "root";
        String pass2 = "";

        Class.forName(driver2);
        Connection connection2 = DriverManager.getConnection(url2, username2, pass2);

        Statement statement2 = connection2.createStatement();

        String consulta = "UPDATE marcascelulares SET puntuacion = ? WHERE nombre = ?";
        PreparedStatement preparedStatement = connection2.prepareStatement(consulta);
        preparedStatement.setInt(1, puntuacion);
        preparedStatement.setString(2, marca);

        int filasActualizadas = preparedStatement.executeUpdate();
        if (filasActualizadas > 0) {

        } else {
            System.out.println("No se encontró el registro para actualizar");
        }

        preparedStatement.close();
        connection2.close();
    }  public static int Select_One(String marca) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/celulares";
        String username = "root";
        String password = "";

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);

        String consultaSQL = "SELECT * FROM marcascelulares WHERE nombre = ?";

        PreparedStatement statement = connection.prepareStatement(consultaSQL);
        statement.setString(1, marca); // Establecer el valor del parámetro

        // Ejecutar la consulta
        ResultSet resultSet = statement.executeQuery();

        // Procesar el resultado si existe
        if (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            int puntuacion = resultSet.getInt("puntuacion");

            return puntuacion;

        } else {
            System.out.println("No se encontró un registro con el codigo especificado.");
        }

        // Cerrar recursos
        resultSet.close();
        statement.close();
        connection.close();

        return 0;
    }
}

