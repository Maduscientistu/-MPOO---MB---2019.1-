package pipol;
public class Pessoa{
		private String nome;
		private String cpf;
		private String rua;
		private int numero;
		private String complemento;
		private String cidade;
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
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
		public String getNome(){
			return this.nome;
	}
		public String getCpf(){
			return this.cpf;
	}
}