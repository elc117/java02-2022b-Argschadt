public class Celular {
	
  public static void main(String[] args) throws Exception {
    Celular meuCelular = new Celular();
    meuCelular.setDono("Heitor");
    
    Celular celularColega = new Celular();
    celularColega.setDono("Rodrigo");
    
    celularColega.modelo = "Moto E7";
    celularColega.anoLancamento = 2020;
    
    System.out.println("Celular " + meuCelular.getModelo() + " do " + meuCelular.getDono() + " tem " + meuCelular.tempoVida() + " anos de vida!");
    System.out.println("Celular " + celularColega.getModelo() + " do " + celularColega.getDono() + " tem " + celularColega.tempoVida() + " anos de vida!");
  }

  private String modelo;
  private int anoLancamento;
  private String dono;

  public Celular() {
    modelo = "RedMi 8";
    anoLancamento = 2019;
    dono = "";
  }

  public String getModelo() {
    return this.modelo;
  }

  public int getAnoLancamento() {
    return this.anoLancamento;
  }
  
  public String getDono() {
    return this.dono;
  }
  
  public String setDono(String dono) {
	return this.dono = dono;
  }
  
  public int tempoVida() {
	  return 2022 - this.anoLancamento;
  }
}


