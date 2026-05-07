package com.example.test.dto.enums;

public enum ErrorCode {
    NONE("Başarılı"),
    NOT_CONFIRMED_ACCOUNT("Hesap doğrulanmamış"),
    BAD_CREDENTIALS("Kullanıcı adı veya şifre hatalı"),
    INVALID_VERIFICATION_CODE("Doğrulama kodu geçersiz"),
    EMAIL_ALREADY_EXISTS("E-posta zaten mevcut"),
    USERNAME_ALREADY_EXISTS("Kullanıcı adı zaten mevcut"),
    PASSWORDS_NOT_MATCH("Şifreler eşleşmiyor"),
    INVALID_USERNAME("Kullanıcı adı geçersiz"),
    UNAUTHORIZED("Kullanıcı adı veya şifre hatalı. Lütfen tekrar deneyin"),
    NOT_FOUND_BOT_SELLER("Satıcı bulunamadı"),
    NOT_FOUND_SELLER("Satıcı bulunamadı"),
    REJECTED("Reddedildi"),
    SELLER_ALREADY_EXISTS("Satıcı zaten mevcut"),
    FILE_IS_EMPTY("Dosya boş"),
    FILE_TOO_LARGE("Dosya boyutu çok büyük"),
    INVALID_FILE_TYPE("Geçersiz dosya formatı"),
    FILE_UPLOAD_ERROR("Dosya yüklenirken hata oluştu"),
    FILE_NOT_FOUND("Dosya bulunamadı"),
    FILE_DELETE_ERROR("Dosya silinirken hata oluştu"),
    NOT_FOUND_EMAIL("Böyle bir e-posta adresi mevcut değil"),
    NOT_FOUND_SHOP("Mağaza bulunamadı"),
    ERROR("Bir hata oluştu"),
    NOT_FOUND_CATEGORY("Kategori bulunamadı"),
    NOT_FOUND_PRODUCT("Ürün bulunamadı"),
    REQUIRED_PRODUCT_TYPES("Ürün türleri zorunludur"),
    REQUIRED_PRODUCT_TYPE_IMAGES("Ürün türü görselleri zorunludur"),
    SHOP_NOT_CONFIRMED_ADMIN("Mağaza yönetici tarafından onaylanmamış"),
    NOT_FOUND_DISCOUNT("İndirim bulunamadı"),
    ALREADY_DISCOUNT_EXISTS("Bu ürün için indirim zaten mevcut"),
    TYPE_NOT_FOUND("Ürün türü bulunamadı"),
    NOT_FOUND_IMAGE("Görsel bulunamadı"),
    NOT_FOUND_CUSTOMER("Müşteri bulunamadı"),
    NOT_FOUND_SUBSCRIPTION_PLAN("Abonelik planı bulunamadı"),
    OUT_OF_STOCK("Ürün stokta yeterli miktarda bulunmuyor"),
    ;

    private final String tr;

    ErrorCode(String tr) {
        this.tr = tr;
    }

    public String getTr() {
        return tr;
    }
}
