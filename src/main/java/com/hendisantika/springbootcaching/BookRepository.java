package com.hendisantika.springbootcaching;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-caching
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/08/18
 * Time: 08.20
 * To change this template use File | Settings | File Templates.
 */
public interface BookRepository {
    Book getByIsbn(String isbn);
}
