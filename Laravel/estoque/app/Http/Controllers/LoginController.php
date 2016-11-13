<?php

namespace estoque\Http\Controllers;

use Auth;
use estoque\Http\Controllers\Controller;

use Illuminate\Http\Request;

class LoginController extends Controller {
	public function login() {
		$credenciais = Request::check('email', 'password');
		if (Auth::attempt($credenciais)) {
			return "Usuário ".Auth::user()->name." logado com sucesso";
		}
		return "As credencias não são válidas";
	}
}
