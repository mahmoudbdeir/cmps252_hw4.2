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

@Tag("38")
class Record_3641 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3641: FirstName is Stanford")
	void FirstNameOfRecord3641() {
		assertEquals("Stanford", customers.get(3640).getFirstName());
	}

	@Test
	@DisplayName("Record 3641: LastName is Spall")
	void LastNameOfRecord3641() {
		assertEquals("Spall", customers.get(3640).getLastName());
	}

	@Test
	@DisplayName("Record 3641: Company is Roy B Moore & Associates Pc")
	void CompanyOfRecord3641() {
		assertEquals("Roy B Moore & Associates Pc", customers.get(3640).getCompany());
	}

	@Test
	@DisplayName("Record 3641: Address is 2080 Ridge Rd E")
	void AddressOfRecord3641() {
		assertEquals("2080 Ridge Rd E", customers.get(3640).getAddress());
	}

	@Test
	@DisplayName("Record 3641: City is Rochester")
	void CityOfRecord3641() {
		assertEquals("Rochester", customers.get(3640).getCity());
	}

	@Test
	@DisplayName("Record 3641: County is Monroe")
	void CountyOfRecord3641() {
		assertEquals("Monroe", customers.get(3640).getCounty());
	}

	@Test
	@DisplayName("Record 3641: State is NY")
	void StateOfRecord3641() {
		assertEquals("NY", customers.get(3640).getState());
	}

	@Test
	@DisplayName("Record 3641: ZIP is 14622")
	void ZIPOfRecord3641() {
		assertEquals("14622", customers.get(3640).getZIP());
	}

	@Test
	@DisplayName("Record 3641: Phone is 585-865-0908")
	void PhoneOfRecord3641() {
		assertEquals("585-865-0908", customers.get(3640).getPhone());
	}

	@Test
	@DisplayName("Record 3641: Fax is 585-865-1581")
	void FaxOfRecord3641() {
		assertEquals("585-865-1581", customers.get(3640).getFax());
	}

	@Test
	@DisplayName("Record 3641: Email is stanford@spall.com")
	void EmailOfRecord3641() {
		assertEquals("stanford@spall.com", customers.get(3640).getEmail());
	}

	@Test
	@DisplayName("Record 3641: Web is http://www.stanfordspall.com")
	void WebOfRecord3641() {
		assertEquals("http://www.stanfordspall.com", customers.get(3640).getWeb());
	}
}
