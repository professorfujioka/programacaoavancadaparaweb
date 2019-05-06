package br.unipe.papw.service;

import br.unipe.papw.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);
}
