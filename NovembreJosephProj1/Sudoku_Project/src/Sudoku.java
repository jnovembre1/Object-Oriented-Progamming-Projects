	// This program will solve three types of incomplete Sudoku boards.
	// @Joseph_Novembre
	// 3/12/2023
	
	import java.util.Scanner;
	
	public class Sudoku 
	{
		//global variables for method operations
		static int[][] grid = new int[9][9];
		static int zeroCounter = 0;
		static Scanner input = new Scanner(System.in);
		
		//this global variable saves all the outputs into a string and then displays the string once a zero board is encountered
		static String output1 = "";
		
		public static void main (String[]args) 
		{
			
			while (zeroCounter < 80)
			{
				//Calls method that gets user to input sudoku boards
				sudokuInput();
				
				//if and else if statements to determine what method to call
				if (zeroCounter > 80)
				{
					System.out.print(output1);
					System.out.print("END");
					break;
				}
				else if (zeroCounter == 1)
				{
					type1Solver(grid);
				}
				else if (zeroCounter == 2)
				{
					type2Solver(grid);
				}
				else if (zeroCounter == 3)
				{
					type3Solver(grid);
				}
				zeroCounter = 0;
				
			}
			
		}
		
		
		//Method with the purpose of solving type-1 problems after it has been delegated to do so by program.
		public static int[][] type1Solver(int[][] grid)
		{
			//integer for calculating the sum of column for calculating missing number. 
			int rowSum = 0;
			
			
			for (int i = 0; i < grid.length; i++)
			{
				rowSum = 0;
				for (int j = 0; j < grid[0].length; j++)
				{
					rowSum += grid[i][j];
				}
				if (rowSum != 45)
				{
					for (int j = 0; j < grid[0].length; j++)
					{
						if (grid[i][j] == 0)
						{
							
							grid[i][j] = 45 - rowSum;
							
							//Save the outputs into a string that will output when zero board is detected
							output1 += "(";
							output1 += Integer.toString(i);
							output1 += ",";
							output1 += Integer.toString(j);
							output1 += ",";
							output1 += Integer.toString(grid[i][j]);
							output1 += ")";
							output1 += "\n";
						}
					}
				}
			}
			return grid;
		}
		
		//Method for solving type-2 problems when program delegates it to doing so.
		public static int[][] type2Solver(int[][] grid)
		{
			
			//indexes for rows and columns for first for-loop cycle
			int columnIndex = 0;
			int rowIndex = 0;
			
			boolean rowLoner = false;
			
			for (int i = 0; i < grid.length; i++)
			{
				int rowSum = 0;
				int sumArray[] = new int [9];
	
				
				int rowCount = 9;
				
				
				int[] numberIndex = new int[2];
				
				for (int j = 0; j < grid.length; j++)
				{
					rowSum += grid[i][j];
					
					if (grid[i][j] == 0)
					{
						rowCount--;
						columnIndex = j;
						rowIndex = i;
						
					}
					
				}
				
				
				if(rowCount == 8)
				{
					grid[i][columnIndex] = 45 - rowSum;
					
					//Save the outputs into a string that will output when zero board is detected
					output1 += "(";
					output1 += Integer.toString(i);
					output1 += ",";
					output1 += Integer.toString(columnIndex);
					output1 += ",";
					output1 += Integer.toString(grid[i][columnIndex]);
					output1 += ")";
					output1 += " ";
					
					rowLoner = true;
					
				}
				else if (rowCount == 7)
				{
					int p = 0;
					for (int z = 0; z < grid.length; z++)
					{
						int columnSum = 0;
											
						for (int j = 0; j < grid.length; j++)
						{
							if (grid[z][j] == 0)
							{
								
								numberIndex[p] = j;
								p++;
							}
							columnSum += grid[j][z];
							sumArray[z] = columnSum;
						}
						
					}
				}
				
				grid[i][numberIndex[0]] = 45 - sumArray[numberIndex[0]];
				grid[i][numberIndex[1]] = 45 - sumArray[numberIndex[1]];
				
			}
			if (rowLoner == false)
			{
			
			//Save the outputs into a string that will output when zero board is detected
			output1 += "(";
			output1 += Integer.toString(rowIndex);
			output1 += ",";
			output1 += Integer.toString(columnIndex - 1);
			output1 += ",";
			output1 += Integer.toString(grid[rowIndex][columnIndex - 1]);
			output1 += ")";
			output1 += " ";
			
			output1 += "(";
			output1 += Integer.toString(rowIndex);
			output1 += ",";
			output1 += Integer.toString(columnIndex);
			output1 += ",";
			output1 += Integer.toString(grid[rowIndex][columnIndex]);
			output1 += ")";
			
			}
			
			output1 += "\n";
			return grid;
			
		}
		
		//method that solves a type 3 sudoku board
		//approach is to isolate the loner and solve like a type 1 problem, and then solve remainder as a type 2 problem
		public static int[][] type3Solver(int grid[][])
		{
			// saves the sum totals of each column in board after the loner is isolated
			int[] sumList = new int[9];
			
			//first for loop that isolates the lone part of the L shape and solves for it
			for (int i = 0; i < grid.length; i++)
			{
				int rowCounter = 9;
				int rowSum = 0;
				int rowIndex = 0;
				int columnIndex = 0;
				
				for (int j = 0; j < grid.length; j++)
				{
					rowSum += grid[i][j];
					if (grid[i][j] == 0)
					{
						rowCounter--;
						rowIndex = i;
						columnIndex = j;
					}
				}
				if (rowCounter == 8)
				{
					grid[rowIndex][columnIndex] = 45 - rowSum;

					//more code that saves output to a string
					output1 += "(";
					output1 += Integer.toString(rowIndex);
					output1 += ",";
					output1 += Integer.toString(columnIndex);
					output1 += ",";
					output1 += Integer.toString(grid[rowIndex][columnIndex]);
					output1 += ")";
					output1 += " ";
				}
			}
			for (int i = 0; i < grid.length; i++)
			{
				for (int j = 0; j < grid.length; j++)
				{
					sumList[i] += grid[j][i];
				}
			}
			
			for (int i = 0; i < grid.length; i++)
			{
				for (int j = 0; j < grid.length; j++)
				{
					if (grid[i][j] == 0)
					
						{
							grid[i][j] = 45 - sumList[j];
							output1 += "(";
							output1 += Integer.toString(i);
							output1 += ",";
							output1 += Integer.toString(j);
							output1 += ",";
							output1 += Integer.toString(grid[i][j]);
							output1 += ")";
							output1 += " ";
						}
				}
			}
			output1 += "\n";
			return grid;
		}
		
		//Method that handles the inputting of each 9x9 sudoku board
		public static int[][] sudokuInput()
		{
		
		
		for (int i = 0; i < grid.length; i++)
		{
			for (int j = 0; j < grid[0].length; j++)
			{
				grid[i][j] = input.nextInt();
				if (grid[i][j] == 0)
				{
					zeroCounter++;
				}
			}
		}
		
		return grid;
		}
		
		
	}

