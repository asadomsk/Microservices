package save.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import save.POJO.Action;
import save.repository.ActionRepository;

@Service
@Transactional
public class SaveService {

	@Autowired
	private ActionRepository repo;

	public void save(Action action) {
		repo.save(action);

	}

}
