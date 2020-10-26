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

@Tag("42")
class Record_871 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 871: FirstName is Marcellus")
	void FirstNameOfRecord871() {
		assertEquals("Marcellus", customers.get(870).getFirstName());
	}

	@Test
	@DisplayName("Record 871: LastName is Cusatis")
	void LastNameOfRecord871() {
		assertEquals("Cusatis", customers.get(870).getLastName());
	}

	@Test
	@DisplayName("Record 871: Company is Santa Fe Industrial Plast Inc")
	void CompanyOfRecord871() {
		assertEquals("Santa Fe Industrial Plast Inc", customers.get(870).getCompany());
	}

	@Test
	@DisplayName("Record 871: Address is 2546 Arthur Kill Rd")
	void AddressOfRecord871() {
		assertEquals("2546 Arthur Kill Rd", customers.get(870).getAddress());
	}

	@Test
	@DisplayName("Record 871: City is Staten Island")
	void CityOfRecord871() {
		assertEquals("Staten Island", customers.get(870).getCity());
	}

	@Test
	@DisplayName("Record 871: County is Richmond")
	void CountyOfRecord871() {
		assertEquals("Richmond", customers.get(870).getCounty());
	}

	@Test
	@DisplayName("Record 871: State is NY")
	void StateOfRecord871() {
		assertEquals("NY", customers.get(870).getState());
	}

	@Test
	@DisplayName("Record 871: ZIP is 10309")
	void ZIPOfRecord871() {
		assertEquals("10309", customers.get(870).getZIP());
	}

	@Test
	@DisplayName("Record 871: Phone is 718-966-5792")
	void PhoneOfRecord871() {
		assertEquals("718-966-5792", customers.get(870).getPhone());
	}

	@Test
	@DisplayName("Record 871: Fax is 718-966-3094")
	void FaxOfRecord871() {
		assertEquals("718-966-3094", customers.get(870).getFax());
	}

	@Test
	@DisplayName("Record 871: Email is marcellus@cusatis.com")
	void EmailOfRecord871() {
		assertEquals("marcellus@cusatis.com", customers.get(870).getEmail());
	}

	@Test
	@DisplayName("Record 871: Web is http://www.marcelluscusatis.com")
	void WebOfRecord871() {
		assertEquals("http://www.marcelluscusatis.com", customers.get(870).getWeb());
	}
}
