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

@Tag("46")
class Record_1450 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1450: FirstName is Krystal")
	void FirstNameOfRecord1450() {
		assertEquals("Krystal", customers.get(1449).getFirstName());
	}

	@Test
	@DisplayName("Record 1450: LastName is Postlewaite")
	void LastNameOfRecord1450() {
		assertEquals("Postlewaite", customers.get(1449).getLastName());
	}

	@Test
	@DisplayName("Record 1450: Company is Mcclure Ramsay & Dickerson")
	void CompanyOfRecord1450() {
		assertEquals("Mcclure Ramsay & Dickerson", customers.get(1449).getCompany());
	}

	@Test
	@DisplayName("Record 1450: Address is 3975 University Dr")
	void AddressOfRecord1450() {
		assertEquals("3975 University Dr", customers.get(1449).getAddress());
	}

	@Test
	@DisplayName("Record 1450: City is Fairfax")
	void CityOfRecord1450() {
		assertEquals("Fairfax", customers.get(1449).getCity());
	}

	@Test
	@DisplayName("Record 1450: County is Fairfax City")
	void CountyOfRecord1450() {
		assertEquals("Fairfax City", customers.get(1449).getCounty());
	}

	@Test
	@DisplayName("Record 1450: State is VA")
	void StateOfRecord1450() {
		assertEquals("VA", customers.get(1449).getState());
	}

	@Test
	@DisplayName("Record 1450: ZIP is 22030")
	void ZIPOfRecord1450() {
		assertEquals("22030", customers.get(1449).getZIP());
	}

	@Test
	@DisplayName("Record 1450: Phone is 703-385-4334")
	void PhoneOfRecord1450() {
		assertEquals("703-385-4334", customers.get(1449).getPhone());
	}

	@Test
	@DisplayName("Record 1450: Fax is 703-385-8094")
	void FaxOfRecord1450() {
		assertEquals("703-385-8094", customers.get(1449).getFax());
	}

	@Test
	@DisplayName("Record 1450: Email is krystal@postlewaite.com")
	void EmailOfRecord1450() {
		assertEquals("krystal@postlewaite.com", customers.get(1449).getEmail());
	}

	@Test
	@DisplayName("Record 1450: Web is http://www.krystalpostlewaite.com")
	void WebOfRecord1450() {
		assertEquals("http://www.krystalpostlewaite.com", customers.get(1449).getWeb());
	}
}
