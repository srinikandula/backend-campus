    package com.anyaudit.controllers;

    import com.anyaudit.dto.SmsClientsDTO;

    import com.anyaudit.service.SmsClientsManager;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.validation.BindingResult;

    import org.springframework.validation.FieldError;
    import org.springframework.web.bind.annotation.*;

    import javax.validation.Valid;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RestController
    @RequestMapping("/api/smsclient")

    public class SmsClientsController {

        private final SmsClientsManager smsClientsManager;

        @Autowired
        public SmsClientsController(SmsClientsManager smsClientsManager) {
            this.smsClientsManager = smsClientsManager;
        }

        @PostMapping("/save")
        public ResponseEntity<Object> createSmsClient(
                @Valid @RequestBody SmsClientsDTO smsClientsDTO, BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                // Build a map of field errors
                Map<String, String> fieldErrors = bindingResult.getFieldErrors().stream()
                        .collect(Collectors.toMap(
                                FieldError::getField,
                                FieldError::getDefaultMessage
                        ));
                return ResponseEntity.badRequest().body(fieldErrors);
            }

            SmsClientsDTO createdClient = smsClientsManager.createSmsClient(smsClientsDTO); // Implement this method
            if (createdClient != null) {
                return new ResponseEntity<>(createdClient, HttpStatus.CREATED);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            }
        }

        @GetMapping("/list")
        public ResponseEntity<List<SmsClientsDTO>> getAllClients() {
            List<SmsClientsDTO> clients = smsClientsManager.getAllSmsClients();
            return ResponseEntity.ok(clients);
        }
        @GetMapping("/list/{clientId}")
        public ResponseEntity<SmsClientsDTO> getClientById(@PathVariable Integer clientId) {
            SmsClientsDTO client = smsClientsManager.getSmsClientById(clientId);
            if (client != null) {
                return ResponseEntity.ok(client);
            } else {
                return ResponseEntity.notFound().build();
            }
        }

        @PutMapping("/update/{clientId}")
        public ResponseEntity<Object> updateSmsClient(
                @PathVariable Integer clientId,
                @Valid @RequestBody SmsClientsDTO smsClientsDTO, BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                // Build a map of field errors
                Map<String, String> fieldErrors = bindingResult.getFieldErrors().stream()
                        .collect(Collectors.toMap(
                                FieldError::getField,
                                FieldError::getDefaultMessage
                        ));
                return ResponseEntity.badRequest().body(fieldErrors);
            }

            SmsClientsDTO updatedClient = smsClientsManager.updateSmsClient(clientId, smsClientsDTO);
            if (updatedClient != null) {
                return new ResponseEntity<>(updatedClient, HttpStatus.OK);
            } else {
                return ResponseEntity.notFound().build();
            }
        }



        @DeleteMapping("/{clientId}")
        public ResponseEntity<String> deleteClient(@PathVariable Integer clientId) {
            smsClientsManager.deleteSmsClient(clientId);
            String responseMessage = "Deleted successfully";
            return ResponseEntity.ok(responseMessage);
        }
    }