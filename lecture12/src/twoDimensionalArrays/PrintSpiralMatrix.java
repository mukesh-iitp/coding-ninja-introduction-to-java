package twoDimensionalArrays;

public class PrintSpiralMatrix {
	
	
	public static void spiralPrint(int matrix[][]) {
		
		int nRows=matrix.length;
		if(nRows==0) {
			return;
		}
		
		int mCols=matrix[0].length;
		int rowStart=0;
		int colStart=0;
		int numsElements=nRows*mCols;
		int count=0;
		
		while(count<numsElements) {
			
			for(int i=colStart;count<numsElements&&i<mCols;i++)
			{
				System.out.println(matrix[rowStart][i]+" ");
				count++;
			}
			rowStart++;
			
			for(int i=rowStart;count<numsElements && i<nRows;i++) {
				System.out.println(matrix[i][mCols-1]+" ");
				count++;
			}
			mCols--;
			
			for(int i=mCols-1;count<numsElements&&i>=colStart;i--)
			{
				System.out.println(matrix[nRows-1][i]+" ");
				count++;
			}
			nRows--;
			
			for(int i=nRows-1;count<numsElements && i>=rowStart;i--) {
				System.out.println(matrix[i][colStart]+" ");
				count++;
			}
			colStart++;
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
