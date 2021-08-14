public class Manual extends Transmission {
    String models[]={"MP4","MP5","MP6","MD5","MD6"};
    int index=0;
    
    
   
   
   
       public Manual(String model)
       {
          for(index=0;index<models.length;index++)
          {
              if(model.equals(models[index]))
              {
              showSpecs();
              break;
              }
          } 
       }
   
       @Override
       public void showSpecs() {
   
              System.out.println("1.	Forward Gears: "+ForwardGears[index]);
              System.out.println("2.	1st Gear Ratio: "+firstGearRatio[index]);
              System.out.println("3.	2nd Gear Ratio: "+secondGearRatio[index]);
              System.out.println("4.	3rd Gear Ratio: "+thirdGearRatio[index]);
              System.out.println("5.	4th Gear Ratio: "+fourthGearRatio[index]);
              System.out.println("6.	5th Gear Ratio: "+fifthGearRatio[index]);
              System.out.println("7.	6th Gear Ratio: "+sixthGearRatio[index]);
              
    
           
       }
       
   }
   