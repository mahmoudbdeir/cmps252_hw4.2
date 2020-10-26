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
class Record_750 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 750: FirstName is Jermaine")
	void FirstNameOfRecord750() {
		assertEquals("Jermaine", customers.get(749).getFirstName());
	}

	@Test
	@DisplayName("Record 750: LastName is Gahan")
	void LastNameOfRecord750() {
		assertEquals("Gahan", customers.get(749).getLastName());
	}

	@Test
	@DisplayName("Record 750: Company is Crescent Ford")
	void CompanyOfRecord750() {
		assertEquals("Crescent Ford", customers.get(749).getCompany());
	}

	@Test
	@DisplayName("Record 750: Address is 520 Garcia Ave")
	void AddressOfRecord750() {
		assertEquals("520 Garcia Ave", customers.get(749).getAddress());
	}

	@Test
	@DisplayName("Record 750: City is Pittsburg")
	void CityOfRecord750() {
		assertEquals("Pittsburg", customers.get(749).getCity());
	}

	@Test
	@DisplayName("Record 750: County is Contra Costa")
	void CountyOfRecord750() {
		assertEquals("Contra Costa", customers.get(749).getCounty());
	}

	@Test
	@DisplayName("Record 750: State is CA")
	void StateOfRecord750() {
		assertEquals("CA", customers.get(749).getState());
	}

	@Test
	@DisplayName("Record 750: ZIP is 94565")
	void ZIPOfRecord750() {
		assertEquals("94565", customers.get(749).getZIP());
	}

	@Test
	@DisplayName("Record 750: Phone is 925-432-7204")
	void PhoneOfRecord750() {
		assertEquals("925-432-7204", customers.get(749).getPhone());
	}

	@Test
	@DisplayName("Record 750: Fax is 925-432-9655")
	void FaxOfRecord750() {
		assertEquals("925-432-9655", customers.get(749).getFax());
	}

	@Test
	@DisplayName("Record 750: Email is jermaine@gahan.com")
	void EmailOfRecord750() {
		assertEquals("jermaine@gahan.com", customers.get(749).getEmail());
	}

	@Test
	@DisplayName("Record 750: Web is http://www.jermainegahan.com")
	void WebOfRecord750() {
		assertEquals("http://www.jermainegahan.com", customers.get(749).getWeb());
	}
}
