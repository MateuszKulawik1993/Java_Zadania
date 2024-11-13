package InterfejsyKlasyPowtorzenie;

public class mainUtrwalenie {
    public static void main(String[] args) {
      Klasa obiekKlasa =  new Klasa(){
            @Override
            public void metodaKlas() {
                super.metodaKlas();
                System.out.println("Anonimowa klasa:metoda ");
            }

            @Override
            public void metodaInterfejsu() {
                super.metodaInterfejsu();
                System.out.println("Anonimowa klasa metodaInterfejsu ");
            }
        };
      KlasaAbstrkcyjna obiektKlasaAbstrkcyjna = new KlasaAbstrkcyjna(){
          @Override
          public void metodaAbstarkcyjna() {
              System.out.println("Druga klasa anonimowa :metodaAbstrakcyjna");
          }
      };
     DrugiInterfejs drugiInterfejs = new DrugiInterfejs(){
          @Override
          public void metodaDrugiegoInterfejsu() {
              System.out.println("Druga klasa anonimowa");
          }
      };
    }
}
