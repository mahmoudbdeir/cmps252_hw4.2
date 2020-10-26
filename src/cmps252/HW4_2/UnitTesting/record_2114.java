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

@Tag("24")
class Record_2114 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2114: FirstName is Kyth")
	void FirstNameOfRecord2114() {
		assertEquals("Kyth", customers.get(2113).getFirstName());
	}

	@Test
	@DisplayName("Record 2114: LastName is Englett")
	void LastNameOfRecord2114() {
		assertEquals("Englett", customers.get(2113).getLastName());
	}

	@Test
	@DisplayName("Record 2114: Company is Essex Abstract Service")
	void CompanyOfRecord2114() {
		assertEquals("Essex Abstract Service", customers.get(2113).getCompany());
	}

	@Test
	@DisplayName("Record 2114: Address is 4802 Travis St")
	void AddressOfRecord2114() {
		assertEquals("4802 Travis St", customers.get(2113).getAddress());
	}

	@Test
	@DisplayName("Record 2114: City is Houston")
	void CityOfRecord2114() {
		assertEquals("Houston", customers.get(2113).getCity());
	}

	@Test
	@DisplayName("Record 2114: County is Harris")
	void CountyOfRecord2114() {
		assertEquals("Harris", customers.get(2113).getCounty());
	}

	@Test
	@DisplayName("Record 2114: State is TX")
	void StateOfRecord2114() {
		assertEquals("TX", customers.get(2113).getState());
	}

	@Test
	@DisplayName("Record 2114: ZIP is 77002")
	void ZIPOfRecord2114() {
		assertEquals("77002", customers.get(2113).getZIP());
	}

	@Test
	@DisplayName("Record 2114: Phone is 713-528-6174")
	void PhoneOfRecord2114() {
		assertEquals("713-528-6174", customers.get(2113).getPhone());
	}

	@Test
	@DisplayName("Record 2114: Fax is 713-528-5569")
	void FaxOfRecord2114() {
		assertEquals("713-528-5569", customers.get(2113).getFax());
	}

	@Test
	@DisplayName("Record 2114: Email is kyth@englett.com")
	void EmailOfRecord2114() {
		assertEquals("kyth@englett.com", customers.get(2113).getEmail());
	}

	@Test
	@DisplayName("Record 2114: Web is http://www.kythenglett.com")
	void WebOfRecord2114() {
		assertEquals("http://www.kythenglett.com", customers.get(2113).getWeb());
	}
}
