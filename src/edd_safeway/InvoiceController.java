/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd_safeway;

import arbol_b.Key;
import arbol_b.Tree;
import block_chain.Logger;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author JOSED
 */
public class InvoiceController extends Controller{
    
    private Tree<Integer,Invoice> facturas;
    private int indexInvoice;
    
    private static InvoiceController invoiceController;
    
    private Queue<Integer> pendingInvoices;
    
    private InvoiceController(){
        facturas = new Tree(5);
        indexInvoice = 0;
        pendingInvoices = new LinkedList<Integer>();
    }
    
    public static InvoiceController getInstance(){
        if(invoiceController == null){
            invoiceController = new InvoiceController();
        }
        
        return invoiceController;
    }
    
    public void addInvoice(int user, int driver, int travel, String date, double total){
        Invoice newInvoice = new Invoice(indexInvoice, user, driver, travel, date, total);
        
        facturas.insertar(indexInvoice, newInvoice, "Q"+total);
        indexInvoice++;
    }
    
    public int addInkvoiceMap(int user, int travel, double total){
        String date = Logger.getInstance().getTimeStamp();
        Invoice newInvoice = new Invoice(indexInvoice, user, -1, travel, date, total);
        
        //Añadir al árbol
        facturas.insertar(indexInvoice, newInvoice, "Q"+total);
        //Añadir invoice a la cola
        pendingInvoices.add(indexInvoice);
        
        System.out.println(" --> Factura añadida: ["+indexInvoice+"] {Usuario: "+user+", Viaje: "+travel+", Fecha: "+date+", Total: Q"+total+"}");
        
        indexInvoice++;
        
        return indexInvoice-1;
        
    }
    
    public int getPendingInvoice(){
        if(pendingInvoices.isEmpty()){
            return -1;
        } else {
            return pendingInvoices.poll();
        }
    }
    
    public Invoice searchInvoice(int id){
        
        Key key = facturas.buscar(id);
        if( key != null){
            return (Invoice) key.getValor();
        } else {
            return null;
        }
       
    }

    public boolean viewInvoicesTree() {
        String dot = facturas.getGraphviz("Facturas");
        
        if(!dot.isEmpty()){
            this.writeTxt("BTreeInvoices",dot);
            this.writePDF("BTreeInvoices");
            this.openPDF();
            return true;
        } else {
            return false;
        }
    }

    
}
