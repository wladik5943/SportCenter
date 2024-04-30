package by.tms.sportcenter.service.interf;

import by.tms.sportcenter.api.service.ServiceCreateRequest;
import by.tms.sportcenter.api.service.ServiceResponse;
import by.tms.sportcenter.api.service.ServiceUpdateRequest;
import by.tms.sportcenter.entity.Service;

import java.time.LocalDate;
import java.util.Collection;

public interface ServiceService {

    ServiceResponse addService(ServiceCreateRequest createRequest);

    ServiceResponse getServiceById(Long id);

    Collection<ServiceResponse> getServices();

    void deleteService(Long id);

    ServiceResponse updateBrand(ServiceUpdateRequest updateRequest);

}
