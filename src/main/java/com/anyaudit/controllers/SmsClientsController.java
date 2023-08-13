    package com.anyaudit.controllers;

    import com.anyaudit.dto.SmsClientsDTO;

    import com.anyaudit.service.SmsClientsManager;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.validation.BindingResult;
    import org.springframework.validation.annotation.Validated;
    import org.springframework.web.bind.annotation.*;

    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    @RestController
    @RequestMapping("/api/smsclient")
    @Validated
    public class SmsClientsController {

        private final SmsClientsManager smsClientsManager;

        @Autowired
        public SmsClientsController(SmsClientsManager smsClientsManager) {
            this.smsClientsManager = smsClientsManager;
        }

        @PostMapping("/save")
        public ResponseEntity<?> createSmsClient(
                @Validated @RequestBody SmsClientsDTO smsClientsDTO, BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                Map<String, String> errors = new HashMap<>();

                if (bindingResult.hasFieldErrors("clientName")) {
                    errors.put("clientName", bindingResult.getFieldError("clientName").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("fileNo")) {
                    errors.put("fileNo", bindingResult.getFieldError("fileNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("clientEmail")) {
                    errors.put("clientEmail", bindingResult.getFieldError("clientEmail").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("clientPan")) {
                    errors.put("clientPan", bindingResult.getFieldError("clientPan").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("phone")) {
                    errors.put("phone", bindingResult.getFieldError("phone").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("ownerName")) {
                    errors.put("ownerName", bindingResult.getFieldError("ownerName").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("ownerNum")) {
                    errors.put("ownerNum", bindingResult.getFieldError("ownerNum").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("accountantName")) {
                    errors.put("accountantName", bindingResult.getFieldError("accountantName").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("accountantNum")) {
                    errors.put("accountantNum", bindingResult.getFieldError("accountantNum").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("address")) {
                    errors.put("address", bindingResult.getFieldError("address").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("asgClientId")) {
                    errors.put("asgClientId", bindingResult.getFieldError("asgClientId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("status")) {
                    errors.put("status", bindingResult.getFieldError("status").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("clientCreationDt")) {
                    errors.put("clientCreationDt", bindingResult.getFieldError("clientCreationDt").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("domainId")) {
                    errors.put("domainId", bindingResult.getFieldError("domainId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("coaHeadId")) {
                    errors.put("coaHeadId", bindingResult.getFieldError("coaHeadId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("cosHeadId")) {
                    errors.put("cosHeadId", bindingResult.getFieldError("cosHeadId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("fssHeadId")) {
                    errors.put("fssHeadId", bindingResult.getFieldError("fssHeadId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("branchId")) {
                    errors.put("branchId", bindingResult.getFieldError("branchId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("mainOrSub")) {
                    errors.put("mainOrSub", bindingResult.getFieldError("mainOrSub").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("assignmentId")) {
                    errors.put("assignmentId", bindingResult.getFieldError("assignmentId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("companyId")) {
                    errors.put("companyId", bindingResult.getFieldError("companyId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("nationality")) {
                    errors.put("nationality", bindingResult.getFieldError("nationality").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("website")) {
                    errors.put("website", bindingResult.getFieldError("website").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("contactPerson")) {
                    errors.put("contactPerson", bindingResult.getFieldError("contactPerson").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("accountingPackage")) {
                    errors.put("accountingPackage", bindingResult.getFieldError("accountingPackage").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("registeredAddress")) {
                    errors.put("registeredAddress", bindingResult.getFieldError("registeredAddress").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("cin")) {
                    errors.put("cin", bindingResult.getFieldError("cin").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("registrationNo")) {
                    errors.put("registrationNo", bindingResult.getFieldError("registrationNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("iec")) {
                    errors.put("iec", bindingResult.getFieldError("iec").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("pfRegNo")) {
                    errors.put("pfRegNo", bindingResult.getFieldError("pfRegNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("esiRegNo")) {
                    errors.put("esiRegNo", bindingResult.getFieldError("esiRegNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("ptRegNo")) {
                    errors.put("ptRegNo", bindingResult.getFieldError("ptRegNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("isFssUpdated")) {
                    errors.put("isFssUpdated", bindingResult.getFieldError("isFssUpdated").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("isRepeated")) {
                    errors.put("isRepeated", bindingResult.getFieldError("isRepeated").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("isCloned")) {
                    errors.put("isCloned", bindingResult.getFieldError("isCloned").getDefaultMessage());
                }

                return ResponseEntity.badRequest().body(errors);
            }

            SmsClientsDTO createdClient = smsClientsManager.createSmsClient(smsClientsDTO);
            return new ResponseEntity<>(createdClient, HttpStatus.CREATED);

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
        public ResponseEntity<?> updateSmsClient(
                @PathVariable Integer clientId,
                @Validated @RequestBody SmsClientsDTO smsClientsDTO, BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                Map<String, String> errors = new HashMap<>();

                if (bindingResult.hasFieldErrors("clientName")) {
                    errors.put("clientName", bindingResult.getFieldError("clientName").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("fileNo")) {
                    errors.put("fileNo", bindingResult.getFieldError("fileNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("clientEmail")) {
                    errors.put("clientEmail", bindingResult.getFieldError("clientEmail").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("clientPan")) {
                    errors.put("clientPan", bindingResult.getFieldError("clientPan").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("phone")) {
                    errors.put("phone", bindingResult.getFieldError("phone").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("ownerName")) {
                    errors.put("ownerName", bindingResult.getFieldError("ownerName").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("ownerNum")) {
                    errors.put("ownerNum", bindingResult.getFieldError("ownerNum").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("accountantName")) {
                    errors.put("accountantName", bindingResult.getFieldError("accountantName").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("accountantNum")) {
                    errors.put("accountantNum", bindingResult.getFieldError("accountantNum").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("address")) {
                    errors.put("address", bindingResult.getFieldError("address").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("asgClientId")) {
                    errors.put("asgClientId", bindingResult.getFieldError("asgClientId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("status")) {
                    errors.put("status", bindingResult.getFieldError("status").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("clientCreationDt")) {
                    errors.put("clientCreationDt", bindingResult.getFieldError("clientCreationDt").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("domainId")) {
                    errors.put("domainId", bindingResult.getFieldError("domainId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("coaHeadId")) {
                    errors.put("coaHeadId", bindingResult.getFieldError("coaHeadId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("cosHeadId")) {
                    errors.put("cosHeadId", bindingResult.getFieldError("cosHeadId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("fssHeadId")) {
                    errors.put("fssHeadId", bindingResult.getFieldError("fssHeadId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("branchId")) {
                    errors.put("branchId", bindingResult.getFieldError("branchId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("mainOrSub")) {
                    errors.put("mainOrSub", bindingResult.getFieldError("mainOrSub").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("assignmentId")) {
                    errors.put("assignmentId", bindingResult.getFieldError("assignmentId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("companyId")) {
                    errors.put("companyId", bindingResult.getFieldError("companyId").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("nationality")) {
                    errors.put("nationality", bindingResult.getFieldError("nationality").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("website")) {
                    errors.put("website", bindingResult.getFieldError("website").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("contactPerson")) {
                    errors.put("contactPerson", bindingResult.getFieldError("contactPerson").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("accountingPackage")) {
                    errors.put("accountingPackage", bindingResult.getFieldError("accountingPackage").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("registeredAddress")) {
                    errors.put("registeredAddress", bindingResult.getFieldError("registeredAddress").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("cin")) {
                    errors.put("cin", bindingResult.getFieldError("cin").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("registrationNo")) {
                    errors.put("registrationNo", bindingResult.getFieldError("registrationNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("iec")) {
                    errors.put("iec", bindingResult.getFieldError("iec").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("pfRegNo")) {
                    errors.put("pfRegNo", bindingResult.getFieldError("pfRegNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("esiRegNo")) {
                    errors.put("esiRegNo", bindingResult.getFieldError("esiRegNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("ptRegNo")) {
                    errors.put("ptRegNo", bindingResult.getFieldError("ptRegNo").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("isFssUpdated")) {
                    errors.put("isFssUpdated", bindingResult.getFieldError("isFssUpdated").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("isRepeated")) {
                    errors.put("isRepeated", bindingResult.getFieldError("isRepeated").getDefaultMessage());
                }
                if (bindingResult.hasFieldErrors("isCloned")) {
                    errors.put("isCloned", bindingResult.getFieldError("isCloned").getDefaultMessage());
                }

                return ResponseEntity.badRequest().body(errors);
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