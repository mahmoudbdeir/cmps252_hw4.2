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

@Tag("6")
class Record_2386 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2386: FirstName is Antonia")
	void FirstNameOfRecord2386() {
		assertEquals("Antonia", customers.get(2385).getFirstName());
	}

	@Test
	@DisplayName("Record 2386: LastName is Kistenmacher")
	void LastNameOfRecord2386() {
		assertEquals("Kistenmacher", customers.get(2385).getLastName());
	}

	@Test
	@DisplayName("Record 2386: Company is Taylor Hospital")
	void CompanyOfRecord2386() {
		assertEquals("Taylor Hospital", customers.get(2385).getCompany());
	}

	@Test
	@DisplayName("Record 2386: Address is 12900 Lakeland Rd")
	void AddressOfRecord2386() {
		assertEquals("12900 Lakeland Rd", customers.get(2385).getAddress());
	}

	@Test
	@DisplayName("Record 2386: City is Santa Fe Springs")
	void CityOfRecord2386() {
		assertEquals("Santa Fe Springs", customers.get(2385).getCity());
	}

	@Test
	@DisplayName("Record 2386: County is Los Angeles")
	void CountyOfRecord2386() {
		assertEquals("Los Angeles", customers.get(2385).getCounty());
	}

	@Test
	@DisplayName("Record 2386: State is CA")
	void StateOfRecord2386() {
		assertEquals("CA", customers.get(2385).getState());
	}

	@Test
	@DisplayName("Record 2386: ZIP is 90670")
	void ZIPOfRecord2386() {
		assertEquals("90670", customers.get(2385).getZIP());
	}

	@Test
	@DisplayName("Record 2386: Phone is 562-946-9050")
	void PhoneOfRecord2386() {
		assertEquals("562-946-9050", customers.get(2385).getPhone());
	}

	@Test
	@DisplayName("Record 2386: Fax is 562-946-6534")
	void FaxOfRecord2386() {
		assertEquals("562-946-6534", customers.get(2385).getFax());
	}

	@Test
	@DisplayName("Record 2386: Email is antonia@kistenmacher.com")
	void EmailOfRecord2386() {
		assertEquals("antonia@kistenmacher.com", customers.get(2385).getEmail());
	}

	@Test
	@DisplayName("Record 2386: Web is http://www.antoniakistenmacher.com")
	void WebOfRecord2386() {
		assertEquals("http://www.antoniakistenmacher.com", customers.get(2385).getWeb());
	}
}
