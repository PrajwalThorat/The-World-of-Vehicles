public class AutoDCT extends Transmission {
    String model1="DCT8";
 int index=8;
 



    public AutoDCT(String model)
    {
        if(model.equals(model1))
        showSpecs();
    }

    @Override
    public void showSpecs() {

           System.out.println("1.	Forward Gears: "+ForwardGears[index]+" (Simulated)");
           System.out.println("2.	1st Gear Ratio: "+firstGearRatio[index]);
           System.out.println("3.	2nd Gear Ratio: "+secondGearRatio[index]);
           System.out.println("4.	3rd Gear Ratio: "+thirdGearRatio[index]);
           System.out.println("5.	4th Gear Ratio: "+fourthGearRatio[index]);
           System.out.println("6.	5th Gear Ratio: "+fifthGearRatio[index]);
           System.out.println("7.	6th Gear Ratio: "+sixthGearRatio[index]);
           System.out.println("8.	7th Gear Ratio: "+seventhGearRatio[index]);
           System.out.println("9.	8th Gear Ratio: "+eighthGearRatio[index]);
           
 
        
    }
}
