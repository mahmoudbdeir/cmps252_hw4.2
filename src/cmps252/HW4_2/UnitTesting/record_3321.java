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

@Tag("15")
class Record_3321 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3321: FirstName is Teresa")
	void FirstNameOfRecord3321() {
		assertEquals("Teresa", customers.get(3320).getFirstName());
	}

	@Test
	@DisplayName("Record 3321: LastName is Groves")
	void LastNameOfRecord3321() {
		assertEquals("Groves", customers.get(3320).getLastName());
	}

	@Test
	@DisplayName("Record 3321: Company is Annual Guide For The Arts")
	void CompanyOfRecord3321() {
		assertEquals("Annual Guide For The Arts", customers.get(3320).getCompany());
	}

	@Test
	@DisplayName("Record 3321: Address is 36 W Main St")
	void AddressOfRecord3321() {
		assertEquals("36 W Main St", customers.get(3320).getAddress());
	}

	@Test
	@DisplayName("Record 3321: City is Freehold")
	void CityOfRecord3321() {
		assertEquals("Freehold", customers.get(3320).getCity());
	}

	@Test
	@DisplayName("Record 3321: County is Monmouth")
	void CountyOfRecord3321() {
		assertEquals("Monmouth", customers.get(3320).getCounty());
	}

	@Test
	@DisplayName("Record 3321: State is NJ")
	void StateOfRecord3321() {
		assertEquals("NJ", customers.get(3320).getState());
	}

	@Test
	@DisplayName("Record 3321: ZIP is 7728")
	void ZIPOfRecord3321() {
		assertEquals("7728", customers.get(3320).getZIP());
	}

	@Test
	@DisplayName("Record 3321: Phone is 732-409-2596")
	void PhoneOfRecord3321() {
		assertEquals("732-409-2596", customers.get(3320).getPhone());
	}

	@Test
	@DisplayName("Record 3321: Fax is 732-409-0634")
	void FaxOfRecord3321() {
		assertEquals("732-409-0634", customers.get(3320).getFax());
	}

	@Test
	@DisplayName("Record 3321: Email is teresa@groves.com")
	void EmailOfRecord3321() {
		assertEquals("teresa@groves.com", customers.get(3320).getEmail());
	}

	@Test
	@DisplayName("Record 3321: Web is http://www.teresagroves.com")
	void WebOfRecord3321() {
		assertEquals("http://www.teresagroves.com", customers.get(3320).getWeb());
	}
}
