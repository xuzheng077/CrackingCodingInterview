package ch11;

/**
 * @author Xu Zheng
 * @description
 */
public class One_Mistake {
    //1. unsigned int is always greater or equals 0, so this is infinite loop.
    // should change it to >0 instead of >=0. Or use signed int
    //2. if use unsigned int, should use %u instead of %d
}
