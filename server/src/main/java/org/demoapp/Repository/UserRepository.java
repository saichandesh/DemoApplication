package org.demoapp.Repository;

import org.demoapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users, Long>{
	
	@Query(value="Select u from users u where username=?1 and password=?2",nativeQuery = true)
	public Users loginAuth(String username, String password);

}
