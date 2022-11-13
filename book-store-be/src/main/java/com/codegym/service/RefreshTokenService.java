package com.codegym.service;

import com.codegym.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenService {
    Optional<RefreshToken> findByToken(String token);

    RefreshToken createRefreshToken(Integer userId);

    RefreshToken verifyExpiration(RefreshToken token);

    int deleteByUserId(Integer userId);
}
