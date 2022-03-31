<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> //We imported this 'taglib' - really, it's a collection of 'custom tags' for us to use. Did you notice the attribute called "prefix"? It's assigned to a letter - the letter 'c'
<c:choose> //Choose. . .
  <c:when test="${cart.isEmpty()}"> //Choose option a if true? "PATH A" [isEmpty from coll. framework]
    <h2>No items in your cart (yet).</h2>
  </c:when>
  <c:otherwise> //Else. . option b over here works "PATH B"
    <c:forEach var="item" items="${cart.items}"> //hmm 'forEach' <- does that ring a bell?
      <div class="item">
      <h3>${item.name}</h3> //Of a cart of items, access ONE item
      <p>${item.description}</p>
      <p>${item.price}</p>
      <c:if test="${item.isOnSale}"> //[IF TRUE ITEM IS ON SALE.. then let the user know with a paragraph]; example of custom method from java class
        <p>This item is on sale!</p>
      </c:if>
      </item>
    </c:forEach>
  </c:otherwise>
</c:choose>
//In the future
//Servlet would have the "cart" passed through as an 'attribute' [kind of like what we did with message]
//Go fetch me all of the 'ads' from the database. . add them as an attribute to pass through to the view
//In the view - show all of the ads using a "forEach" and build them in cards