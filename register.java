public Class register{
  @Autowird
  private RegisterService service;
  
  public void register(String userName,String password){
    service.register(userName,password);
  }
}
