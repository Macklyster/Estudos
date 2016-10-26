<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class DatabaseSeeder extends Seeder {
	/**
	 * Run the database seeds.
	 *
	 * @return void
	 */
	public function run() {
		$this->call('ProdutoTableSeeder');
	}
}

class ProdutoTableSeeder extends Seeder {
	public function run() {
		DB::insert('insert into produtos
			(nome, quantidade, valor,  descricao)
			values(?,?,?,?)',
			array('Geladeira', 2, 590, 'Side by Side com gelo na porta'));

		DB::insert('insert into produtos
			(nome, quantidade, valor,  descricao)
			values(?,?,?,?)',
			array('Fogão', 5, 950.00, 'Painel automatico e forno elétrico'));

		DB::insert('insert into produtos
			(nome, quantidade, valor,  descricao)
			values(?,?,?,?)',
			array('Microondas', 1, 1500, 'Manda SMS quando termina de esquentar'));
	}
}
