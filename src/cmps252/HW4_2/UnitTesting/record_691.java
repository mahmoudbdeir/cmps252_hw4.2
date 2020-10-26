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

@Tag("4")
class Record_691 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 691: FirstName is Bobby")
	void FirstNameOfRecord691() {
		assertEquals("Bobby", customers.get(690).getFirstName());
	}

	@Test
	@DisplayName("Record 691: LastName is Baik")
	void LastNameOfRecord691() {
		assertEquals("Baik", customers.get(690).getLastName());
	}

	@Test
	@DisplayName("Record 691: Company is Mitchells Woodworking")
	void CompanyOfRecord691() {
		assertEquals("Mitchells Woodworking", customers.get(690).getCompany());
	}

	@Test
	@DisplayName("Record 691: Address is 300 Alemany Blvd")
	void AddressOfRecord691() {
		assertEquals("300 Alemany Blvd", customers.get(690).getAddress());
	}

	@Test
	@DisplayName("Record 691: City is San Francisco")
	void CityOfRecord691() {
		assertEquals("San Francisco", customers.get(690).getCity());
	}

	@Test
	@DisplayName("Record 691: County is San Francisco")
	void CountyOfRecord691() {
		assertEquals("San Francisco", customers.get(690).getCounty());
	}

	@Test
	@DisplayName("Record 691: State is CA")
	void StateOfRecord691() {
		assertEquals("CA", customers.get(690).getState());
	}

	@Test
	@DisplayName("Record 691: ZIP is 94110")
	void ZIPOfRecord691() {
		assertEquals("94110", customers.get(690).getZIP());
	}

	@Test
	@DisplayName("Record 691: Phone is 415-821-8771")
	void PhoneOfRecord691() {
		assertEquals("415-821-8771", customers.get(690).getPhone());
	}

	@Test
	@DisplayName("Record 691: Fax is 415-821-5981")
	void FaxOfRecord691() {
		assertEquals("415-821-5981", customers.get(690).getFax());
	}

	@Test
	@DisplayName("Record 691: Email is bobby@baik.com")
	void EmailOfRecord691() {
		assertEquals("bobby@baik.com", customers.get(690).getEmail());
	}

	@Test
	@DisplayName("Record 691: Web is http://www.bobbybaik.com")
	void WebOfRecord691() {
		assertEquals("http://www.bobbybaik.com", customers.get(690).getWeb());
	}
}
