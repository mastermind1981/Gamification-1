package ch.heigvd.gamification.services.crud;

import ch.heigvd.gamification.exceptions.EntityNotFoundException;
import ch.heigvd.gamification.model.Application;
import ch.heigvd.gamification.services.crud.interfaces.IApplicationsManager;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Implementation of the application manager interface.
 *
 * @see IApplicationsManager
 * @author Gaël Jobin
 */
@Stateless
public class ApplicationsManager implements IApplicationsManager {

  @PersistenceContext(unitName = "Gamification")
  private EntityManager em;

  @Override
  public long create(Application applicationData) {
    Application newApplication = new Application(applicationData);
    em.persist(newApplication);
    return newApplication.getId();
  }

  @Override
  public void update(Application newState) throws EntityNotFoundException {
    findById(newState.getId());
    em.merge(newState);
  }

  @Override
  public void delete(long id) throws EntityNotFoundException {
    //Is delete cascade setted ?
    em.remove(findById(id));
  }

  @Override
  public Application findById(long id) throws EntityNotFoundException {
    Application existingApplication = em.find(Application.class, id);
    if (existingApplication == null) {
      throw new EntityNotFoundException();
    }
    return existingApplication;
  }

  @Override
  public List<Application> findAll() {
    return em.createNamedQuery("findAllApplication").getResultList();
  }
}
