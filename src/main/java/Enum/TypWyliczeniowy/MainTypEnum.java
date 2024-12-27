package Enum.TypWyliczeniowy;

public class MainTypEnum {
    public static void main(String[] args) {
      KierunkiSwiata kierunek = KierunkiSwiata.ZACHOD;

      switch (kierunek){
          case POLNOC:
              System.out.println("Ide na północ");
              break;
          case POLUDNIE:
              System.out.println("Ide na poludnie");
              break;
          case ZACHOD:
              System.out.println("Ide na zachod");
              break;
          case WSCHOD:
              System.out.println("Ide na wschod");
              break;
          default:
              System.out.println("Nie mam dokąd pojsc");
      }

      KierunkiSwiata kierunkiSwiata = KierunkiSwiata.ZACHOD;
      System.out.println("ordinal():" + kierunkiSwiata.ordinal());

      KierunkiSwiata kolejnyKierunekSwiata = KierunkiSwiata.valueOf("WSCHOD");
      System.out.println("ValueOf:"+ kolejnyKierunekSwiata);

      KierunkiSwiata[] kierunkiSwiatas = kierunkiSwiata.values();
      for(int i=0; i<kierunkiSwiatas.length; i++){
          System.out.println("i:"+i +" " +"kierunek" + " " + kierunkiSwiatas[i]);
      }
      KierunkiSwiata ks = kierunkiSwiata.values()[2];
      System.out.println("values[2]:" + ks);
    }
}
