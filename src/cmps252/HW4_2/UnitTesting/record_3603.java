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

@Tag("14")
class Record_3603 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3603: FirstName is Hilton")
	void FirstNameOfRecord3603() {
		assertEquals("Hilton", customers.get(3602).getFirstName());
	}

	@Test
	@DisplayName("Record 3603: LastName is Standish")
	void LastNameOfRecord3603() {
		assertEquals("Standish", customers.get(3602).getLastName());
	}

	@Test
	@DisplayName("Record 3603: Company is Valentine, Michael L Esq")
	void CompanyOfRecord3603() {
		assertEquals("Valentine, Michael L Esq", customers.get(3602).getCompany());
	}

	@Test
	@DisplayName("Record 3603: Address is 1911 Las Vegas Blvd S")
	void AddressOfRecord3603() {
		assertEquals("1911 Las Vegas Blvd S", customers.get(3602).getAddress());
	}

	@Test
	@DisplayName("Record 3603: City is Las Vegas")
	void CityOfRecord3603() {
		assertEquals("Las Vegas", customers.get(3602).getCity());
	}

	@Test
	@DisplayName("Record 3603: County is Clark")
	void CountyOfRecord3603() {
		assertEquals("Clark", customers.get(3602).getCounty());
	}

	@Test
	@DisplayName("Record 3603: State is NV")
	void StateOfRecord3603() {
		assertEquals("NV", customers.get(3602).getState());
	}

	@Test
	@DisplayName("Record 3603: ZIP is 89104")
	void ZIPOfRecord3603() {
		assertEquals("89104", customers.get(3602).getZIP());
	}

	@Test
	@DisplayName("Record 3603: Phone is 702-735-8154")
	void PhoneOfRecord3603() {
		assertEquals("702-735-8154", customers.get(3602).getPhone());
	}

	@Test
	@DisplayName("Record 3603: Fax is 702-735-0563")
	void FaxOfRecord3603() {
		assertEquals("702-735-0563", customers.get(3602).getFax());
	}

	@Test
	@DisplayName("Record 3603: Email is hilton@standish.com")
	void EmailOfRecord3603() {
		assertEquals("hilton@standish.com", customers.get(3602).getEmail());
	}

	@Test
	@DisplayName("Record 3603: Web is http://www.hiltonstandish.com")
	void WebOfRecord3603() {
		assertEquals("http://www.hiltonstandish.com", customers.get(3602).getWeb());
	}
}
