package com.userservice.service;

import com.userservice.dto.response.ApiResponseDto;
import com.userservice.dto.request.RegisterRequestDto;
import com.userservice.dto.response.RegisterResponseDto;

public interface UserService {
   ApiResponseDto<RegisterResponseDto> register(RegisterRequestDto request);
}
