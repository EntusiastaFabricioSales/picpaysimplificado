package com.picpaysimplificado.services;

import com.picpaysimplificado.dtos.NotificationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "email-service", url = "http://localhost:8090/api/email")
public interface NotificationService {
    /*@Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String subject, String message) throws Exception{
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, subject, message);

        //ResponseEntity<String> notificationResponse = restTemplate.postForEntity("http://o4d9z.mocklab.io/notify", notificationRequest, String.class);

        //if(!(notificationResponse.getStatusCode() == HttpStatus.OK)){
            //System.out.println("erro ao enviar notificacao");
        //throw new Exception("Serviço de notificação está fora do ar");
        //}

        System.out.println("Notificacao enviada para o o usuario");
    }*/

    @PostMapping("/send")
    void sendEmail(@RequestBody NotificationDTO emailRequest);
}
