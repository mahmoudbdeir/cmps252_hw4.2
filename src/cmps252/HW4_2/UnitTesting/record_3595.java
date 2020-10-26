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

@Tag("22")
class Record_3595 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3595: FirstName is Bobbie")
	void FirstNameOfRecord3595() {
		assertEquals("Bobbie", customers.get(3594).getFirstName());
	}

	@Test
	@DisplayName("Record 3595: LastName is Mccaulley")
	void LastNameOfRecord3595() {
		assertEquals("Mccaulley", customers.get(3594).getLastName());
	}

	@Test
	@DisplayName("Record 3595: Company is C V Utah Federal Credit Union")
	void CompanyOfRecord3595() {
		assertEquals("C V Utah Federal Credit Union", customers.get(3594).getCompany());
	}

	@Test
	@DisplayName("Record 3595: Address is 9011 W Hwy 98 Tops L")
	void AddressOfRecord3595() {
		assertEquals("9011 W Hwy 98 Tops L", customers.get(3594).getAddress());
	}

	@Test
	@DisplayName("Record 3595: City is Destin")
	void CityOfRecord3595() {
		assertEquals("Destin", customers.get(3594).getCity());
	}

	@Test
	@DisplayName("Record 3595: County is Okaloosa")
	void CountyOfRecord3595() {
		assertEquals("Okaloosa", customers.get(3594).getCounty());
	}

	@Test
	@DisplayName("Record 3595: State is FL")
	void StateOfRecord3595() {
		assertEquals("FL", customers.get(3594).getState());
	}

	@Test
	@DisplayName("Record 3595: ZIP is 32541")
	void ZIPOfRecord3595() {
		assertEquals("32541", customers.get(3594).getZIP());
	}

	@Test
	@DisplayName("Record 3595: Phone is 850-269-7414")
	void PhoneOfRecord3595() {
		assertEquals("850-269-7414", customers.get(3594).getPhone());
	}

	@Test
	@DisplayName("Record 3595: Fax is 850-269-0543")
	void FaxOfRecord3595() {
		assertEquals("850-269-0543", customers.get(3594).getFax());
	}

	@Test
	@DisplayName("Record 3595: Email is bobbie@mccaulley.com")
	void EmailOfRecord3595() {
		assertEquals("bobbie@mccaulley.com", customers.get(3594).getEmail());
	}

	@Test
	@DisplayName("Record 3595: Web is http://www.bobbiemccaulley.com")
	void WebOfRecord3595() {
		assertEquals("http://www.bobbiemccaulley.com", customers.get(3594).getWeb());
	}
}
