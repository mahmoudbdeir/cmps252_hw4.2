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
class Record_4869 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4869: FirstName is Paige")
	void FirstNameOfRecord4869() {
		assertEquals("Paige", customers.get(4868).getFirstName());
	}

	@Test
	@DisplayName("Record 4869: LastName is Garrettson")
	void LastNameOfRecord4869() {
		assertEquals("Garrettson", customers.get(4868).getLastName());
	}

	@Test
	@DisplayName("Record 4869: Company is Beres, Joel T Esq")
	void CompanyOfRecord4869() {
		assertEquals("Beres, Joel T Esq", customers.get(4868).getCompany());
	}

	@Test
	@DisplayName("Record 4869: Address is 1800 30th St")
	void AddressOfRecord4869() {
		assertEquals("1800 30th St", customers.get(4868).getAddress());
	}

	@Test
	@DisplayName("Record 4869: City is Bakersfield")
	void CityOfRecord4869() {
		assertEquals("Bakersfield", customers.get(4868).getCity());
	}

	@Test
	@DisplayName("Record 4869: County is Kern")
	void CountyOfRecord4869() {
		assertEquals("Kern", customers.get(4868).getCounty());
	}

	@Test
	@DisplayName("Record 4869: State is CA")
	void StateOfRecord4869() {
		assertEquals("CA", customers.get(4868).getState());
	}

	@Test
	@DisplayName("Record 4869: ZIP is 93301")
	void ZIPOfRecord4869() {
		assertEquals("93301", customers.get(4868).getZIP());
	}

	@Test
	@DisplayName("Record 4869: Phone is 661-327-4088")
	void PhoneOfRecord4869() {
		assertEquals("661-327-4088", customers.get(4868).getPhone());
	}

	@Test
	@DisplayName("Record 4869: Fax is 661-327-1551")
	void FaxOfRecord4869() {
		assertEquals("661-327-1551", customers.get(4868).getFax());
	}

	@Test
	@DisplayName("Record 4869: Email is paige@garrettson.com")
	void EmailOfRecord4869() {
		assertEquals("paige@garrettson.com", customers.get(4868).getEmail());
	}

	@Test
	@DisplayName("Record 4869: Web is http://www.paigegarrettson.com")
	void WebOfRecord4869() {
		assertEquals("http://www.paigegarrettson.com", customers.get(4868).getWeb());
	}
}
