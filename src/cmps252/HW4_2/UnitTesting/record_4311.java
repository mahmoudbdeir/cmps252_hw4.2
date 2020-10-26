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

@Tag("25")
class Record_4311 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4311: FirstName is Julian")
	void FirstNameOfRecord4311() {
		assertEquals("Julian", customers.get(4310).getFirstName());
	}

	@Test
	@DisplayName("Record 4311: LastName is Suders")
	void LastNameOfRecord4311() {
		assertEquals("Suders", customers.get(4310).getLastName());
	}

	@Test
	@DisplayName("Record 4311: Company is Tennessee Shell Co Inc")
	void CompanyOfRecord4311() {
		assertEquals("Tennessee Shell Co Inc", customers.get(4310).getCompany());
	}

	@Test
	@DisplayName("Record 4311: Address is 7010 Little River Tpke  #-320")
	void AddressOfRecord4311() {
		assertEquals("7010 Little River Tpke  #-320", customers.get(4310).getAddress());
	}

	@Test
	@DisplayName("Record 4311: City is Annandale")
	void CityOfRecord4311() {
		assertEquals("Annandale", customers.get(4310).getCity());
	}

	@Test
	@DisplayName("Record 4311: County is Fairfax")
	void CountyOfRecord4311() {
		assertEquals("Fairfax", customers.get(4310).getCounty());
	}

	@Test
	@DisplayName("Record 4311: State is VA")
	void StateOfRecord4311() {
		assertEquals("VA", customers.get(4310).getState());
	}

	@Test
	@DisplayName("Record 4311: ZIP is 22003")
	void ZIPOfRecord4311() {
		assertEquals("22003", customers.get(4310).getZIP());
	}

	@Test
	@DisplayName("Record 4311: Phone is 703-914-1192")
	void PhoneOfRecord4311() {
		assertEquals("703-914-1192", customers.get(4310).getPhone());
	}

	@Test
	@DisplayName("Record 4311: Fax is 703-914-4621")
	void FaxOfRecord4311() {
		assertEquals("703-914-4621", customers.get(4310).getFax());
	}

	@Test
	@DisplayName("Record 4311: Email is julian@suders.com")
	void EmailOfRecord4311() {
		assertEquals("julian@suders.com", customers.get(4310).getEmail());
	}

	@Test
	@DisplayName("Record 4311: Web is http://www.juliansuders.com")
	void WebOfRecord4311() {
		assertEquals("http://www.juliansuders.com", customers.get(4310).getWeb());
	}
}
