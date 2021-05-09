package core.concretes;

import GoogleService.GoogleManager;
import core.abstracts.PermissionService;

public class GoogleServiceAdapter  implements PermissionService{
	GoogleManager googleManager = new GoogleManager();

	@Override
	public boolean checkEmail() {
		return googleManager.checkEmail();
	}

	@Override
	public boolean confirmEmail() {
		// TODO Auto-generated method stub
		return googleManager.confirmEmail();
	}

}
