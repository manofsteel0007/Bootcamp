/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment.sql_creation;

/**
 *
 * @author kumar
 */
public class Sample {

    public Sample() {
        String x="CREATE TABLE student_results(\n" +
"user_name VARCHAR(100),\n" +
"name VARCHAR(100),\n" +
"test1 DOUBLE,\n" +
"test2 DOUBLE,\n" +
"test3 DOUBLE,\n" +
"test4 DOUBLE,\n" +
"avarage DOUBLE\n" +
");\n" +
"\n" +
"/* INSERT QUERY NO: 1 */\n" +
"INSERT INTO student_results(user_name, name, test1, test2, test3, test4, avarage)\n" +
"VALUES\n" +
"(\n" +
"'18eumc071', 'Kumaran S', 45, 15, 87, 26, 43.25\n" +
");\n" +
"\n" +
"/* INSERT QUERY NO: 2 */\n" +
"INSERT INTO student_results(user_name, name, test1, test2, test3, test4, avarage)\n" +
"VALUES\n" +
"(\n" +
"'18eumc070', 'Krishnan ', 48, 21, 78, 98, 61.25\n" +
");\n" +
"\n" +
"/* INSERT QUERY NO: 3 */\n" +
"INSERT INTO student_results(user_name, name, test1, test2, test3, test4, avarage)\n" +
"VALUES\n" +
"(\n" +
"'18euit009', 'Aravindha M', 48, 78, 54, 23, 50.75\n" +
");";
        String pp[]=x.split(";");
        
        for (int i = 0; i < pp.length; i++) {
            System.out.println(pp[i].trim());
        }
    }
    public static void main(String[] args) {
        new Sample();
    }
}
