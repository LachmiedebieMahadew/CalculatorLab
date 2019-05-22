/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;


import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Kadjal
 */
public class DictionaryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("application/json");
        PrintWriter output = response.getWriter();
        Gson gson = new Gson();
        List<Result> dicList = new ArrayList<>();
        
        try {
            String word = request.getParameter("word");
            Connection con = DatabaseConnection.initializeDatabase();
            Statement st = con.createStatement();
            String sql;
            sql = "select wordtype,definition from entries where word=\""+word+"\";";
            ResultSet rs = st.executeQuery(sql);
            dicList.clear();
           while(rs.next()){
            dicList.add(new Result(rs.getString("wordtype"), rs.getString("definition")));
            }
           
           String dictionaryJsonString = gson.toJson(dicList);
           output.print(dictionaryJsonString);
        } catch (SQLException ex) {
           
           output.println("Word not found!");
                   
        } catch (ClassNotFoundException ex) {
          //  Logger.getLogger(OnlineDictionary.class.getName()).log(Level.SEVERE, null, ex);
          output.println(ex);
        }
            

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
