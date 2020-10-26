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

@Tag("21")
class Record_4352 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4352: FirstName is Monika")
	void FirstNameOfRecord4352() {
		assertEquals("Monika", customers.get(4351).getFirstName());
	}

	@Test
	@DisplayName("Record 4352: LastName is Kassler")
	void LastNameOfRecord4352() {
		assertEquals("Kassler", customers.get(4351).getLastName());
	}

	@Test
	@DisplayName("Record 4352: Company is Fields, Leslie A Esq")
	void CompanyOfRecord4352() {
		assertEquals("Fields, Leslie A Esq", customers.get(4351).getCompany());
	}

	@Test
	@DisplayName("Record 4352: Address is 1200 Walnut St")
	void AddressOfRecord4352() {
		assertEquals("1200 Walnut St", customers.get(4351).getAddress());
	}

	@Test
	@DisplayName("Record 4352: City is Philadelphia")
	void CityOfRecord4352() {
		assertEquals("Philadelphia", customers.get(4351).getCity());
	}

	@Test
	@DisplayName("Record 4352: County is Philadelphia")
	void CountyOfRecord4352() {
		assertEquals("Philadelphia", customers.get(4351).getCounty());
	}

	@Test
	@DisplayName("Record 4352: State is PA")
	void StateOfRecord4352() {
		assertEquals("PA", customers.get(4351).getState());
	}

	@Test
	@DisplayName("Record 4352: ZIP is 19107")
	void ZIPOfRecord4352() {
		assertEquals("19107", customers.get(4351).getZIP());
	}

	@Test
	@DisplayName("Record 4352: Phone is 215-546-8000")
	void PhoneOfRecord4352() {
		assertEquals("215-546-8000", customers.get(4351).getPhone());
	}

	@Test
	@DisplayName("Record 4352: Fax is 215-546-7544")
	void FaxOfRecord4352() {
		assertEquals("215-546-7544", customers.get(4351).getFax());
	}

	@Test
	@DisplayName("Record 4352: Email is monika@kassler.com")
	void EmailOfRecord4352() {
		assertEquals("monika@kassler.com", customers.get(4351).getEmail());
	}

	@Test
	@DisplayName("Record 4352: Web is http://www.monikakassler.com")
	void WebOfRecord4352() {
		assertEquals("http://www.monikakassler.com", customers.get(4351).getWeb());
	}
}
