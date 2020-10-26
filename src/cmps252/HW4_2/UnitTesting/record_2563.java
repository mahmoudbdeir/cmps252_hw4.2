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

@Tag("19")
class Record_2563 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2563: FirstName is Shannon")
	void FirstNameOfRecord2563() {
		assertEquals("Shannon", customers.get(2562).getFirstName());
	}

	@Test
	@DisplayName("Record 2563: LastName is Giebler")
	void LastNameOfRecord2563() {
		assertEquals("Giebler", customers.get(2562).getLastName());
	}

	@Test
	@DisplayName("Record 2563: Company is Community Nursing Services")
	void CompanyOfRecord2563() {
		assertEquals("Community Nursing Services", customers.get(2562).getCompany());
	}

	@Test
	@DisplayName("Record 2563: Address is 112 Main")
	void AddressOfRecord2563() {
		assertEquals("112 Main", customers.get(2562).getAddress());
	}

	@Test
	@DisplayName("Record 2563: City is Fargo")
	void CityOfRecord2563() {
		assertEquals("Fargo", customers.get(2562).getCity());
	}

	@Test
	@DisplayName("Record 2563: County is Ellis")
	void CountyOfRecord2563() {
		assertEquals("Ellis", customers.get(2562).getCounty());
	}

	@Test
	@DisplayName("Record 2563: State is OK")
	void StateOfRecord2563() {
		assertEquals("OK", customers.get(2562).getState());
	}

	@Test
	@DisplayName("Record 2563: ZIP is 73840")
	void ZIPOfRecord2563() {
		assertEquals("73840", customers.get(2562).getZIP());
	}

	@Test
	@DisplayName("Record 2563: Phone is 580-698-7751")
	void PhoneOfRecord2563() {
		assertEquals("580-698-7751", customers.get(2562).getPhone());
	}

	@Test
	@DisplayName("Record 2563: Fax is 580-698-2948")
	void FaxOfRecord2563() {
		assertEquals("580-698-2948", customers.get(2562).getFax());
	}

	@Test
	@DisplayName("Record 2563: Email is shannon@giebler.com")
	void EmailOfRecord2563() {
		assertEquals("shannon@giebler.com", customers.get(2562).getEmail());
	}

	@Test
	@DisplayName("Record 2563: Web is http://www.shannongiebler.com")
	void WebOfRecord2563() {
		assertEquals("http://www.shannongiebler.com", customers.get(2562).getWeb());
	}
}
