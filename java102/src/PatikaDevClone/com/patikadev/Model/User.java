package PatikaDevClone.com.patikadev.Model;

import PatikaDevClone.com.patikadev.Helper.DBConnector;
import PatikaDevClone.com.patikadev.Helper.Helper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String uname;
    private String pass;
    private String type;

    public User() {
    }

    public User(int id, String name, String uname, String pass, String type) {
        this.id = id;
        this.name = name;
        this.uname = uname;
        this.pass = pass;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList() {
        ArrayList<User> userList = new ArrayList<>();
        User obj;
        try {
            Statement statement = DBConnector.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");
            while (resultSet.next()) {
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUname(resultSet.getString("uname"));
                obj.setPass(resultSet.getString("pass"));
                obj.setType(resultSet.getString("type"));
                userList.add(obj);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public static boolean add(String name, String uname, String pass, String type) {
        String query = "INSERT INTO user (name, uname, pass, type) VALUES (?, ?, ?, ?)";
        User findUser = getFetch(uname);
        if (findUser != null) {
            Helper.showMessage("Bu kullanıcı adı daha önceden eklenmiş. Lütfen farklı bir kullanıcı adı giriniz.");
            return false;
        }
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, uname);
            preparedStatement.setString(3, pass);
            preparedStatement.setString(4, type);
            int response = preparedStatement.executeUpdate();
            preparedStatement.close();
            if (response == -1) {
                Helper.showMessage("error");
            }
            return response != -1;
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
        }
        return true;
    }

    public static User getFetch(String uname) {
        User obj = null;
        String query = "SELECT * FROM user WHERE uname = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(query);
            preparedStatement.setString(1, uname);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUname(resultSet.getString("uname"));
                obj.setPass(resultSet.getString("pass"));
                obj.setType(resultSet.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

    public static User getFetch(String uname, String pass) {
        User obj = null;
        String query = "SELECT * FROM user WHERE uname = ? AND pass = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(query);
            preparedStatement.setString(1, uname);
            preparedStatement.setString(2, pass);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                switch (resultSet.getString("type")) {
                    case "operator":
                        obj = new Operator();
                        break;
                    default:
                        obj = new User();
                        break;
                }
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUname(resultSet.getString("uname"));
                obj.setPass(resultSet.getString("pass"));
                obj.setType(resultSet.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

    public static User getFetch(int id) {
        User obj = null;
        String query = "SELECT * FROM user WHERE id = ?";
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUname(resultSet.getString("uname"));
                obj.setPass(resultSet.getString("pass"));
                obj.setType(resultSet.getString("type"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM user WHERE id = ?";
        ArrayList<Course> courseList = Course.getListByUser(id);
        for (Course course : courseList) {
            Course.delete(course.getId());
        }
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(query);
            preparedStatement.setInt(1, id);
            int response = preparedStatement.executeUpdate();
            preparedStatement.close();
            return response != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean update(int id, String name, String uname, String pass, String type) {
        String query = "UPDATE user SET name = ?, uname = ?, pass = ?, type = ? WHERE id = ?";
        User findUser = getFetch(uname);
        if (findUser != null && findUser.getId() != id) {
            Helper.showMessage("Bu kullanıcı adı daha önceden eklenmiş. Lütfen farklı bir kullanıcı adı giriniz.");
            return false;
        }
        String[] typeList = {"operator", "educator", "student"};
        int count = 0;
        for (String str : typeList) {
            if (!str.equals(type))
                count++;
        }
        if (count == typeList.length) {
            Helper.showMessage("Lütfen geçerli bir değer giriniz!");
            return false;
        }
        try {
            PreparedStatement preparedStatement = DBConnector.getInstance().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, uname);
            preparedStatement.setString(3, pass);
            preparedStatement.setString(4, type);
            preparedStatement.setInt(5, id);
            int response = preparedStatement.executeUpdate();
            return response != -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<User> searchUserList(String query) {
        ArrayList<User> userList = new ArrayList<>();
        User obj;
        try {
            Statement statement = DBConnector.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                obj = new User();
                obj.setId(resultSet.getInt("id"));
                obj.setName(resultSet.getString("name"));
                obj.setUname(resultSet.getString("uname"));
                obj.setPass(resultSet.getString("pass"));
                obj.setType(resultSet.getString("type"));
                userList.add(obj);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    public static String searchQuery(String name, String uname, String type) {
        String query = "SELECT * FROM user WHERE uname LIKE '%{{uname}}%' AND name LIKE '%{{name}}%'";
        query = query.replace("{{uname}}", uname);
        query = query.replace("{{name}}", name);
        if (!type.isEmpty()) {
            query += " AND type LIKE '{{type}}'";
            query = query.replace("{{type}}", type);
        }
        return query;
    }
}
