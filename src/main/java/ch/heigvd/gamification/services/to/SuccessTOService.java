package ch.heigvd.gamification.services.to;

import ch.heigvd.gamification.model.Success;
import ch.heigvd.gamification.services.to.interfaces.ISuccessTOService;
import ch.heigvd.gamification.to.SuccessTO;
import javax.ejb.Stateless;

/**
 *
 * @author Gaël Jobin
 */
@Stateless
public class SuccessTOService implements ISuccessTOService {

  @Override
  public SuccessTO buildSuccessTO(Success source) {
    return new SuccessTO(
            source.getId(),
            source.getName(),
            source.getBadge()
    );
  }

  @Override
  public void updateSuccessEntity(Success existingEntity, SuccessTO newState) { //TODO
   existingEntity.setName(newState.getName());
   existingEntity.setBadge(newState.getBadge());
  }

}
