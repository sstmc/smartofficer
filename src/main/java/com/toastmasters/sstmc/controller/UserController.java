package com.toastmasters.sstmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toastmasters.sstmc.entities.User;
import com.toastmasters.sstmc.rest.RestResponse;
import com.toastmasters.sstmc.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = "user controller")
@RestController()
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@ApiOperation(value = "add user", notes = "all the parameters are string type")
	@RequestMapping(method = RequestMethod.POST)
	public RestResponse add(@RequestBody User user) {
		RestResponse lResponse = new RestResponse();
		lResponse.setSuccess(true);
		try {
			userService.add(user);
		} catch (Exception ex) {
			lResponse.setSuccess(false);
			lResponse.setMessage(ex.getMessage());
		}
		return lResponse;
	}

	@ApiOperation(value="delete all users")
	@RequestMapping(method = RequestMethod.DELETE)
	public RestResponse deleteAll() {
		RestResponse lResponse = new RestResponse();
		lResponse.setSuccess(true);
		try {
			userService.deleteAll();
		} catch (Exception ex) {
			lResponse.setSuccess(false);
			lResponse.setMessage(ex.getMessage());
		}
		return lResponse;
	}

	@ApiOperation(value = "get all users")
	@RequestMapping(method = RequestMethod.GET)
	public RestResponse list() {
		RestResponse lResponse = new RestResponse();
		lResponse.setSuccess(true);
		try {
			List<User> lUserList = userService.list();
			lResponse.setData(lUserList);
		} catch (Exception ex) {
			lResponse.setSuccess(false);
			lResponse.setMessage(ex.getMessage());
		}
		return lResponse;
	}

	@ApiOperation(value = "get users by club")
	@RequestMapping(value = "/getByClub", method = RequestMethod.GET, params = "club")
	@ApiImplicitParam(name="club",value="club name",dataType="string", paramType = "query")
	public RestResponse getByClub(@RequestParam String club) {
		RestResponse lResponse = new RestResponse();
		lResponse.setSuccess(true);
		try {
			List<User> lUserList = userService.getByClub(club);
			lResponse.setData(lUserList);
		} catch (Exception ex) {
			lResponse.setSuccess(false);
			lResponse.setMessage(ex.getMessage());
		}
		return lResponse;
	}

	@ApiOperation(value = "get users by name", notes = "name is the short name of user")
	@RequestMapping(value = "/getByName",method = RequestMethod.GET, params = "name")
	@ApiImplicitParam(name="name",value="short name",dataType="string", paramType = "query")
	public RestResponse getByName(@RequestParam String name) {
		RestResponse lResponse = new RestResponse();
		lResponse.setSuccess(true);
		try {
			List<User> lUserList = userService.getByName(name);
			lResponse.setData(lUserList);
		} catch (Exception ex) {
			lResponse.setSuccess(false);
			lResponse.setMessage(ex.getMessage());
		}
		return lResponse;
	}

	@ApiOperation(value = "get user by club and name", notes = "name is the short name of user")
	@RequestMapping(method = RequestMethod.GET, params = { "club", "name" })
	@ApiImplicitParams({
		  @ApiImplicitParam(name="club",value="club name",dataType="string", paramType = "query"),
		  @ApiImplicitParam(name="name",value="short name",dataType="string", paramType = "query")})
	public RestResponse get(@RequestParam String club, @RequestParam String name) {
		RestResponse lResponse = new RestResponse();
		lResponse.setSuccess(true);
		try {
			User lUser = userService.get(club, name);
			lResponse.setData(lUser);
		} catch (Exception ex) {
			lResponse.setSuccess(false);
			lResponse.setMessage(ex.getMessage());
		}
		return lResponse;
	}
}
