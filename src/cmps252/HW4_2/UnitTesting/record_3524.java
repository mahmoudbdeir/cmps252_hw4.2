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
class Record_3524 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3524: FirstName is Luis")
	void FirstNameOfRecord3524() {
		assertEquals("Luis", customers.get(3523).getFirstName());
	}

	@Test
	@DisplayName("Record 3524: LastName is Moitoza")
	void LastNameOfRecord3524() {
		assertEquals("Moitoza", customers.get(3523).getLastName());
	}

	@Test
	@DisplayName("Record 3524: Company is New York Life Insurance")
	void CompanyOfRecord3524() {
		assertEquals("New York Life Insurance", customers.get(3523).getCompany());
	}

	@Test
	@DisplayName("Record 3524: Address is 1018 York St")
	void AddressOfRecord3524() {
		assertEquals("1018 York St", customers.get(3523).getAddress());
	}

	@Test
	@DisplayName("Record 3524: City is Houston")
	void CityOfRecord3524() {
		assertEquals("Houston", customers.get(3523).getCity());
	}

	@Test
	@DisplayName("Record 3524: County is Harris")
	void CountyOfRecord3524() {
		assertEquals("Harris", customers.get(3523).getCounty());
	}

	@Test
	@DisplayName("Record 3524: State is TX")
	void StateOfRecord3524() {
		assertEquals("TX", customers.get(3523).getState());
	}

	@Test
	@DisplayName("Record 3524: ZIP is 77003")
	void ZIPOfRecord3524() {
		assertEquals("77003", customers.get(3523).getZIP());
	}

	@Test
	@DisplayName("Record 3524: Phone is 713-659-1110")
	void PhoneOfRecord3524() {
		assertEquals("713-659-1110", customers.get(3523).getPhone());
	}

	@Test
	@DisplayName("Record 3524: Fax is 713-659-1094")
	void FaxOfRecord3524() {
		assertEquals("713-659-1094", customers.get(3523).getFax());
	}

	@Test
	@DisplayName("Record 3524: Email is luis@moitoza.com")
	void EmailOfRecord3524() {
		assertEquals("luis@moitoza.com", customers.get(3523).getEmail());
	}

	@Test
	@DisplayName("Record 3524: Web is http://www.luismoitoza.com")
	void WebOfRecord3524() {
		assertEquals("http://www.luismoitoza.com", customers.get(3523).getWeb());
	}
}
