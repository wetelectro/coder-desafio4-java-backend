package coder.wetagustin.observer.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/config")
public class ConfigurationController {

    @Autowired
    ConfigurationService configService;

    @PutMapping("/users")
    public Object updateConfig(@RequestBody UserConfiguration newConfig) {
        System.out.println("PUT :: Cambiar configuracion de usuario(ROL).\n");
        configService.updateUserRol(newConfig);
        return newConfig;
    }

}
