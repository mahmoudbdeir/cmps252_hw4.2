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

@Tag("16")
class Record_2302 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2302: FirstName is Tracy")
	void FirstNameOfRecord2302() {
		assertEquals("Tracy", customers.get(2301).getFirstName());
	}

	@Test
	@DisplayName("Record 2302: LastName is Chislom")
	void LastNameOfRecord2302() {
		assertEquals("Chislom", customers.get(2301).getLastName());
	}

	@Test
	@DisplayName("Record 2302: Company is Segal & Andres Pa")
	void CompanyOfRecord2302() {
		assertEquals("Segal & Andres Pa", customers.get(2301).getCompany());
	}

	@Test
	@DisplayName("Record 2302: Address is 7701 Fullerton Rd")
	void AddressOfRecord2302() {
		assertEquals("7701 Fullerton Rd", customers.get(2301).getAddress());
	}

	@Test
	@DisplayName("Record 2302: City is Springfield")
	void CityOfRecord2302() {
		assertEquals("Springfield", customers.get(2301).getCity());
	}

	@Test
	@DisplayName("Record 2302: County is Fairfax")
	void CountyOfRecord2302() {
		assertEquals("Fairfax", customers.get(2301).getCounty());
	}

	@Test
	@DisplayName("Record 2302: State is VA")
	void StateOfRecord2302() {
		assertEquals("VA", customers.get(2301).getState());
	}

	@Test
	@DisplayName("Record 2302: ZIP is 22153")
	void ZIPOfRecord2302() {
		assertEquals("22153", customers.get(2301).getZIP());
	}

	@Test
	@DisplayName("Record 2302: Phone is 703-569-6918")
	void PhoneOfRecord2302() {
		assertEquals("703-569-6918", customers.get(2301).getPhone());
	}

	@Test
	@DisplayName("Record 2302: Fax is 703-569-0759")
	void FaxOfRecord2302() {
		assertEquals("703-569-0759", customers.get(2301).getFax());
	}

	@Test
	@DisplayName("Record 2302: Email is tracy@chislom.com")
	void EmailOfRecord2302() {
		assertEquals("tracy@chislom.com", customers.get(2301).getEmail());
	}

	@Test
	@DisplayName("Record 2302: Web is http://www.tracychislom.com")
	void WebOfRecord2302() {
		assertEquals("http://www.tracychislom.com", customers.get(2301).getWeb());
	}
}
