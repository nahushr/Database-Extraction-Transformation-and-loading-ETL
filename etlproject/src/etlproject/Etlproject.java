package etlproject;
import java.sql.*; 
import java.lang.*;

public class Etlproject
{
    //variables of oracle database
    static int eid[]=new int[10];
    static String ename[]=new String[10];
    static float esalary[]=new float[10];
    static int ephone[]=new int[10];
    static String ebdate[]=new String[10];
    static String ecity[]=new String[10];
    static String edept_name[]=new String[10];
    static int edept_id[]=new int[10];
    static String egender[]=new String[10];
    
    //variables of mysql database
    static int meid[]=new int[10];
    static String mename[]=new String[10];
    static float mesalary[]=new float[10];
    static int mephone[]=new int[10];
    static String mebdate[]=new String[10];
    static String mecity[]=new String[10];
    static String medept_name[]=new String[10];
    static int medept_id[]=new int[10];
    static String megender[]=new String[10];
    
    //variables of msaccess database
    static int mseid[]=new int[10];
    static String msename[]=new String[10];
    static float msesalary[]=new float[10];
    static int msephone[]=new int[10];
    static String msebdate[]=new String[10];
    static String msecity[]=new String[10];
    static String msedept_name[]=new String[10];
    static int msedept_id[]=new int[10];
    static String msegender[]=new String[10];
    
   // variable constants of mysql database
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/mysqldb";
    
