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

@Tag("8")
class Record_1111 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1111: FirstName is Felecia")
	void FirstNameOfRecord1111() {
		assertEquals("Felecia", customers.get(1110).getFirstName());
	}

	@Test
	@DisplayName("Record 1111: LastName is Triece")
	void LastNameOfRecord1111() {
		assertEquals("Triece", customers.get(1110).getLastName());
	}

	@Test
	@DisplayName("Record 1111: Company is Goodwin, Daniel G Esq")
	void CompanyOfRecord1111() {
		assertEquals("Goodwin, Daniel G Esq", customers.get(1110).getCompany());
	}

	@Test
	@DisplayName("Record 1111: Address is 609 Alexander Plz")
	void AddressOfRecord1111() {
		assertEquals("609 Alexander Plz", customers.get(1110).getAddress());
	}

	@Test
	@DisplayName("Record 1111: City is Franklin")
	void CityOfRecord1111() {
		assertEquals("Franklin", customers.get(1110).getCity());
	}

	@Test
	@DisplayName("Record 1111: County is Williamson")
	void CountyOfRecord1111() {
		assertEquals("Williamson", customers.get(1110).getCounty());
	}

	@Test
	@DisplayName("Record 1111: State is TN")
	void StateOfRecord1111() {
		assertEquals("TN", customers.get(1110).getState());
	}

	@Test
	@DisplayName("Record 1111: ZIP is 37064")
	void ZIPOfRecord1111() {
		assertEquals("37064", customers.get(1110).getZIP());
	}

	@Test
	@DisplayName("Record 1111: Phone is 615-794-9031")
	void PhoneOfRecord1111() {
		assertEquals("615-794-9031", customers.get(1110).getPhone());
	}

	@Test
	@DisplayName("Record 1111: Fax is 615-794-5283")
	void FaxOfRecord1111() {
		assertEquals("615-794-5283", customers.get(1110).getFax());
	}

	@Test
	@DisplayName("Record 1111: Email is felecia@triece.com")
	void EmailOfRecord1111() {
		assertEquals("felecia@triece.com", customers.get(1110).getEmail());
	}

	@Test
	@DisplayName("Record 1111: Web is http://www.feleciatriece.com")
	void WebOfRecord1111() {
		assertEquals("http://www.feleciatriece.com", customers.get(1110).getWeb());
	}
}
