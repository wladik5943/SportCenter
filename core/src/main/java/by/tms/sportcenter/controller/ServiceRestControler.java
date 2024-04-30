package by.tms.sportcenter.controller;


import by.tms.sportcenter.api.service.ServiceCreateRequest;
import by.tms.sportcenter.api.service.ServiceResponse;
import by.tms.sportcenter.service.interf.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("services")
public class ServiceRestControler {

    private final ServiceService serviceService;

    @PostMapping
    public ServiceResponse addService(@RequestBody ServiceCreateRequest createRequest) {
        return serviceService.addService(createRequest);
    }

    @GetMapping
    public Collection<ServiceResponse> services() {
        return serviceService.getServices();
    }


}
