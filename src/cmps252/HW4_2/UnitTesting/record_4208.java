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

@Tag("20")
class Record_4208 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4208: FirstName is Ollie")
	void FirstNameOfRecord4208() {
		assertEquals("Ollie", customers.get(4207).getFirstName());
	}

	@Test
	@DisplayName("Record 4208: LastName is Hiraki")
	void LastNameOfRecord4208() {
		assertEquals("Hiraki", customers.get(4207).getLastName());
	}

	@Test
	@DisplayName("Record 4208: Company is Racine Plastic Inc")
	void CompanyOfRecord4208() {
		assertEquals("Racine Plastic Inc", customers.get(4207).getCompany());
	}

	@Test
	@DisplayName("Record 4208: Address is 16 N Huron St")
	void AddressOfRecord4208() {
		assertEquals("16 N Huron St", customers.get(4207).getAddress());
	}

	@Test
	@DisplayName("Record 4208: City is Toledo")
	void CityOfRecord4208() {
		assertEquals("Toledo", customers.get(4207).getCity());
	}

	@Test
	@DisplayName("Record 4208: County is Lucas")
	void CountyOfRecord4208() {
		assertEquals("Lucas", customers.get(4207).getCounty());
	}

	@Test
	@DisplayName("Record 4208: State is OH")
	void StateOfRecord4208() {
		assertEquals("OH", customers.get(4207).getState());
	}

	@Test
	@DisplayName("Record 4208: ZIP is 43604")
	void ZIPOfRecord4208() {
		assertEquals("43604", customers.get(4207).getZIP());
	}

	@Test
	@DisplayName("Record 4208: Phone is 419-259-8104")
	void PhoneOfRecord4208() {
		assertEquals("419-259-8104", customers.get(4207).getPhone());
	}

	@Test
	@DisplayName("Record 4208: Fax is 419-259-7048")
	void FaxOfRecord4208() {
		assertEquals("419-259-7048", customers.get(4207).getFax());
	}

	@Test
	@DisplayName("Record 4208: Email is ollie@hiraki.com")
	void EmailOfRecord4208() {
		assertEquals("ollie@hiraki.com", customers.get(4207).getEmail());
	}

	@Test
	@DisplayName("Record 4208: Web is http://www.olliehiraki.com")
	void WebOfRecord4208() {
		assertEquals("http://www.olliehiraki.com", customers.get(4207).getWeb());
	}
}
