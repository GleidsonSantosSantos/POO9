package view;

import model.bhImposto;

public class Principal extends bhImposto {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        double areaTotal = Double.parseDouble(request.getParameter("areaTotal"));
        int numeroComodos = Integer.parseInt(request.getParameter("numeroComodos"));
        int numeroQuartos = Integer.parseInt(request.getParameter("numeroQuartos"));
        double areaGaragem = Double.parseDouble(request.getParameter("areaGaragem"));
        int idade = Integer.parseInt(request.getParameter("idade"));
        String cidade = request.getParameter("cidade");

  
        Imovel imovel = new Imovel();
        imovel.setAreaTotal(areaTotal);
        imovel.setNumeroComodos(numeroComodos);
        imovel.setNumeroQuartos(numeroQuartos);
        imovel.setAreaGaragem(areaGaragem);
        imovel.setIdade(idade);


        ImpostoCalculavel calculador = null;
        switch (cidade) {
            case "saoPaulo":
                calculador = new SaoPauloImposto();
                break;
            case "beloHorizonte":
                calculador = new BeloHorizonteImposto();
                break;
            case "portoAlegre":
                calculador = new PortoAlegreImposto();
                break;
            case "curitiba":
                calculador = new CuritibaImposto();
                break;
        }

   
        double imposto = calculador.calcularImposto(imovel);

      
        request.setAttribute("imposto", imposto);
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}
