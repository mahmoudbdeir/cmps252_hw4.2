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

@Tag("2")
class Record_3017 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3017: FirstName is Amy")
	void FirstNameOfRecord3017() {
		assertEquals("Amy", customers.get(3016).getFirstName());
	}

	@Test
	@DisplayName("Record 3017: LastName is Bermudez")
	void LastNameOfRecord3017() {
		assertEquals("Bermudez", customers.get(3016).getLastName());
	}

	@Test
	@DisplayName("Record 3017: Company is Holland Welding & Iron Wks Inc")
	void CompanyOfRecord3017() {
		assertEquals("Holland Welding & Iron Wks Inc", customers.get(3016).getCompany());
	}

	@Test
	@DisplayName("Record 3017: Address is 418 Hamburg Tpke")
	void AddressOfRecord3017() {
		assertEquals("418 Hamburg Tpke", customers.get(3016).getAddress());
	}

	@Test
	@DisplayName("Record 3017: City is Wayne")
	void CityOfRecord3017() {
		assertEquals("Wayne", customers.get(3016).getCity());
	}

	@Test
	@DisplayName("Record 3017: County is Passaic")
	void CountyOfRecord3017() {
		assertEquals("Passaic", customers.get(3016).getCounty());
	}

	@Test
	@DisplayName("Record 3017: State is NJ")
	void StateOfRecord3017() {
		assertEquals("NJ", customers.get(3016).getState());
	}

	@Test
	@DisplayName("Record 3017: ZIP is 7470")
	void ZIPOfRecord3017() {
		assertEquals("7470", customers.get(3016).getZIP());
	}

	@Test
	@DisplayName("Record 3017: Phone is 973-956-7984")
	void PhoneOfRecord3017() {
		assertEquals("973-956-7984", customers.get(3016).getPhone());
	}

	@Test
	@DisplayName("Record 3017: Fax is 973-956-1351")
	void FaxOfRecord3017() {
		assertEquals("973-956-1351", customers.get(3016).getFax());
	}

	@Test
	@DisplayName("Record 3017: Email is amy@bermudez.com")
	void EmailOfRecord3017() {
		assertEquals("amy@bermudez.com", customers.get(3016).getEmail());
	}

	@Test
	@DisplayName("Record 3017: Web is http://www.amybermudez.com")
	void WebOfRecord3017() {
		assertEquals("http://www.amybermudez.com", customers.get(3016).getWeb());
	}
}
