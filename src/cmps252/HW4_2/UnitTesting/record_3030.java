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

@Tag("18")
class Record_3030 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3030: FirstName is Winfred")
	void FirstNameOfRecord3030() {
		assertEquals("Winfred", customers.get(3029).getFirstName());
	}

	@Test
	@DisplayName("Record 3030: LastName is Edminster")
	void LastNameOfRecord3030() {
		assertEquals("Edminster", customers.get(3029).getLastName());
	}

	@Test
	@DisplayName("Record 3030: Company is Walz, Karl M Esq")
	void CompanyOfRecord3030() {
		assertEquals("Walz, Karl M Esq", customers.get(3029).getCompany());
	}

	@Test
	@DisplayName("Record 3030: Address is 900 Providence Hwy")
	void AddressOfRecord3030() {
		assertEquals("900 Providence Hwy", customers.get(3029).getAddress());
	}

	@Test
	@DisplayName("Record 3030: City is Dedham")
	void CityOfRecord3030() {
		assertEquals("Dedham", customers.get(3029).getCity());
	}

	@Test
	@DisplayName("Record 3030: County is Norfolk")
	void CountyOfRecord3030() {
		assertEquals("Norfolk", customers.get(3029).getCounty());
	}

	@Test
	@DisplayName("Record 3030: State is MA")
	void StateOfRecord3030() {
		assertEquals("MA", customers.get(3029).getState());
	}

	@Test
	@DisplayName("Record 3030: ZIP is 2026")
	void ZIPOfRecord3030() {
		assertEquals("2026", customers.get(3029).getZIP());
	}

	@Test
	@DisplayName("Record 3030: Phone is 781-326-1273")
	void PhoneOfRecord3030() {
		assertEquals("781-326-1273", customers.get(3029).getPhone());
	}

	@Test
	@DisplayName("Record 3030: Fax is 781-326-8821")
	void FaxOfRecord3030() {
		assertEquals("781-326-8821", customers.get(3029).getFax());
	}

	@Test
	@DisplayName("Record 3030: Email is winfred@edminster.com")
	void EmailOfRecord3030() {
		assertEquals("winfred@edminster.com", customers.get(3029).getEmail());
	}

	@Test
	@DisplayName("Record 3030: Web is http://www.winfrededminster.com")
	void WebOfRecord3030() {
		assertEquals("http://www.winfrededminster.com", customers.get(3029).getWeb());
	}
}
