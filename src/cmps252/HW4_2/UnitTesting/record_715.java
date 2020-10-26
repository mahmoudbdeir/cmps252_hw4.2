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

@Tag("27")
class Record_715 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 715: FirstName is Jackie")
	void FirstNameOfRecord715() {
		assertEquals("Jackie", customers.get(714).getFirstName());
	}

	@Test
	@DisplayName("Record 715: LastName is Squyres")
	void LastNameOfRecord715() {
		assertEquals("Squyres", customers.get(714).getLastName());
	}

	@Test
	@DisplayName("Record 715: Company is Max Daetwyler Corp")
	void CompanyOfRecord715() {
		assertEquals("Max Daetwyler Corp", customers.get(714).getCompany());
	}

	@Test
	@DisplayName("Record 715: Address is 5680 Euclid Ave")
	void AddressOfRecord715() {
		assertEquals("5680 Euclid Ave", customers.get(714).getAddress());
	}

	@Test
	@DisplayName("Record 715: City is Cleveland")
	void CityOfRecord715() {
		assertEquals("Cleveland", customers.get(714).getCity());
	}

	@Test
	@DisplayName("Record 715: County is Cuyahoga")
	void CountyOfRecord715() {
		assertEquals("Cuyahoga", customers.get(714).getCounty());
	}

	@Test
	@DisplayName("Record 715: State is OH")
	void StateOfRecord715() {
		assertEquals("OH", customers.get(714).getState());
	}

	@Test
	@DisplayName("Record 715: ZIP is 44103")
	void ZIPOfRecord715() {
		assertEquals("44103", customers.get(714).getZIP());
	}

	@Test
	@DisplayName("Record 715: Phone is 216-881-2304")
	void PhoneOfRecord715() {
		assertEquals("216-881-2304", customers.get(714).getPhone());
	}

	@Test
	@DisplayName("Record 715: Fax is 216-881-6807")
	void FaxOfRecord715() {
		assertEquals("216-881-6807", customers.get(714).getFax());
	}

	@Test
	@DisplayName("Record 715: Email is jackie@squyres.com")
	void EmailOfRecord715() {
		assertEquals("jackie@squyres.com", customers.get(714).getEmail());
	}

	@Test
	@DisplayName("Record 715: Web is http://www.jackiesquyres.com")
	void WebOfRecord715() {
		assertEquals("http://www.jackiesquyres.com", customers.get(714).getWeb());
	}
}
