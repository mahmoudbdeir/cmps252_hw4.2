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

@Tag("45")
class Record_1997 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1997: FirstName is Horace")
	void FirstNameOfRecord1997() {
		assertEquals("Horace", customers.get(1996).getFirstName());
	}

	@Test
	@DisplayName("Record 1997: LastName is Engemann")
	void LastNameOfRecord1997() {
		assertEquals("Engemann", customers.get(1996).getLastName());
	}

	@Test
	@DisplayName("Record 1997: Company is Tripifoods Inc")
	void CompanyOfRecord1997() {
		assertEquals("Tripifoods Inc", customers.get(1996).getCompany());
	}

	@Test
	@DisplayName("Record 1997: Address is 8094 Buck Lake Rd")
	void AddressOfRecord1997() {
		assertEquals("8094 Buck Lake Rd", customers.get(1996).getAddress());
	}

	@Test
	@DisplayName("Record 1997: City is Tallahassee")
	void CityOfRecord1997() {
		assertEquals("Tallahassee", customers.get(1996).getCity());
	}

	@Test
	@DisplayName("Record 1997: County is Leon")
	void CountyOfRecord1997() {
		assertEquals("Leon", customers.get(1996).getCounty());
	}

	@Test
	@DisplayName("Record 1997: State is FL")
	void StateOfRecord1997() {
		assertEquals("FL", customers.get(1996).getState());
	}

	@Test
	@DisplayName("Record 1997: ZIP is 32311")
	void ZIPOfRecord1997() {
		assertEquals("32311", customers.get(1996).getZIP());
	}

	@Test
	@DisplayName("Record 1997: Phone is 850-671-7572")
	void PhoneOfRecord1997() {
		assertEquals("850-671-7572", customers.get(1996).getPhone());
	}

	@Test
	@DisplayName("Record 1997: Fax is 850-671-3011")
	void FaxOfRecord1997() {
		assertEquals("850-671-3011", customers.get(1996).getFax());
	}

	@Test
	@DisplayName("Record 1997: Email is horace@engemann.com")
	void EmailOfRecord1997() {
		assertEquals("horace@engemann.com", customers.get(1996).getEmail());
	}

	@Test
	@DisplayName("Record 1997: Web is http://www.horaceengemann.com")
	void WebOfRecord1997() {
		assertEquals("http://www.horaceengemann.com", customers.get(1996).getWeb());
	}
}
