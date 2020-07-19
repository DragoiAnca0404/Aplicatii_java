
package modelnumeretelefon;


public class ModelNumereTelefon {

   
        private String codTara,codJudet,nrTelefon;
        public ModelNumereTelefon(String ct,String cj,String nr){
            codTara=ct;
            codJudet=cj;
            nrTelefon=nr;
            
        }
        
        public String converteste(){
            StringBuffer sb=new StringBuffer("+00");
            sb.append(codTara + "-");
            sb.append(codJudet + "-");
            sb.append(nrTelefon);
            return sb.toString();
        }
        
        public void setCodTara(String tara){
            codTara=tara;
        }
        public void setnrTelefon(String nr){
            nrTelefon=nr;
        }
        
    }
    