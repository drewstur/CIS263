/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab05 - Array multiplication table
	Due:		Due: 10/26/14
	Instructor: Michael Mick
*/

import java.util.Scanner;
import javax.swing.JOptionPane;

public class FaberDrewLab05
{
	public static void main(String[] args)
	{
		int maxTable = 0;
		String stringValue;
		int[][] multipleTable;

		stringValue = JOptionPane.showInputDialog(
						null,
						"Please enter maximum table size (0 to quit):",
						"Multiplication Table Maker",
						JOptionPane.QUESTION_MESSAGE);

		maxTable = Integer.parseInt(stringValue);

		while(maxTable > 0)
		{
			multipleTable = makeArray(maxTable);

			System.out.println("Multiplication Table of 1's Through "+maxTable+"'s");
			printArray(multipleTable);
			System.out.println();

			stringValue = JOptionPane.showInputDialog(
							null,
							"Please enter maximum table size (0 to quit):",
							"Multiplication Table Maker",
							JOptionPane.QUESTION_MESSAGE);

			maxTable = Integer.parseInt(stringValue);
		}
	}

	public static int[][] makeArray(int maxTable)
	{
		int[][] multipleTable = new int[maxTable][maxTable];

		for(int x = 0; x < multipleTable.length; x++)
		{
			for(int y = 0; y < multipleTable.length; y++)
			{
				multipleTable[x][y] = (x+1)*(y+1);
			}
		}
		return multipleTable;
	}

	public static void printArray(int[][] multipleTable)
	{
		for(int x = 0; x < multipleTable.length; x++)
		{
			for(int y = 0; y < multipleTable.length; y++)
			{
				System.out.print("\t"+multipleTable[x][y]+"\t");
			}
			System.out.println();
		}
	}
}