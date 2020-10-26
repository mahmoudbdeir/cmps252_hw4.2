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

@Tag("5")
class Record_2282 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2282: FirstName is Angelo")
	void FirstNameOfRecord2282() {
		assertEquals("Angelo", customers.get(2281).getFirstName());
	}

	@Test
	@DisplayName("Record 2282: LastName is Cruickshank")
	void LastNameOfRecord2282() {
		assertEquals("Cruickshank", customers.get(2281).getLastName());
	}

	@Test
	@DisplayName("Record 2282: Company is Gentile Wyner Penta & Co")
	void CompanyOfRecord2282() {
		assertEquals("Gentile Wyner Penta & Co", customers.get(2281).getCompany());
	}

	@Test
	@DisplayName("Record 2282: Address is St Louis County")
	void AddressOfRecord2282() {
		assertEquals("St Louis County", customers.get(2281).getAddress());
	}

	@Test
	@DisplayName("Record 2282: City is Saint Louis")
	void CityOfRecord2282() {
		assertEquals("Saint Louis", customers.get(2281).getCity());
	}

	@Test
	@DisplayName("Record 2282: County is Saint Louis")
	void CountyOfRecord2282() {
		assertEquals("Saint Louis", customers.get(2281).getCounty());
	}

	@Test
	@DisplayName("Record 2282: State is MO")
	void StateOfRecord2282() {
		assertEquals("MO", customers.get(2281).getState());
	}

	@Test
	@DisplayName("Record 2282: ZIP is 63105")
	void ZIPOfRecord2282() {
		assertEquals("63105", customers.get(2281).getZIP());
	}

	@Test
	@DisplayName("Record 2282: Phone is 314-567-5890")
	void PhoneOfRecord2282() {
		assertEquals("314-567-5890", customers.get(2281).getPhone());
	}

	@Test
	@DisplayName("Record 2282: Fax is 314-567-4519")
	void FaxOfRecord2282() {
		assertEquals("314-567-4519", customers.get(2281).getFax());
	}

	@Test
	@DisplayName("Record 2282: Email is angelo@cruickshank.com")
	void EmailOfRecord2282() {
		assertEquals("angelo@cruickshank.com", customers.get(2281).getEmail());
	}

	@Test
	@DisplayName("Record 2282: Web is http://www.angelocruickshank.com")
	void WebOfRecord2282() {
		assertEquals("http://www.angelocruickshank.com", customers.get(2281).getWeb());
	}
}
