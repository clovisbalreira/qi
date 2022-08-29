package model;

public class Funcionario {
    //atributos
    private String nome;
    private String cpf;
    private String cargo;
    private int valorHora;
    private int quantidadeHoras;
    private int tipoInsalubridade;
    private int dependentes;

    //metodos assessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public int getTipoInsalubridade() {
        return tipoInsalubridade;
    }

    public void setTipoInsalubridade(int tipoInsalubridade) {
        this.tipoInsalubridade = tipoInsalubridade;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    //metodos
    public double calcularSalarioBruto(){ return this.getValorHora() * this.getQuantidadeHoras(); }
    public double calcularValeTransporte(){
        double vt = this.calcularSalarioBruto() * 0.06;
        if( vt > 295.20){
            return 0;
        }else{
            return vt;
        }
    }
    public double calcularSalarioFamilia(){
        if(this.calcularSalarioBruto() <= 907.77){
            return this.getDependentes() * 46.54;
        }else if(this.calcularSalarioBruto() <= 1364.43){
            return this.getDependentes() * 32.80;
        }else{
            return 0;
        }
    }
    public double calcularInsalubridade(){
        double porcentagem;
        switch (this.getTipoInsalubridade()){
            case 2:
                porcentagem = 0.10;
            break;
            case 3:
                porcentagem = 0.20;
            break;
            case 4:
                porcentagem = 0.40;
            break;
            default:
                porcentagem = 0;
            break;
        }
        return this.calcularSalarioBruto() * porcentagem;
    }
    public double calcularInss(){
        if(this.calcularSalarioBruto() <= 1751.81){
            return this.calcularSalarioBruto() * 0.08;
        }else if(this.calcularSalarioBruto() <= 2919.72){
            return this.calcularSalarioBruto() * 0.09;
        }else if(this.calcularSalarioBruto() <= 5839.45){
            return this.calcularSalarioBruto() * 0.11;
        }else {
            return this.calcularSalarioBruto() * 0.27;
        }
    }
    public double calcularValeRefeicao(){ return 400 * 0.20;}
    public double calcularBenificios(){ return this.calcularSalarioFamilia();}
    public double calcularDebito(){ return this.calcularValeTransporte() + this.calcularInsalubridade() + this.calcularInss() + this.calcularValeRefeicao(); }
    public double calcularSalarioLiquido(){ return this.calcularSalarioBruto() + this.calcularBenificios() - this.calcularDebito();}

    //toString
    @Override
    public String toString() {
        return  "\nNome                 : " + this.getNome()+
                "\nCPF                  : " + this.getCpf() +
                "\nCargo                : " + this.getCargo() +
                "\nValorHora            : " + this.getValorHora() +
                "\nQuantidadeHoras      : " + this.getQuantidadeHoras() +
                "\nTipoInsalubridade    : " + this.getTipoInsalubridade() +
                "\nDependentes          : " + this.getDependentes() +
                "\nSalario Bruto        : " + this.calcularSalarioBruto() +
                "\nVale Transporte      : " + this.calcularValeTransporte() +
                "\nSalario Familia      : " + this.calcularSalarioFamilia() +
                "\nInsubridade          : " + this.calcularInsalubridade() +
                "\nINSS                 : " + this.calcularInss() +
                "\nVale Refeição        : " + this.calcularValeRefeicao() +
                "\nCreditos             : " + this.calcularBenificios() +
                "\nDebito               : " + this.calcularDebito() +
                "\nSalario Liquido      : " + this.calcularSalarioLiquido();
    }
}
