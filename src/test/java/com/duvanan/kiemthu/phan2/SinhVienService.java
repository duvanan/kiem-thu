package com.duvanan.kiemthu.phan2;

import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> sinhViens = new ArrayList<>();

    public SinhVienService() {
        SinhVien sinhVien = new SinhVien("1", "du van an", "lP01", "Kiem Thu", "Ph27911");
        sinhViens.add(sinhVien);
    }

    public boolean themSinhVien(SinhVien sinhVien) {
        if (ObjectUtils.isEmpty(sinhVien)) {
            throw new IllegalArgumentException("sinh vien khong duoc de null");
        } else if (ObjectUtils.isEmpty(sinhVien.getId())) {
            throw new IllegalArgumentException("id khong duoc de trong");
        } else if (ObjectUtils.isEmpty(sinhVien.getHoten())) {
            throw new IllegalArgumentException("Ho ten khong duoc de trong");
        } else if (ObjectUtils.isEmpty(sinhVien.getMalop())) {
            throw new IllegalArgumentException("Ma lop khong duoc de trong");
        } else if (ObjectUtils.isEmpty(sinhVien.getTenlop())) {
            throw new IllegalArgumentException("Ten lop khong duoc de trong");
        } else if (!sinhVien.getTenlop().matches("[a-zA-Z0-9\\s]+")) {
            throw new IllegalArgumentException("Ten lop khong duoc chua ki tu dac biet");
        }
        else if (ObjectUtils.isEmpty(sinhVien.getMasv())) {
            throw new IllegalArgumentException("Ma sinh vien khong duoc de trong");
        }
        sinhViens.add(sinhVien);
        return true;
    }

    public boolean timKiemTheoMaSinhVien(String masv) {
        if (ObjectUtils.isEmpty(masv)) {
            throw new IllegalArgumentException("Ma sinh vien khong duoc de trong");
        }
       return sinhViens.stream().anyMatch(i -> i.getMasv().equals(masv));
    }
}
