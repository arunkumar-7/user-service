package com.userservice.service;

import com.userservice.dto.ApiResponseDto;
import com.userservice.dto.RegisterRequestDto;
import com.userservice.dto.RegisterResponseDto;

public interface UserService {
   ApiResponseDto<RegisterResponseDto> register(RegisterRequestDto request);
}
