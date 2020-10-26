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

@Tag("24")
class Record_143 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 143: FirstName is Bess")
	void FirstNameOfRecord143() {
		assertEquals("Bess", customers.get(142).getFirstName());
	}

	@Test
	@DisplayName("Record 143: LastName is Moreland")
	void LastNameOfRecord143() {
		assertEquals("Moreland", customers.get(142).getLastName());
	}

	@Test
	@DisplayName("Record 143: Company is Guzy, Robert A Esq")
	void CompanyOfRecord143() {
		assertEquals("Guzy, Robert A Esq", customers.get(142).getCompany());
	}

	@Test
	@DisplayName("Record 143: Address is Rt 513")
	void AddressOfRecord143() {
		assertEquals("Rt 513", customers.get(142).getAddress());
	}

	@Test
	@DisplayName("Record 143: City is Califon")
	void CityOfRecord143() {
		assertEquals("Califon", customers.get(142).getCity());
	}

	@Test
	@DisplayName("Record 143: County is Hunterdon")
	void CountyOfRecord143() {
		assertEquals("Hunterdon", customers.get(142).getCounty());
	}

	@Test
	@DisplayName("Record 143: State is NJ")
	void StateOfRecord143() {
		assertEquals("NJ", customers.get(142).getState());
	}

	@Test
	@DisplayName("Record 143: ZIP is 07830")
	void ZIPOfRecord143() {
		assertEquals("07830", customers.get(142).getZIP());
	}

	@Test
	@DisplayName("Record 143: Phone is 908-832-6351")
	void PhoneOfRecord143() {
		assertEquals("908-832-6351", customers.get(142).getPhone());
	}

	@Test
	@DisplayName("Record 143: Fax is 908-832-9675")
	void FaxOfRecord143() {
		assertEquals("908-832-9675", customers.get(142).getFax());
	}

	@Test
	@DisplayName("Record 143: Email is bess@moreland.com")
	void EmailOfRecord143() {
		assertEquals("bess@moreland.com", customers.get(142).getEmail());
	}

	@Test
	@DisplayName("Record 143: Web is http://www.bessmoreland.com")
	void WebOfRecord143() {
		assertEquals("http://www.bessmoreland.com", customers.get(142).getWeb());
	}
}
