package coder.wetagustin.observer.configuration;

import coder.wetagustin.observer.observator.Observator;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcreteUser extends Observator implements InitializingBean {

    @Autowired
    ConfigurationService configService;

    private String email;
    private String phone;
    private String rol;

    @Override
    public void update( EventType e ) {
        if ( e.equals( EventType.USER )) {
            this.rol = configService.getRol();
            this.phone = configService.getPhone();
            this.email = configService.getEmail();
            System.out.println("Nueva CONFIGURACION asignado al ConcreteUser(Observador) => { rol: " +
                    this.rol + ", email: " +
                    this.email + ", phone: " +
                    this.phone + " }\n"
            );
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        configService.addObservator(this);
    }

}
