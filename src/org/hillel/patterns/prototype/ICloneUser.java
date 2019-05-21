package org.hillel.patterns.prototype;

public interface ICloneUser extends Cloneable {

    User createDeepCopy();

    User swallowCopyCloneable() throws CloneNotSupportedException;

}
