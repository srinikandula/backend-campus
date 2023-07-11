package com.anyaudit.controllers;

import com.anyaudit.models.AnnexureField;
import com.anyaudit.models.ProcessAuditNode;
import com.anyaudit.service.AnnexureFieldManager;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@Getter
@Setter
@RequestMapping("/api/annexurefield")
public class AnnexureFieldController {

    @Autowired
    private AnnexureFieldManager annexureFieldManager;

    @GetMapping("/list")
    public List<AnnexureField> getAll() {
        return annexureFieldManager.getAll();
    }
}
