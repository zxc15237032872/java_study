public enum Gender {
    BOY("男"),GIRL("女");//每一个枚举项都是一个枚举对象
    private String name;
    private Gender(){}
    private Gender(String name){
        this.name=name;
    }
    public  String getname(){
        return this.name;
    }



}
