package revision;

public class StarpatternTelusko {

	public static void main(String[] args) {
		int[] row0 = {0,1,3,4,7,8,9,10,24,25,26,27,28,34,37,38,39};
		int[] row1;
		int[] row2;
		int[] row3;
		int[] row4;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<41;j++){
				if(j==2||j==6||j==12||j==18||j==22||j==30||j==36||j==40
				 ||(i==0)&&(j==0||j==1||j==3||j==4||j==7||j==8||j==9||j==10||j==24||j==25||j==26||j==27||j==28||j==34||j==37||j==38||j==39)
				 ||(i==1)&&(j==24||j==33)
				 ||(i==2)&&(j==7||j==8||j==9||j==10||j==24||j==25||j==26||j==27||j==28||j==31||j==32)
				 ||(i==3)&&(j==28||j==33)
				 ||(i==4)&&(j==7||j==8||j==9||j==10||j==13||j==14||j==15||j==16||j==19||j==20||j==21||j==24||j==25||j==26||j==27||j==28||j==34||j==37||j==38||j==39))
				
					System.out.print("* ");
				else System.out.print("  ");
					
					
			}
			System.out.println("");
		}
	}

}