    public static void main(String args[])throws Exception
    {
        //to extract records from oracle database
        //System.out.println("*******ORACLE DATABASE*********");
       try{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from employee");
int i=0;
//storing the database values in arrays
while(rs.next())  {
    eid[i]=rs.getInt(1);
    ename[i]=rs.getString(2);
    esalary[i]=rs.getInt(3);
    ephone[i]=rs.getInt(4);
    ebdate[i]=rs.getDate(5).toString();
    ecity[i]=rs.getString(6);
    edept_name[i]=rs.getString(7);
    edept_id[i]=rs.getInt(8);
    egender[i]=rs.getString(9);
    i++;
    
}
  
  
//step5 close the connection object  
con.close();  
  
}
    catch(Exception e)
    {
        System.out.println(e);
    }  
    finally
    {
        //to print the data
           /*for(int j=0;j<10;j++)
           {
               System.out.println(eid[j]+"       "+ename[j]+"       "+esalary[j]+"       "+ephone[j]+"       "+ebdate[j]+"       "+ecity[j]+"       "+edept_name[j]+"       "+edept_id[j]+"       "+egender[j]+"       ");
           }*/
    }
//-------------------------------------------------------------------------------------------
      
    //to extract data from ms-access database
    //System.out.println("******MS-ACCESS DATABASE*********");
     try 
     {
              // loading thejdbc odbc driver
              Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              // creating connection toth data base
              Connection con = DriverManager.getConnection("jdbc:odbc:emp","","");
              Statement st = con.createStatement();
              // create an execute sql command on database    
              ResultSet msrs = st.executeQuery("Select * from msaccesstable");
              ResultSetMetaData rsmd = msrs.getMetaData();
              // this getColumnCount reurn the number of column in the selected table
              int numberOfColumns = rsmd.getColumnCount();
             // while loop and with while loop code use for print the data
              int msi=0;
              //to store data from msaccess in array variables
             while (msrs.next()) 
             {
                  mseid[msi]=msrs.getInt(1);
                  msename[msi]=msrs.getString(2);
                  msesalary[msi]=msrs.getInt(3);
                  msephone[msi]=msrs.getInt(4);
                  msebdate[msi]=msrs.getDate(5).toString();
                  msecity[msi]=msrs.getString(6);
                  msedept_name[msi]=msrs.getString(7);
                  msedept_id[msi]=msrs.getInt(8);
                  msegender[msi]=msrs.getString(9).substring(0,1);
                 msi++;
             }
              con.close();
            
       } 
     catch (Exception ex)
     {
           System.err.print("Exception: ");
           System.err.println(ex.getMessage());
      }
    finally
    {
        //to print data
        /*
        for(int j=0;j<10;j++)
           {
               System.out.println(mseid[j]+"       "+msename[j]+"       "+msesalary[j]+"       "+msephone[j]+"       "+msebdate[j]+"       "+msecity[j]+"       "+msedept_name[j]+"       "+msedept_id[j]+"       "+msegender[j]+"       ");
           }*/
        
    }
//-------------------------------------------------------------------------------------------------------------
     
     //to extract data from mysql(phpmy admin) database
     //System.out.println("******MYSQL DATABASE********");
     
     try
     {
        Connection conmysql = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
        Statement stmt=(Statement)conmysql.createStatement();
        String mysqlquery="select * from emptable";
        ResultSet rsmysql = stmt.executeQuery(mysqlquery);
        int mi=0;
        //to store data from mysql database to array variables
        while(rsmysql.next())
        {
            meid[mi]=rsmysql.getInt("eid");
            mename[mi]=rsmysql.getString("ename");
            mesalary[mi]=Math.round(rsmysql.getDouble("esalary"));
            mephone[mi]=rsmysql.getInt("ephone");
            mebdate[mi]=rsmysql.getDate("ebdate").toString();
            mecity[mi]=rsmysql.getString("ecity");
            medept_name[mi]=rsmysql.getString("edept_name");
            medept_id[mi]=rsmysql.getInt("edept_id");
            megender[mi]=rsmysql.getString("egender").substring(0,1).toUpperCase();
            mi++;
        }
        conmysql.close();
              
     }
     catch(Exception ef)
     {
         System.out.println(ef);
     }
     finally
    {
        //to print data
        /*
           for(int j=0;j<10;j++)
           {
               System.out.println(meid[j]+"       "+mename[j]+"       "+mesalary[j]+"       "+mephone[j]+"       "+mebdate[j]+"       "+mecity[j]+"       "+medept_name[j]+"       "+medept_id[j]+"       "+megender[j]+"       ");
           }
        */
    }
     //to set and call the form class from the same package            
     uidesignclass form_display_object =new uidesignclass();
     form_display_object.setVisible(true);
 }//MAIN
    
//-------------------------------------------------------------------------------------------------------
 public void oracle()//copies only oracle database to finaltable
 {
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, eid[idx]);
   pstmt2.setString(2, ename[idx]);
   pstmt2.setFloat(3, esalary[idx]);
   pstmt2.setInt(4, ephone[idx]);
   pstmt2.setString(5, ebdate[idx]);
   pstmt2.setString(6, ecity[idx]);
   pstmt2.setString(7, edept_name[idx]);
   pstmt2.setInt(8, edept_id[idx]);
   pstmt2.setString(9,egender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  conn.close();
     }
     catch(Exception exc)
     {
         System.err.println(exc);
     }
 }//oracle method
 
 //----------------------------------------------------------------------------
 
 public void msaccess()//copies only msaccess database to finaltable
 {
  try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, mseid[idx]);
   pstmt2.setString(2, msename[idx]);
   pstmt2.setFloat(3, msesalary[idx]);
   pstmt2.setInt(4, msephone[idx]);
   pstmt2.setString(5, msebdate[idx]);
   pstmt2.setString(6, msecity[idx]);
   pstmt2.setString(7, msedept_name[idx]);
   pstmt2.setInt(8, msedept_id[idx]);
   pstmt2.setString(9,msegender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  conn.close();
     }
     catch(Exception exc)
     {
         System.err.println(exc);
     }
  
 }//msaccess method
 
 //--------------------------------------------------------------------------------
 
 public void mysql()//copies only mysql database to finaltable
 {
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, meid[idx]);
   pstmt2.setString(2, mename[idx]);
   pstmt2.setFloat(3, mesalary[idx]);
   pstmt2.setInt(4, mephone[idx]);
   pstmt2.setString(5, mebdate[idx]);
   pstmt2.setString(6, mecity[idx]);
   pstmt2.setString(7, medept_name[idx]);
   pstmt2.setInt(8, medept_id[idx]);
   pstmt2.setString(9,megender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  conn.close();
     }
     catch(Exception exc)
     {
         System.err.println(exc);
     }

 }//mysql method
 
 //-----------------------------------------------------------------------------------
 
 public void oracle_msaccess()//copies first msaccess and then oracle databsse into finaltable
 {
    try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, mseid[idx]);
   pstmt2.setString(2, msename[idx]);
   pstmt2.setFloat(3, msesalary[idx]);
   pstmt2.setInt(4, msephone[idx]);
   pstmt2.setString(5, msebdate[idx]);
   pstmt2.setString(6, msecity[idx]);
   pstmt2.setString(7, msedept_name[idx]);
   pstmt2.setInt(8, msedept_id[idx]);
   pstmt2.setString(9,msegender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  
  String sql3 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt3 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt3.setInt(1, eid[idx]);
   pstmt3.setString(2, ename[idx]);
   pstmt3.setFloat(3, esalary[idx]);
   pstmt3.setInt(4, ephone[idx]);
   pstmt3.setString(5, ebdate[idx]);
   pstmt3.setString(6, ecity[idx]);
   pstmt3.setString(7, edept_name[idx]);
   pstmt3.setInt(8, edept_id[idx]);
   pstmt3.setString(9, egender[idx]);
   pstmt3.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt3.close();
  conn.close();  
  }
     catch(Exception exc)
     {
         System.err.println(exc);
     } 
 }//oracle_msaccess method 
 
 //------------------------------------------------------------------------------
 
 public void oracle_mysql()// copies first oracle database and then mysql databse into finaltable
 {
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, eid[idx]);
   pstmt2.setString(2, ename[idx]);
   pstmt2.setFloat(3, esalary[idx]);
   pstmt2.setInt(4, ephone[idx]);
   pstmt2.setString(5, ebdate[idx]);
   pstmt2.setString(6, ecity[idx]);
   pstmt2.setString(7, edept_name[idx]);
   pstmt2.setInt(8, edept_id[idx]);
   pstmt2.setString(9,egender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  
  String sql3 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt3 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt3.setInt(1, meid[idx]);
   pstmt3.setString(2, mename[idx]);
   pstmt3.setFloat(3, mesalary[idx]);
   pstmt3.setInt(4, mephone[idx]);
   pstmt3.setString(5, mebdate[idx]);
   pstmt3.setString(6, mecity[idx]);
   pstmt3.setString(7, medept_name[idx]);
   pstmt3.setInt(8, medept_id[idx]);
   pstmt3.setString(9, megender[idx]);
   pstmt3.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt3.close();
  conn.close();  
}
     catch(Exception exc)
     {
         System.err.println(exc);
     } 
 }//oracle_mysql method
 
 //---------------------------------------------------------------------------
 
 
 public void msaccess_mysql()//copies first msaccess and then mysql database into mysql
 {
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, mseid[idx]);
   pstmt2.setString(2, msename[idx]);
   pstmt2.setFloat(3, msesalary[idx]);
   pstmt2.setInt(4, msephone[idx]);
   pstmt2.setString(5, msebdate[idx]);
   pstmt2.setString(6, msecity[idx]);
   pstmt2.setString(7, msedept_name[idx]);
   pstmt2.setInt(8, msedept_id[idx]);
   pstmt2.setString(9,msegender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  
  String sql3 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt3 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt3.setInt(1, meid[idx]);
   pstmt3.setString(2, mename[idx]);
   pstmt3.setFloat(3, mesalary[idx]);
   pstmt3.setInt(4, mephone[idx]);
   pstmt3.setString(5, mebdate[idx]);
   pstmt3.setString(6, mecity[idx]);
   pstmt3.setString(7, medept_name[idx]);
   pstmt3.setInt(8, medept_id[idx]);
   pstmt3.setString(9, megender[idx]);
   pstmt3.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt3.close();
  conn.close();
  
  
     }
     catch(Exception exc)
     {
         System.err.println(exc);
     } 
     
 }//msaccess_mysql method
 
 //----------------------------------------------------------------------------------------------
 
 public void oracle_msaccess_mysql()//copies first msaccess, second oracle, third mysql database to the finaltable
 {
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="select * from finaltable";
        String sql2 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt2 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt2.setInt(1, mseid[idx]);
   pstmt2.setString(2, msename[idx]);
   pstmt2.setFloat(3, msesalary[idx]);
   pstmt2.setInt(4, msephone[idx]);
   pstmt2.setString(5, msebdate[idx]);
   pstmt2.setString(6, msecity[idx]);
   pstmt2.setString(7, msedept_name[idx]);
   pstmt2.setInt(8, msedept_id[idx]);
   pstmt2.setString(9,msegender[idx]);
   pstmt2.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt2.close();
  
  String sql3 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt3 = conn.prepareStatement(sql2);
 for (int idx=0;idx<10;idx++)
 {
   pstmt3.setInt(1, eid[idx]);
   pstmt3.setString(2, ename[idx]);
   pstmt3.setFloat(3, esalary[idx]);
   pstmt3.setInt(4, ephone[idx]);
   pstmt3.setString(5, ebdate[idx]);
   pstmt3.setString(6, ecity[idx]);
   pstmt3.setString(7, edept_name[idx]);
   pstmt3.setInt(8, edept_id[idx]);
   pstmt3.setString(9, egender[idx]);
   pstmt3.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt3.close();
  
 String sql4 = "INSERT INTO finaltable VALUES (?,?,?,?,?,?,?,?,?)";

    //PreparedStatement pstmt1 = conn.prepareStatement(sql1);
    PreparedStatement pstmt4 = conn.prepareStatement(sql4);
 for (int idx=0;idx<10;idx++)
 {
   pstmt4.setInt(1, meid[idx]);
   pstmt4.setString(2, mename[idx]);
   pstmt4.setFloat(3, mesalary[idx]);
   pstmt4.setInt(4, mephone[idx]);
   pstmt4.setString(5, mebdate[idx]);
   pstmt4.setString(6, mecity[idx]);
   pstmt4.setString(7, medept_name[idx]);
   pstmt4.setInt(8, medept_id[idx]);
   pstmt4.setString(9, megender[idx]);
   pstmt4.executeUpdate(); 
  } // End of for loop
  //pstmt1.close();
  pstmt4.close();
  conn.close();
 
     }
     catch(Exception exc)
     {
         System.err.println(exc);
     } 
 }//oracle_msaccess_mysql method
 
 //----------------------------------------------------------------------------------------------
 
 public void truncatetable()
 {
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");  
  
        //step2 create  the connection object  
        Connection conn=DriverManager.getConnection(  
        "jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","dba");  
  
        //step3 create the statement object  
        Statement stmt=conn.createStatement();  
        
        String sql1="truncate table finaltable";
        stmt.executeQuery(sql1);
        conn.close();
        
     }
     catch(Exception exc)
     {
         System.err.println(exc);
     }
 }
 
    
}//CLASS