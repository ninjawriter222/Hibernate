package com.javatpoint.mypackage;

public class StoreData {

    public StoreData() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    public static void main(String[] strings) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           org/hibernate/boot/registry/StandardServiceRegistryBuilder
         * 3: dup
         * 4: invokespecial org/hibernate/boot/registry/StandardServiceRegistryBuilder."<init>":()V
         * 7: ldc           hibernate.cfg.xml
         * 9: invokevirtual org/hibernate/boot/registry/StandardServiceRegistryBuilder.configure:(Ljava/lang/String;)Lorg/hibernate/boot/registry/StandardServiceRegistryBuilder;
         * 12: invokevirtual org/hibernate/boot/registry/StandardServiceRegistryBuilder.build:()Lorg/hibernate/boot/registry/StandardServiceRegistry;
         * 15: astore_1
         * 16: new           org/hibernate/boot/MetadataSources
         * 19: dup
         * 20: aload_1
         * 21: invokespecial org/hibernate/boot/MetadataSources."<init>":(Lorg/hibernate/service/ServiceRegistry;)V
         * 24: invokevirtual org/hibernate/boot/MetadataSources.getMetadataBuilder:()Lorg/hibernate/boot/MetadataBuilder;
         * 27: invokeinterface org/hibernate/boot/MetadataBuilder.build:()Lorg/hibernate/boot/Metadata;
         * 32: astore_2
         * 33: aload_2
         * 34: invokeinterface org/hibernate/boot/Metadata.getSessionFactoryBuilder:()Lorg/hibernate/boot/SessionFactoryBuilder;
         * 39: invokeinterface org/hibernate/boot/SessionFactoryBuilder.build:()Lorg/hibernate/SessionFactory;
         * 44: astore_3
         * 45: aload_3
         * 46: invokeinterface org/hibernate/SessionFactory.openSession:()Lorg/hibernate/Session;
         * 51: astore        4
         * 53: aload         4
         * 55: invokeinterface org/hibernate/Session.beginTransaction:()Lorg/hibernate/Transaction;
         * 60: astore        5
         * 62: new           com/javatpoint/mypackage/Employee
         * 65: dup
         * 66: invokespecial com/javatpoint/mypackage/Employee."<init>":()V
         * 69: astore        6
         * 71: aload         6
         * 73: bipush        101
         * 75: invokevirtual com/javatpoint/mypackage/Employee.setId:(I)V
         * 78: aload         6
         * 80: ldc           Gaurav
         * 82: invokevirtual com/javatpoint/mypackage/Employee.setFirstName:(Ljava/lang/String;)V
         * 85: aload         6
         * 87: ldc           Chawla
         * 89: invokevirtual com/javatpoint/mypackage/Employee.setLastName:(Ljava/lang/String;)V
         * 92: aload         4
         * 94: aload         6
         * 96: invokeinterface org/hibernate/Session.save:(Ljava/lang/Object;)Ljava/io/Serializable;
         * 101: pop
         * 102: aload         5
         * 104: invokeinterface org/hibernate/Transaction.commit:()V
         * 109: getstatic     java/lang/System.out:Ljava/io/PrintStream;
         * 112: ldc           successfully saved
         * 114: invokevirtual java/io/PrintStream.println:(Ljava/lang/String;)V
         * 117: aload_3
         * 118: invokeinterface org/hibernate/SessionFactory.close:()V
         * 123: aload         4
         * 125: invokeinterface org/hibernate/Session.close:()V
         * 130: return
         *  */
        // </editor-fold>
    }
}
