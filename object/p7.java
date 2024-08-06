class Sample{
    public static void main(String[] args){
        String s1="ABC";
        String s2="ABC";
        Sample S1=new Sample();
        Sample S2=new Sample();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));

    }
}