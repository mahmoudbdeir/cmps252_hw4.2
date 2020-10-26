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

@Tag("27")
class Record_3013 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3013: FirstName is Beau")
	void FirstNameOfRecord3013() {
		assertEquals("Beau", customers.get(3012).getFirstName());
	}

	@Test
	@DisplayName("Record 3013: LastName is Mitschke")
	void LastNameOfRecord3013() {
		assertEquals("Mitschke", customers.get(3012).getLastName());
	}

	@Test
	@DisplayName("Record 3013: Company is Burke, Martin N Esq")
	void CompanyOfRecord3013() {
		assertEquals("Burke, Martin N Esq", customers.get(3012).getCompany());
	}

	@Test
	@DisplayName("Record 3013: Address is 707 Bidwill Ave")
	void AddressOfRecord3013() {
		assertEquals("707 Bidwill Ave", customers.get(3012).getAddress());
	}

	@Test
	@DisplayName("Record 3013: City is Fairbanks")
	void CityOfRecord3013() {
		assertEquals("Fairbanks", customers.get(3012).getCity());
	}

	@Test
	@DisplayName("Record 3013: County is Fairbanks North Star")
	void CountyOfRecord3013() {
		assertEquals("Fairbanks North Star", customers.get(3012).getCounty());
	}

	@Test
	@DisplayName("Record 3013: State is AK")
	void StateOfRecord3013() {
		assertEquals("AK", customers.get(3012).getState());
	}

	@Test
	@DisplayName("Record 3013: ZIP is 99701")
	void ZIPOfRecord3013() {
		assertEquals("99701", customers.get(3012).getZIP());
	}

	@Test
	@DisplayName("Record 3013: Phone is 907-452-6548")
	void PhoneOfRecord3013() {
		assertEquals("907-452-6548", customers.get(3012).getPhone());
	}

	@Test
	@DisplayName("Record 3013: Fax is 907-452-0859")
	void FaxOfRecord3013() {
		assertEquals("907-452-0859", customers.get(3012).getFax());
	}

	@Test
	@DisplayName("Record 3013: Email is beau@mitschke.com")
	void EmailOfRecord3013() {
		assertEquals("beau@mitschke.com", customers.get(3012).getEmail());
	}

	@Test
	@DisplayName("Record 3013: Web is http://www.beaumitschke.com")
	void WebOfRecord3013() {
		assertEquals("http://www.beaumitschke.com", customers.get(3012).getWeb());
	}
}
