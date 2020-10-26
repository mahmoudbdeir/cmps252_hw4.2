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

@Tag("40")
class Record_3252 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3252: FirstName is Warner")
	void FirstNameOfRecord3252() {
		assertEquals("Warner", customers.get(3251).getFirstName());
	}

	@Test
	@DisplayName("Record 3252: LastName is Patrum")
	void LastNameOfRecord3252() {
		assertEquals("Patrum", customers.get(3251).getLastName());
	}

	@Test
	@DisplayName("Record 3252: Company is Lopez, Tomas Esq")
	void CompanyOfRecord3252() {
		assertEquals("Lopez, Tomas Esq", customers.get(3251).getCompany());
	}

	@Test
	@DisplayName("Record 3252: Address is 5351 Buford Hwy Ne")
	void AddressOfRecord3252() {
		assertEquals("5351 Buford Hwy Ne", customers.get(3251).getAddress());
	}

	@Test
	@DisplayName("Record 3252: City is Atlanta")
	void CityOfRecord3252() {
		assertEquals("Atlanta", customers.get(3251).getCity());
	}

	@Test
	@DisplayName("Record 3252: County is Dekalb")
	void CountyOfRecord3252() {
		assertEquals("Dekalb", customers.get(3251).getCounty());
	}

	@Test
	@DisplayName("Record 3252: State is GA")
	void StateOfRecord3252() {
		assertEquals("GA", customers.get(3251).getState());
	}

	@Test
	@DisplayName("Record 3252: ZIP is 30340")
	void ZIPOfRecord3252() {
		assertEquals("30340", customers.get(3251).getZIP());
	}

	@Test
	@DisplayName("Record 3252: Phone is 770-457-2232")
	void PhoneOfRecord3252() {
		assertEquals("770-457-2232", customers.get(3251).getPhone());
	}

	@Test
	@DisplayName("Record 3252: Fax is 770-457-6549")
	void FaxOfRecord3252() {
		assertEquals("770-457-6549", customers.get(3251).getFax());
	}

	@Test
	@DisplayName("Record 3252: Email is warner@patrum.com")
	void EmailOfRecord3252() {
		assertEquals("warner@patrum.com", customers.get(3251).getEmail());
	}

	@Test
	@DisplayName("Record 3252: Web is http://www.warnerpatrum.com")
	void WebOfRecord3252() {
		assertEquals("http://www.warnerpatrum.com", customers.get(3251).getWeb());
	}
}
