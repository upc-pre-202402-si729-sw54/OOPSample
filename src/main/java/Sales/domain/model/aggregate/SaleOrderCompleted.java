package Sales.domain.model.aggregate;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SaleOrderCompleted extends SaleOrder {

    private String status;

    public SaleOrderCompleted(){
        super();
        this.status = "Completed";
    }

    public SaleOrderCompleted(String customerName) {
        super();
        this.customerName = customerName;
        this.status = "Completed";
    }

    @Override
    public String getOrderStatus(String someParameter) throws IOException {
        return this.status;
    }
}
