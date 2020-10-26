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

@Tag("26")
class Record_3233 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3233: FirstName is Forest")
	void FirstNameOfRecord3233() {
		assertEquals("Forest", customers.get(3232).getFirstName());
	}

	@Test
	@DisplayName("Record 3233: LastName is Ochakovsky")
	void LastNameOfRecord3233() {
		assertEquals("Ochakovsky", customers.get(3232).getLastName());
	}

	@Test
	@DisplayName("Record 3233: Company is Ask Mr Foster Travel Service")
	void CompanyOfRecord3233() {
		assertEquals("Ask Mr Foster Travel Service", customers.get(3232).getCompany());
	}

	@Test
	@DisplayName("Record 3233: Address is 1625 Dell Range Blvd")
	void AddressOfRecord3233() {
		assertEquals("1625 Dell Range Blvd", customers.get(3232).getAddress());
	}

	@Test
	@DisplayName("Record 3233: City is Cheyenne")
	void CityOfRecord3233() {
		assertEquals("Cheyenne", customers.get(3232).getCity());
	}

	@Test
	@DisplayName("Record 3233: County is Laramie")
	void CountyOfRecord3233() {
		assertEquals("Laramie", customers.get(3232).getCounty());
	}

	@Test
	@DisplayName("Record 3233: State is WY")
	void StateOfRecord3233() {
		assertEquals("WY", customers.get(3232).getState());
	}

	@Test
	@DisplayName("Record 3233: ZIP is 82009")
	void ZIPOfRecord3233() {
		assertEquals("82009", customers.get(3232).getZIP());
	}

	@Test
	@DisplayName("Record 3233: Phone is 307-635-3264")
	void PhoneOfRecord3233() {
		assertEquals("307-635-3264", customers.get(3232).getPhone());
	}

	@Test
	@DisplayName("Record 3233: Fax is 307-635-5181")
	void FaxOfRecord3233() {
		assertEquals("307-635-5181", customers.get(3232).getFax());
	}

	@Test
	@DisplayName("Record 3233: Email is forest@ochakovsky.com")
	void EmailOfRecord3233() {
		assertEquals("forest@ochakovsky.com", customers.get(3232).getEmail());
	}

	@Test
	@DisplayName("Record 3233: Web is http://www.forestochakovsky.com")
	void WebOfRecord3233() {
		assertEquals("http://www.forestochakovsky.com", customers.get(3232).getWeb());
	}
}
