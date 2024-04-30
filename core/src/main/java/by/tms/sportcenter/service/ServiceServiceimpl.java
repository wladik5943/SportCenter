package by.tms.sportcenter.service;

import by.tms.sportcenter.api.service.ServiceCreateRequest;
import by.tms.sportcenter.api.service.ServiceResponse;
import by.tms.sportcenter.api.service.ServiceUpdateRequest;
import by.tms.sportcenter.mapper.ServiceMapper;
import by.tms.sportcenter.repository.interf.ServiceRepository;
import by.tms.sportcenter.service.interf.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ServiceServiceimpl implements ServiceService {
@Autowired
    private ServiceRepository serviceRepository;
@Autowired
    private ServiceMapper serviceMapper;

    @Override
    public ServiceResponse addService(ServiceCreateRequest createRequest){
        var service = serviceMapper.toEntity(createRequest);
        return serviceMapper.toResponse(serviceRepository.save(service));
    }

    @Override
    public ServiceResponse getServiceById(Long id) {
        return null;
    }

    @Override
    public Collection<ServiceResponse> getServices() {
        return serviceRepository.findAll().stream().map(serviceMapper::toResponse).toList();
    }

    @Override
    public void deleteService(Long id) {

    }

    @Override
    public ServiceResponse updateBrand(ServiceUpdateRequest updateRequest) {
        return null;
    }
}
