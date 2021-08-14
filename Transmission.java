public abstract class Transmission {


    int ForwardGears[]={4,5,6,5,6,4,5,6,8};
    String firstGearRatio[]={"2.540","3.545","3.010","3.545","3.640","2.540","2.950","2.631","4.714"};
    String secondGearRatio[]={"1.920","1.904","2.070","1.904","2.150","1.920","1.940","1.440","3.143"};
    String thirdGearRatio[]={"1.510","1.280","1.430","1.233","1.360","1.510","1.340","1.165","2.106"};
    String fourthGearRatio[]={"1.000","0.914","1.000","0.911","1.000","1.000","1.000","0.906","1.667"};
    String fifthGearRatio[]={"NA","0.757","0.710","0.725","0.750","NA","0.630","0.680","1.285"};
    String sixthGearRatio[]={"NA","NA","0.570","NA","0.630","NA","NA","0.499","1.000"};
    String seventhGearRatio[]={"NA","NA","NA","NA","NA","NA","NA","NA","0.839"};
    String eighthGearRatio[]={"NA","NA","NA","NA","NA","NA","NA","NA","0.667"};

    public abstract void showSpecs();
    
}
