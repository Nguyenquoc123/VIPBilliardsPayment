package com.group1.vipbilliardspayment.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MatHangTrongHoaDonCreateRequest {
    @NotNull(message = "FIELD_NULL")
    Integer maHang;

    @NotNull(message = "FIELD_NULL")
    Integer maHoaDon;

    @NotNull(message = "FIELD_NULL")
    @Min(value = 0, message = "SOLUONG_INVALID")
    int soLuong;
}
