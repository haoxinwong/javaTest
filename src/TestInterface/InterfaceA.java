/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestInterface;

/**
 *
 * @author WarSpite
 */
public interface InterfaceA {
    void aaa();
    
}
interface InterfaceB {
    void bbb();
    
}
interface InterfaceC extends InterfaceA, InterfaceB{
    void ccc();
    
}

class TestClass implements InterfaceC{

    @Override
    public void aaa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ccc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bbb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
