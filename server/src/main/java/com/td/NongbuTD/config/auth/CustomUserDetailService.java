package com.td.NongbuTD.config.auth;

import com.td.NongbuTD.exception.NoUserFoundException;
import com.td.NongbuTD.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
@Transactional
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String uuid) throws UsernameNotFoundException {
        try {
            return userRepository.findById(UUID.fromString(uuid))
                    .orElseThrow(() -> new NoUserFoundException());
        } catch (NoUserFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
