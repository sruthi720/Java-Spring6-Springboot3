package org.telusko;

import org.springframework.stereotype.Component;

@Component("phon1")
public class Phone implements Computer{
    @Override
    public void compile() {
        System.out.println("implements by phone");
    }
}
