package core.concretes;

import core.abstracts.PermissionService;

public class PermissionManager implements PermissionService {

	private PermissionService permissionService;

	public PermissionManager(PermissionService permissionService) {
		super();
		this.permissionService = permissionService;
	}

	@Override
	public boolean checkEmail() {
		return permissionService.checkEmail();
	}

	@Override
	public boolean confirmEmail() {
		return permissionService.confirmEmail();
	}
	

}
