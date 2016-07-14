package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vocabtest")
public class Vocab {
	
	@Id
	@Column(name = "VOCAB")
	private String vocab;
	
	@Column(name = "TRANSLATE")
	private String translate;
	
	@Column(name = "MODE")
	private String mode;
	
	public String getVocab() {
		return vocab;
	}
	public void setVocab(String vocab) {
		this.vocab = vocab;
	}
	public String getTranslate() {
		return translate;
	}
	public void setTranslate(String translate) {
		this.translate = translate;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	
}
