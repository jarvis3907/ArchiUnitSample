package org.example.layers;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Stateless
@Local(SomeBusinessInterface.class)
public class SecondBeanImplementingSomeBusinessInterface implements SomeBusinessInterface {
}
