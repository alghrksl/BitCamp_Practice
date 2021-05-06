package sample01;

public class Samplearr {

	public static void main(String[] args) {
	
		String A[]= new String[7];
		String[][] student = { { "A", "B", "A", "C", "C", "D", "E", "F", "A", "D" },
				{ "D", "B", "A", "B", "C", "A", "E", "F", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "E", "D", "D", "A", "C", "B", "E", "E", "A", "D" },
				{ "A", "B", "D", "C", "C", "D", "E", "E", "A", "D" },
				{ "D", "B", "D", "C", "C", "D", "A", "E", "A", "D" } };

		for (int i = 0; i <= 6; i++) {

				
				A[i] = student[i][9];
				System.out.print(A[i]);
				
			}

			
			
		}

		
	}


