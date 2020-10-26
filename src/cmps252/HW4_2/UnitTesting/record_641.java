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

@Tag("48")
class Record_641 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 641: FirstName is Ernestine")
	void FirstNameOfRecord641() {
		assertEquals("Ernestine", customers.get(640).getFirstName());
	}

	@Test
	@DisplayName("Record 641: LastName is Dufek")
	void LastNameOfRecord641() {
		assertEquals("Dufek", customers.get(640).getLastName());
	}

	@Test
	@DisplayName("Record 641: Company is Energy Unlimited")
	void CompanyOfRecord641() {
		assertEquals("Energy Unlimited", customers.get(640).getCompany());
	}

	@Test
	@DisplayName("Record 641: Address is Rr 4")
	void AddressOfRecord641() {
		assertEquals("Rr 4", customers.get(640).getAddress());
	}

	@Test
	@DisplayName("Record 641: City is Bloomfield")
	void CityOfRecord641() {
		assertEquals("Bloomfield", customers.get(640).getCity());
	}

	@Test
	@DisplayName("Record 641: County is Greene")
	void CountyOfRecord641() {
		assertEquals("Greene", customers.get(640).getCounty());
	}

	@Test
	@DisplayName("Record 641: State is IN")
	void StateOfRecord641() {
		assertEquals("IN", customers.get(640).getState());
	}

	@Test
	@DisplayName("Record 641: ZIP is 47424")
	void ZIPOfRecord641() {
		assertEquals("47424", customers.get(640).getZIP());
	}

	@Test
	@DisplayName("Record 641: Phone is 812-825-6022")
	void PhoneOfRecord641() {
		assertEquals("812-825-6022", customers.get(640).getPhone());
	}

	@Test
	@DisplayName("Record 641: Fax is 812-825-9658")
	void FaxOfRecord641() {
		assertEquals("812-825-9658", customers.get(640).getFax());
	}

	@Test
	@DisplayName("Record 641: Email is ernestine@dufek.com")
	void EmailOfRecord641() {
		assertEquals("ernestine@dufek.com", customers.get(640).getEmail());
	}

	@Test
	@DisplayName("Record 641: Web is http://www.ernestinedufek.com")
	void WebOfRecord641() {
		assertEquals("http://www.ernestinedufek.com", customers.get(640).getWeb());
	}
}
