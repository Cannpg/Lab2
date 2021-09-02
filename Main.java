class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    double mmsTotal = 55 * 11;
    double mmsBlue = mmsTotal * 0.24;
    double mmsBrown = mmsTotal * 0.13;
    double mmsGreen = mmsTotal * 0.16;
    double mmsOrange = mmsTotal * 0.20;
    double mmsRed = mmsTotal * 0.13;
    double mmsYellow = mmsTotal * 0.14;
    double mmsSumOfColors = mmsBlue + mmsBrown + mmsGreen + mmsOrange + mmsRed + mmsYellow;

   System.out.println("Estimated Number of Blue M&Ms: " + mmsBlue);
   System.out.println("Estimated Number of Brown M&Ms: " + mmsBrown);
   System.out.println("Estimated Number of Green M&Ms: " + mmsGreen);
   System.out.println("Estimated Number of Orange M&Ms: " + mmsOrange);
   System.out.println("Estimated Number of Red M&Ms: " + mmsRed);
   System.out.println("Estimated Number of Yellow M&Ms: " + mmsYellow);

//line break so that the console is easier to read
   System.out.println();

    if (mmsBlue < mmsBrown && mmsRed > mmsOrange){
      System.out.println("Blue under Brown and Red over Orange");
    }
    else{
      System.out.println("Blue is NOT under Brown and Red is NOT over Orange");
    }

    if (mmsBrown >= mmsGreen){
      System.out.println("Brown is greater than or equal to Green");
    }
    else{
      System.out.println("Brown is NOT greater than or equal to Green");
    }

    if (mmsSumOfColors == mmsTotal){
      System.out.println("Numbers match");
    }
    else{
       System.out.println("Numbers DO NOT match");
    }
  }
}