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

@Tag("39")
class Record_1951 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1951: FirstName is Lynn")
	void FirstNameOfRecord1951() {
		assertEquals("Lynn", customers.get(1950).getFirstName());
	}

	@Test
	@DisplayName("Record 1951: LastName is Mcnichols")
	void LastNameOfRecord1951() {
		assertEquals("Mcnichols", customers.get(1950).getLastName());
	}

	@Test
	@DisplayName("Record 1951: Company is Benson, James D Esq")
	void CompanyOfRecord1951() {
		assertEquals("Benson, James D Esq", customers.get(1950).getCompany());
	}

	@Test
	@DisplayName("Record 1951: Address is 14212 Atlanta Dr")
	void AddressOfRecord1951() {
		assertEquals("14212 Atlanta Dr", customers.get(1950).getAddress());
	}

	@Test
	@DisplayName("Record 1951: City is Laredo")
	void CityOfRecord1951() {
		assertEquals("Laredo", customers.get(1950).getCity());
	}

	@Test
	@DisplayName("Record 1951: County is Webb")
	void CountyOfRecord1951() {
		assertEquals("Webb", customers.get(1950).getCounty());
	}

	@Test
	@DisplayName("Record 1951: State is TX")
	void StateOfRecord1951() {
		assertEquals("TX", customers.get(1950).getState());
	}

	@Test
	@DisplayName("Record 1951: ZIP is 78045")
	void ZIPOfRecord1951() {
		assertEquals("78045", customers.get(1950).getZIP());
	}

	@Test
	@DisplayName("Record 1951: Phone is 956-724-8336")
	void PhoneOfRecord1951() {
		assertEquals("956-724-8336", customers.get(1950).getPhone());
	}

	@Test
	@DisplayName("Record 1951: Fax is 956-724-9452")
	void FaxOfRecord1951() {
		assertEquals("956-724-9452", customers.get(1950).getFax());
	}

	@Test
	@DisplayName("Record 1951: Email is lynn@mcnichols.com")
	void EmailOfRecord1951() {
		assertEquals("lynn@mcnichols.com", customers.get(1950).getEmail());
	}

	@Test
	@DisplayName("Record 1951: Web is http://www.lynnmcnichols.com")
	void WebOfRecord1951() {
		assertEquals("http://www.lynnmcnichols.com", customers.get(1950).getWeb());
	}
}
