package br.com.dio.dio_spring_security_jwt.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JWTCreator {
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String ROLES_AUTHORITIES = "authorities";
    private static final int KEY_LENGTH = 32; // 256 bits (32 bytes)

    // Método para gerar um token JWT (sem PREFIXO)
    public static String create(String key, JWTObject jwtObject) {
        Key signingKey = getSigningKey(key);

        return Jwts.builder()
                .subject(jwtObject.getSubject())
                .issuedAt(jwtObject.getIssuedAt())
                .expiration(jwtObject.getExpiration())
                .claim(ROLES_AUTHORITIES, checkRoles(jwtObject.getRoles()))
                .signWith(signingKey, SignatureAlgorithm.HS256)
                .compact();
    }


    // Metodo para validar e extrair informações do token JWT
    public static JWTObject parse(String token, String key)
            throws ExpiredJwtException, UnsupportedJwtException, MalformedJwtException, SecurityException {
        JWTObject object = new JWTObject();

        // Remove espaços em branco desnecessários
        token = token.trim();

        Key signingKey = getSigningKey(key);

        // Parse do token usando a API correta da versão 0.12.x
        JwtParser parser = Jwts.parser().setSigningKey(signingKey).build();
        Jws<Claims> claimsJws = parser.parseSignedClaims(token);
        Claims claims = claimsJws.getPayload();

        object.setSubject(claims.getSubject());
        object.setIssuedAt(claims.getIssuedAt());
        object.setExpiration(claims.getExpiration());
        object.setRoles(claims.get(ROLES_AUTHORITIES, List.class));
        return object;
    }


    // Méeodo para gerar uma chave segura de 256 bits (32 bytes)
    private static Key getSigningKey(String key) {
        byte[] keyBytes = key.getBytes(StandardCharsets.UTF_8);

        // Garante que a chave tenha exatamente 32 bytes (256 bits)
        if (keyBytes.length < KEY_LENGTH) {
            keyBytes = Arrays.copyOf(keyBytes, KEY_LENGTH); // Preenche com zeros
        } else if (keyBytes.length > KEY_LENGTH) {
            keyBytes = Arrays.copyOfRange(keyBytes, 0, KEY_LENGTH); // Trunca a chave
        }

        return Keys.hmacShaKeyFor(keyBytes);
    }

    // Garante que os papéis tenham o prefixo "ROLE_"
    private static List<String> checkRoles(List<String> roles) {
        return roles.stream()
                .map(role -> role.startsWith("ROLE_") ? role : "ROLE_" + role)
                .collect(Collectors.toList());
    }
}
