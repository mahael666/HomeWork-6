package com.company;

import com.company.main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public static testmain{

    @test
public void TriangleCreation(){
        Triangle triangle = new Triangle(3, 4, 5);
        }

@Test
public void testCopyConstructor(){
        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(triangle1);
        assertEquals(triangle1.getA(), triangle2.getA());
        assertEquals(triangle1.getB(), triangle2.getB());
        assertEquals(triangle1.getC(), triangle2.getC());
        }

        }