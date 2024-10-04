package tech;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	

    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public String processProduct(HttpServletRequest request, Model model) {
        String name = request.getParameter("productName");
        String category = request.getParameter("category");
        double price = Double.parseDouble(request.getParameter("price"));
        String imageUrl = request.getParameter("imageUrl");

       productService.addProduct(name, category, price, imageUrl);
        
       // Adding product list and success message to the model
       model.addAttribute("productList", productService.getAllProducts());
       model.addAttribute("message", "Product " + name + " saved successfully!");

       // Returning the index page with updated product list
       return "index";
    }

    @GetMapping("/")
    public String showProductList(Model model) {
        model.addAttribute("productList", productService.getAllProducts());
        return "index";
    }

    @GetMapping("/deleteProduct")
    public String deleteProduct(HttpServletRequest req, Model model) {
        int productId = Integer.parseInt(req.getParameter("productId"));
        productService.deleteProduct(productId);
        
     // Refreshing product list
        model.addAttribute("productList", productService.getAllProducts());
        model.addAttribute("message", "Product deleted successfully.");
        return "index";
        
    }

}
