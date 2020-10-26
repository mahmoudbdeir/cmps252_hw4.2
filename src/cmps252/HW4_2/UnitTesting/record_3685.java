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

@Tag("28")
class Record_3685 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3685: FirstName is Alton")
	void FirstNameOfRecord3685() {
		assertEquals("Alton", customers.get(3684).getFirstName());
	}

	@Test
	@DisplayName("Record 3685: LastName is Franch")
	void LastNameOfRecord3685() {
		assertEquals("Franch", customers.get(3684).getLastName());
	}

	@Test
	@DisplayName("Record 3685: Company is Industrial Razor Blade Co Inc")
	void CompanyOfRecord3685() {
		assertEquals("Industrial Razor Blade Co Inc", customers.get(3684).getCompany());
	}

	@Test
	@DisplayName("Record 3685: Address is 16500 Nw 52nd Ave")
	void AddressOfRecord3685() {
		assertEquals("16500 Nw 52nd Ave", customers.get(3684).getAddress());
	}

	@Test
	@DisplayName("Record 3685: City is Hialeah")
	void CityOfRecord3685() {
		assertEquals("Hialeah", customers.get(3684).getCity());
	}

	@Test
	@DisplayName("Record 3685: County is Miami-Dade")
	void CountyOfRecord3685() {
		assertEquals("Miami-Dade", customers.get(3684).getCounty());
	}

	@Test
	@DisplayName("Record 3685: State is FL")
	void StateOfRecord3685() {
		assertEquals("FL", customers.get(3684).getState());
	}

	@Test
	@DisplayName("Record 3685: ZIP is 33014")
	void ZIPOfRecord3685() {
		assertEquals("33014", customers.get(3684).getZIP());
	}

	@Test
	@DisplayName("Record 3685: Phone is 305-621-9523")
	void PhoneOfRecord3685() {
		assertEquals("305-621-9523", customers.get(3684).getPhone());
	}

	@Test
	@DisplayName("Record 3685: Fax is 305-621-9341")
	void FaxOfRecord3685() {
		assertEquals("305-621-9341", customers.get(3684).getFax());
	}

	@Test
	@DisplayName("Record 3685: Email is alton@franch.com")
	void EmailOfRecord3685() {
		assertEquals("alton@franch.com", customers.get(3684).getEmail());
	}

	@Test
	@DisplayName("Record 3685: Web is http://www.altonfranch.com")
	void WebOfRecord3685() {
		assertEquals("http://www.altonfranch.com", customers.get(3684).getWeb());
	}
}
