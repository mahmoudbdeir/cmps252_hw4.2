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

@Tag("44")
class Record_2993 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2993: FirstName is Martina")
	void FirstNameOfRecord2993() {
		assertEquals("Martina", customers.get(2992).getFirstName());
	}

	@Test
	@DisplayName("Record 2993: LastName is Glanton")
	void LastNameOfRecord2993() {
		assertEquals("Glanton", customers.get(2992).getLastName());
	}

	@Test
	@DisplayName("Record 2993: Company is Chang Tumaneng & Mesina")
	void CompanyOfRecord2993() {
		assertEquals("Chang Tumaneng & Mesina", customers.get(2992).getCompany());
	}

	@Test
	@DisplayName("Record 2993: Address is 7921 Canoga Ave")
	void AddressOfRecord2993() {
		assertEquals("7921 Canoga Ave", customers.get(2992).getAddress());
	}

	@Test
	@DisplayName("Record 2993: City is Canoga Park")
	void CityOfRecord2993() {
		assertEquals("Canoga Park", customers.get(2992).getCity());
	}

	@Test
	@DisplayName("Record 2993: County is Los Angeles")
	void CountyOfRecord2993() {
		assertEquals("Los Angeles", customers.get(2992).getCounty());
	}

	@Test
	@DisplayName("Record 2993: State is CA")
	void StateOfRecord2993() {
		assertEquals("CA", customers.get(2992).getState());
	}

	@Test
	@DisplayName("Record 2993: ZIP is 91304")
	void ZIPOfRecord2993() {
		assertEquals("91304", customers.get(2992).getZIP());
	}

	@Test
	@DisplayName("Record 2993: Phone is 818-340-4312")
	void PhoneOfRecord2993() {
		assertEquals("818-340-4312", customers.get(2992).getPhone());
	}

	@Test
	@DisplayName("Record 2993: Fax is 818-340-3506")
	void FaxOfRecord2993() {
		assertEquals("818-340-3506", customers.get(2992).getFax());
	}

	@Test
	@DisplayName("Record 2993: Email is martina@glanton.com")
	void EmailOfRecord2993() {
		assertEquals("martina@glanton.com", customers.get(2992).getEmail());
	}

	@Test
	@DisplayName("Record 2993: Web is http://www.martinaglanton.com")
	void WebOfRecord2993() {
		assertEquals("http://www.martinaglanton.com", customers.get(2992).getWeb());
	}
}
