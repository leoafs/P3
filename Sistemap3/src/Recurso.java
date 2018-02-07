
public class Recurso {
	
		private String identificacao;
		private String dataini;
		private String horaini;
		private String datafin;
		private String horafin;
		private String responsavel;
		private String usuario;
		public Recurso(String usuario) {
			this.usuario = usuario;
		}

		public String identific(String identificacao ){
			this.identificacao = identificacao;
			if((identificacao != "Apresentação" && (usuario == "Aluno" ||  usuario== "Pesquisador"))) {
				System.out.println("Não autorizado");
				return "Não";
			}
			else return "Sim";
			
		}
		
		public void dataDeInicio(String dataini){
			
			this.dataini=dataini;
			
		}
		
		public void horaDeInicio(String horaini ){
			
			this.horaini = horaini;
			
		}
		
		public void datafinal(String datafin){
			
			this.datafin = datafin;
	
		}
		
		public void horafinal(String horafin){
			
			this.horafin = horafin;
				
		}
		
		public String resp(String responsavel){
			
			this.responsavel=responsavel;
			if(responsavel=="Aluno") {
				System.out.println("Não autorizado");
				return "Não";
			}
			else return "Sim";
		}

	}
