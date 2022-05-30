package projeto.cadastro.aluno.model;

public class Leitor {
	
	private int RGM;
	private String nomeAluno;
	private String nascAluno;
	private int CPF;
	private String emailAluno;
	private String endAluno;
	private String munAluno;
	private String ufAluno;
	private int celAluno;
	private String cursoAluno;
	private String campusAluno;
	private String perAluno;
	private String discAluno;
	private String semAluno;
	private String notaAluno;
	private int falAluno;
	
public Leitor() {
	
	
}

public Leitor(int rGM, String nomeAluno, String nascAluno, int cPF, String emailAluno, String endAluno, String munAluno,
		String ufAluno, int celAluno, String cursoAluno, String campusAluno, String perAluno, String discAluno,
		String semAluno, String notaAluno, int falAluno) {
	super();
	RGM = rGM;
	this.nomeAluno = nomeAluno;
	this.nascAluno = nascAluno;
	CPF = cPF;
	this.emailAluno = emailAluno;
	this.endAluno = endAluno;
	this.munAluno = munAluno;
	this.ufAluno = ufAluno;
	this.celAluno = celAluno;
	this.cursoAluno = cursoAluno;
	this.campusAluno = campusAluno;
	this.perAluno = perAluno;
	this.discAluno = discAluno;
	this.semAluno = semAluno;
	this.notaAluno = notaAluno;
	this.falAluno = falAluno;
}

public int getRGM() {
	return RGM;
}

public void setRGM(int rGM) {
	RGM = rGM;
}

public String getNomeAluno() {
	return nomeAluno;
}

public void setNomeAluno(String nomeAluno) {
	this.nomeAluno = nomeAluno;
}

public String getNascAluno() {
	return nascAluno;
}

public void setNascAluno(String nascAluno) {
	this.nascAluno = nascAluno;
}

public int getCPF() {
	return CPF;
}

public void setCPF(int cPF) {
	CPF = cPF;
}

public String getEmailAluno() {
	return emailAluno;
}

public void setEmailAluno(String emailAluno) {
	this.emailAluno = emailAluno;
}

public String getEndAluno() {
	return endAluno;
}

public void setEndAluno(String endAluno) {
	this.endAluno = endAluno;
}

public String getMunAluno() {
	return munAluno;
}

public void setMunAluno(String munAluno) {
	this.munAluno = munAluno;
}

public String getUfAluno() {
	return ufAluno;
}

public void setUfAluno(String ufAluno) {
	this.ufAluno = ufAluno;
}

public int getCelAluno() {
	return celAluno;
}

public void setCelAluno(int celAluno) {
	this.celAluno = celAluno;
}

public String getCursoAluno() {
	return cursoAluno;
}

public void setCursoAluno(String cursoAluno) {
	this.cursoAluno = cursoAluno;
}

public String getCampusAluno() {
	return campusAluno;
}

public void setCampusAluno(String campusAluno) {
	this.campusAluno = campusAluno;
}

public String getPerAluno() {
	return perAluno;
}

public void setPerAluno(String perAluno) {
	this.perAluno = perAluno;
}

public String getDiscAluno() {
	return discAluno;
}

public void setDiscAluno(String discAluno) {
	this.discAluno = discAluno;
}

public String getSemAluno() {
	return semAluno;
}

public void setSemAluno(String semAluno) {
	this.semAluno = semAluno;
}

public String getNotaAluno() {
	return notaAluno;
}

public void setNotaAluno(String notaAluno) {
	this.notaAluno = notaAluno;
}

public int getFalAluno() {
	return falAluno;
}

public void setFalAluno(int falAluno) {
	this.falAluno = falAluno;
}

}