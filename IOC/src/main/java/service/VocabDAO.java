package service;

import java.util.List;

import model.Vocab;

public interface VocabDAO {

	public List<Vocab> getListVocab();
	public void addNewVocab(Vocab vc);
	public void delectVocab(Vocab vc);
	public void editVocab(Vocab vc);
}
