package Talonario.conexion;

public class ConexionMySQL {

	

    private final String user = "user01";              //Su usuarion.m
    private final String password = "password";        //Su contraseña
    private final String url = "jdbc:mysql://localhost:3306/talonario"; //Tu BDD (registro)
    private final String driver = "com.mysql.cj.jdbc.Driver";          //Driver de MySQL
    private Connection con = null;

    public Connection getConexion() throws SQLException { //Método para devolver la conexión
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public void close() { // método para cerrar la conexión
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Talonariomodel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
