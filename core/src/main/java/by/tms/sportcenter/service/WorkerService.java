package by.tms.sportcenter.service;

import by.tms.sportcenter.entity.Worker;
import by.tms.sportcenter.repository.Session.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    private WorkerRepository workerRepository;

    @Autowired
    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public void add(Worker worker) {
        workerRepository.add(worker);
    }
}
