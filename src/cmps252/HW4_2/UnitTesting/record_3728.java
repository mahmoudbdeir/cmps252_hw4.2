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

@Tag("13")
class Record_3728 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3728: FirstName is Brigitte")
	void FirstNameOfRecord3728() {
		assertEquals("Brigitte", customers.get(3727).getFirstName());
	}

	@Test
	@DisplayName("Record 3728: LastName is Hataway")
	void LastNameOfRecord3728() {
		assertEquals("Hataway", customers.get(3727).getLastName());
	}

	@Test
	@DisplayName("Record 3728: Company is Vincent, Gary L Esq")
	void CompanyOfRecord3728() {
		assertEquals("Vincent, Gary L Esq", customers.get(3727).getCompany());
	}

	@Test
	@DisplayName("Record 3728: Address is 10021 W 75th St")
	void AddressOfRecord3728() {
		assertEquals("10021 W 75th St", customers.get(3727).getAddress());
	}

	@Test
	@DisplayName("Record 3728: City is Overland Park")
	void CityOfRecord3728() {
		assertEquals("Overland Park", customers.get(3727).getCity());
	}

	@Test
	@DisplayName("Record 3728: County is Johnson")
	void CountyOfRecord3728() {
		assertEquals("Johnson", customers.get(3727).getCounty());
	}

	@Test
	@DisplayName("Record 3728: State is KS")
	void StateOfRecord3728() {
		assertEquals("KS", customers.get(3727).getState());
	}

	@Test
	@DisplayName("Record 3728: ZIP is 66204")
	void ZIPOfRecord3728() {
		assertEquals("66204", customers.get(3727).getZIP());
	}

	@Test
	@DisplayName("Record 3728: Phone is 913-842-7481")
	void PhoneOfRecord3728() {
		assertEquals("913-842-7481", customers.get(3727).getPhone());
	}

	@Test
	@DisplayName("Record 3728: Fax is 913-842-5268")
	void FaxOfRecord3728() {
		assertEquals("913-842-5268", customers.get(3727).getFax());
	}

	@Test
	@DisplayName("Record 3728: Email is brigitte@hataway.com")
	void EmailOfRecord3728() {
		assertEquals("brigitte@hataway.com", customers.get(3727).getEmail());
	}

	@Test
	@DisplayName("Record 3728: Web is http://www.brigittehataway.com")
	void WebOfRecord3728() {
		assertEquals("http://www.brigittehataway.com", customers.get(3727).getWeb());
	}
}
