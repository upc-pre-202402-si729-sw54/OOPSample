package Sales.domain.model.aggregate;

import java.io.FileNotFoundException;

public class SaleOrder {
    private String id;
    private String customerId;
    protected String customerName;

    public SaleOrder() {
        this.id = "";
        this.customerId = "";
        this.customerName = "";
    }

    public SaleOrder(String customerName) {
        super();
        this.customerName = customerName;
    }

    public SaleOrder(String id, String customerId, String customerName) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getOrderStatus(String someParameter) throws Exception {
        return "CREATED";
    }
}
