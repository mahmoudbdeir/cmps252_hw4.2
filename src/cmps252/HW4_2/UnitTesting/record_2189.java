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

@Tag("28")
class Record_2189 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2189: FirstName is Raul")
	void FirstNameOfRecord2189() {
		assertEquals("Raul", customers.get(2188).getFirstName());
	}

	@Test
	@DisplayName("Record 2189: LastName is Daleus")
	void LastNameOfRecord2189() {
		assertEquals("Daleus", customers.get(2188).getLastName());
	}

	@Test
	@DisplayName("Record 2189: Company is Omega Casting Corp")
	void CompanyOfRecord2189() {
		assertEquals("Omega Casting Corp", customers.get(2188).getCompany());
	}

	@Test
	@DisplayName("Record 2189: Address is 2208 W Gore Blvd")
	void AddressOfRecord2189() {
		assertEquals("2208 W Gore Blvd", customers.get(2188).getAddress());
	}

	@Test
	@DisplayName("Record 2189: City is Lawton")
	void CityOfRecord2189() {
		assertEquals("Lawton", customers.get(2188).getCity());
	}

	@Test
	@DisplayName("Record 2189: County is Comanche")
	void CountyOfRecord2189() {
		assertEquals("Comanche", customers.get(2188).getCounty());
	}

	@Test
	@DisplayName("Record 2189: State is OK")
	void StateOfRecord2189() {
		assertEquals("OK", customers.get(2188).getState());
	}

	@Test
	@DisplayName("Record 2189: ZIP is 73501")
	void ZIPOfRecord2189() {
		assertEquals("73501", customers.get(2188).getZIP());
	}

	@Test
	@DisplayName("Record 2189: Phone is 580-357-6213")
	void PhoneOfRecord2189() {
		assertEquals("580-357-6213", customers.get(2188).getPhone());
	}

	@Test
	@DisplayName("Record 2189: Fax is 580-357-1532")
	void FaxOfRecord2189() {
		assertEquals("580-357-1532", customers.get(2188).getFax());
	}

	@Test
	@DisplayName("Record 2189: Email is raul@daleus.com")
	void EmailOfRecord2189() {
		assertEquals("raul@daleus.com", customers.get(2188).getEmail());
	}

	@Test
	@DisplayName("Record 2189: Web is http://www.rauldaleus.com")
	void WebOfRecord2189() {
		assertEquals("http://www.rauldaleus.com", customers.get(2188).getWeb());
	}
}
