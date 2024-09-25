// Represents a request made by a passenger (both internal and external requests).
public class Request implements Comparable<Request> {
    private InternalRequest internalRequest;
    private ExternalRequest externalRequest;

    // Constructor to initialize the internal and external requests
    public Request(InternalRequest internalRequest, ExternalRequest externalRequest) {
        this.internalRequest = internalRequest;
        this.externalRequest = externalRequest;
    }

    public InternalRequest getInternalRequest() {
        return internalRequest;
    }

    public ExternalRequest getExternalRequest() {
        return externalRequest;
    }

    // Comparable method to order requests based on destination floors
    @Override
    public int compareTo(Request req) {
        return Integer.compare(this.internalRequest.getDestinationFloor(), req.getInternalRequest().getDestinationFloor());
    }
}
