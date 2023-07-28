package com.edu.iudigital.helpmeiud.service.iface;

public interface IEmailService {

    boolean sendEmail(String mensaje, String email, String asunto);
}
