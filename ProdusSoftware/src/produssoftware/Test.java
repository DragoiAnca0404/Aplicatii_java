
package produssoftware;

public class Test {
    public static void main(String[] args) {
        ProdusSoftware[] produse=new ProdusSoftware[4];
        produse[0]=new SistemDeOperare(123,"WindowsXP",75);
        produse[1]=new Joc(123,"Mario",75);
        produse[2]=new LimbajeDeProgramare(2134,"Pascal",350);
        produse[3]=new SistemDeOperare(5689,"NortonCommander",120);
        for(int i=0;i<produse.length;i++){
            produse[i].calculeazaPretNou();
            System.out.println(produse[i]);
        }
    }
    
}
