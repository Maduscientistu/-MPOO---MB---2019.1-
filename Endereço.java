package pipol;
public class Endereço{
	public String rua;
	public int numero;
	public String complemento;
	public String cidade;
	public void setRua(String rua){
		this.rua = rua;
	}
public void setComplemento(String complemento){
		this.complemento = complemento;
	}
public void setCidade(String cidade){
		this.cidade = cidade;
	}
public void setNumero(int numero){
		this.numero = numero;
	}
public String getComplemento(){
		return this.complemento;
	}
public String getCidade(){
		return this.cidade;
	}
public int getNumero(){
		return this.numero;
	}
public String getRua(){
		return this.rua;
}
}