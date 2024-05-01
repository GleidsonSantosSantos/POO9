package JPS;


	<!-- formulario.jsp -->
	<form action="calcularImposto" method="post">
	    Área Total: <input type="text" name="areaTotal"><br>
	    Número de Cômodos: <input type="text" name="numeroComodos"><br>
	    Número de Quartos: <input type="text" name="numeroQuartos"><br>
	    Área da Garagem: <input type="text" name="areaGaragem"><br>
	    Idade do Imóvel: <input type="text" name="idade"><br>
	    <select name="cidade">
	        <option value="saoPaulo">São Paulo</option>
	        <option value="beloHorizonte">Belo Horizonte</option>
	        <option value="portoAlegre">Porto Alegre</option>
	        <option value="curitiba">Curitiba</option>
	    </select>
	    <input type="submit" value="Calcular Imposto">
	</form>

}
