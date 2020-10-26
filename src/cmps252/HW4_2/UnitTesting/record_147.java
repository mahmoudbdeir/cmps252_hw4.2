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

@Tag("29")
class Record_147 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 147: FirstName is Felicia")
	void FirstNameOfRecord147() {
		assertEquals("Felicia", customers.get(146).getFirstName());
	}

	@Test
	@DisplayName("Record 147: LastName is Speyer")
	void LastNameOfRecord147() {
		assertEquals("Speyer", customers.get(146).getLastName());
	}

	@Test
	@DisplayName("Record 147: Company is A Classical Record")
	void CompanyOfRecord147() {
		assertEquals("A Classical Record", customers.get(146).getCompany());
	}

	@Test
	@DisplayName("Record 147: Address is 1409 Robinson Rd")
	void AddressOfRecord147() {
		assertEquals("1409 Robinson Rd", customers.get(146).getAddress());
	}

	@Test
	@DisplayName("Record 147: City is Old Hickory")
	void CityOfRecord147() {
		assertEquals("Old Hickory", customers.get(146).getCity());
	}

	@Test
	@DisplayName("Record 147: County is Davidson")
	void CountyOfRecord147() {
		assertEquals("Davidson", customers.get(146).getCounty());
	}

	@Test
	@DisplayName("Record 147: State is TN")
	void StateOfRecord147() {
		assertEquals("TN", customers.get(146).getState());
	}

	@Test
	@DisplayName("Record 147: ZIP is 37138")
	void ZIPOfRecord147() {
		assertEquals("37138", customers.get(146).getZIP());
	}

	@Test
	@DisplayName("Record 147: Phone is 615-847-7347")
	void PhoneOfRecord147() {
		assertEquals("615-847-7347", customers.get(146).getPhone());
	}

	@Test
	@DisplayName("Record 147: Fax is 615-847-6936")
	void FaxOfRecord147() {
		assertEquals("615-847-6936", customers.get(146).getFax());
	}

	@Test
	@DisplayName("Record 147: Email is felicia@speyer.com")
	void EmailOfRecord147() {
		assertEquals("felicia@speyer.com", customers.get(146).getEmail());
	}

	@Test
	@DisplayName("Record 147: Web is http://www.feliciaspeyer.com")
	void WebOfRecord147() {
		assertEquals("http://www.feliciaspeyer.com", customers.get(146).getWeb());
	}
}
