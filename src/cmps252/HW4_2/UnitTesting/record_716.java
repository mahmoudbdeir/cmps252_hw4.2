package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("26")
class Record_716 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 716: FirstName is Lance")
	void FirstNameOfRecord716() {
		assertEquals("Lance", customers.get(715).getFirstName());
	}

	@Test
	@DisplayName("Record 716: LastName is Eloy")
	void LastNameOfRecord716() {
		assertEquals("Eloy", customers.get(715).getLastName());
	}

	@Test
	@DisplayName("Record 716: Company is Kansas Cy South Trnsprt Co Inc")
	void CompanyOfRecord716() {
		assertEquals("Kansas Cy South Trnsprt Co Inc", customers.get(715).getCompany());
	}

	@Test
	@DisplayName("Record 716: Address is 10065 Greenleaf Ave  #-a")
	void AddressOfRecord716() {
		assertEquals("10065 Greenleaf Ave  #-a", customers.get(715).getAddress());
	}

	@Test
	@DisplayName("Record 716: City is Santa Fe Springs")
	void CityOfRecord716() {
		assertEquals("Santa Fe Springs", customers.get(715).getCity());
	}

	@Test
	@DisplayName("Record 716: County is Los Angeles")
	void CountyOfRecord716() {
		assertEquals("Los Angeles", customers.get(715).getCounty());
	}

	@Test
	@DisplayName("Record 716: State is CA")
	void StateOfRecord716() {
		assertEquals("CA", customers.get(715).getState());
	}

	@Test
	@DisplayName("Record 716: ZIP is 90670")
	void ZIPOfRecord716() {
		assertEquals("90670", customers.get(715).getZIP());
	}

	@Test
	@DisplayName("Record 716: Phone is 562-946-4186")
	void PhoneOfRecord716() {
		assertEquals("562-946-4186", customers.get(715).getPhone());
	}

	@Test
	@DisplayName("Record 716: Fax is 562-946-8296")
	void FaxOfRecord716() {
		assertEquals("562-946-8296", customers.get(715).getFax());
	}

	@Test
	@DisplayName("Record 716: Email is lance@eloy.com")
	void EmailOfRecord716() {
		assertEquals("lance@eloy.com", customers.get(715).getEmail());
	}

	@Test
	@DisplayName("Record 716: Web is http://www.lanceeloy.com")
	void WebOfRecord716() {
		assertEquals("http://www.lanceeloy.com", customers.get(715).getWeb());
	}
}
