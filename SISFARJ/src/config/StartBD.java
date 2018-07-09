package config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import banco.Banco;

public class StartBD {
	
	
	public static void resetDatabase() throws SQLException
    {
        String s = new String();
        StringBuffer sb = new StringBuffer();
 
        try
        {
            FileReader fr = new FileReader(new File("./WebContent/WEB-INF/scripts/create_db.sql"));
 
            BufferedReader br = new BufferedReader(fr);
 
            while((s = br.readLine()) != null)
            {
                sb.append(s);
            }
            br.close();
            String[] inst = sb.toString().split(";");
 
            Connection c = Banco.getConnection();
            Statement st = c.createStatement();
 
            for(int i = 0; i<inst.length; i++)
            {
                if(!inst[i].trim().equals(""))
                {
                    st.execute(inst[i]);
                    System.out.println(">>"+inst[i]);
                }
            }
            c.close();
   
        }
        catch(Exception e)
        {
            System.out.println("*** Error : "+e.toString());
            System.out.println("*** ");
            System.out.println("*** Error : ");
            e.printStackTrace();
            System.out.println("################################################");
            System.out.println(sb.toString());
        }
 
    }
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		

		resetDatabase();
	}
}
