package marksheet;

public class Marksheet {

	public static void main(String[] args) {
    int Database=70;
    int Systems=68;
    int Algorithms=74;
    int Statistics=65;
    int Total=Database+Systems+Algorithms+Statistics;
    float Average=(float)Total/4;
	System.out.println("                Department of Computer Science");
	System.out.println("                      End Semester results");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|Name:-        |Roll_No:      Semester:");
	System.out.println("_______________________________________________________________________________________________");
	System.out.println("|Unit Code    |Unit Name:    Score");
	System.out.println("-----------------------------------------------------------------------------------------------");
    System.out.println("|CCS2101       |Database      |"+Database);
    System.out.println("|CCS2102       |Systems       |"+Systems);
    System.out.println("|CCS2103       |Algorithms    |"+Algorithms);
    System.out.println("|CCS2104       |Statistics    |"+Statistics);
    System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|Total                        |"+Total);
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|Average                      |"+Average);
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("|Grade                        |A");
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("                Recommendation|"); 
	System.out.println("-----------------------------------------------------------------------------------------------");
	System.out.println("Grading Criteria          Overall Grade(A-D)     Recommend Pass");
	}
}
