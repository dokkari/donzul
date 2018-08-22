package dok.donzul.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dok.donzul.entity.TbMstUser;
import dok.donzul.entity.TbMstUserAuthority;
import dok.donzul.entity.TbMstUserAuthorityExample;
import dok.donzul.entity.TbMstUserExample;
import dok.donzul.mapper.TbMstUserAuthorityMapper;
import dok.donzul.mapper.TbMstUserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbMstUserMapper userMapper;
	@Autowired
	private TbMstUserAuthorityMapper userAuthMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		TbMstUserExample userEx = new TbMstUserExample();
		userEx.createCriteria().andUsernameEqualTo(username);
		List<TbMstUser> userList = userMapper.selectByExample(userEx);
		
		TbMstUser user = new TbMstUser();
		
		if(userList != null && userList.size() > 0) {
			user = userList.get(0);
			
			user.setAuthorities(getAuthorities(username));
			
		}
		
		return user;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities(String username) {
		TbMstUserAuthorityExample authEx = new TbMstUserAuthorityExample();
		authEx.createCriteria().andUsernameEqualTo(username);
		List<TbMstUserAuthority> stringAuths = userAuthMapper.selectByExample(authEx);
		List<GrantedAuthority> authorities = new ArrayList<>();
		if(stringAuths != null && stringAuths.size() > 0) {
			for(TbMstUserAuthority auth : stringAuths) {
				authorities.add(new SimpleGrantedAuthority(auth.getAuthorityName()));
			}
		}
		return authorities;
	}

}
