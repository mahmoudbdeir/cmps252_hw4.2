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
class Record_141 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 141: FirstName is Sol")
	void FirstNameOfRecord141() {
		assertEquals("Sol", customers.get(140).getFirstName());
	}

	@Test
	@DisplayName("Record 141: LastName is Gleckler")
	void LastNameOfRecord141() {
		assertEquals("Gleckler", customers.get(140).getLastName());
	}

	@Test
	@DisplayName("Record 141: Company is Tri Modal Distribution Svc")
	void CompanyOfRecord141() {
		assertEquals("Tri Modal Distribution Svc", customers.get(140).getCompany());
	}

	@Test
	@DisplayName("Record 141: Address is 2225 W Lee St")
	void AddressOfRecord141() {
		assertEquals("2225 W Lee St", customers.get(140).getAddress());
	}

	@Test
	@DisplayName("Record 141: City is Greensboro")
	void CityOfRecord141() {
		assertEquals("Greensboro", customers.get(140).getCity());
	}

	@Test
	@DisplayName("Record 141: County is Guilford")
	void CountyOfRecord141() {
		assertEquals("Guilford", customers.get(140).getCounty());
	}

	@Test
	@DisplayName("Record 141: State is NC")
	void StateOfRecord141() {
		assertEquals("NC", customers.get(140).getState());
	}

	@Test
	@DisplayName("Record 141: ZIP is 27403")
	void ZIPOfRecord141() {
		assertEquals("27403", customers.get(140).getZIP());
	}

	@Test
	@DisplayName("Record 141: Phone is 336-855-8844")
	void PhoneOfRecord141() {
		assertEquals("336-855-8844", customers.get(140).getPhone());
	}

	@Test
	@DisplayName("Record 141: Fax is 336-855-0701")
	void FaxOfRecord141() {
		assertEquals("336-855-0701", customers.get(140).getFax());
	}

	@Test
	@DisplayName("Record 141: Email is sol@gleckler.com")
	void EmailOfRecord141() {
		assertEquals("sol@gleckler.com", customers.get(140).getEmail());
	}

	@Test
	@DisplayName("Record 141: Web is http://www.solgleckler.com")
	void WebOfRecord141() {
		assertEquals("http://www.solgleckler.com", customers.get(140).getWeb());
	}
}
