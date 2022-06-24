package revision;

public class StarPatternName {

	public static void main(String[] args) {
		int[] jstar={0,4,7,11,14,18,21,25};
		
		int[] jnotstar={5,6,12,13,19,20};
		for (int i=0;i<5;i++) {
			for(int j=0;j<23;j++) {
				if((i==0&&(j==0||j==1||j==2||j==3||j==4||j==6||j==7||j==8||j==9||j==10||j==12||j==13||j==14||j==15||j==16||j==18))
				 ||(i==4&&(j==0||j==1||j==2||j==3||j==4||j==6||j==7||j==8||j==9||j==10||j==12||j==16))
				 ||j==2||j==12||j==16||j==18||j==22
				 ||(i==1&&(j==6||j==12||j==16||j==19||j==21))
				 ||(i==2&&(j==6||j==7||j==8||j==9||j==10||j==12||j==13||j==14||j==15||j==16||j==20))
				 ||(i==3&&j==10)
				 )
					
					System.out.print("* ");
				//else for(int element:jnotstar) if (j!=element);
					//System.out.print("* ");
				else
					System.out.print("  ");
				}
			System.out.println("");
				//else
					//System.out.print("o ");
			}
		
		
		}

	}
