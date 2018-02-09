
public class Recurso {
	
		private String identificacao;
		private String dataini;
		private String horaini;
		private String datafin;
		private String horafin;
		private String responsavel;
		private String usuario;
		private String email;
		private String descri;
		
		public void email(String email) {
			this.email=email;
		}
		public void descri(String descri) {
			this.descri=descri;
		}
		
		public void user(String usuario) {
			this.usuario = usuario;
		
		}

		public void identific(String identificacao ){
			this.identificacao = identificacao;	
			
			
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
		
		public int resp(String responsavel,int idresponsavel){
			
			this.responsavel=responsavel;
			if(idresponsavel!=12350 && idresponsavel!=13123 &&  idresponsavel!=12341) {
				return 1;
			}
			else return 0;
		}
		public String get_ident () {
		
			return this.identificacao;
		}
		public String get_dataini () {
			
			return this.dataini;
		}
		public String get_horaini () {
			
			return this.horaini;
		}
		public String get_datafin () {
			
			return this.datafin;
		}
		public String get_horafin () {
			
			return this.horafin;
		}
		public String get_respon () {
			
			return this.responsavel;
		}
		public String get_usuario () {
			
			return this.usuario;
		}
		public String get_email () {
			
			return this.email;
		}
		public String get_descri () {
			
			return this.descri;
		}
	}
