package pl.simpleascoding.tutoringplatform.service.security;

import pl.simpleascoding.tutoringplatform.dto.CredentialsDTO;

import java.util.Map;

public interface SecurityService {

    Map<String, String> login(CredentialsDTO dto, String issuer);

    Map<String, String> refresh(String auth, String issuer);

}
