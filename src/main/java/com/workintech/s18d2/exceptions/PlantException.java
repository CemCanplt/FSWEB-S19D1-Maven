package com.workintech.s18d2.exceptions;/*
Not: HttpStatus kodları hakkında:
  200: Başarılı | 201: Başarıyla oluşturuldu
  400: Geçersiz istek | 401: Yetkisiz | 403: Yasaklı | 404: Bulunamadı
  500: Sunucu hatası | 502: Geçersiz yanıt | 503: Hizmet dışı | 504: Zaman aşımı
*/

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class PlantException extends RuntimeException {
    private HttpStatus httpStatus;
    /*
    HttpStatus otomatik olarak import olmuyor.
    HttpStatus'ü org.springframework.http.HttpStatus'ten import etmeyi unutma.
    */

/*
Not: RuntimeException'un 4 tane constructor'ı var. Bunlardan birini kullanabilirsin.
Bu şablonda en sık kullanılan constructor'ı ekledim.
Eğer başka bir constructor kullanmak istersen, şablonu kendine göre düzenleyebilirsin.
*/

    public PlantException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
