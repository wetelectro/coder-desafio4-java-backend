package coder.wetagustin.observer.configuration;

import coder.wetagustin.observer.subject.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService extends Subject {

    @Value(value = "${user.rol}")
    private String rol;

    @Value(value = "${user.email}")
    private String email;

    @Value(value = "${user.phone}")
    private String phone;

    public void updateUserRol( UserConfiguration userConfig ) {

        if( userConfig.getRol() != null ) {
            rol = userConfig.getRol();
        }

        if( userConfig.getEmail() != null ) {
            email = userConfig.getEmail();
        }

        if( userConfig.getPhone() != null ) {
            email = userConfig.getPhone();
        }

        System.out.println("Nueva CONFIGURACION asignada al ConfigurationService(Sujeto) => { rol: " +
                this.rol + ", email: " +
                this.email + ", phone: " +
                this.phone + " }\n"
        );

        this.notifyObservators( EventType.USER );
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
