package co.edu.iudigital.helpmeiud.services.iface;

public interface IEmailService {

    boolean sendMail(String mensaje, String email, String asunto);
}