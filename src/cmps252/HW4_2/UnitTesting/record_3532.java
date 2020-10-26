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

@Tag("23")
class Record_3532 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3532: FirstName is Melinda")
	void FirstNameOfRecord3532() {
		assertEquals("Melinda", customers.get(3531).getFirstName());
	}

	@Test
	@DisplayName("Record 3532: LastName is Virag")
	void LastNameOfRecord3532() {
		assertEquals("Virag", customers.get(3531).getLastName());
	}

	@Test
	@DisplayName("Record 3532: Company is Alphagraphics Printshops")
	void CompanyOfRecord3532() {
		assertEquals("Alphagraphics Printshops", customers.get(3531).getCompany());
	}

	@Test
	@DisplayName("Record 3532: Address is 3130 Airway Ave")
	void AddressOfRecord3532() {
		assertEquals("3130 Airway Ave", customers.get(3531).getAddress());
	}

	@Test
	@DisplayName("Record 3532: City is Costa Mesa")
	void CityOfRecord3532() {
		assertEquals("Costa Mesa", customers.get(3531).getCity());
	}

	@Test
	@DisplayName("Record 3532: County is Orange")
	void CountyOfRecord3532() {
		assertEquals("Orange", customers.get(3531).getCounty());
	}

	@Test
	@DisplayName("Record 3532: State is CA")
	void StateOfRecord3532() {
		assertEquals("CA", customers.get(3531).getState());
	}

	@Test
	@DisplayName("Record 3532: ZIP is 92626")
	void ZIPOfRecord3532() {
		assertEquals("92626", customers.get(3531).getZIP());
	}

	@Test
	@DisplayName("Record 3532: Phone is 949-557-1491")
	void PhoneOfRecord3532() {
		assertEquals("949-557-1491", customers.get(3531).getPhone());
	}

	@Test
	@DisplayName("Record 3532: Fax is 949-557-6155")
	void FaxOfRecord3532() {
		assertEquals("949-557-6155", customers.get(3531).getFax());
	}

	@Test
	@DisplayName("Record 3532: Email is melinda@virag.com")
	void EmailOfRecord3532() {
		assertEquals("melinda@virag.com", customers.get(3531).getEmail());
	}

	@Test
	@DisplayName("Record 3532: Web is http://www.melindavirag.com")
	void WebOfRecord3532() {
		assertEquals("http://www.melindavirag.com", customers.get(3531).getWeb());
	}
}
