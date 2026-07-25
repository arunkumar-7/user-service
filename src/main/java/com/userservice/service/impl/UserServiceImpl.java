package com.userservice.service.impl;

import com.userservice.dto.ApiResponseDto;
import com.userservice.dto.RegisterRequestDto;
import com.userservice.dto.RegisterResponseDto;
import com.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public ApiResponseDto<RegisterResponseDto> register(RegisterRequestDto request) {
        return null;
    }
}
