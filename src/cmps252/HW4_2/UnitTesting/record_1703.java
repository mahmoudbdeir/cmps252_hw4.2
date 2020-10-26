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

@Tag("32")
class Record_1703 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1703: FirstName is Freda")
	void FirstNameOfRecord1703() {
		assertEquals("Freda", customers.get(1702).getFirstName());
	}

	@Test
	@DisplayName("Record 1703: LastName is Pribbenow")
	void LastNameOfRecord1703() {
		assertEquals("Pribbenow", customers.get(1702).getLastName());
	}

	@Test
	@DisplayName("Record 1703: Company is Lab Crafters Inc")
	void CompanyOfRecord1703() {
		assertEquals("Lab Crafters Inc", customers.get(1702).getCompany());
	}

	@Test
	@DisplayName("Record 1703: Address is 820 Laredo St")
	void AddressOfRecord1703() {
		assertEquals("820 Laredo St", customers.get(1702).getAddress());
	}

	@Test
	@DisplayName("Record 1703: City is Laredo")
	void CityOfRecord1703() {
		assertEquals("Laredo", customers.get(1702).getCity());
	}

	@Test
	@DisplayName("Record 1703: County is Webb")
	void CountyOfRecord1703() {
		assertEquals("Webb", customers.get(1702).getCounty());
	}

	@Test
	@DisplayName("Record 1703: State is TX")
	void StateOfRecord1703() {
		assertEquals("TX", customers.get(1702).getState());
	}

	@Test
	@DisplayName("Record 1703: ZIP is 78040")
	void ZIPOfRecord1703() {
		assertEquals("78040", customers.get(1702).getZIP());
	}

	@Test
	@DisplayName("Record 1703: Phone is 956-724-1334")
	void PhoneOfRecord1703() {
		assertEquals("956-724-1334", customers.get(1702).getPhone());
	}

	@Test
	@DisplayName("Record 1703: Fax is 956-724-3054")
	void FaxOfRecord1703() {
		assertEquals("956-724-3054", customers.get(1702).getFax());
	}

	@Test
	@DisplayName("Record 1703: Email is freda@pribbenow.com")
	void EmailOfRecord1703() {
		assertEquals("freda@pribbenow.com", customers.get(1702).getEmail());
	}

	@Test
	@DisplayName("Record 1703: Web is http://www.fredapribbenow.com")
	void WebOfRecord1703() {
		assertEquals("http://www.fredapribbenow.com", customers.get(1702).getWeb());
	}
}
